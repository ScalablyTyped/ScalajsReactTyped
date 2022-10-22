package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EJSONableCustomType extends StObject {
  
  def equals(other: js.Object): Boolean
  
  def toJSONValue(): JSONable
  
  def typeName(): String
}
object EJSONableCustomType {
  
  inline def apply(equals_ : js.Object => Boolean, toJSONValue: CallbackTo[JSONable], typeName: CallbackTo[String]): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(toJSONValue = toJSONValue.toJsFn, typeName = typeName.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[EJSONableCustomType]
  }
  
  extension [Self <: EJSONableCustomType](x: Self) {
    
    inline def setEquals_(value: js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setToJSONValue(value: CallbackTo[JSONable]): Self = StObject.set(x, "toJSONValue", value.toJsFn)
    
    inline def setTypeName(value: CallbackTo[String]): Self = StObject.set(x, "typeName", value.toJsFn)
  }
}
