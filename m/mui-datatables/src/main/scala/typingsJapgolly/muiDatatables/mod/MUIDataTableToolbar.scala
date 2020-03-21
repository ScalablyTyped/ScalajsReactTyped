package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableToolbar extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var columns: js.Array[MUIDataTableColumnDef]
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var filterData: js.UndefOr[js.Any] = js.undefined
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var filterUpdate: js.UndefOr[js.Any] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var resetFilters: js.UndefOr[js.Any] = js.undefined
  var searchTextUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var setTableActions: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var tableRef: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var title: js.UndefOr[js.Any] = js.undefined
  var toggleViewColumn: js.UndefOr[js.Any] = js.undefined
}

object MUIDataTableToolbar {
  @scala.inline
  def apply(
    columns: js.Array[MUIDataTableColumnDef],
    classes: js.Object = null,
    data: js.Array[_] = null,
    filterData: js.Any = null,
    filterList: js.Array[js.Array[String]] = null,
    filterUpdate: js.Any = null,
    options: js.Object = null,
    resetFilters: js.Any = null,
    searchTextUpdate: /* args */ js.Any => CallbackTo[js.Any] = null,
    setTableActions: /* args */ js.Any => CallbackTo[js.Any] = null,
    tableRef: /* args */ js.Any => CallbackTo[js.Any] = null,
    title: js.Any = null,
    toggleViewColumn: js.Any = null
  ): MUIDataTableToolbar = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (filterData != null) __obj.updateDynamic("filterData")(filterData.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (filterUpdate != null) __obj.updateDynamic("filterUpdate")(filterUpdate.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resetFilters != null) __obj.updateDynamic("resetFilters")(resetFilters.asInstanceOf[js.Any])
    if (searchTextUpdate != null) __obj.updateDynamic("searchTextUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => searchTextUpdate(t0).runNow()))
    if (setTableActions != null) __obj.updateDynamic("setTableActions")(js.Any.fromFunction1((t0: /* args */ js.Any) => setTableActions(t0).runNow()))
    if (tableRef != null) __obj.updateDynamic("tableRef")(js.Any.fromFunction1((t0: /* args */ js.Any) => tableRef(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toggleViewColumn != null) __obj.updateDynamic("toggleViewColumn")(toggleViewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableToolbar]
  }
}

