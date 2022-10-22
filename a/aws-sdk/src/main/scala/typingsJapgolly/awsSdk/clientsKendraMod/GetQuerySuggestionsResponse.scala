package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQuerySuggestionsResponse extends StObject {
  
  /**
    * The unique identifier for a list of query suggestions for an index.
    */
  var QuerySuggestionsId: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.QuerySuggestionsId] = js.undefined
  
  /**
    * A list of query suggestions for an index.
    */
  var Suggestions: js.UndefOr[SuggestionList] = js.undefined
}
object GetQuerySuggestionsResponse {
  
  inline def apply(): GetQuerySuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQuerySuggestionsResponse]
  }
  
  extension [Self <: GetQuerySuggestionsResponse](x: Self) {
    
    inline def setQuerySuggestionsId(value: QuerySuggestionsId): Self = StObject.set(x, "QuerySuggestionsId", value.asInstanceOf[js.Any])
    
    inline def setQuerySuggestionsIdUndefined: Self = StObject.set(x, "QuerySuggestionsId", js.undefined)
    
    inline def setSuggestions(value: SuggestionList): Self = StObject.set(x, "Suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "Suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: Suggestion*): Self = StObject.set(x, "Suggestions", js.Array(value*))
  }
}
