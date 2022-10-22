package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPaneSuggestionsRequest
  extends StObject
     with ISearchPaneSuggestionsRequest
object SearchPaneSuggestionsRequest {
  
  inline def apply(
    getDeferral: CallbackTo[SearchPaneSuggestionsRequestDeferral],
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): SearchPaneSuggestionsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, isCanceled = isCanceled.asInstanceOf[js.Any], searchSuggestionCollection = searchSuggestionCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneSuggestionsRequest]
  }
}
