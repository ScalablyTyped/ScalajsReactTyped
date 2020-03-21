package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An input field that allows choosing between a set of predefined options.
  *
  *     var checkboxGroup = CardService.newSelectionInput()
  *         .setType(CardService.SelectionInputType.CHECK_BOX)
  *         .setTitle("A group of checkboxes. Multiple selections are allowed.")
  *         .setFieldName("checkbox_field")
  *         .addItem("checkbox one title", "checkbox_one_value", false)
  *         .addItem("checkbox two title", "checkbox_two_value", true)
  *         .addItem("checkbox three title", "checkbox_three_value", false)
  *         .setOnChangeAction(CardService.newAction()
  *             .setFunctionName("handleCheckboxChange"));
  *
  *     var radioGroup = CardService.newSelectionInput()
  *         .setType(CardService.SelectionInputType.RADIO_BUTTON)
  *         .setTitle("A group of radio buttons. Only a single selection is allowed.")
  *         .setFieldName("checkbox_field")
  *         .addItem("radio button one title", "radio_one_value", true)
  *         .addItem("radio button two title", "radio_two_value", true)
  *         .addItem("radio button three title", "radio_three_value", false);
  */
trait SelectionInput extends js.Object {
  def addItem(text: js.Any, value: js.Any, selected: Boolean): SelectionInput
  def setFieldName(fieldName: String): SelectionInput
  def setOnChangeAction(action: Action): SelectionInput
  def setTitle(title: String): SelectionInput
  def setType(`type`: SelectionInputType): SelectionInput
}

object SelectionInput {
  @scala.inline
  def apply(
    addItem: (js.Any, js.Any, Boolean) => CallbackTo[SelectionInput],
    setFieldName: String => CallbackTo[SelectionInput],
    setOnChangeAction: Action => CallbackTo[SelectionInput],
    setTitle: String => CallbackTo[SelectionInput],
    setType: SelectionInputType => CallbackTo[SelectionInput]
  ): SelectionInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItem")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: scala.Boolean) => addItem(t0, t1, t2).runNow()))
    __obj.updateDynamic("setFieldName")(js.Any.fromFunction1((t0: java.lang.String) => setFieldName(t0).runNow()))
    __obj.updateDynamic("setOnChangeAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnChangeAction(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.SelectionInputType) => setType(t0).runNow()))
    __obj.asInstanceOf[SelectionInput]
  }
}

