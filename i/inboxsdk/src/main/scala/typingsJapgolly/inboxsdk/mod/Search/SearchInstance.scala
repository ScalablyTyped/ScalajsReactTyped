package typingsJapgolly.inboxsdk.mod.Search

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInstance extends js.Object {
  def registerSearchQueryRewriter(rewriter: SearchQueryRewriter): Unit
  def registerSearchSuggestionsProvider(
    handler: js.Function1[
      /* query */ String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ]
  ): Unit
}

object SearchInstance {
  @scala.inline
  def apply(
    registerSearchQueryRewriter: SearchQueryRewriter => Callback,
    registerSearchSuggestionsProvider: js.Function1[
      /* query */ String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ] => Callback
  ): SearchInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerSearchQueryRewriter")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Search.SearchQueryRewriter) => registerSearchQueryRewriter(t0).runNow()))
    __obj.updateDynamic("registerSearchSuggestionsProvider")(js.Any.fromFunction1((t0: js.Function1[
  /* query */ java.lang.String, 
  js.Array[typingsJapgolly.inboxsdk.mod.Search.AutocompleteSearchResult] | js.Promise[js.Array[typingsJapgolly.inboxsdk.mod.Search.AutocompleteSearchResult]]]) => registerSearchSuggestionsProvider(t0).runNow()))
    __obj.asInstanceOf[SearchInstance]
  }
}

