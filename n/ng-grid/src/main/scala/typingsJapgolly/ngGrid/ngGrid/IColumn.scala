package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumn extends StObject {
  
  var aggLabelFilter: Any
  
  var cellClass: String
  
  var cellEditableCondition: Any
  
  var cellFilter: Any
  
  var cellTemplate: String
  
  var colDef: IColumnDef
  
  def copy(): IColumn
  
  var cursor: String
  
  var displayName: String
  
  var enableCellEdit: Boolean
  
  var field: String
  
  def gripClick(): Any
  
  def gripOnMouseDown(event: Any): Any
  
  def gripOnMouseUp(event: Any): Unit
  
  var groupIndex: Double
  
  var groupable: Boolean
  
  def groupedByClass(): String
  
  var headerCellTemplate: String
  
  var headerClass: String
  
  var headerRowHeight: Double
  
  var index: Double
  
  var isAggCol: Boolean
  
  var isGroupedBy: Boolean
  
  var maxWidth: Double
  
  var minWidth: Double
  
  def noSortVisible(): Boolean
  
  def onMouseMove(event: Any): Unit
  
  var originalIndex: Double
  
  var pinnable: Boolean
  
  var pinned: Boolean
  
  var resizable: Boolean
  
  def setVars(fromCol: IColumn): Unit
  
  def showSortButtonDown(): Boolean
  
  def showSortButtonUp(): Boolean
  
  def sort(event: Any): Boolean
  
  var sortDirection: String
  
  var sortPriority: Double
  
  var sortable: Boolean
  
  var sortingAlgorithm: js.Function
  
  def toggleVisible(): Unit
  
  var visible: Boolean
  
  var width: Double
}
object IColumn {
  
  inline def apply(
    aggLabelFilter: Any,
    cellClass: String,
    cellEditableCondition: Any,
    cellFilter: Any,
    cellTemplate: String,
    colDef: IColumnDef,
    copy: CallbackTo[IColumn],
    cursor: String,
    displayName: String,
    enableCellEdit: Boolean,
    field: String,
    gripClick: CallbackTo[Any],
    gripOnMouseDown: Any => Any,
    gripOnMouseUp: Any => Callback,
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
    onMouseMove: Any => Callback,
    originalIndex: Double,
    pinnable: Boolean,
    pinned: Boolean,
    resizable: Boolean,
    setVars: IColumn => Callback,
    showSortButtonDown: CallbackTo[Boolean],
    showSortButtonUp: CallbackTo[Boolean],
    sort: Any => Boolean,
    sortDirection: String,
    sortPriority: Double,
    sortable: Boolean,
    sortingAlgorithm: js.Function,
    toggleVisible: Callback,
    visible: Boolean,
    width: Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(aggLabelFilter = aggLabelFilter.asInstanceOf[js.Any], cellClass = cellClass.asInstanceOf[js.Any], cellEditableCondition = cellEditableCondition.asInstanceOf[js.Any], cellFilter = cellFilter.asInstanceOf[js.Any], cellTemplate = cellTemplate.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], copy = copy.toJsFn, cursor = cursor.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enableCellEdit = enableCellEdit.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], gripClick = gripClick.toJsFn, gripOnMouseDown = js.Any.fromFunction1(gripOnMouseDown), gripOnMouseUp = js.Any.fromFunction1((t0: Any) => gripOnMouseUp(t0).runNow()), groupIndex = groupIndex.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], groupedByClass = groupedByClass.toJsFn, headerCellTemplate = headerCellTemplate.asInstanceOf[js.Any], headerClass = headerClass.asInstanceOf[js.Any], headerRowHeight = headerRowHeight.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isAggCol = isAggCol.asInstanceOf[js.Any], isGroupedBy = isGroupedBy.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], noSortVisible = noSortVisible.toJsFn, onMouseMove = js.Any.fromFunction1((t0: Any) => onMouseMove(t0).runNow()), originalIndex = originalIndex.asInstanceOf[js.Any], pinnable = pinnable.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], setVars = js.Any.fromFunction1((t0: IColumn) => setVars(t0).runNow()), showSortButtonDown = showSortButtonDown.toJsFn, showSortButtonUp = showSortButtonUp.toJsFn, sort = js.Any.fromFunction1(sort), sortDirection = sortDirection.asInstanceOf[js.Any], sortPriority = sortPriority.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], sortingAlgorithm = sortingAlgorithm.asInstanceOf[js.Any], toggleVisible = toggleVisible.toJsFn, visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  
  extension [Self <: IColumn](x: Self) {
    
    inline def setAggLabelFilter(value: Any): Self = StObject.set(x, "aggLabelFilter", value.asInstanceOf[js.Any])
    
    inline def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
    
    inline def setCellEditableCondition(value: Any): Self = StObject.set(x, "cellEditableCondition", value.asInstanceOf[js.Any])
    
    inline def setCellFilter(value: Any): Self = StObject.set(x, "cellFilter", value.asInstanceOf[js.Any])
    
    inline def setCellTemplate(value: String): Self = StObject.set(x, "cellTemplate", value.asInstanceOf[js.Any])
    
    inline def setColDef(value: IColumnDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: CallbackTo[IColumn]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGripClick(value: CallbackTo[Any]): Self = StObject.set(x, "gripClick", value.toJsFn)
    
    inline def setGripOnMouseDown(value: Any => Any): Self = StObject.set(x, "gripOnMouseDown", js.Any.fromFunction1(value))
    
    inline def setGripOnMouseUp(value: Any => Callback): Self = StObject.set(x, "gripOnMouseUp", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    inline def setGroupable(value: Boolean): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
    
    inline def setGroupedByClass(value: CallbackTo[String]): Self = StObject.set(x, "groupedByClass", value.toJsFn)
    
    inline def setHeaderCellTemplate(value: String): Self = StObject.set(x, "headerCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowHeight(value: Double): Self = StObject.set(x, "headerRowHeight", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIsAggCol(value: Boolean): Self = StObject.set(x, "isAggCol", value.asInstanceOf[js.Any])
    
    inline def setIsGroupedBy(value: Boolean): Self = StObject.set(x, "isGroupedBy", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setNoSortVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "noSortVisible", value.toJsFn)
    
    inline def setOnMouseMove(value: Any => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOriginalIndex(value: Double): Self = StObject.set(x, "originalIndex", value.asInstanceOf[js.Any])
    
    inline def setPinnable(value: Boolean): Self = StObject.set(x, "pinnable", value.asInstanceOf[js.Any])
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setSetVars(value: IColumn => Callback): Self = StObject.set(x, "setVars", js.Any.fromFunction1((t0: IColumn) => value(t0).runNow()))
    
    inline def setShowSortButtonDown(value: CallbackTo[Boolean]): Self = StObject.set(x, "showSortButtonDown", value.toJsFn)
    
    inline def setShowSortButtonUp(value: CallbackTo[Boolean]): Self = StObject.set(x, "showSortButtonUp", value.toJsFn)
    
    inline def setSort(value: Any => Boolean): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    inline def setSortDirection(value: String): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    inline def setSortPriority(value: Double): Self = StObject.set(x, "sortPriority", value.asInstanceOf[js.Any])
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortingAlgorithm(value: js.Function): Self = StObject.set(x, "sortingAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setToggleVisible(value: Callback): Self = StObject.set(x, "toggleVisible", value.toJsFn)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
