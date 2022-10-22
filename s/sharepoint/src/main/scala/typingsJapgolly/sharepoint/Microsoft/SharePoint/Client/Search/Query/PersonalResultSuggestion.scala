package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonalResultSuggestion
  extends StObject
     with ClientValueObject {
  
  def get_highlightedTitle(): String
  
  def get_isBestBet(): Boolean
  
  def get_title(): String
  
  def get_url(): String
  
  def set_highlightedTitle(value: String): Unit
  
  def set_isBestBet(value: Boolean): Unit
  
  def set_title(value: String): Unit
  
  def set_url(value: String): Unit
}
object PersonalResultSuggestion {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_highlightedTitle: CallbackTo[String],
    get_isBestBet: CallbackTo[Boolean],
    get_title: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_url: CallbackTo[String],
    set_highlightedTitle: String => Callback,
    set_isBestBet: Boolean => Callback,
    set_title: String => Callback,
    set_url: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): PersonalResultSuggestion = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_highlightedTitle = get_highlightedTitle.toJsFn, get_isBestBet = get_isBestBet.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, get_url = get_url.toJsFn, set_highlightedTitle = js.Any.fromFunction1((t0: String) => set_highlightedTitle(t0).runNow()), set_isBestBet = js.Any.fromFunction1((t0: Boolean) => set_isBestBet(t0).runNow()), set_title = js.Any.fromFunction1((t0: String) => set_title(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[PersonalResultSuggestion]
  }
  
  extension [Self <: PersonalResultSuggestion](x: Self) {
    
    inline def setGet_highlightedTitle(value: CallbackTo[String]): Self = StObject.set(x, "get_highlightedTitle", value.toJsFn)
    
    inline def setGet_isBestBet(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isBestBet", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setSet_highlightedTitle(value: String => Callback): Self = StObject.set(x, "set_highlightedTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_isBestBet(value: Boolean => Callback): Self = StObject.set(x, "set_isBestBet", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_title(value: String => Callback): Self = StObject.set(x, "set_title", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
