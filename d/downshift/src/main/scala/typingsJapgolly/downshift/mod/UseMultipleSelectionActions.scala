package typingsJapgolly.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMultipleSelectionActions[Item] extends StObject {
  
  def addSelectedItem(item: Item): Unit
  
  def removeSelectedItem(item: Item): Unit
  
  def reset(): Unit
  
  def setActiveIndex(index: Double): Unit
  
  def setSelectedItems(items: js.Array[Item]): Unit
}
object UseMultipleSelectionActions {
  
  inline def apply[Item](
    addSelectedItem: Item => japgolly.scalajs.react.Callback,
    removeSelectedItem: Item => japgolly.scalajs.react.Callback,
    reset: japgolly.scalajs.react.Callback,
    setActiveIndex: Double => japgolly.scalajs.react.Callback,
    setSelectedItems: js.Array[Item] => japgolly.scalajs.react.Callback
  ): UseMultipleSelectionActions[Item] = {
    val __obj = js.Dynamic.literal(addSelectedItem = js.Any.fromFunction1((t0: Item) => addSelectedItem(t0).runNow()), removeSelectedItem = js.Any.fromFunction1((t0: Item) => removeSelectedItem(t0).runNow()), reset = reset.toJsFn, setActiveIndex = js.Any.fromFunction1((t0: Double) => setActiveIndex(t0).runNow()), setSelectedItems = js.Any.fromFunction1((t0: js.Array[Item]) => setSelectedItems(t0).runNow()))
    __obj.asInstanceOf[UseMultipleSelectionActions[Item]]
  }
  
  extension [Self <: UseMultipleSelectionActions[?], Item](x: Self & UseMultipleSelectionActions[Item]) {
    
    inline def setAddSelectedItem(value: Item => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addSelectedItem", js.Any.fromFunction1((t0: Item) => value(t0).runNow()))
    
    inline def setRemoveSelectedItem(value: Item => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeSelectedItem", js.Any.fromFunction1((t0: Item) => value(t0).runNow()))
    
    inline def setReset(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetActiveIndex(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setActiveIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSelectedItems(value: js.Array[Item] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setSelectedItems", js.Any.fromFunction1((t0: js.Array[Item]) => value(t0).runNow()))
  }
}
