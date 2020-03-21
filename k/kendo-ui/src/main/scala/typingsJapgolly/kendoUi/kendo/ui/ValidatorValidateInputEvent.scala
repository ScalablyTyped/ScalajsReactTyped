package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorValidateInputEvent extends ValidatorEvent {
  var input: js.UndefOr[JQuery] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object ValidatorValidateInputEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Validator,
    input: JQuery = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): ValidatorValidateInputEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorValidateInputEvent]
  }
}

