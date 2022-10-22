package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySuggestionResults
  extends StObject
     with ClientValueObject {
  
  def get_peopleNames(): js.Array[String]
  
  def get_personalResults(): js.Array[PersonalResultSuggestion]
  
  def get_queries(): js.Array[QuerySuggestionQuery]
  
  def set_peopleNames(value: js.Array[String]): Unit
  
  def set_personalResults(value: js.Array[PersonalResultSuggestion]): Unit
  
  def set_queries(value: js.Array[QuerySuggestionQuery]): Unit
}
object QuerySuggestionResults {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_peopleNames: CallbackTo[js.Array[String]],
    get_personalResults: CallbackTo[js.Array[PersonalResultSuggestion]],
    get_queries: CallbackTo[js.Array[QuerySuggestionQuery]],
    get_typeId: CallbackTo[String],
    set_peopleNames: js.Array[String] => Callback,
    set_personalResults: js.Array[PersonalResultSuggestion] => Callback,
    set_queries: js.Array[QuerySuggestionQuery] => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): QuerySuggestionResults = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_peopleNames = get_peopleNames.toJsFn, get_personalResults = get_personalResults.toJsFn, get_queries = get_queries.toJsFn, get_typeId = get_typeId.toJsFn, set_peopleNames = js.Any.fromFunction1((t0: js.Array[String]) => set_peopleNames(t0).runNow()), set_personalResults = js.Any.fromFunction1((t0: js.Array[PersonalResultSuggestion]) => set_personalResults(t0).runNow()), set_queries = js.Any.fromFunction1((t0: js.Array[QuerySuggestionQuery]) => set_queries(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[QuerySuggestionResults]
  }
  
  extension [Self <: QuerySuggestionResults](x: Self) {
    
    inline def setGet_peopleNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_peopleNames", value.toJsFn)
    
    inline def setGet_personalResults(value: CallbackTo[js.Array[PersonalResultSuggestion]]): Self = StObject.set(x, "get_personalResults", value.toJsFn)
    
    inline def setGet_queries(value: CallbackTo[js.Array[QuerySuggestionQuery]]): Self = StObject.set(x, "get_queries", value.toJsFn)
    
    inline def setSet_peopleNames(value: js.Array[String] => Callback): Self = StObject.set(x, "set_peopleNames", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setSet_personalResults(value: js.Array[PersonalResultSuggestion] => Callback): Self = StObject.set(x, "set_personalResults", js.Any.fromFunction1((t0: js.Array[PersonalResultSuggestion]) => value(t0).runNow()))
    
    inline def setSet_queries(value: js.Array[QuerySuggestionQuery] => Callback): Self = StObject.set(x, "set_queries", js.Any.fromFunction1((t0: js.Array[QuerySuggestionQuery]) => value(t0).runNow()))
  }
}
