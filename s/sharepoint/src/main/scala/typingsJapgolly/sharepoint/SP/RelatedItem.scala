package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedItem
  extends StObject
     with ClientValueObject {
  
  def get_iconUrl(): String
  
  def get_itemId(): Double
  
  def get_listId(): String
  
  def get_title(): String
  
  def get_url(): String
  
  def get_webId(): String
  
  def set_iconUrl(value: String): Unit
  
  def set_itemId(value: Double): Unit
  
  def set_listId(value: String): Unit
  
  def set_title(value: String): Unit
  
  def set_url(value: String): Unit
  
  def set_webId(value: String): Unit
}
object RelatedItem {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_iconUrl: CallbackTo[String],
    get_itemId: CallbackTo[Double],
    get_listId: CallbackTo[String],
    get_title: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_url: CallbackTo[String],
    get_webId: CallbackTo[String],
    set_iconUrl: String => Callback,
    set_itemId: Double => Callback,
    set_listId: String => Callback,
    set_title: String => Callback,
    set_url: String => Callback,
    set_webId: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): RelatedItem = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_iconUrl = get_iconUrl.toJsFn, get_itemId = get_itemId.toJsFn, get_listId = get_listId.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, get_url = get_url.toJsFn, get_webId = get_webId.toJsFn, set_iconUrl = js.Any.fromFunction1((t0: String) => set_iconUrl(t0).runNow()), set_itemId = js.Any.fromFunction1((t0: Double) => set_itemId(t0).runNow()), set_listId = js.Any.fromFunction1((t0: String) => set_listId(t0).runNow()), set_title = js.Any.fromFunction1((t0: String) => set_title(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()), set_webId = js.Any.fromFunction1((t0: String) => set_webId(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[RelatedItem]
  }
  
  extension [Self <: RelatedItem](x: Self) {
    
    inline def setGet_iconUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_iconUrl", value.toJsFn)
    
    inline def setGet_itemId(value: CallbackTo[Double]): Self = StObject.set(x, "get_itemId", value.toJsFn)
    
    inline def setGet_listId(value: CallbackTo[String]): Self = StObject.set(x, "get_listId", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setGet_webId(value: CallbackTo[String]): Self = StObject.set(x, "get_webId", value.toJsFn)
    
    inline def setSet_iconUrl(value: String => Callback): Self = StObject.set(x, "set_iconUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_itemId(value: Double => Callback): Self = StObject.set(x, "set_itemId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_listId(value: String => Callback): Self = StObject.set(x, "set_listId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_title(value: String => Callback): Self = StObject.set(x, "set_title", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_webId(value: String => Callback): Self = StObject.set(x, "set_webId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
