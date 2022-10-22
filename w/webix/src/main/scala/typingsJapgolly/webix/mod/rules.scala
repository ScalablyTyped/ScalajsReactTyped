package typingsJapgolly.webix.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rules extends StObject {
  
  def isChecked(): Boolean
  
  def isEmail(): Boolean
  
  def isNotEmpty(): Boolean
  
  def isNumber(): Boolean
}
object rules {
  
  @JSImport("webix", "rules")
  @js.native
  val ^ : typingsJapgolly.webix.webix.rules = js.native
  
  extension [Self <: rules](x: Self) {
    
    inline def setIsChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChecked", value.toJsFn)
    
    inline def setIsEmail(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmail", value.toJsFn)
    
    inline def setIsNotEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNotEmpty", value.toJsFn)
    
    inline def setIsNumber(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNumber", value.toJsFn)
  }
}
