package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllSelected[T] extends StObject {
  
  val allSelected: Boolean
  
  def isSelected(item: T): Boolean
  
  val noneSelected: Boolean
  
  val partiallySelected: Boolean
  
  def select(item: T): Unit
  
  def selectAll(): Unit
  
  val selected: js.Array[T]
  
  val setSelected: Dispatch[SetStateAction[js.Array[T]]]
  
  def toggle(item: T): Unit
  
  def toggleAll(): Unit
  
  def unSelect(item: T): Unit
  
  def unSelectAll(): Unit
}
object AllSelected {
  
  inline def apply[T](
    allSelected: Boolean,
    isSelected: T => Boolean,
    noneSelected: Boolean,
    partiallySelected: Boolean,
    select: T => Callback,
    selectAll: Callback,
    selected: js.Array[T],
    setSelected: SetStateAction[js.Array[T]] => Callback,
    toggle: T => Callback,
    toggleAll: Callback,
    unSelect: T => Callback,
    unSelectAll: Callback
  ): AllSelected[T] = {
    val __obj = js.Dynamic.literal(allSelected = allSelected.asInstanceOf[js.Any], isSelected = js.Any.fromFunction1(isSelected), noneSelected = noneSelected.asInstanceOf[js.Any], partiallySelected = partiallySelected.asInstanceOf[js.Any], select = js.Any.fromFunction1((t0: T) => select(t0).runNow()), selectAll = selectAll.toJsFn, selected = selected.asInstanceOf[js.Any], setSelected = js.Any.fromFunction1((t0: SetStateAction[js.Array[T]]) => setSelected(t0).runNow()), toggle = js.Any.fromFunction1((t0: T) => toggle(t0).runNow()), toggleAll = toggleAll.toJsFn, unSelect = js.Any.fromFunction1((t0: T) => unSelect(t0).runNow()), unSelectAll = unSelectAll.toJsFn)
    __obj.asInstanceOf[AllSelected[T]]
  }
  
  extension [Self <: AllSelected[?], T](x: Self & AllSelected[T]) {
    
    inline def setAllSelected(value: Boolean): Self = StObject.set(x, "allSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: T => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
    
    inline def setNoneSelected(value: Boolean): Self = StObject.set(x, "noneSelected", value.asInstanceOf[js.Any])
    
    inline def setPartiallySelected(value: Boolean): Self = StObject.set(x, "partiallySelected", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: T => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setSelectAll(value: Callback): Self = StObject.set(x, "selectAll", value.toJsFn)
    
    inline def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setSetSelected(value: SetStateAction[js.Array[T]] => Callback): Self = StObject.set(x, "setSelected", js.Any.fromFunction1((t0: SetStateAction[js.Array[T]]) => value(t0).runNow()))
    
    inline def setToggle(value: T => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setToggleAll(value: Callback): Self = StObject.set(x, "toggleAll", value.toJsFn)
    
    inline def setUnSelect(value: T => Callback): Self = StObject.set(x, "unSelect", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setUnSelectAll(value: Callback): Self = StObject.set(x, "unSelectAll", value.toJsFn)
  }
}
