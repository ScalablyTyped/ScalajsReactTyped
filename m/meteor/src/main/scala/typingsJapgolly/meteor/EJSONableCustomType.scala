package typingsJapgolly.meteor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EJSONableCustomType extends StObject {
  
  @JSName("clone")
  var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  @JSName("equals")
  var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, Boolean]] = js.undefined
  
  def toJSONValue(): JSONable
  
  def typeName(): String
}
object EJSONableCustomType {
  
  inline def apply(toJSONValue: CallbackTo[JSONable], typeName: CallbackTo[String]): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(toJSONValue = toJSONValue.toJsFn, typeName = typeName.toJsFn)
    __obj.asInstanceOf[EJSONableCustomType]
  }
  
  extension [Self <: EJSONableCustomType](x: Self) {
    
    inline def setClone_(value: CallbackTo[EJSONableCustomType]): Self = StObject.set(x, "clone", value.toJsFn)
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setEquals_(value: /* other */ js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setToJSONValue(value: CallbackTo[JSONable]): Self = StObject.set(x, "toJSONValue", value.toJsFn)
    
    inline def setTypeName(value: CallbackTo[String]): Self = StObject.set(x, "typeName", value.toJsFn)
  }
}
