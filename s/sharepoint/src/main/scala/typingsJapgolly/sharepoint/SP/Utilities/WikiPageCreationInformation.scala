package typingsJapgolly.sharepoint.SP.Utilities

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WikiPageCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_serverRelativeUrl(): String
  
  def get_wikiHtmlContent(): String
  
  def set_serverRelativeUrl(value: String): Unit
  
  def set_wikiHtmlContent(value: String): Unit
}
object WikiPageCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_serverRelativeUrl: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_wikiHtmlContent: CallbackTo[String],
    set_serverRelativeUrl: String => Callback,
    set_wikiHtmlContent: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): WikiPageCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_serverRelativeUrl = get_serverRelativeUrl.toJsFn, get_typeId = get_typeId.toJsFn, get_wikiHtmlContent = get_wikiHtmlContent.toJsFn, set_serverRelativeUrl = js.Any.fromFunction1((t0: String) => set_serverRelativeUrl(t0).runNow()), set_wikiHtmlContent = js.Any.fromFunction1((t0: String) => set_wikiHtmlContent(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[WikiPageCreationInformation]
  }
  
  extension [Self <: WikiPageCreationInformation](x: Self) {
    
    inline def setGet_serverRelativeUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_serverRelativeUrl", value.toJsFn)
    
    inline def setGet_wikiHtmlContent(value: CallbackTo[String]): Self = StObject.set(x, "get_wikiHtmlContent", value.toJsFn)
    
    inline def setSet_serverRelativeUrl(value: String => Callback): Self = StObject.set(x, "set_serverRelativeUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_wikiHtmlContent(value: String => Callback): Self = StObject.set(x, "set_wikiHtmlContent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
