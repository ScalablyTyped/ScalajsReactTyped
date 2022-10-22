package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneSuggestionsRequest extends StObject {
  
  def getDeferral(): SearchPaneSuggestionsRequestDeferral
  
  var isCanceled: Boolean
  
  var searchSuggestionCollection: SearchSuggestionCollection
}
object ISearchPaneSuggestionsRequest {
  
  inline def apply(
    getDeferral: CallbackTo[SearchPaneSuggestionsRequestDeferral],
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): ISearchPaneSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, isCanceled = isCanceled.asInstanceOf[js.Any], searchSuggestionCollection = searchSuggestionCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneSuggestionsRequest]
  }
  
  extension [Self <: ISearchPaneSuggestionsRequest](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[SearchPaneSuggestionsRequestDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    inline def setSearchSuggestionCollection(value: SearchSuggestionCollection): Self = StObject.set(x, "searchSuggestionCollection", value.asInstanceOf[js.Any])
  }
}
