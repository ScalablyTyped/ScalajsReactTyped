package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for SuggestionsResponse objects.
  */
trait SuggestionsResponseBuilder extends js.Object {
  def build(): SuggestionsResponse
  def setSuggestions(suggestions: Suggestions): SuggestionsResponseBuilder
}

object SuggestionsResponseBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[SuggestionsResponse],
    setSuggestions: Suggestions => CallbackTo[SuggestionsResponseBuilder]
  ): SuggestionsResponseBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setSuggestions")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Suggestions) => setSuggestions(t0).runNow()))
    __obj.asInstanceOf[SuggestionsResponseBuilder]
  }
}

