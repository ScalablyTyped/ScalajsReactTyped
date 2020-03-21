package typingsJapgolly.ejWebAll.ej.PivotGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.ejWebAll.ej.Pivot.AnalysisMode
import typingsJapgolly.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches client-side after the AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
  /** Sets the mode for the PivotGrid widget to bind either OLAP or relational data source.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.undefined
  /** Triggers before performing exporting in the pivot grid.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.undefined
  /** Triggers before the pivot engine starts to populate.
    */
  var beforePivotEnginePopulate: js.UndefOr[js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from the PivotGrid to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
  /** Triggers when click action is performed over a value cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
  /** Triggers when right-click action is performed on a cell.
    */
  var cellContext: js.UndefOr[js.Function1[/* e */ CellContextEventArgs, Unit]] = js.undefined
  /** Triggers when double-click action is performed over a value cell.
    */
  var cellDoubleClick: js.UndefOr[js.Function1[/* e */ CellDoubleClickEventArgs, Unit]] = js.undefined
  /** Triggers before editing the cells.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.undefined
  /** Triggers when a specific range of value cells is selected.
    */
  var cellSelection: js.UndefOr[js.Function1[/* e */ CellSelectionEventArgs, Unit]] = js.undefined
  /** Allows you to collapse specified members in each field by default.
    * @Default {null}
    */
  var collapsedMembers: js.UndefOr[js.Any] = js.undefined
  /** Triggers when the hyperlink of column header is clicked.
    */
  var columnHeaderHyperlinkClick: js.UndefOr[js.Function1[/* e */ ColumnHeaderHyperlinkClickEventArgs, Unit]] = js.undefined
  /** Specifies the CSS class to the PivotGrid for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Object is utilized to pass additional information between the client-end and the service-end while operating the control in server mode.
    * @Default {null}
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** Initializes the data source for the PivotGrid widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  /** Triggers after performing drill operation in the PivotGrid.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.undefined
  /** Triggers while clicking &quot;OK&quot; in the drill-through dialog.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.undefined
  /** Enables the advanced filtering options such as value filtering, label filtering, and sorting for each field in the server mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[Boolean] = js.undefined
  /** Allows you to get cell details in JSON format by clicking the value cell.
    * @Default {false}
    */
  var enableCellClick: js.UndefOr[Boolean] = js.undefined
  /** Allows you to access each cell by right-clicking the mouse.
    * @Default {false}
    */
  var enableCellContext: js.UndefOr[Boolean] = js.undefined
  /** Allows you to get cell details in JSON format by double-clicking the value cell.
    * @Default {false}
    */
  var enableCellDoubleClick: js.UndefOr[Boolean] = js.undefined
  /** Allows you to edit value cells for write-back support in the PivotGrid. This is applicable only for the server-mode.
    * @Default {false}
    */
  var enableCellEditing: js.UndefOr[Boolean] = js.undefined
  /** Enables the cell selection for a specific range of value cells.
    * @Default {false}
    */
  var enableCellSelection: js.UndefOr[Boolean] = js.undefined
  /** Collapses the pivot items along rows and columns by default. It works only for the relational data source.
    * @Default {false}
    */
  var enableCollapseByDefault: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the display of grand total for all columns.
    * @Default {true}
    */
  var enableColumnGrandTotal: js.UndefOr[Boolean] = js.undefined
  /** Allows you to adjust the width of columns dynamically within given widget size.
    * @Default {false}
    */
  var enableColumnResizing: js.UndefOr[Boolean] = js.undefined
  /** Allows you to export entire data instead of current page data, while paging option is enabled.
    * @Default {false}
    */
  var enableCompleteDataExport: js.UndefOr[Boolean] = js.undefined
  /** Allows you to format a specific set of cells based on the condition.
    * @Default {false}
    */
  var enableConditionalFormatting: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable/disable the context menu of pivot buttons in the PivotGrid.
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.undefined
  /** Allows you to refresh the control on-demand and not during every UI operation.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[Boolean] = js.undefined
  /** Enables the Drill-Through feature which retrieves raw items that are used to create a specific cell in the PivotGrid.
    * @Default {false}
    */
  var enableDrillThrough: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the display of grand total for rows and columns.
    * @Default {true}
    */
  var enableGrandTotal: js.UndefOr[Boolean] = js.undefined
  /** Enables the display of GroupingBar allowing you to filter, sort, and remove fields obtained from the datasource.
    * @Default {false}
    */
  var enableGroupingBar: js.UndefOr[Boolean] = js.undefined
  /** Allows you to load the PivotGrid using the JSON data.
    * @Default {false}
    */
  var enableJSONRendering: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables paging in the member editor for viewing the large count of members in pages.
    * @Default {false}
    */
  var enableMemberEditorPaging: js.UndefOr[Boolean] = js.undefined
  /** Enables/Disables sorting option in member editor dialog for the members of the respective field.
    * @Default {false}
    */
  var enableMemberEditorSorting: js.UndefOr[Boolean] = js.undefined
  /** Allows you to view the large amount of data by applying paging.
    * @Default {false}
    */
  var enablePaging: js.UndefOr[Boolean] = js.undefined
  /** Enables rendering of the PivotGrid widget along with the PivotTable field list which allows UI operations.
    * @Default {true}
    */
  var enablePivotFieldList: js.UndefOr[Boolean] = js.undefined
  /** Allows you to view the layout of PivotGrid from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Enables the display of grand total for all rows.
    * @Default {true}
    */
  var enableRowGrandTotal: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable the ToolTip.
    * @Default {false}
    */
  var enableToolTip: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable the animation effects in the tooltip.
    * @Default {false}
    */
  var enableToolTipAnimation: js.UndefOr[Boolean] = js.undefined
  /** Allows you to view the large amount of data through virtual scrolling.
    * @Default {false}
    */
  var enableVirtualScrolling: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.undefined
  /** Object that holds the settings of frozen headers.
    * @Default {{}}
    */
  var frozenHeaderSettings: js.UndefOr[FrozenHeaderSettings] = js.undefined
  /** Allows you to display the header name in the PivotGrid control.
    * @Default {{}}
    */
  var headerSettings: js.UndefOr[HeaderSettings] = js.undefined
  /** Allows you to configure the hyperlink settings of the PivotGrid control.
    * @Default {{}}
    */
  var hyperlinkSettings: js.UndefOr[HyperlinkSettings] = js.undefined
  /** Allows you to enable PivotGridâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Contains the serialized JSON string which renders the PivotGrid.
    */
  var jsonRecords: js.UndefOr[String] = js.undefined
  /** Sets the summary layout for PivotGrid.Following are the ways in which summary can be positioned: normal summary (bottom), top summary, no summary, and excel-like summary.
    * @Default {ej.PivotGrid.Layout.Normal}
    */
  var layout: js.UndefOr[Layout | String] = js.undefined
  /** Triggers when the PivotGrid loading is initiated.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Triggers before loading a report from the database.
    */
  var loadReport: js.UndefOr[js.Function1[/* e */ LoadReportEventArgs, Unit]] = js.undefined
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Allows you to set the maximum number of nodes as well as child nodes to be displayed in the member editor.
    * @Default {1000}
    */
  var maxNodeLimitInMemberEditor: js.UndefOr[Double] = js.undefined
  /** Allows you to set the number of members to be displayed in each page of member editor on applying paging in it.
    * @Default {100}
    */
  var memberEditorPageSize: js.UndefOr[Double] = js.undefined
  /** Sets the mode for PivotGrid widget for binding the data source either in the server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.undefined
  /** Connects the PivotSchemaDesigner with specified ID to the PivotGrid control.
    * @Default {â€œâ€}
    */
  var pivotTableFieldListID: js.UndefOr[String] = js.undefined
  /** Triggers when PivotGrid widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
  /** Triggers when any error occurred during the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.undefined
  /** Triggers when the PivotGrid successfully reaches the client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.undefined
  /** Allows you to fit the width of the column based on its maximum text width.
    * @Default {true}
    */
  var resizeColumnsToFit: js.UndefOr[Boolean] = js.undefined
  /** Triggers when the hyperlink of row header is clicked.
    */
  var rowHeaderHyperlinkClick: js.UndefOr[js.Function1[/* e */ RowHeaderHyperlinkClickEventArgs, Unit]] = js.undefined
  /** Triggers before saving the current report to the database.
    */
  var saveReport: js.UndefOr[js.Function1[/* e */ SaveReportEventArgs, Unit]] = js.undefined
  /** Allows you to set the custom name for the methods at service-end, communicated during AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
  /** Allows you to show the appropriate unique name in the pivot button.
    * @Default {false}
    */
  var showUniqueNameOnPivotButton: js.UndefOr[Boolean] = js.undefined
  /** Triggers when the hyperlink of summary cell is clicked.
    */
  var summaryCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ SummaryCellHyperlinkClickEventArgs, Unit]] = js.undefined
  /** Connects the service using the specified URL for any server updates.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.undefined
  /** Triggers when the hyperlink of value cell is clicked.
    */
  var valueCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ ValueCellHyperlinkClickEventArgs, Unit]] = js.undefined
  /** Holds the necessary properties for value sorting.
    * @Default {{}}
    */
  var valueSortSettings: js.UndefOr[ValueSortSettings] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterServiceInvoke: /* e */ AfterServiceInvokeEventArgs => Callback = null,
    analysisMode: AnalysisMode | String = null,
    beforeExport: /* e */ BeforeExportEventArgs => Callback = null,
    beforePivotEnginePopulate: /* e */ BeforePivotEnginePopulateEventArgs => Callback = null,
    beforeServiceInvoke: /* e */ BeforeServiceInvokeEventArgs => Callback = null,
    cellClick: /* e */ CellClickEventArgs => Callback = null,
    cellContext: /* e */ CellContextEventArgs => Callback = null,
    cellDoubleClick: /* e */ CellDoubleClickEventArgs => Callback = null,
    cellEdit: /* e */ CellEditEventArgs => Callback = null,
    cellSelection: /* e */ CellSelectionEventArgs => Callback = null,
    collapsedMembers: js.Any = null,
    columnHeaderHyperlinkClick: /* e */ ColumnHeaderHyperlinkClickEventArgs => Callback = null,
    cssClass: String = null,
    customObject: js.Any = null,
    dataSource: DataSource = null,
    drillSuccess: /* e */ DrillSuccessEventArgs => Callback = null,
    drillThrough: /* e */ DrillThroughEventArgs => Callback = null,
    enableAdvancedFilter: js.UndefOr[Boolean] = js.undefined,
    enableCellClick: js.UndefOr[Boolean] = js.undefined,
    enableCellContext: js.UndefOr[Boolean] = js.undefined,
    enableCellDoubleClick: js.UndefOr[Boolean] = js.undefined,
    enableCellEditing: js.UndefOr[Boolean] = js.undefined,
    enableCellSelection: js.UndefOr[Boolean] = js.undefined,
    enableCollapseByDefault: js.UndefOr[Boolean] = js.undefined,
    enableColumnGrandTotal: js.UndefOr[Boolean] = js.undefined,
    enableColumnResizing: js.UndefOr[Boolean] = js.undefined,
    enableCompleteDataExport: js.UndefOr[Boolean] = js.undefined,
    enableConditionalFormatting: js.UndefOr[Boolean] = js.undefined,
    enableContextMenu: js.UndefOr[Boolean] = js.undefined,
    enableDeferUpdate: js.UndefOr[Boolean] = js.undefined,
    enableDrillThrough: js.UndefOr[Boolean] = js.undefined,
    enableGrandTotal: js.UndefOr[Boolean] = js.undefined,
    enableGroupingBar: js.UndefOr[Boolean] = js.undefined,
    enableJSONRendering: js.UndefOr[Boolean] = js.undefined,
    enableMemberEditorPaging: js.UndefOr[Boolean] = js.undefined,
    enableMemberEditorSorting: js.UndefOr[Boolean] = js.undefined,
    enablePaging: js.UndefOr[Boolean] = js.undefined,
    enablePivotFieldList: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableRowGrandTotal: js.UndefOr[Boolean] = js.undefined,
    enableToolTip: js.UndefOr[Boolean] = js.undefined,
    enableToolTipAnimation: js.UndefOr[Boolean] = js.undefined,
    enableVirtualScrolling: js.UndefOr[Boolean] = js.undefined,
    enableXHRCredentials: js.UndefOr[Boolean] = js.undefined,
    frozenHeaderSettings: FrozenHeaderSettings = null,
    headerSettings: HeaderSettings = null,
    hyperlinkSettings: HyperlinkSettings = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    jsonRecords: String = null,
    layout: Layout | String = null,
    load: /* e */ LoadEventArgs => Callback = null,
    loadReport: /* e */ LoadReportEventArgs => Callback = null,
    locale: String = null,
    maxNodeLimitInMemberEditor: Int | Double = null,
    memberEditorPageSize: Int | Double = null,
    operationalMode: OperationalMode | String = null,
    pivotTableFieldListID: String = null,
    renderComplete: /* e */ RenderCompleteEventArgs => Callback = null,
    renderFailure: /* e */ RenderFailureEventArgs => Callback = null,
    renderSuccess: /* e */ RenderSuccessEventArgs => Callback = null,
    resizeColumnsToFit: js.UndefOr[Boolean] = js.undefined,
    rowHeaderHyperlinkClick: /* e */ RowHeaderHyperlinkClickEventArgs => Callback = null,
    saveReport: /* e */ SaveReportEventArgs => Callback = null,
    serviceMethodSettings: ServiceMethodSettings = null,
    showUniqueNameOnPivotButton: js.UndefOr[Boolean] = js.undefined,
    summaryCellHyperlinkClick: /* e */ SummaryCellHyperlinkClickEventArgs => Callback = null,
    url: String = null,
    valueCellHyperlinkClick: /* e */ ValueCellHyperlinkClickEventArgs => Callback = null,
    valueSortSettings: ValueSortSettings = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterServiceInvoke != null) __obj.updateDynamic("afterServiceInvoke")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.AfterServiceInvokeEventArgs) => afterServiceInvoke(t0).runNow()))
    if (analysisMode != null) __obj.updateDynamic("analysisMode")(analysisMode.asInstanceOf[js.Any])
    if (beforeExport != null) __obj.updateDynamic("beforeExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.BeforeExportEventArgs) => beforeExport(t0).runNow()))
    if (beforePivotEnginePopulate != null) __obj.updateDynamic("beforePivotEnginePopulate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.BeforePivotEnginePopulateEventArgs) => beforePivotEnginePopulate(t0).runNow()))
    if (beforeServiceInvoke != null) __obj.updateDynamic("beforeServiceInvoke")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.BeforeServiceInvokeEventArgs) => beforeServiceInvoke(t0).runNow()))
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.CellClickEventArgs) => cellClick(t0).runNow()))
    if (cellContext != null) __obj.updateDynamic("cellContext")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.CellContextEventArgs) => cellContext(t0).runNow()))
    if (cellDoubleClick != null) __obj.updateDynamic("cellDoubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.CellDoubleClickEventArgs) => cellDoubleClick(t0).runNow()))
    if (cellEdit != null) __obj.updateDynamic("cellEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.CellEditEventArgs) => cellEdit(t0).runNow()))
    if (cellSelection != null) __obj.updateDynamic("cellSelection")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.CellSelectionEventArgs) => cellSelection(t0).runNow()))
    if (collapsedMembers != null) __obj.updateDynamic("collapsedMembers")(collapsedMembers.asInstanceOf[js.Any])
    if (columnHeaderHyperlinkClick != null) __obj.updateDynamic("columnHeaderHyperlinkClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.ColumnHeaderHyperlinkClickEventArgs) => columnHeaderHyperlinkClick(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customObject != null) __obj.updateDynamic("customObject")(customObject.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (drillSuccess != null) __obj.updateDynamic("drillSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.DrillSuccessEventArgs) => drillSuccess(t0).runNow()))
    if (drillThrough != null) __obj.updateDynamic("drillThrough")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.DrillThroughEventArgs) => drillThrough(t0).runNow()))
    if (!js.isUndefined(enableAdvancedFilter)) __obj.updateDynamic("enableAdvancedFilter")(enableAdvancedFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellClick)) __obj.updateDynamic("enableCellClick")(enableCellClick.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellContext)) __obj.updateDynamic("enableCellContext")(enableCellContext.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellDoubleClick)) __obj.updateDynamic("enableCellDoubleClick")(enableCellDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellEditing)) __obj.updateDynamic("enableCellEditing")(enableCellEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellSelection)) __obj.updateDynamic("enableCellSelection")(enableCellSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCollapseByDefault)) __obj.updateDynamic("enableCollapseByDefault")(enableCollapseByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnGrandTotal)) __obj.updateDynamic("enableColumnGrandTotal")(enableColumnGrandTotal.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCompleteDataExport)) __obj.updateDynamic("enableCompleteDataExport")(enableCompleteDataExport.asInstanceOf[js.Any])
    if (!js.isUndefined(enableConditionalFormatting)) __obj.updateDynamic("enableConditionalFormatting")(enableConditionalFormatting.asInstanceOf[js.Any])
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDeferUpdate)) __obj.updateDynamic("enableDeferUpdate")(enableDeferUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDrillThrough)) __obj.updateDynamic("enableDrillThrough")(enableDrillThrough.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGrandTotal)) __obj.updateDynamic("enableGrandTotal")(enableGrandTotal.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroupingBar)) __obj.updateDynamic("enableGroupingBar")(enableGroupingBar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableJSONRendering)) __obj.updateDynamic("enableJSONRendering")(enableJSONRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMemberEditorPaging)) __obj.updateDynamic("enableMemberEditorPaging")(enableMemberEditorPaging.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMemberEditorSorting)) __obj.updateDynamic("enableMemberEditorSorting")(enableMemberEditorSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePaging)) __obj.updateDynamic("enablePaging")(enablePaging.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePivotFieldList)) __obj.updateDynamic("enablePivotFieldList")(enablePivotFieldList.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowGrandTotal)) __obj.updateDynamic("enableRowGrandTotal")(enableRowGrandTotal.asInstanceOf[js.Any])
    if (!js.isUndefined(enableToolTip)) __obj.updateDynamic("enableToolTip")(enableToolTip.asInstanceOf[js.Any])
    if (!js.isUndefined(enableToolTipAnimation)) __obj.updateDynamic("enableToolTipAnimation")(enableToolTipAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableVirtualScrolling)) __obj.updateDynamic("enableVirtualScrolling")(enableVirtualScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(enableXHRCredentials)) __obj.updateDynamic("enableXHRCredentials")(enableXHRCredentials.asInstanceOf[js.Any])
    if (frozenHeaderSettings != null) __obj.updateDynamic("frozenHeaderSettings")(frozenHeaderSettings.asInstanceOf[js.Any])
    if (headerSettings != null) __obj.updateDynamic("headerSettings")(headerSettings.asInstanceOf[js.Any])
    if (hyperlinkSettings != null) __obj.updateDynamic("hyperlinkSettings")(hyperlinkSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (jsonRecords != null) __obj.updateDynamic("jsonRecords")(jsonRecords.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.LoadEventArgs) => load(t0).runNow()))
    if (loadReport != null) __obj.updateDynamic("loadReport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.LoadReportEventArgs) => loadReport(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxNodeLimitInMemberEditor != null) __obj.updateDynamic("maxNodeLimitInMemberEditor")(maxNodeLimitInMemberEditor.asInstanceOf[js.Any])
    if (memberEditorPageSize != null) __obj.updateDynamic("memberEditorPageSize")(memberEditorPageSize.asInstanceOf[js.Any])
    if (operationalMode != null) __obj.updateDynamic("operationalMode")(operationalMode.asInstanceOf[js.Any])
    if (pivotTableFieldListID != null) __obj.updateDynamic("pivotTableFieldListID")(pivotTableFieldListID.asInstanceOf[js.Any])
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.RenderCompleteEventArgs) => renderComplete(t0).runNow()))
    if (renderFailure != null) __obj.updateDynamic("renderFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.RenderFailureEventArgs) => renderFailure(t0).runNow()))
    if (renderSuccess != null) __obj.updateDynamic("renderSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.RenderSuccessEventArgs) => renderSuccess(t0).runNow()))
    if (!js.isUndefined(resizeColumnsToFit)) __obj.updateDynamic("resizeColumnsToFit")(resizeColumnsToFit.asInstanceOf[js.Any])
    if (rowHeaderHyperlinkClick != null) __obj.updateDynamic("rowHeaderHyperlinkClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.RowHeaderHyperlinkClickEventArgs) => rowHeaderHyperlinkClick(t0).runNow()))
    if (saveReport != null) __obj.updateDynamic("saveReport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.SaveReportEventArgs) => saveReport(t0).runNow()))
    if (serviceMethodSettings != null) __obj.updateDynamic("serviceMethodSettings")(serviceMethodSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(showUniqueNameOnPivotButton)) __obj.updateDynamic("showUniqueNameOnPivotButton")(showUniqueNameOnPivotButton.asInstanceOf[js.Any])
    if (summaryCellHyperlinkClick != null) __obj.updateDynamic("summaryCellHyperlinkClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.SummaryCellHyperlinkClickEventArgs) => summaryCellHyperlinkClick(t0).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (valueCellHyperlinkClick != null) __obj.updateDynamic("valueCellHyperlinkClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotGrid.ValueCellHyperlinkClickEventArgs) => valueCellHyperlinkClick(t0).runNow()))
    if (valueSortSettings != null) __obj.updateDynamic("valueSortSettings")(valueSortSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

