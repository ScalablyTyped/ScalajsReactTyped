package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A input field widget that accepts text input.
  *
  *     var textInput = CardService.newTextInput()
  *         .setFieldName("text_input_form_input_key")
  *         .setTitle("Text input title")
  *         .setHint("Text input hint");
  */
trait TextInput extends js.Object {
  def setFieldName(fieldName: String): TextInput
  def setHint(hint: String): TextInput
  def setMultiline(multiline: Boolean): TextInput
  def setOnChangeAction(action: Action): TextInput
  def setSuggestions(suggestions: Suggestions): TextInput
  def setSuggestionsAction(suggestionsAction: Action): TextInput
  def setTitle(title: String): TextInput
  def setValue(value: String): TextInput
}

object TextInput {
  @scala.inline
  def apply(
    setFieldName: String => CallbackTo[TextInput],
    setHint: String => CallbackTo[TextInput],
    setMultiline: Boolean => CallbackTo[TextInput],
    setOnChangeAction: Action => CallbackTo[TextInput],
    setSuggestions: Suggestions => CallbackTo[TextInput],
    setSuggestionsAction: Action => CallbackTo[TextInput],
    setTitle: String => CallbackTo[TextInput],
    setValue: String => CallbackTo[TextInput]
  ): TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFieldName")(js.Any.fromFunction1((t0: java.lang.String) => setFieldName(t0).runNow()))
    __obj.updateDynamic("setHint")(js.Any.fromFunction1((t0: java.lang.String) => setHint(t0).runNow()))
    __obj.updateDynamic("setMultiline")(js.Any.fromFunction1((t0: scala.Boolean) => setMultiline(t0).runNow()))
    __obj.updateDynamic("setOnChangeAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnChangeAction(t0).runNow()))
    __obj.updateDynamic("setSuggestions")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Suggestions) => setSuggestions(t0).runNow()))
    __obj.updateDynamic("setSuggestionsAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setSuggestionsAction(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.asInstanceOf[TextInput]
  }
}

