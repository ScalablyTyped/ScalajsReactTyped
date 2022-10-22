package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkSelectionState extends StObject {
  
  /** A string representing the BulkSelection state (not a React state).
    * Possible values: ALL, SOME, NONE
    */
  var bulkSelectionState: String
  
  /** Deselect all items (clear selection) */
  def deselectAll(origin: Any): Unit
  
  /** Indicates the `toggleAll` behaviour when some rows are selected. `true` means SOME -> NONE, `false` means SOME -> ALL  */
  var deselectRowsByDefault: Any
  
  /** Get a copy (array) of ids that were deselected after bulk selection was done, when `infiniteBulkSelected` is `true`.
    * If `infiniteBulkSelected` is `false`, returns `null`.  */
  def getNotSelectedIds(): Any
  
  /** Get a copy (array) of selected ids when `infiniteBulkSelected` is `false`.
    * If `infiniteBulkSelected` is true, returns `null` */
  def getSelectedIds(): Any
  
  /** Indicates whether bulk selection was done by the user and `hasMoreInBulkSelection` is `true` */
  var infiniteBulkSelected: Boolean
  
  /** Is the item with the given id selected. (id comes from the rowData.id if exists, if not then it is the rowIndex)
    * Note: `selectedIds` and `notSelectedIds` are mutually exclusive and only one of them is defined.
    * `notSelectedIds` is defined when `hasMoreInBulkSelection` is selected and user did bulk selection. Otherwise, selectedIds is defined. */
  def isSelected(id: Any): Any
  
  /** Select all items */
  def selectAll(origin: Any): Unit
  
  /** Number of selected items */
  var selectedCount: Any
  
  /** Can be either a boolean or a function.
    * A boolean affects selection of all table rows.
    * A function will be called for every row in `data` to specify if its checkbox should be disabled. */
  var selectionDisabled: Any
  
  /** Set the selection.
    * An optional `change` argument will be passed "as is" to the Table's onSelectionChanged callback.
    */
  def setSelectedIds(selectedIds: Any, change: Any, props: Any): Unit
  
  /** Toggles the bulk selection state: NONE -> ALL, SOME -> ALL, ALL -> NONE */
  def toggleAll(deselectRowsByDefault: Any, origin: Any): Unit
  
  /** Toggle the selection state (selected/not-selected) of an item by id */
  def toggleSelectionById(id: Any, origin: Any): Unit
}
object BulkSelectionState {
  
  inline def apply(
    bulkSelectionState: String,
    deselectAll: Any => Callback,
    deselectRowsByDefault: Any,
    getNotSelectedIds: CallbackTo[Any],
    getSelectedIds: CallbackTo[Any],
    infiniteBulkSelected: Boolean,
    isSelected: Any => Any,
    selectAll: Any => Callback,
    selectedCount: Any,
    selectionDisabled: Any,
    setSelectedIds: (Any, Any, Any) => Callback,
    toggleAll: (Any, Any) => Callback,
    toggleSelectionById: (Any, Any) => Callback
  ): BulkSelectionState = {
    val __obj = js.Dynamic.literal(bulkSelectionState = bulkSelectionState.asInstanceOf[js.Any], deselectAll = js.Any.fromFunction1((t0: Any) => deselectAll(t0).runNow()), deselectRowsByDefault = deselectRowsByDefault.asInstanceOf[js.Any], getNotSelectedIds = getNotSelectedIds.toJsFn, getSelectedIds = getSelectedIds.toJsFn, infiniteBulkSelected = infiniteBulkSelected.asInstanceOf[js.Any], isSelected = js.Any.fromFunction1(isSelected), selectAll = js.Any.fromFunction1((t0: Any) => selectAll(t0).runNow()), selectedCount = selectedCount.asInstanceOf[js.Any], selectionDisabled = selectionDisabled.asInstanceOf[js.Any], setSelectedIds = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (setSelectedIds(t0, t1, t2)).runNow()), toggleAll = js.Any.fromFunction2((t0: Any, t1: Any) => (toggleAll(t0, t1)).runNow()), toggleSelectionById = js.Any.fromFunction2((t0: Any, t1: Any) => (toggleSelectionById(t0, t1)).runNow()))
    __obj.asInstanceOf[BulkSelectionState]
  }
  
  extension [Self <: BulkSelectionState](x: Self) {
    
    inline def setBulkSelectionState(value: String): Self = StObject.set(x, "bulkSelectionState", value.asInstanceOf[js.Any])
    
    inline def setDeselectAll(value: Any => Callback): Self = StObject.set(x, "deselectAll", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDeselectRowsByDefault(value: Any): Self = StObject.set(x, "deselectRowsByDefault", value.asInstanceOf[js.Any])
    
    inline def setGetNotSelectedIds(value: CallbackTo[Any]): Self = StObject.set(x, "getNotSelectedIds", value.toJsFn)
    
    inline def setGetSelectedIds(value: CallbackTo[Any]): Self = StObject.set(x, "getSelectedIds", value.toJsFn)
    
    inline def setInfiniteBulkSelected(value: Boolean): Self = StObject.set(x, "infiniteBulkSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Any => Any): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
    
    inline def setSelectAll(value: Any => Callback): Self = StObject.set(x, "selectAll", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSelectedCount(value: Any): Self = StObject.set(x, "selectedCount", value.asInstanceOf[js.Any])
    
    inline def setSelectionDisabled(value: Any): Self = StObject.set(x, "selectionDisabled", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedIds(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "setSelectedIds", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setToggleAll(value: (Any, Any) => Callback): Self = StObject.set(x, "toggleAll", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setToggleSelectionById(value: (Any, Any) => Callback): Self = StObject.set(x, "toggleSelectionById", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
  }
}
