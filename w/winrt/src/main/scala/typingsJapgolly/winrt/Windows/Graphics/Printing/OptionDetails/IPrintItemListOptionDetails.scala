package typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintItemListOptionDetails extends IPrintOptionDetails {
  var items: IVectorView[_]
}

object IPrintItemListOptionDetails {
  @scala.inline
  def apply(
    errorText: String,
    items: IVectorView[_],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => CallbackTo[Boolean],
    value: js.Any
  ): IPrintItemListOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("trySetValue")(js.Any.fromFunction1((t0: js.Any) => trySetValue(t0).runNow()))
    __obj.asInstanceOf[IPrintItemListOptionDetails]
  }
}

