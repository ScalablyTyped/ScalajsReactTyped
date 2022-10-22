package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_content(): Base64EncodedByteArray
  
  def get_overwrite(): Boolean
  
  def get_url(): String
  
  def set_content(value: Base64EncodedByteArray): Unit
  
  def set_overwrite(value: Boolean): Unit
  
  def set_url(value: String): Unit
}
object FileCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_content: CallbackTo[Base64EncodedByteArray],
    get_overwrite: CallbackTo[Boolean],
    get_typeId: CallbackTo[String],
    get_url: CallbackTo[String],
    set_content: Base64EncodedByteArray => Callback,
    set_overwrite: Boolean => Callback,
    set_url: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): FileCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_content = get_content.toJsFn, get_overwrite = get_overwrite.toJsFn, get_typeId = get_typeId.toJsFn, get_url = get_url.toJsFn, set_content = js.Any.fromFunction1((t0: Base64EncodedByteArray) => set_content(t0).runNow()), set_overwrite = js.Any.fromFunction1((t0: Boolean) => set_overwrite(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[FileCreationInformation]
  }
  
  extension [Self <: FileCreationInformation](x: Self) {
    
    inline def setGet_content(value: CallbackTo[Base64EncodedByteArray]): Self = StObject.set(x, "get_content", value.toJsFn)
    
    inline def setGet_overwrite(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_overwrite", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setSet_content(value: Base64EncodedByteArray => Callback): Self = StObject.set(x, "set_content", js.Any.fromFunction1((t0: Base64EncodedByteArray) => value(t0).runNow()))
    
    inline def setSet_overwrite(value: Boolean => Callback): Self = StObject.set(x, "set_overwrite", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
