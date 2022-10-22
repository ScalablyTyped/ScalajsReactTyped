package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSaveBinaryInformation
  extends StObject
     with ClientValueObject {
  
  def get_checkRequiredFields(): Boolean
  
  def get_content(): Base64EncodedByteArray
  
  def get_eTag(): String
  
  def get_fieldValues(): Any
  
  def set_checkRequiredFields(value: Boolean): Unit
  
  def set_content(value: Base64EncodedByteArray): Unit
  
  def set_eTag(value: String): Unit
  
  def set_fieldValues(value: Any): Unit
}
object FileSaveBinaryInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_checkRequiredFields: CallbackTo[Boolean],
    get_content: CallbackTo[Base64EncodedByteArray],
    get_eTag: CallbackTo[String],
    get_fieldValues: CallbackTo[Any],
    get_typeId: CallbackTo[String],
    set_checkRequiredFields: Boolean => Callback,
    set_content: Base64EncodedByteArray => Callback,
    set_eTag: String => Callback,
    set_fieldValues: Any => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): FileSaveBinaryInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_checkRequiredFields = get_checkRequiredFields.toJsFn, get_content = get_content.toJsFn, get_eTag = get_eTag.toJsFn, get_fieldValues = get_fieldValues.toJsFn, get_typeId = get_typeId.toJsFn, set_checkRequiredFields = js.Any.fromFunction1((t0: Boolean) => set_checkRequiredFields(t0).runNow()), set_content = js.Any.fromFunction1((t0: Base64EncodedByteArray) => set_content(t0).runNow()), set_eTag = js.Any.fromFunction1((t0: String) => set_eTag(t0).runNow()), set_fieldValues = js.Any.fromFunction1((t0: Any) => set_fieldValues(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[FileSaveBinaryInformation]
  }
  
  extension [Self <: FileSaveBinaryInformation](x: Self) {
    
    inline def setGet_checkRequiredFields(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_checkRequiredFields", value.toJsFn)
    
    inline def setGet_content(value: CallbackTo[Base64EncodedByteArray]): Self = StObject.set(x, "get_content", value.toJsFn)
    
    inline def setGet_eTag(value: CallbackTo[String]): Self = StObject.set(x, "get_eTag", value.toJsFn)
    
    inline def setGet_fieldValues(value: CallbackTo[Any]): Self = StObject.set(x, "get_fieldValues", value.toJsFn)
    
    inline def setSet_checkRequiredFields(value: Boolean => Callback): Self = StObject.set(x, "set_checkRequiredFields", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_content(value: Base64EncodedByteArray => Callback): Self = StObject.set(x, "set_content", js.Any.fromFunction1((t0: Base64EncodedByteArray) => value(t0).runNow()))
    
    inline def setSet_eTag(value: String => Callback): Self = StObject.set(x, "set_eTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_fieldValues(value: Any => Callback): Self = StObject.set(x, "set_fieldValues", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
