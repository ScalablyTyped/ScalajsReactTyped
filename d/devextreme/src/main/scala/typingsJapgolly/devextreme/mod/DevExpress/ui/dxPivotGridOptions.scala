package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonAllowFieldDragging
import typingsJapgolly.devextreme.AnonApplyChangesMode
import typingsJapgolly.devextreme.AnonArea
import typingsJapgolly.devextreme.AnonCell
import typingsJapgolly.devextreme.AnonCollapseAll
import typingsJapgolly.devextreme.AnonColumnFields
import typingsJapgolly.devextreme.AnonComponentDxPivotGrid
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonCustomLoad
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonFileNameFormat
import typingsJapgolly.devextreme.AnonFileNameModel
import typingsJapgolly.devextreme.AnonIgnoreExcelErrors
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonSearchTimeout
import typingsJapgolly.devextreme.AnonShowIndicator
import typingsJapgolly.devextreme.AnonUseNative
import typingsJapgolly.devextreme.devextremeStrings.both
import typingsJapgolly.devextreme.devextremeStrings.column
import typingsJapgolly.devextreme.devextremeStrings.columns
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.row
import typingsJapgolly.devextreme.devextremeStrings.rows
import typingsJapgolly.devextreme.devextremeStrings.standard
import typingsJapgolly.devextreme.devextremeStrings.tree
import typingsJapgolly.devextreme.mod.DevExpress.data.PivotGridDataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.PivotGridDataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPivotGridOptions extends WidgetOptions[dxPivotGrid] {
  /** Allows an end-user to expand/collapse all header items within a header level. */
  var allowExpandAll: js.UndefOr[Boolean] = js.undefined
  /** Allows a user to filter fields by selecting or deselecting values in the popup menu. */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Allows an end-user to change sorting options. */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Allows an end-user to sort columns by summary values. */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.undefined
  /** Specifies the area to which data field headers must belong. */
  var dataFieldArea: js.UndefOr[column | row] = js.undefined
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions] = js.undefined
  /** Configures client-side exporting. */
  var export: js.UndefOr[AnonIgnoreExcelErrors] = js.undefined
  /** The Field Chooser configuration options. */
  var fieldChooser: js.UndefOr[AnonApplyChangesMode] = js.undefined
  /** Configures the field panel. */
  var fieldPanel: js.UndefOr[AnonAllowFieldDragging] = js.undefined
  /** Configures the header filter feature. */
  var headerFilter: js.UndefOr[AnonSearchTimeout] = js.undefined
  /** Specifies whether or not to hide rows and columns with no data. */
  var hideEmptySummaryCells: js.UndefOr[Boolean] = js.undefined
  /** Specifies options configuring the load panel. */
  var loadPanel: js.UndefOr[AnonShowIndicator] = js.undefined
  /** A function that is executed when a pivot grid cell is clicked or tapped. */
  var onCellClick: js.UndefOr[js.Function1[/* e */ AnonArea, _]] = js.undefined
  /** A function that is executed after a pivot grid cell is created. */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ AnonCell, _]] = js.undefined
  /** A function that is executed before the context menu is rendered. */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ AnonColumnFields, _]] = js.undefined
  /** A function that is executed after data is exported. */
  var onExported: js.UndefOr[js.Function1[/* e */ AnonComponentDxPivotGrid, _]] = js.undefined
  /** A function that is executed before data is exported. */
  var onExporting: js.UndefOr[js.Function1[/* e */ AnonFileNameModel, _]] = js.undefined
  /** A function that is executed before a file with exported data is saved to the user's local storage. */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ AnonFileNameFormat, _]] = js.undefined
  /** Specifies the layout of items in the row header. */
  var rowHeaderLayout: js.UndefOr[standard | tree] = js.undefined
  /** A configuration object specifying scrolling options. */
  var scrolling: js.UndefOr[AnonUseNative] = js.undefined
  /** Specifies whether the outer borders of the grid are visible or not. */
  var showBorders: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to display the Grand Total column. */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to display the Total columns. */
  var showColumnTotals: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to display the Grand Total row. */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to display the Total rows. Applies only if rowHeaderLayout is "standard". */
  var showRowTotals: js.UndefOr[Boolean] = js.undefined
  /** Specifies where to show the total rows or columns. Applies only if rowHeaderLayout is "standard". */
  var showTotalsPrior: js.UndefOr[both | columns | none | rows] = js.undefined
  /** A configuration object specifying options related to state storing. */
  var stateStoring: js.UndefOr[AnonCustomLoad] = js.undefined
  /** Strings that can be changed or localized in the PivotGrid widget. */
  var texts: js.UndefOr[AnonCollapseAll] = js.undefined
  /** Specifies whether long text in header items should be wrapped. */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxPivotGridOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowExpandAll: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    allowSortingBySummary: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    dataFieldArea: column | row = null,
    dataSource: js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: AnonIgnoreExcelErrors = null,
    fieldChooser: AnonApplyChangesMode = null,
    fieldPanel: AnonAllowFieldDragging = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    headerFilter: AnonSearchTimeout = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hideEmptySummaryCells: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    loadPanel: AnonShowIndicator = null,
    onCellClick: /* e */ AnonArea => CallbackTo[js.Any] = null,
    onCellPrepared: /* e */ AnonCell => CallbackTo[js.Any] = null,
    onContentReady: /* e */ AnonComponentElement[dxPivotGrid] => CallbackTo[js.Any] = null,
    onContextMenuPreparing: /* e */ AnonColumnFields => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxPivotGrid] => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentDxPivotGrid => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFileNameModel => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonFileNameFormat => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxPivotGrid] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxPivotGrid] => CallbackTo[js.Any] = null,
    rowHeaderLayout: standard | tree = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrolling: AnonUseNative = null,
    showBorders: js.UndefOr[Boolean] = js.undefined,
    showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined,
    showColumnTotals: js.UndefOr[Boolean] = js.undefined,
    showRowGrandTotals: js.UndefOr[Boolean] = js.undefined,
    showRowTotals: js.UndefOr[Boolean] = js.undefined,
    showTotalsPrior: both | columns | none | rows = null,
    stateStoring: AnonCustomLoad = null,
    tabIndex: Int | Double = null,
    texts: AnonCollapseAll = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExpandAll)) __obj.updateDynamic("allowExpandAll")(allowExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSortingBySummary)) __obj.updateDynamic("allowSortingBySummary")(allowSortingBySummary.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataFieldArea != null) __obj.updateDynamic("dataFieldArea")(dataFieldArea.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (fieldChooser != null) __obj.updateDynamic("fieldChooser")(fieldChooser.asInstanceOf[js.Any])
    if (fieldPanel != null) __obj.updateDynamic("fieldPanel")(fieldPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEmptySummaryCells)) __obj.updateDynamic("hideEmptySummaryCells")(hideEmptySummaryCells.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (loadPanel != null) __obj.updateDynamic("loadPanel")(loadPanel.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonArea) => onCellClick(t0).runNow()))
    if (onCellPrepared != null) __obj.updateDynamic("onCellPrepared")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCell) => onCellPrepared(t0).runNow()))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxPivotGrid]) => onContentReady(t0).runNow()))
    if (onContextMenuPreparing != null) __obj.updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonColumnFields) => onContextMenuPreparing(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxPivotGrid]) => onDisposing(t0).runNow()))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxPivotGrid) => onExported(t0).runNow()))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFileNameModel) => onExporting(t0).runNow()))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFileNameFormat) => onFileSaving(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxPivotGrid]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxPivotGrid]) => onOptionChanged(t0).runNow()))
    if (rowHeaderLayout != null) __obj.updateDynamic("rowHeaderLayout")(rowHeaderLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnGrandTotals)) __obj.updateDynamic("showColumnGrandTotals")(showColumnGrandTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnTotals)) __obj.updateDynamic("showColumnTotals")(showColumnTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowGrandTotals)) __obj.updateDynamic("showRowGrandTotals")(showRowGrandTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowTotals)) __obj.updateDynamic("showRowTotals")(showRowTotals.asInstanceOf[js.Any])
    if (showTotalsPrior != null) __obj.updateDynamic("showTotalsPrior")(showTotalsPrior.asInstanceOf[js.Any])
    if (stateStoring != null) __obj.updateDynamic("stateStoring")(stateStoring.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPivotGridOptions]
  }
}

