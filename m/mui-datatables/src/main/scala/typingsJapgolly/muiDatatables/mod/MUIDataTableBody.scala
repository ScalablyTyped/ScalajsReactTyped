package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.muiDatatables.AnonRowIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableBody extends js.Object {
  var classes: js.Object
  var columns: js.Array[MUIDataTableColumnDef]
  var count: Double
  var data: js.Array[js.Object | (js.Array[Double | String])]
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var onRowClick: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex, Unit]] = js.undefined
  var options: js.Object
  var searchText: js.UndefOr[String] = js.undefined
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var selectedRows: js.UndefOr[js.Object] = js.undefined
  var toggleExpandRow: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
}

object MUIDataTableBody {
  @scala.inline
  def apply(
    classes: js.Object,
    columns: js.Array[MUIDataTableColumnDef],
    count: Double,
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: js.Object,
    filterList: js.Array[js.Array[String]] = null,
    onRowClick: (/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex) => Callback = null,
    searchText: String = null,
    selectRowUpdate: /* args */ js.Any => CallbackTo[js.Any] = null,
    selectedRows: js.Object = null,
    toggleExpandRow: /* args */ js.Any => CallbackTo[js.Any] = null
  ): MUIDataTableBody = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2((t0: /* rowData */ js.Array[java.lang.String], t1: /* rowMeta */ typingsJapgolly.muiDatatables.AnonRowIndex) => onRowClick(t0, t1).runNow()))
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (selectRowUpdate != null) __obj.updateDynamic("selectRowUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => selectRowUpdate(t0).runNow()))
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows.asInstanceOf[js.Any])
    if (toggleExpandRow != null) __obj.updateDynamic("toggleExpandRow")(js.Any.fromFunction1((t0: /* args */ js.Any) => toggleExpandRow(t0).runNow()))
    __obj.asInstanceOf[MUIDataTableBody]
  }
}

