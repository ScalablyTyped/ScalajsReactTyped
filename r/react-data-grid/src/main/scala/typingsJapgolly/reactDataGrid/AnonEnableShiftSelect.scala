package typingsJapgolly.reactDataGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.SelectionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnableShiftSelect[T] extends js.Object {
  var enableShiftSelect: js.UndefOr[Boolean] = js.undefined
  var onRowsDeselected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.undefined
  var onRowsSelected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.undefined
  var selectBy: js.UndefOr[AnonIndexes] = js.undefined
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
}

object AnonEnableShiftSelect {
  @scala.inline
  def apply[T](
    enableShiftSelect: js.UndefOr[Boolean] = js.undefined,
    onRowsDeselected: /* rows */ js.Array[SelectionParams[T]] => Callback = null,
    onRowsSelected: /* rows */ js.Array[SelectionParams[T]] => Callback = null,
    selectBy: AnonIndexes = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined
  ): AnonEnableShiftSelect[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableShiftSelect)) __obj.updateDynamic("enableShiftSelect")(enableShiftSelect.asInstanceOf[js.Any])
    if (onRowsDeselected != null) __obj.updateDynamic("onRowsDeselected")(js.Any.fromFunction1((t0: /* rows */ js.Array[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.SelectionParams[T]]) => onRowsDeselected(t0).runNow()))
    if (onRowsSelected != null) __obj.updateDynamic("onRowsSelected")(js.Any.fromFunction1((t0: /* rows */ js.Array[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.SelectionParams[T]]) => onRowsSelected(t0).runNow()))
    if (selectBy != null) __obj.updateDynamic("selectBy")(selectBy.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnableShiftSelect[T]]
  }
}

