package expression

import value._

case class Conditional (condition: Expression, consequent: Expression, alternative: Expression = null) extends SpecialForm {
  //conditional execution
  def execute(env: Environment): Value = {
    val a = condition.execute(env)
    
    //type checking
    if (!a.isInstanceOf[Boole]) throw new Exception("Condition must be a Boole")
    
    val aVal = a.isInstanceOf[Boole]
    if (aVal) consequent.execute(env)
    else if (alternative != null) alternative.execute(env)
    else Notification("Unspecified")
  }
}