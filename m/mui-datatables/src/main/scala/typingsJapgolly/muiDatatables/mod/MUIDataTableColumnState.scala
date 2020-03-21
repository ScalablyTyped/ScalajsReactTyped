package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.muiDatatables.muiDatatablesStrings.`false`
import typingsJapgolly.muiDatatables.muiDatatablesStrings.`true`
import typingsJapgolly.muiDatatables.muiDatatablesStrings.asc
import typingsJapgolly.muiDatatables.muiDatatablesStrings.desc
import typingsJapgolly.muiDatatables.muiDatatablesStrings.excluded
import typingsJapgolly.muiDatatables.muiDatatablesStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableColumnState extends MUIDataTableColumnOptions {
  var label: js.UndefOr[String] = js.undefined
  var name: String
}

object MUIDataTableColumnState {
  @scala.inline
  def apply(
    name: String,
    customBodyRender: (/* value */ js.Any, /* tableMeta */ MUIDataTableMeta, /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, js.Any]) => CallbackTo[String | Node] = null,
    customFilterListRender: /* value */ js.Any => CallbackTo[String] = null,
    customHeadRender: (/* columnMeta */ MUIDataTableCustomHeadRenderer, /* updateDirection */ js.Function1[/* params */ js.Any, js.Any]) => CallbackTo[String | Node] = null,
    display: `true` | `false` | excluded = null,
    download: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterList: js.Array[String] = null,
    filterOptions: MUIDataTableFilterOptions = null,
    filterType: FilterType = null,
    hint: String = null,
    label: String = null,
    print: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    setCellHeaderProps: /* columnMeta */ MUIDataTableCustomHeadRenderer => CallbackTo[js.Object] = null,
    setCellProps: (/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double) => CallbackTo[js.Object] = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    sortDirection: asc | desc | none = null,
    viewColumns: js.UndefOr[Boolean] = js.undefined
  ): MUIDataTableColumnState = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (customBodyRender != null) __obj.updateDynamic("customBodyRender")(js.Any.fromFunction3((t0: /* value */ js.Any, t1: /* tableMeta */ typingsJapgolly.muiDatatables.mod.MUIDataTableMeta, t2: /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, js.Any]) => customBodyRender(t0, t1, t2).runNow()))
    if (customFilterListRender != null) __obj.updateDynamic("customFilterListRender")(js.Any.fromFunction1((t0: /* value */ js.Any) => customFilterListRender(t0).runNow()))
    if (customHeadRender != null) __obj.updateDynamic("customHeadRender")(js.Any.fromFunction2((t0: /* columnMeta */ typingsJapgolly.muiDatatables.mod.MUIDataTableCustomHeadRenderer, t1: /* updateDirection */ js.Function1[/* params */ js.Any, js.Any]) => customHeadRender(t0, t1).runNow()))
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (setCellHeaderProps != null) __obj.updateDynamic("setCellHeaderProps")(js.Any.fromFunction1((t0: /* columnMeta */ typingsJapgolly.muiDatatables.mod.MUIDataTableCustomHeadRenderer) => setCellHeaderProps(t0).runNow()))
    if (setCellProps != null) __obj.updateDynamic("setCellProps")(js.Any.fromFunction3((t0: /* cellValue */ java.lang.String, t1: /* rowIndex */ scala.Double, t2: /* columnIndex */ scala.Double) => setCellProps(t0, t1, t2).runNow()))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(viewColumns)) __obj.updateDynamic("viewColumns")(viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableColumnState]
  }
}

