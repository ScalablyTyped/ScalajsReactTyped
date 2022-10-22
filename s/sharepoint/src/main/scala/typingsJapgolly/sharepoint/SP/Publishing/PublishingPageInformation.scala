package typingsJapgolly.sharepoint.SP.Publishing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.Folder
import typingsJapgolly.sharepoint.SP.ListItem
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishingPageInformation
  extends StObject
     with ClientValueObject {
  
  def get_folder(): Folder
  
  def get_name(): String
  
  def get_pageLayoutListItem(): ListItem[Any]
  
  def set_folder(value: Folder): Folder
  
  def set_name(value: String): String
  
  def set_pageLayoutListItem(value: ListItem[Any]): ListItem[Any]
}
object PublishingPageInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_folder: CallbackTo[Folder],
    get_name: CallbackTo[String],
    get_pageLayoutListItem: CallbackTo[ListItem[Any]],
    get_typeId: CallbackTo[String],
    set_folder: Folder => Folder,
    set_name: String => String,
    set_pageLayoutListItem: ListItem[Any] => ListItem[Any],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): PublishingPageInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_folder = get_folder.toJsFn, get_name = get_name.toJsFn, get_pageLayoutListItem = get_pageLayoutListItem.toJsFn, get_typeId = get_typeId.toJsFn, set_folder = js.Any.fromFunction1(set_folder), set_name = js.Any.fromFunction1(set_name), set_pageLayoutListItem = js.Any.fromFunction1(set_pageLayoutListItem), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[PublishingPageInformation]
  }
  
  extension [Self <: PublishingPageInformation](x: Self) {
    
    inline def setGet_folder(value: CallbackTo[Folder]): Self = StObject.set(x, "get_folder", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_pageLayoutListItem(value: CallbackTo[ListItem[Any]]): Self = StObject.set(x, "get_pageLayoutListItem", value.toJsFn)
    
    inline def setSet_folder(value: Folder => Folder): Self = StObject.set(x, "set_folder", js.Any.fromFunction1(value))
    
    inline def setSet_name(value: String => String): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
    
    inline def setSet_pageLayoutListItem(value: ListItem[Any] => ListItem[Any]): Self = StObject.set(x, "set_pageLayoutListItem", js.Any.fromFunction1(value))
  }
}
