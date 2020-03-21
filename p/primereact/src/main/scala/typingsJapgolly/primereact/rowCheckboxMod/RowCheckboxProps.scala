package typingsJapgolly.primereact.rowCheckboxMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.primereact.AnonCheckedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowCheckboxProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ AnonCheckedData, Unit]] = js.undefined
  var rowData: js.UndefOr[js.Object] = js.undefined
}

object RowCheckboxProps {
  @scala.inline
  def apply(onClick: /* e */ AnonCheckedData => Callback = null, rowData: js.Object = null): RowCheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonCheckedData) => onClick(t0).runNow()))
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowCheckboxProps]
  }
}

