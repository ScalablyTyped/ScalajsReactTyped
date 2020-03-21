package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope * / any */ trait IGridScope extends js.Object {
  var columns: js.Array[_]
  var configGroups: js.Array[_]
  var elementsNeedMeasuring: Boolean
  var enableCellEditOnFocus: Boolean
  var enableCellSelection: Boolean
  var enablePaging: Boolean
  var footer: IFooter
  var footerRowHeight: Double
  var forceSyncScrolling: Boolean
  var gridId: String
  var headerRow: js.Any
  var i18n: js.Any
  var jqueryUITheme: js.Any
  var multiSelect: Boolean
  var pagingOptions: IPagingOptions
  var renderedColumns: js.Array[_]
  var renderedRows: js.Array[_]
  var rowHeight: Double
  var selectedItems: js.Array[_]
  var selectionProvider: ISelectionProvider
  var showColumnMenu: Boolean
  var showFooter: Boolean
  var showMenu: Boolean
  var showSelectionCheckbox: Boolean
  def adjustScrollLeft(scrollLeft: Double): Unit
  def adjustScrollTop(scrollTop: Double, force: Boolean): Unit
  def groupBy(col: IColumn): Unit
  def headerScrollerDim(): js.Any
  def removeGroup(index: Double): Unit
  def showGroupPanel(): js.Any
  def togglePin(col: IColumn): Unit
  def toggleSelectAll(): Unit
  def toggleShowMenu(): Unit
  def topPanelHeight(): Double
  def totalFilteredItemsLength(): Double
  def totalRowWidth(): Double
  def viewportDimHeight(): Double
}

object IGridScope {
  @scala.inline
  def apply(
    adjustScrollLeft: Double => Callback,
    adjustScrollTop: (Double, Boolean) => Callback,
    columns: js.Array[_],
    configGroups: js.Array[_],
    elementsNeedMeasuring: Boolean,
    enableCellEditOnFocus: Boolean,
    enableCellSelection: Boolean,
    enablePaging: Boolean,
    footer: IFooter,
    footerRowHeight: Double,
    forceSyncScrolling: Boolean,
    gridId: String,
    groupBy: IColumn => Callback,
    headerRow: js.Any,
    headerScrollerDim: CallbackTo[js.Any],
    i18n: js.Any,
    jqueryUITheme: js.Any,
    multiSelect: Boolean,
    pagingOptions: IPagingOptions,
    removeGroup: Double => Callback,
    renderedColumns: js.Array[_],
    renderedRows: js.Array[_],
    rowHeight: Double,
    selectedItems: js.Array[_],
    selectionProvider: ISelectionProvider,
    showColumnMenu: Boolean,
    showFooter: Boolean,
    showGroupPanel: CallbackTo[js.Any],
    showMenu: Boolean,
    showSelectionCheckbox: Boolean,
    togglePin: IColumn => Callback,
    toggleSelectAll: Callback,
    toggleShowMenu: Callback,
    topPanelHeight: CallbackTo[Double],
    totalFilteredItemsLength: CallbackTo[Double],
    totalRowWidth: CallbackTo[Double],
    viewportDimHeight: CallbackTo[Double]
  ): IGridScope = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], configGroups = configGroups.asInstanceOf[js.Any], elementsNeedMeasuring = elementsNeedMeasuring.asInstanceOf[js.Any], enableCellEditOnFocus = enableCellEditOnFocus.asInstanceOf[js.Any], enableCellSelection = enableCellSelection.asInstanceOf[js.Any], enablePaging = enablePaging.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], footerRowHeight = footerRowHeight.asInstanceOf[js.Any], forceSyncScrolling = forceSyncScrolling.asInstanceOf[js.Any], gridId = gridId.asInstanceOf[js.Any], headerRow = headerRow.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], jqueryUITheme = jqueryUITheme.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], pagingOptions = pagingOptions.asInstanceOf[js.Any], renderedColumns = renderedColumns.asInstanceOf[js.Any], renderedRows = renderedRows.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any], showColumnMenu = showColumnMenu.asInstanceOf[js.Any], showFooter = showFooter.asInstanceOf[js.Any], showMenu = showMenu.asInstanceOf[js.Any], showSelectionCheckbox = showSelectionCheckbox.asInstanceOf[js.Any])
    __obj.updateDynamic("adjustScrollLeft")(js.Any.fromFunction1((t0: scala.Double) => adjustScrollLeft(t0).runNow()))
    __obj.updateDynamic("adjustScrollTop")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => adjustScrollTop(t0, t1).runNow()))
    __obj.updateDynamic("groupBy")(js.Any.fromFunction1((t0: typingsJapgolly.ngGrid.ngGrid.IColumn) => groupBy(t0).runNow()))
    __obj.updateDynamic("headerScrollerDim")(headerScrollerDim.toJsFn)
    __obj.updateDynamic("removeGroup")(js.Any.fromFunction1((t0: scala.Double) => removeGroup(t0).runNow()))
    __obj.updateDynamic("showGroupPanel")(showGroupPanel.toJsFn)
    __obj.updateDynamic("togglePin")(js.Any.fromFunction1((t0: typingsJapgolly.ngGrid.ngGrid.IColumn) => togglePin(t0).runNow()))
    __obj.updateDynamic("toggleSelectAll")(toggleSelectAll.toJsFn)
    __obj.updateDynamic("toggleShowMenu")(toggleShowMenu.toJsFn)
    __obj.updateDynamic("topPanelHeight")(topPanelHeight.toJsFn)
    __obj.updateDynamic("totalFilteredItemsLength")(totalFilteredItemsLength.toJsFn)
    __obj.updateDynamic("totalRowWidth")(totalRowWidth.toJsFn)
    __obj.updateDynamic("viewportDimHeight")(viewportDimHeight.toJsFn)
    __obj.asInstanceOf[IGridScope]
  }
}

