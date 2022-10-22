package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_contentStream(): Base64EncodedByteArray
  
  def get_fileName(): String
  
  def set_contentStream(value: Base64EncodedByteArray): Unit
  
  def set_fileName(value: String): Unit
}
object AttachmentCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_contentStream: CallbackTo[Base64EncodedByteArray],
    get_fileName: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_contentStream: Base64EncodedByteArray => Callback,
    set_fileName: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): AttachmentCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_contentStream = get_contentStream.toJsFn, get_fileName = get_fileName.toJsFn, get_typeId = get_typeId.toJsFn, set_contentStream = js.Any.fromFunction1((t0: Base64EncodedByteArray) => set_contentStream(t0).runNow()), set_fileName = js.Any.fromFunction1((t0: String) => set_fileName(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[AttachmentCreationInformation]
  }
  
  extension [Self <: AttachmentCreationInformation](x: Self) {
    
    inline def setGet_contentStream(value: CallbackTo[Base64EncodedByteArray]): Self = StObject.set(x, "get_contentStream", value.toJsFn)
    
    inline def setGet_fileName(value: CallbackTo[String]): Self = StObject.set(x, "get_fileName", value.toJsFn)
    
    inline def setSet_contentStream(value: Base64EncodedByteArray => Callback): Self = StObject.set(x, "set_contentStream", js.Any.fromFunction1((t0: Base64EncodedByteArray) => value(t0).runNow()))
    
    inline def setSet_fileName(value: String => Callback): Self = StObject.set(x, "set_fileName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
