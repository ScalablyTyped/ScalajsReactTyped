package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTypeCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_description(): String
  
  def get_group(): String
  
  def get_name(): String
  
  def get_parentContentType(): ContentType
  
  def set_description(value: String): Unit
  
  def set_group(value: String): Unit
  
  def set_name(value: String): Unit
  
  def set_parentContentType(value: ContentType): Unit
}
object ContentTypeCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_description: CallbackTo[String],
    get_group: CallbackTo[String],
    get_name: CallbackTo[String],
    get_parentContentType: CallbackTo[ContentType],
    get_typeId: CallbackTo[String],
    set_description: String => Callback,
    set_group: String => Callback,
    set_name: String => Callback,
    set_parentContentType: ContentType => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ContentTypeCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_description = get_description.toJsFn, get_group = get_group.toJsFn, get_name = get_name.toJsFn, get_parentContentType = get_parentContentType.toJsFn, get_typeId = get_typeId.toJsFn, set_description = js.Any.fromFunction1((t0: String) => set_description(t0).runNow()), set_group = js.Any.fromFunction1((t0: String) => set_group(t0).runNow()), set_name = js.Any.fromFunction1((t0: String) => set_name(t0).runNow()), set_parentContentType = js.Any.fromFunction1((t0: ContentType) => set_parentContentType(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ContentTypeCreationInformation]
  }
  
  extension [Self <: ContentTypeCreationInformation](x: Self) {
    
    inline def setGet_description(value: CallbackTo[String]): Self = StObject.set(x, "get_description", value.toJsFn)
    
    inline def setGet_group(value: CallbackTo[String]): Self = StObject.set(x, "get_group", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_parentContentType(value: CallbackTo[ContentType]): Self = StObject.set(x, "get_parentContentType", value.toJsFn)
    
    inline def setSet_description(value: String => Callback): Self = StObject.set(x, "set_description", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_group(value: String => Callback): Self = StObject.set(x, "set_group", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_name(value: String => Callback): Self = StObject.set(x, "set_name", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_parentContentType(value: ContentType => Callback): Self = StObject.set(x, "set_parentContentType", js.Any.fromFunction1((t0: ContentType) => value(t0).runNow()))
  }
}
