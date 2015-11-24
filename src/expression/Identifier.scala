package expression

import value.Environment

case class Identifier (value:String) extends Expression {
  def execute(env: Environment) = if (env.contains(this)) env.get(this).get else throw new Exception("Identifier undefined")
}