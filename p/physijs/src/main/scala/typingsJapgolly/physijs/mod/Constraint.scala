package typingsJapgolly.physijs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constraint extends StObject {
  
  def getDefinition(): Any
}
object Constraint {
  
  inline def apply(getDefinition: CallbackTo[Any]): Constraint = {
    val __obj = js.Dynamic.literal(getDefinition = getDefinition.toJsFn)
    __obj.asInstanceOf[Constraint]
  }
  
  extension [Self <: Constraint](x: Self) {
    
    inline def setGetDefinition(value: CallbackTo[Any]): Self = StObject.set(x, "getDefinition", value.toJsFn)
  }
}
