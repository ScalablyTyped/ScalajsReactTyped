package typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails.IPrintOptionDetails because Already inherited
- typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails.IPrintCustomOptionDetails because var conflicts: errorText, optionId, optionType, state, value. Inlined displayName */ trait IPrintCustomItemListOptionDetails extends IPrintItemListOptionDetails {
  var displayName: String
  def addItem(itemId: String, displayName: String): Unit
}

object IPrintCustomItemListOptionDetails {
  @scala.inline
  def apply(
    addItem: (String, String) => Callback,
    displayName: String,
    errorText: String,
    items: IVectorView[_],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => CallbackTo[Boolean],
    value: js.Any
  ): IPrintCustomItemListOptionDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("addItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addItem(t0, t1).runNow()))
    __obj.updateDynamic("trySetValue")(js.Any.fromFunction1((t0: js.Any) => trySetValue(t0).runNow()))
    __obj.asInstanceOf[IPrintCustomItemListOptionDetails]
  }
}

