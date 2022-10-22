package typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValueNullValueEnum extends StObject {
  
  var NULL_VALUE: ValueNullValue
  
  def values(): js.Array[ValueNullValue]
}
object IValueNullValueEnum {
  
  inline def apply(NULL_VALUE: ValueNullValue, values: CallbackTo[js.Array[ValueNullValue]]): IValueNullValueEnum = {
    val __obj = js.Dynamic.literal(NULL_VALUE = NULL_VALUE.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[IValueNullValueEnum]
  }
  
  extension [Self <: IValueNullValueEnum](x: Self) {
    
    inline def setNULL_VALUE(value: ValueNullValue): Self = StObject.set(x, "NULL_VALUE", value.asInstanceOf[js.Any])
    
    inline def setValues(value: CallbackTo[js.Array[ValueNullValue]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
