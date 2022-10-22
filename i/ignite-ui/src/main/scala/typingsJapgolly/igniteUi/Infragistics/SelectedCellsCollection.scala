package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedCellsCollection extends StObject {
  
  def activate(identifier: js.Object, element: js.Object, suppress: js.Object): Unit
  
  def activeCell(): Unit
  
  def addSubscriber(subscriber: js.Object, owner: js.Object): Unit
  
  def atLeastOneSelected(rowId: js.Object, forOwner: js.Object): Unit
  
  def changeOwner(newOwner: js.Object): Unit
  
  def cleanAll(forOwner: js.Object): Unit
  
  def clearSelection(forOwner: js.Object): Unit
  
  def deactivate(suppress: js.Object): Unit
  
  def deselect(identifier: js.Object, info: js.Object, suppress: js.Object): Unit
  
  def deselectAll(suppress: js.Object): Unit
  
  def elementFromIdentifier(identifier: js.Object): Unit
  
  def elementPosition(identifier: js.Object, element: js.Object): Unit
  
  def isActive(identifier: js.Object, forOwner: js.Object): Unit
  
  def isSelected(identifier: js.Object, forOwner: js.Object): Unit
  
  def onlyOneSelected(): Unit
  
  def rangeDeselect(range: js.Object, info: js.Object, suppress: js.Object): Unit
  
  def rangeSelect(range: js.Object, add: js.Object, prevRange: js.Object, info: js.Object, suppress: js.Object): Unit
  
  def removeSubscriber(subscriberId: js.Object, owner: js.Object): Unit
  
  def select(identifier: js.Object, add: js.Object, info: js.Object, suppress: js.Object): Unit
  
  def selectedCells(): Unit
  
  def selectedRows(): Unit
  
  def selectionLength(): Unit
  
  def toggle(element: js.Object): Unit
}
object SelectedCellsCollection {
  
  inline def apply(
    activate: (js.Object, js.Object, js.Object) => Callback,
    activeCell: Callback,
    addSubscriber: (js.Object, js.Object) => Callback,
    atLeastOneSelected: (js.Object, js.Object) => Callback,
    changeOwner: js.Object => Callback,
    cleanAll: js.Object => Callback,
    clearSelection: js.Object => Callback,
    deactivate: js.Object => Callback,
    deselect: (js.Object, js.Object, js.Object) => Callback,
    deselectAll: js.Object => Callback,
    elementFromIdentifier: js.Object => Callback,
    elementPosition: (js.Object, js.Object) => Callback,
    isActive: (js.Object, js.Object) => Callback,
    isSelected: (js.Object, js.Object) => Callback,
    onlyOneSelected: Callback,
    rangeDeselect: (js.Object, js.Object, js.Object) => Callback,
    rangeSelect: (js.Object, js.Object, js.Object, js.Object, js.Object) => Callback,
    removeSubscriber: (js.Object, js.Object) => Callback,
    select: (js.Object, js.Object, js.Object, js.Object) => Callback,
    selectedCells: Callback,
    selectedRows: Callback,
    selectionLength: Callback,
    toggle: js.Object => Callback
  ): SelectedCellsCollection = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (activate(t0, t1, t2)).runNow()), activeCell = activeCell.toJsFn, addSubscriber = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (addSubscriber(t0, t1)).runNow()), atLeastOneSelected = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (atLeastOneSelected(t0, t1)).runNow()), changeOwner = js.Any.fromFunction1((t0: js.Object) => changeOwner(t0).runNow()), cleanAll = js.Any.fromFunction1((t0: js.Object) => cleanAll(t0).runNow()), clearSelection = js.Any.fromFunction1((t0: js.Object) => clearSelection(t0).runNow()), deactivate = js.Any.fromFunction1((t0: js.Object) => deactivate(t0).runNow()), deselect = js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (deselect(t0, t1, t2)).runNow()), deselectAll = js.Any.fromFunction1((t0: js.Object) => deselectAll(t0).runNow()), elementFromIdentifier = js.Any.fromFunction1((t0: js.Object) => elementFromIdentifier(t0).runNow()), elementPosition = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (elementPosition(t0, t1)).runNow()), isActive = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (isActive(t0, t1)).runNow()), isSelected = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (isSelected(t0, t1)).runNow()), onlyOneSelected = onlyOneSelected.toJsFn, rangeDeselect = js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (rangeDeselect(t0, t1, t2)).runNow()), rangeSelect = js.Any.fromFunction5((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object) => (rangeSelect(t0, t1, t2, t3, t4)).runNow()), removeSubscriber = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (removeSubscriber(t0, t1)).runNow()), select = js.Any.fromFunction4((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object) => (select(t0, t1, t2, t3)).runNow()), selectedCells = selectedCells.toJsFn, selectedRows = selectedRows.toJsFn, selectionLength = selectionLength.toJsFn, toggle = js.Any.fromFunction1((t0: js.Object) => toggle(t0).runNow()))
    __obj.asInstanceOf[SelectedCellsCollection]
  }
  
  extension [Self <: SelectedCellsCollection](x: Self) {
    
    inline def setActivate(value: (js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setActiveCell(value: Callback): Self = StObject.set(x, "activeCell", value.toJsFn)
    
    inline def setAddSubscriber(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "addSubscriber", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setAtLeastOneSelected(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "atLeastOneSelected", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setChangeOwner(value: js.Object => Callback): Self = StObject.set(x, "changeOwner", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setCleanAll(value: js.Object => Callback): Self = StObject.set(x, "cleanAll", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setClearSelection(value: js.Object => Callback): Self = StObject.set(x, "clearSelection", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDeactivate(value: js.Object => Callback): Self = StObject.set(x, "deactivate", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDeselect(value: (js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "deselect", js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setDeselectAll(value: js.Object => Callback): Self = StObject.set(x, "deselectAll", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setElementFromIdentifier(value: js.Object => Callback): Self = StObject.set(x, "elementFromIdentifier", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setElementPosition(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "elementPosition", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setIsActive(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "isActive", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setIsSelected(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "isSelected", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setOnlyOneSelected(value: Callback): Self = StObject.set(x, "onlyOneSelected", value.toJsFn)
    
    inline def setRangeDeselect(value: (js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "rangeDeselect", js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setRangeSelect(value: (js.Object, js.Object, js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "rangeSelect", js.Any.fromFunction5((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setRemoveSubscriber(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "removeSubscriber", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setSelect(value: (js.Object, js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "select", js.Any.fromFunction4((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSelectedCells(value: Callback): Self = StObject.set(x, "selectedCells", value.toJsFn)
    
    inline def setSelectedRows(value: Callback): Self = StObject.set(x, "selectedRows", value.toJsFn)
    
    inline def setSelectionLength(value: Callback): Self = StObject.set(x, "selectionLength", value.toJsFn)
    
    inline def setToggle(value: js.Object => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
