package typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintCustomTextOptionDetails extends IPrintCustomOptionDetails {
  var maxCharacters: Double
}

object IPrintCustomTextOptionDetails {
  @scala.inline
  def apply(
    displayName: String,
    errorText: String,
    maxCharacters: Double,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => CallbackTo[Boolean],
    value: js.Any
  ): IPrintCustomTextOptionDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], maxCharacters = maxCharacters.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("trySetValue")(js.Any.fromFunction1((t0: js.Any) => trySetValue(t0).runNow()))
    __obj.asInstanceOf[IPrintCustomTextOptionDetails]
  }
}

