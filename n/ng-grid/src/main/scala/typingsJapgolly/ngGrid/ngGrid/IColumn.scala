package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends js.Object {
  var aggLabelFilter: js.Any
  var cellClass: String
  var cellEditableCondition: js.Any
  var cellFilter: js.Any
  var cellTemplate: String
  var colDef: IColumnDef
  var cursor: String
  var displayName: String
  var enableCellEdit: Boolean
  var field: String
  var groupIndex: Double
  var groupable: Boolean
  var headerCellTemplate: String
  var headerClass: String
  var headerRowHeight: Double
  var index: Double
  var isAggCol: Boolean
  var isGroupedBy: Boolean
  var maxWidth: Double
  var minWidth: Double
  var originalIndex: Double
  var pinnable: Boolean
  var pinned: Boolean
  var resizable: Boolean
  var sortDirection: String
  var sortPriority: Double
  var sortable: Boolean
  var sortingAlgorithm: js.Function
  var visible: Boolean
  var width: Double
  def copy(): IColumn
  def gripClick(): js.Any
  def gripOnMouseDown(event: js.Any): js.Any
  def gripOnMouseUp(event: js.Any): Unit
  def groupedByClass(): String
  def noSortVisible(): Boolean
  def onMouseMove(event: js.Any): Unit
  def setVars(fromCol: IColumn): Unit
  def showSortButtonDown(): Boolean
  def showSortButtonUp(): Boolean
  def sort(event: js.Any): Boolean
  def toggleVisible(): Unit
}

object IColumn {
  @scala.inline
  def apply(
    aggLabelFilter: js.Any,
    cellClass: String,
    cellEditableCondition: js.Any,
    cellFilter: js.Any,
    cellTemplate: String,
    colDef: IColumnDef,
    copy: CallbackTo[IColumn],
    cursor: String,
    displayName: String,
    enableCellEdit: Boolean,
    field: String,
    gripClick: CallbackTo[js.Any],
    gripOnMouseDown: js.Any => CallbackTo[js.Any],
    gripOnMouseUp: js.Any => Callback,
    groupIndex: Double,
    groupable: Boolean,
    groupedByClass: CallbackTo[String],
    headerCellTemplate: String,
    headerClass: String,
    headerRowHeight: Double,
    index: Double,
    isAggCol: Boolean,
    isGroupedBy: Boolean,
    maxWidth: Double,
    minWidth: Double,
    noSortVisible: CallbackTo[Boolean],
    onMouseMove: js.Any => Callback,
    originalIndex: Double,
    pinnable: Boolean,
    pinned: Boolean,
    resizable: Boolean,
    setVars: IColumn => Callback,
    showSortButtonDown: CallbackTo[Boolean],
    showSortButtonUp: CallbackTo[Boolean],
    sort: js.Any => CallbackTo[Boolean],
    sortDirection: String,
    sortPriority: Double,
    sortable: Boolean,
    sortingAlgorithm: js.Function,
    toggleVisible: Callback,
    visible: Boolean,
    width: Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(aggLabelFilter = aggLabelFilter.asInstanceOf[js.Any], cellClass = cellClass.asInstanceOf[js.Any], cellEditableCondition = cellEditableCondition.asInstanceOf[js.Any], cellFilter = cellFilter.asInstanceOf[js.Any], cellTemplate = cellTemplate.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enableCellEdit = enableCellEdit.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], headerCellTemplate = headerCellTemplate.asInstanceOf[js.Any], headerClass = headerClass.asInstanceOf[js.Any], headerRowHeight = headerRowHeight.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isAggCol = isAggCol.asInstanceOf[js.Any], isGroupedBy = isGroupedBy.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], pinnable = pinnable.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any], sortPriority = sortPriority.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], sortingAlgorithm = sortingAlgorithm.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("gripClick")(gripClick.toJsFn)
    __obj.updateDynamic("gripOnMouseDown")(js.Any.fromFunction1((t0: js.Any) => gripOnMouseDown(t0).runNow()))
    __obj.updateDynamic("gripOnMouseUp")(js.Any.fromFunction1((t0: js.Any) => gripOnMouseUp(t0).runNow()))
    __obj.updateDynamic("groupedByClass")(groupedByClass.toJsFn)
    __obj.updateDynamic("noSortVisible")(noSortVisible.toJsFn)
    __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: js.Any) => onMouseMove(t0).runNow()))
    __obj.updateDynamic("setVars")(js.Any.fromFunction1((t0: typingsJapgolly.ngGrid.ngGrid.IColumn) => setVars(t0).runNow()))
    __obj.updateDynamic("showSortButtonDown")(showSortButtonDown.toJsFn)
    __obj.updateDynamic("showSortButtonUp")(showSortButtonUp.toJsFn)
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: js.Any) => sort(t0).runNow()))
    __obj.updateDynamic("toggleVisible")(toggleVisible.toJsFn)
    __obj.asInstanceOf[IColumn]
  }
}

