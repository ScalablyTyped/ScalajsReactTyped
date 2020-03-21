package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.alphanum
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.array
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.boolean
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.clipboard
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.date
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.datetime
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.download
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.edit
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.exists
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.flip
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.number
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.string
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ColumnLookup extends js.Object

object _ColumnLookup {
  @scala.inline
  def ColumnComponent(
    delete: CallbackTo[js.Promise[Unit]],
    getCells: CallbackTo[js.Array[CellComponent]],
    getDefinition: CallbackTo[ColumnDefinition],
    getElement: CallbackTo[HTMLElement],
    getField: CallbackTo[String],
    getNextColumn: CallbackTo[typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent | `false`],
    getParentColumn: CallbackTo[typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent | `false`],
    getPrevColumn: CallbackTo[typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent | `false`],
    getSubColumns: CallbackTo[js.Array[typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent]],
    getTable: CallbackTo[typingsJapgolly.tabulatorTables.Tabulator],
    getVisibility: CallbackTo[Boolean],
    headerFilterFocus: Callback,
    hide: Callback,
    move: (ColumnLookup, Boolean) => Callback,
    reloadHeaderFilter: Callback,
    scrollTo: CallbackTo[js.Promise[Unit]],
    setHeaderFilterValue: js.Any => Callback,
    show: Callback,
    toggle: Callback,
    updateDefinition: ColumnDefinition => CallbackTo[js.Promise[Unit]]
  ): _ColumnLookup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("getCells")(getCells.toJsFn)
    __obj.updateDynamic("getDefinition")(getDefinition.toJsFn)
    __obj.updateDynamic("getElement")(getElement.toJsFn)
    __obj.updateDynamic("getField")(getField.toJsFn)
    __obj.updateDynamic("getNextColumn")(getNextColumn.toJsFn)
    __obj.updateDynamic("getParentColumn")(getParentColumn.toJsFn)
    __obj.updateDynamic("getPrevColumn")(getPrevColumn.toJsFn)
    __obj.updateDynamic("getSubColumns")(getSubColumns.toJsFn)
    __obj.updateDynamic("getTable")(getTable.toJsFn)
    __obj.updateDynamic("getVisibility")(getVisibility.toJsFn)
    __obj.updateDynamic("headerFilterFocus")(headerFilterFocus.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: typingsJapgolly.tabulatorTables.Tabulator.ColumnLookup, t1: scala.Boolean) => move(t0, t1).runNow()))
    __obj.updateDynamic("reloadHeaderFilter")(reloadHeaderFilter.toJsFn)
    __obj.updateDynamic("scrollTo")(scrollTo.toJsFn)
    __obj.updateDynamic("setHeaderFilterValue")(js.Any.fromFunction1((t0: js.Any) => setHeaderFilterValue(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.updateDynamic("updateDefinition")(js.Any.fromFunction1((t0: typingsJapgolly.tabulatorTables.Tabulator.ColumnDefinition) => updateDefinition(t0).runNow()))
    __obj.asInstanceOf[_ColumnLookup]
  }
  @scala.inline
  def ColumnDefinition(
    title: String,
    accessor: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => CallbackTo[js.Any] = null,
    accessorClipboard: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => CallbackTo[js.Any] = null,
    accessorClipboardParams: CustomAccessorParams = null,
    accessorDownload: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => CallbackTo[js.Any] = null,
    accessorDownloadParams: CustomAccessorParams = null,
    accessorParams: CustomAccessorParams = null,
    align: ColumnDefinitionAlign = null,
    bottomCalc: ColumnCalc = null,
    bottomCalcFormatter: Formatter = null,
    bottomCalcFormatterParams: FormatterParams = null,
    bottomCalcParams: (/* values */ js.Any, /* data */ js.Any) => CallbackTo[js.Any] = null,
    cellClick: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellContext: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellDblClick: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellDblTap: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellEditCancelled: /* cell */ CellComponent => Callback = null,
    cellEdited: /* cell */ CellComponent => Callback = null,
    cellEditing: /* cell */ CellComponent => Callback = null,
    cellMouseEnter: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseLeave: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseMove: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseOut: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseOver: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellTap: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellTapHold: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    clipboard: js.UndefOr[Boolean] = js.undefined,
    columns: js.Array[typingsJapgolly.tabulatorTables.Tabulator.ColumnDefinition] = null,
    cssClass: String = null,
    download: js.UndefOr[Boolean] = js.undefined,
    downloadTitle: String = null,
    editable: Boolean | (js.Function1[/* cell */ CellComponent, Boolean]) = null,
    editableTitle: js.UndefOr[Boolean] = js.undefined,
    editor: Editor = null,
    editorParams: EditorParams = null,
    field: String = null,
    formatter: Formatter = null,
    formatterParams: FormatterParams = null,
    frozen: js.UndefOr[Boolean] = js.undefined,
    headerClick: (/* e */ js.Any, /* column */ ColumnComponent) => Callback = null,
    headerContext: (/* e */ js.Any, /* column */ ColumnComponent) => Callback = null,
    headerDblClick: (/* e */ js.Any, /* column */ ColumnComponent) => Callback = null,
    headerDblTap: (/* e */ js.Any, /* column */ ColumnComponent) => Callback = null,
    headerFilter: Editor = null,
    headerFilterEmptyCheck: /* value */ js.Any => CallbackTo[Boolean] = null,
    headerFilterFunc: FilterType | (js.Function4[
      /* headerValue */ js.Any, 
      /* rowValue */ js.Any, 
      /* rowdata */ js.Any, 
      /* filterparams */ js.Any, 
      Boolean
    ]) = null,
    headerFilterFuncParams: js.Any = null,
    headerFilterLiveFilter: js.UndefOr[Boolean] = js.undefined,
    headerFilterParams: EditorParams = null,
    headerFilterPlaceholder: String = null,
    headerSort: js.UndefOr[Boolean] = js.undefined,
    headerSortStartingDir: SortDirection = null,
    headerSortTristate: js.UndefOr[Boolean] = js.undefined,
    headerTap: (/* e */ js.Any, /* column */ ColumnComponent) => Callback = null,
    headerTapHold: (/* e */ js.Any, /* column */ ColumnComponent) => Callback = null,
    headerTooltip: Boolean | String | (js.Function1[/* column */ ColumnComponent, String]) = null,
    headerVertical: Boolean | flip = null,
    hideInHtml: js.UndefOr[Boolean] = js.undefined,
    htmlOutput: js.UndefOr[Boolean] = js.undefined,
    minWidth: Int | Double = null,
    mutator: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => CallbackTo[js.Any] = null,
    mutatorClipboard: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => CallbackTo[js.Any] = null,
    mutatorClipboardParams: CustomMutatorParams = null,
    mutatorData: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => CallbackTo[js.Any] = null,
    mutatorDataParams: CustomMutatorParams = null,
    mutatorEdit: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => CallbackTo[js.Any] = null,
    mutatorEditParams: CustomMutatorParams = null,
    mutatorParams: CustomMutatorParams = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    responsive: Int | Double = null,
    rowHandle: js.UndefOr[Boolean] = js.undefined,
    sorter: string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* aRow */ RowComponent, 
      /* bRow */ RowComponent, 
      /* column */ ColumnComponent, 
      /* dir */ SortDirection, 
      /* sorterParams */ js.Object, 
      Double
    ]) = null,
    sorterParams: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction = null,
    titleFormatter: Formatter = null,
    titleFormatterParams: FormatterParams = null,
    tooltip: String | GlobalTooltipOption = null,
    topCalc: ColumnCalc = null,
    topCalcFormatter: Formatter = null,
    topCalcFormatterParams: FormatterParams = null,
    topCalcParams: (/* values */ js.Any, /* data */ js.Any) => CallbackTo[js.Any] = null,
    validator: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator = null,
    variableHeight: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    widthGrow: Int | Double = null,
    widthShrink: Int | Double = null
  ): _ColumnLookup = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (accessor != null) __obj.updateDynamic("accessor")(js.Any.fromFunction5((t0: /* value */ js.Any, t1: /* data */ js.Any, t2: /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.download | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.clipboard, t3: /* AccessorParams */ js.Any, t4: /* column */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent]) => accessor(t0, t1, t2, t3, t4).runNow()))
    if (accessorClipboard != null) __obj.updateDynamic("accessorClipboard")(js.Any.fromFunction5((t0: /* value */ js.Any, t1: /* data */ js.Any, t2: /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.download | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.clipboard, t3: /* AccessorParams */ js.Any, t4: /* column */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent]) => accessorClipboard(t0, t1, t2, t3, t4).runNow()))
    if (accessorClipboardParams != null) __obj.updateDynamic("accessorClipboardParams")(accessorClipboardParams.asInstanceOf[js.Any])
    if (accessorDownload != null) __obj.updateDynamic("accessorDownload")(js.Any.fromFunction5((t0: /* value */ js.Any, t1: /* data */ js.Any, t2: /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.download | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.clipboard, t3: /* AccessorParams */ js.Any, t4: /* column */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent]) => accessorDownload(t0, t1, t2, t3, t4).runNow()))
    if (accessorDownloadParams != null) __obj.updateDynamic("accessorDownloadParams")(accessorDownloadParams.asInstanceOf[js.Any])
    if (accessorParams != null) __obj.updateDynamic("accessorParams")(accessorParams.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bottomCalc != null) __obj.updateDynamic("bottomCalc")(bottomCalc.asInstanceOf[js.Any])
    if (bottomCalcFormatter != null) __obj.updateDynamic("bottomCalcFormatter")(bottomCalcFormatter.asInstanceOf[js.Any])
    if (bottomCalcFormatterParams != null) __obj.updateDynamic("bottomCalcFormatterParams")(bottomCalcFormatterParams.asInstanceOf[js.Any])
    if (bottomCalcParams != null) __obj.updateDynamic("bottomCalcParams")(js.Any.fromFunction2((t0: /* values */ js.Any, t1: /* data */ js.Any) => bottomCalcParams(t0, t1).runNow()))
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellClick(t0, t1).runNow()))
    if (cellContext != null) __obj.updateDynamic("cellContext")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellContext(t0, t1).runNow()))
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellDblClick(t0, t1).runNow()))
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellDblTap(t0, t1).runNow()))
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellEditCancelled(t0).runNow()))
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellEdited(t0).runNow()))
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellEditing(t0).runNow()))
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseEnter(t0, t1).runNow()))
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseLeave(t0, t1).runNow()))
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseMove(t0, t1).runNow()))
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseOut(t0, t1).runNow()))
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseOver(t0, t1).runNow()))
    if (cellTap != null) __obj.updateDynamic("cellTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellTap(t0, t1).runNow()))
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellTapHold(t0, t1).runNow()))
    if (!js.isUndefined(clipboard)) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (downloadTitle != null) __obj.updateDynamic("downloadTitle")(downloadTitle.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(editableTitle)) __obj.updateDynamic("editableTitle")(editableTitle.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (editorParams != null) __obj.updateDynamic("editorParams")(editorParams.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formatterParams != null) __obj.updateDynamic("formatterParams")(formatterParams.asInstanceOf[js.Any])
    if (!js.isUndefined(frozen)) __obj.updateDynamic("frozen")(frozen.asInstanceOf[js.Any])
    if (headerClick != null) __obj.updateDynamic("headerClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent) => headerClick(t0, t1).runNow()))
    if (headerContext != null) __obj.updateDynamic("headerContext")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent) => headerContext(t0, t1).runNow()))
    if (headerDblClick != null) __obj.updateDynamic("headerDblClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent) => headerDblClick(t0, t1).runNow()))
    if (headerDblTap != null) __obj.updateDynamic("headerDblTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent) => headerDblTap(t0, t1).runNow()))
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (headerFilterEmptyCheck != null) __obj.updateDynamic("headerFilterEmptyCheck")(js.Any.fromFunction1((t0: /* value */ js.Any) => headerFilterEmptyCheck(t0).runNow()))
    if (headerFilterFunc != null) __obj.updateDynamic("headerFilterFunc")(headerFilterFunc.asInstanceOf[js.Any])
    if (headerFilterFuncParams != null) __obj.updateDynamic("headerFilterFuncParams")(headerFilterFuncParams.asInstanceOf[js.Any])
    if (!js.isUndefined(headerFilterLiveFilter)) __obj.updateDynamic("headerFilterLiveFilter")(headerFilterLiveFilter.asInstanceOf[js.Any])
    if (headerFilterParams != null) __obj.updateDynamic("headerFilterParams")(headerFilterParams.asInstanceOf[js.Any])
    if (headerFilterPlaceholder != null) __obj.updateDynamic("headerFilterPlaceholder")(headerFilterPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSort)) __obj.updateDynamic("headerSort")(headerSort.asInstanceOf[js.Any])
    if (headerSortStartingDir != null) __obj.updateDynamic("headerSortStartingDir")(headerSortStartingDir.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSortTristate)) __obj.updateDynamic("headerSortTristate")(headerSortTristate.asInstanceOf[js.Any])
    if (headerTap != null) __obj.updateDynamic("headerTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent) => headerTap(t0, t1).runNow()))
    if (headerTapHold != null) __obj.updateDynamic("headerTapHold")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent) => headerTapHold(t0, t1).runNow()))
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip.asInstanceOf[js.Any])
    if (headerVertical != null) __obj.updateDynamic("headerVertical")(headerVertical.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInHtml)) __obj.updateDynamic("hideInHtml")(hideInHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlOutput)) __obj.updateDynamic("htmlOutput")(htmlOutput.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mutator != null) __obj.updateDynamic("mutator")(js.Any.fromFunction5((t0: /* value */ js.Any, t1: /* data */ js.Any, t2: /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.edit, t3: /* mutatorParams */ js.Any, t4: /* cell */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.CellComponent]) => mutator(t0, t1, t2, t3, t4).runNow()))
    if (mutatorClipboard != null) __obj.updateDynamic("mutatorClipboard")(js.Any.fromFunction5((t0: /* value */ js.Any, t1: /* data */ js.Any, t2: /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.edit, t3: /* mutatorParams */ js.Any, t4: /* cell */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.CellComponent]) => mutatorClipboard(t0, t1, t2, t3, t4).runNow()))
    if (mutatorClipboardParams != null) __obj.updateDynamic("mutatorClipboardParams")(mutatorClipboardParams.asInstanceOf[js.Any])
    if (mutatorData != null) __obj.updateDynamic("mutatorData")(js.Any.fromFunction5((t0: /* value */ js.Any, t1: /* data */ js.Any, t2: /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.edit, t3: /* mutatorParams */ js.Any, t4: /* cell */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.CellComponent]) => mutatorData(t0, t1, t2, t3, t4).runNow()))
    if (mutatorDataParams != null) __obj.updateDynamic("mutatorDataParams")(mutatorDataParams.asInstanceOf[js.Any])
    if (mutatorEdit != null) __obj.updateDynamic("mutatorEdit")(js.Any.fromFunction5((t0: /* value */ js.Any, t1: /* data */ js.Any, t2: /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.data | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.edit, t3: /* mutatorParams */ js.Any, t4: /* cell */ js.UndefOr[typingsJapgolly.tabulatorTables.Tabulator.CellComponent]) => mutatorEdit(t0, t1, t2, t3, t4).runNow()))
    if (mutatorEditParams != null) __obj.updateDynamic("mutatorEditParams")(mutatorEditParams.asInstanceOf[js.Any])
    if (mutatorParams != null) __obj.updateDynamic("mutatorParams")(mutatorParams.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHandle)) __obj.updateDynamic("rowHandle")(rowHandle.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (sorterParams != null) __obj.updateDynamic("sorterParams")(sorterParams.asInstanceOf[js.Any])
    if (titleFormatter != null) __obj.updateDynamic("titleFormatter")(titleFormatter.asInstanceOf[js.Any])
    if (titleFormatterParams != null) __obj.updateDynamic("titleFormatterParams")(titleFormatterParams.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (topCalc != null) __obj.updateDynamic("topCalc")(topCalc.asInstanceOf[js.Any])
    if (topCalcFormatter != null) __obj.updateDynamic("topCalcFormatter")(topCalcFormatter.asInstanceOf[js.Any])
    if (topCalcFormatterParams != null) __obj.updateDynamic("topCalcFormatterParams")(topCalcFormatterParams.asInstanceOf[js.Any])
    if (topCalcParams != null) __obj.updateDynamic("topCalcParams")(js.Any.fromFunction2((t0: /* values */ js.Any, t1: /* data */ js.Any) => topCalcParams(t0, t1).runNow()))
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    if (!js.isUndefined(variableHeight)) __obj.updateDynamic("variableHeight")(variableHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthGrow != null) __obj.updateDynamic("widthGrow")(widthGrow.asInstanceOf[js.Any])
    if (widthShrink != null) __obj.updateDynamic("widthShrink")(widthShrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColumnLookup]
  }
}

