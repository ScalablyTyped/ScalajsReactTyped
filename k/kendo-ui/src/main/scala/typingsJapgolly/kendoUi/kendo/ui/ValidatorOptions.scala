package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorOptions extends js.Object {
  var errorTemplate: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var validate: js.UndefOr[js.Function1[/* e */ ValidatorValidateEvent, Unit]] = js.undefined
  var validateInput: js.UndefOr[js.Function1[/* e */ ValidatorValidateInputEvent, Unit]] = js.undefined
  var validateOnBlur: js.UndefOr[Boolean] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    errorTemplate: String = null,
    messages: js.Any = null,
    name: String = null,
    rules: js.Any = null,
    validate: /* e */ ValidatorValidateEvent => Callback = null,
    validateInput: /* e */ ValidatorValidateInputEvent => Callback = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (errorTemplate != null) __obj.updateDynamic("errorTemplate")(errorTemplate.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ValidatorValidateEvent) => validate(t0).runNow()))
    if (validateInput != null) __obj.updateDynamic("validateInput")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ValidatorValidateInputEvent) => validateInput(t0).runNow()))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

