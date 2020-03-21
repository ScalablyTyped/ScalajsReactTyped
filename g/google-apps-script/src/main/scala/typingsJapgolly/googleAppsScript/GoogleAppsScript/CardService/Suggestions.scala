package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Autocomplete suggestions to supplement a TextInput widget.
  *
  *     var textInput = CardService.newTextInput()
  *         .setSuggestions(CardService.newSuggestions()
  *             .addSuggestion("First suggestion")
  *             .addSuggestion("Second suggestion"))
  */
trait Suggestions extends js.Object {
  def addSuggestion(suggestion: String): Suggestions
  def addSuggestions(suggestions: js.Array[String]): Suggestions
}

object Suggestions {
  @scala.inline
  def apply(
    addSuggestion: String => CallbackTo[Suggestions],
    addSuggestions: js.Array[String] => CallbackTo[Suggestions]
  ): Suggestions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSuggestion")(js.Any.fromFunction1((t0: java.lang.String) => addSuggestion(t0).runNow()))
    __obj.updateDynamic("addSuggestions")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => addSuggestions(t0).runNow()))
    __obj.asInstanceOf[Suggestions]
  }
}

