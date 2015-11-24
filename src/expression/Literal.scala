package expression

import value._

trait Literal {
  def execute (env : Environment) = this
}