package value

import expression.Identifier
import scala.collection.immutable.HashMap

class Environment extends HashMap [Identifier, Value] with Value {
    
}