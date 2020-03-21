package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response object that can be returned from a suggestions callback function. This is used with
  * TextInput widgets that implement autocomplete.
  *
  *     var suggestionsResponse = CardService.newSuggestionsResponseBuilder()
  *         .setSuggestions(CardService.newSuggestions()
  *             .addSuggestion("First suggestion")
  *             .addSuggestion("Second suggestion"))
  *             .build();
  */
trait SuggestionsResponse extends js.Object {
  def printJson(): String
}

object SuggestionsResponse {
  @scala.inline
  def apply(printJson: CallbackTo[String]): SuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.asInstanceOf[SuggestionsResponse]
  }
}

