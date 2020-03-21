package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A UI element that supports being toggled on or off. This can only be used within a KeyValue widget.
  *
  *     var switchKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Switch key value widget label")
  *         .setContent("This is a key value widget with a switch on the right")
  *         .setSwitch(CardService.newSwitch()
  *             .setFieldName("form_input_switch_key")
  *             .setValue("form_input_switch_value")
  *             .setOnChangeAction(CardService.newAction()
  *                 .setFunctionName("handleSwitchChange")));
  */
trait Switch extends js.Object {
  def setFieldName(fieldName: String): Switch
  def setOnChangeAction(action: Action): Switch
  def setSelected(selected: Boolean): Switch
  def setValue(value: String): Switch
}

object Switch {
  @scala.inline
  def apply(
    setFieldName: String => CallbackTo[Switch],
    setOnChangeAction: Action => CallbackTo[Switch],
    setSelected: Boolean => CallbackTo[Switch],
    setValue: String => CallbackTo[Switch]
  ): Switch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFieldName")(js.Any.fromFunction1((t0: java.lang.String) => setFieldName(t0).runNow()))
    __obj.updateDynamic("setOnChangeAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnChangeAction(t0).runNow()))
    __obj.updateDynamic("setSelected")(js.Any.fromFunction1((t0: scala.Boolean) => setSelected(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.asInstanceOf[Switch]
  }
}

