package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemFormUpdateValue
  extends StObject
     with ClientValueObject {
  
  def get_errorMessage(): String
  
  def get_fieldName(): String
  
  def get_fieldValue(): String
  
  def get_hasException(): Boolean
  
  def set_errorMessage(value: String): Unit
  
  def set_fieldName(value: String): Unit
  
  def set_fieldValue(value: String): Unit
  
  def set_hasException(value: Boolean): Unit
}
object ListItemFormUpdateValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_errorMessage: CallbackTo[String],
    get_fieldName: CallbackTo[String],
    get_fieldValue: CallbackTo[String],
    get_hasException: CallbackTo[Boolean],
    get_typeId: CallbackTo[String],
    set_errorMessage: String => Callback,
    set_fieldName: String => Callback,
    set_fieldValue: String => Callback,
    set_hasException: Boolean => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ListItemFormUpdateValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_errorMessage = get_errorMessage.toJsFn, get_fieldName = get_fieldName.toJsFn, get_fieldValue = get_fieldValue.toJsFn, get_hasException = get_hasException.toJsFn, get_typeId = get_typeId.toJsFn, set_errorMessage = js.Any.fromFunction1((t0: String) => set_errorMessage(t0).runNow()), set_fieldName = js.Any.fromFunction1((t0: String) => set_fieldName(t0).runNow()), set_fieldValue = js.Any.fromFunction1((t0: String) => set_fieldValue(t0).runNow()), set_hasException = js.Any.fromFunction1((t0: Boolean) => set_hasException(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ListItemFormUpdateValue]
  }
  
  extension [Self <: ListItemFormUpdateValue](x: Self) {
    
    inline def setGet_errorMessage(value: CallbackTo[String]): Self = StObject.set(x, "get_errorMessage", value.toJsFn)
    
    inline def setGet_fieldName(value: CallbackTo[String]): Self = StObject.set(x, "get_fieldName", value.toJsFn)
    
    inline def setGet_fieldValue(value: CallbackTo[String]): Self = StObject.set(x, "get_fieldValue", value.toJsFn)
    
    inline def setGet_hasException(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_hasException", value.toJsFn)
    
    inline def setSet_errorMessage(value: String => Callback): Self = StObject.set(x, "set_errorMessage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_fieldName(value: String => Callback): Self = StObject.set(x, "set_fieldName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_fieldValue(value: String => Callback): Self = StObject.set(x, "set_fieldValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_hasException(value: Boolean => Callback): Self = StObject.set(x, "set_hasException", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
