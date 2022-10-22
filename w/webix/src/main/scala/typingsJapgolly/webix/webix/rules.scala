package typingsJapgolly.webix.webix

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
  
  inline def apply(
    isChecked: CallbackTo[Boolean],
    isEmail: CallbackTo[Boolean],
    isNotEmpty: CallbackTo[Boolean],
    isNumber: CallbackTo[Boolean]
  ): rules = {
    val __obj = js.Dynamic.literal(isChecked = isChecked.toJsFn, isEmail = isEmail.toJsFn, isNotEmpty = isNotEmpty.toJsFn, isNumber = isNumber.toJsFn)
    __obj.asInstanceOf[rules]
  }
  
  extension [Self <: rules](x: Self) {
    
    inline def setIsChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChecked", value.toJsFn)
    
    inline def setIsEmail(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmail", value.toJsFn)
    
    inline def setIsNotEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNotEmpty", value.toJsFn)
    
    inline def setIsNumber(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNumber", value.toJsFn)
  }
}
