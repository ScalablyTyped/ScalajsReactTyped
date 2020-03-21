package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneSuggestionsRequest extends js.Object {
  var isCanceled: Boolean
  var searchSuggestionCollection: SearchSuggestionCollection
  def getDeferral(): SearchPaneSuggestionsRequestDeferral
}

object ISearchPaneSuggestionsRequest {
  @scala.inline
  def apply(
    getDeferral: CallbackTo[SearchPaneSuggestionsRequestDeferral],
    isCanceled: Boolean,
    searchSuggestionCollection: SearchSuggestionCollection
  ): ISearchPaneSuggestionsRequest = {
    val __obj = js.Dynamic.literal(isCanceled = isCanceled.asInstanceOf[js.Any], searchSuggestionCollection = searchSuggestionCollection.asInstanceOf[js.Any])
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[ISearchPaneSuggestionsRequest]
  }
}

