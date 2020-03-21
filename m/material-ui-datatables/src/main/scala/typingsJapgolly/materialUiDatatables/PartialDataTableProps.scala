package typingsJapgolly.materialUiDatatables

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialUiDatatables.materialUiDatatablesStrings.default
import typingsJapgolly.materialUiDatatables.materialUiDatatablesStrings.filter
import typingsJapgolly.materialUiDatatables.mod.Column
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<material-ui-datatables.material-ui-datatables.DataTableProps> */
trait PartialDataTableProps extends js.Object {
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var deselectOnClickaway: js.UndefOr[Boolean] = js.undefined
  var enableSelectAll: js.UndefOr[Boolean] = js.undefined
  var filterHintText: js.UndefOr[String] = js.undefined
  var filterValue: js.UndefOr[String] = js.undefined
  var fixedFooter: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var footerToolbarStyle: js.UndefOr[CSSProperties] = js.undefined
  var headerToolbarMode: js.UndefOr[default | filter | String] = js.undefined
  var height: js.UndefOr[js.Any] = js.undefined
  var multiSelectable: js.UndefOr[Boolean] = js.undefined
  var onCellClick: js.UndefOr[
    js.Function5[
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      /* row */ js.Any, 
      /* columnValue */ js.Any, 
      /* event */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var onCellDoubleClick: js.UndefOr[
    js.Function5[
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      /* row */ js.Any, 
      /* columnValue */ js.Any, 
      /* event */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var onFilterValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onNextPageClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onPreviousPageClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Any, Unit]] = js.undefined
  var onRowSizeChange: js.UndefOr[js.Function2[/* index */ Double, /* value */ js.Any, Unit]] = js.undefined
  var onSortOrderChange: js.UndefOr[js.Function2[/* key */ String, /* order */ String, Unit]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var rowSize: js.UndefOr[Double] = js.undefined
  var rowSizeLabel: js.UndefOr[String] = js.undefined
  var rowSizeList: js.UndefOr[js.Array[Double]] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var showCheckboxes: js.UndefOr[Boolean] = js.undefined
  var showFooterToolbar: js.UndefOr[Boolean] = js.undefined
  var showHeaderToolbar: js.UndefOr[Boolean] = js.undefined
  var showHeaderToolbarFilterIcon: js.UndefOr[Boolean] = js.undefined
  var showRowHover: js.UndefOr[Boolean] = js.undefined
  var showRowSizeControls: js.UndefOr[Boolean] = js.undefined
  var stripedRows: js.UndefOr[Boolean] = js.undefined
  var summaryLabelTemplate: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* count */ Double, _]] = js.undefined
  var tableBodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var tableHeaderColumnStyle: js.UndefOr[CSSProperties] = js.undefined
  var tableHeaderStyle: js.UndefOr[CSSProperties] = js.undefined
  var tableRowColumnStyle: js.UndefOr[CSSProperties] = js.undefined
  var tableRowStyle: js.UndefOr[CSSProperties] = js.undefined
  var tableStyle: js.UndefOr[CSSProperties] = js.undefined
  var tableWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
  var toolbarIconRight: js.UndefOr[js.Any] = js.undefined
}

object PartialDataTableProps {
  @scala.inline
  def apply(
    columns: js.Array[Column] = null,
    count: Int | Double = null,
    data: js.Array[_] = null,
    deselectOnClickaway: js.UndefOr[Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[Boolean] = js.undefined,
    filterHintText: String = null,
    filterValue: String = null,
    fixedFooter: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    footerToolbarStyle: CSSProperties = null,
    headerToolbarMode: default | filter | String = null,
    height: js.Any = null,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Callback = null,
    onCellDoubleClick: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Callback = null,
    onFilterValueChange: /* value */ String => Callback = null,
    onNextPageClick: /* event */ js.Any => Callback = null,
    onPreviousPageClick: /* event */ js.Any => Callback = null,
    onRowSelection: /* selectedRows */ js.Any => Callback = null,
    onRowSizeChange: (/* index */ Double, /* value */ js.Any) => Callback = null,
    onSortOrderChange: (/* key */ String, /* order */ String) => Callback = null,
    page: Int | Double = null,
    rowSize: Int | Double = null,
    rowSizeLabel: String = null,
    rowSizeList: js.Array[Double] = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showCheckboxes: js.UndefOr[Boolean] = js.undefined,
    showFooterToolbar: js.UndefOr[Boolean] = js.undefined,
    showHeaderToolbar: js.UndefOr[Boolean] = js.undefined,
    showHeaderToolbarFilterIcon: js.UndefOr[Boolean] = js.undefined,
    showRowHover: js.UndefOr[Boolean] = js.undefined,
    showRowSizeControls: js.UndefOr[Boolean] = js.undefined,
    stripedRows: js.UndefOr[Boolean] = js.undefined,
    summaryLabelTemplate: (/* start */ Double, /* end */ Double, /* count */ Double) => CallbackTo[js.Any] = null,
    tableBodyStyle: CSSProperties = null,
    tableHeaderColumnStyle: CSSProperties = null,
    tableHeaderStyle: CSSProperties = null,
    tableRowColumnStyle: CSSProperties = null,
    tableRowStyle: CSSProperties = null,
    tableStyle: CSSProperties = null,
    tableWrapperStyle: CSSProperties = null,
    title: String = null,
    titleStyle: CSSProperties = null,
    toolbarIconRight: js.Any = null
  ): PartialDataTableProps = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(deselectOnClickaway)) __obj.updateDynamic("deselectOnClickaway")(deselectOnClickaway.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll.asInstanceOf[js.Any])
    if (filterHintText != null) __obj.updateDynamic("filterHintText")(filterHintText.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedFooter)) __obj.updateDynamic("fixedFooter")(fixedFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (footerToolbarStyle != null) __obj.updateDynamic("footerToolbarStyle")(footerToolbarStyle.asInstanceOf[js.Any])
    if (headerToolbarMode != null) __obj.updateDynamic("headerToolbarMode")(headerToolbarMode.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction5((t0: /* rowIndex */ scala.Double, t1: /* columnIndex */ scala.Double, t2: /* row */ js.Any, t3: /* columnValue */ js.Any, t4: /* event */ js.Any) => onCellClick(t0, t1, t2, t3, t4).runNow()))
    if (onCellDoubleClick != null) __obj.updateDynamic("onCellDoubleClick")(js.Any.fromFunction5((t0: /* rowIndex */ scala.Double, t1: /* columnIndex */ scala.Double, t2: /* row */ js.Any, t3: /* columnValue */ js.Any, t4: /* event */ js.Any) => onCellDoubleClick(t0, t1, t2, t3, t4).runNow()))
    if (onFilterValueChange != null) __obj.updateDynamic("onFilterValueChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onFilterValueChange(t0).runNow()))
    if (onNextPageClick != null) __obj.updateDynamic("onNextPageClick")(js.Any.fromFunction1((t0: /* event */ js.Any) => onNextPageClick(t0).runNow()))
    if (onPreviousPageClick != null) __obj.updateDynamic("onPreviousPageClick")(js.Any.fromFunction1((t0: /* event */ js.Any) => onPreviousPageClick(t0).runNow()))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1((t0: /* selectedRows */ js.Any) => onRowSelection(t0).runNow()))
    if (onRowSizeChange != null) __obj.updateDynamic("onRowSizeChange")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* value */ js.Any) => onRowSizeChange(t0, t1).runNow()))
    if (onSortOrderChange != null) __obj.updateDynamic("onSortOrderChange")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* order */ java.lang.String) => onSortOrderChange(t0, t1).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (rowSizeLabel != null) __obj.updateDynamic("rowSizeLabel")(rowSizeLabel.asInstanceOf[js.Any])
    if (rowSizeList != null) __obj.updateDynamic("rowSizeList")(rowSizeList.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckboxes)) __obj.updateDynamic("showCheckboxes")(showCheckboxes.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooterToolbar)) __obj.updateDynamic("showFooterToolbar")(showFooterToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeaderToolbar)) __obj.updateDynamic("showHeaderToolbar")(showHeaderToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeaderToolbarFilterIcon)) __obj.updateDynamic("showHeaderToolbarFilterIcon")(showHeaderToolbarFilterIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowHover)) __obj.updateDynamic("showRowHover")(showRowHover.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowSizeControls)) __obj.updateDynamic("showRowSizeControls")(showRowSizeControls.asInstanceOf[js.Any])
    if (!js.isUndefined(stripedRows)) __obj.updateDynamic("stripedRows")(stripedRows.asInstanceOf[js.Any])
    if (summaryLabelTemplate != null) __obj.updateDynamic("summaryLabelTemplate")(js.Any.fromFunction3((t0: /* start */ scala.Double, t1: /* end */ scala.Double, t2: /* count */ scala.Double) => summaryLabelTemplate(t0, t1, t2).runNow()))
    if (tableBodyStyle != null) __obj.updateDynamic("tableBodyStyle")(tableBodyStyle.asInstanceOf[js.Any])
    if (tableHeaderColumnStyle != null) __obj.updateDynamic("tableHeaderColumnStyle")(tableHeaderColumnStyle.asInstanceOf[js.Any])
    if (tableHeaderStyle != null) __obj.updateDynamic("tableHeaderStyle")(tableHeaderStyle.asInstanceOf[js.Any])
    if (tableRowColumnStyle != null) __obj.updateDynamic("tableRowColumnStyle")(tableRowColumnStyle.asInstanceOf[js.Any])
    if (tableRowStyle != null) __obj.updateDynamic("tableRowStyle")(tableRowStyle.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (tableWrapperStyle != null) __obj.updateDynamic("tableWrapperStyle")(tableWrapperStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (toolbarIconRight != null) __obj.updateDynamic("toolbarIconRight")(toolbarIconRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDataTableProps]
  }
}

