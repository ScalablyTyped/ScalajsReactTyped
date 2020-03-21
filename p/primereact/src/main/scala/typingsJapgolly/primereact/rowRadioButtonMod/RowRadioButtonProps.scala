package typingsJapgolly.primereact.rowRadioButtonMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.primereact.AnonDataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowRadioButtonProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ AnonDataObject, Unit]] = js.undefined
  var rowData: js.UndefOr[js.Object] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
}

object RowRadioButtonProps {
  @scala.inline
  def apply(
    onClick: /* e */ AnonDataObject => Callback = null,
    rowData: js.Object = null,
    selected: js.UndefOr[Boolean] = js.undefined
  ): RowRadioButtonProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataObject) => onClick(t0).runNow()))
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowRadioButtonProps]
  }
}

