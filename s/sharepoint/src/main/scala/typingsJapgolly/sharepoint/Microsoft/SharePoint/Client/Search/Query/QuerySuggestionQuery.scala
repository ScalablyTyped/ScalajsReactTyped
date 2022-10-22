package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySuggestionQuery
  extends StObject
     with ClientValueObject {
  
  def get_isPersonal(): Boolean
  
  def get_query(): String
  
  def set_isPersonal(value: Boolean): Unit
  
  def set_query(value: String): Unit
}
object QuerySuggestionQuery {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_isPersonal: CallbackTo[Boolean],
    get_query: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_isPersonal: Boolean => Callback,
    set_query: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): QuerySuggestionQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_isPersonal = get_isPersonal.toJsFn, get_query = get_query.toJsFn, get_typeId = get_typeId.toJsFn, set_isPersonal = js.Any.fromFunction1((t0: Boolean) => set_isPersonal(t0).runNow()), set_query = js.Any.fromFunction1((t0: String) => set_query(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[QuerySuggestionQuery]
  }
  
  extension [Self <: QuerySuggestionQuery](x: Self) {
    
    inline def setGet_isPersonal(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isPersonal", value.toJsFn)
    
    inline def setGet_query(value: CallbackTo[String]): Self = StObject.set(x, "get_query", value.toJsFn)
    
    inline def setSet_isPersonal(value: Boolean => Callback): Self = StObject.set(x, "set_isPersonal", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_query(value: String => Callback): Self = StObject.set(x, "set_query", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
