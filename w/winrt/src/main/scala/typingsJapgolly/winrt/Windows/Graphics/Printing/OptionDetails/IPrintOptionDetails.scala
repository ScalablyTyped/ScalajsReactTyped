package typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintOptionDetails extends js.Object {
  var errorText: String
  var optionId: String
  var optionType: PrintOptionType
  var state: PrintOptionStates
  var value: js.Any
  def trySetValue(value: js.Any): Boolean
}

object IPrintOptionDetails {
  @scala.inline
  def apply(
    errorText: String,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => CallbackTo[Boolean],
    value: js.Any
  ): IPrintOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("trySetValue")(js.Any.fromFunction1((t0: js.Any) => trySetValue(t0).runNow()))
    __obj.asInstanceOf[IPrintOptionDetails]
  }
}

