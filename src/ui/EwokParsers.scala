package ui

import scala.util.parsing.combinator._
import expression._
import value._

class EwokParsers extends RegexParsers {
  
  
  
  def expression: Parser[Expression] = Declaration | Conditional | Disjunction | failure("Invalid expression")
  
  
  def declaration: Parser[Declaration] = "def"~identifier~"="~ expression ^^
  {
   case "def"~id~"="~exp => Declaration(id, exp)
  }  
}