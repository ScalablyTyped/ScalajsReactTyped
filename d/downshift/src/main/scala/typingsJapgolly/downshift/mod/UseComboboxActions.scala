package typingsJapgolly.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseComboboxActions[Item] extends StObject {
  
  def closeMenu(): Unit
  
  def openMenu(): Unit
  
  def reset(): Unit
  
  def selectItem(item: Item): Unit
  
  def setHighlightedIndex(index: Double): Unit
  
  def setInputValue(inputValue: String): Unit
  
  def toggleMenu(): Unit
}
object UseComboboxActions {
  
  inline def apply[Item](
    closeMenu: japgolly.scalajs.react.Callback,
    openMenu: japgolly.scalajs.react.Callback,
    reset: japgolly.scalajs.react.Callback,
    selectItem: Item => japgolly.scalajs.react.Callback,
    setHighlightedIndex: Double => japgolly.scalajs.react.Callback,
    setInputValue: String => japgolly.scalajs.react.Callback,
    toggleMenu: japgolly.scalajs.react.Callback
  ): UseComboboxActions[Item] = {
    val __obj = js.Dynamic.literal(closeMenu = closeMenu.toJsFn, openMenu = openMenu.toJsFn, reset = reset.toJsFn, selectItem = js.Any.fromFunction1((t0: Item) => selectItem(t0).runNow()), setHighlightedIndex = js.Any.fromFunction1((t0: Double) => setHighlightedIndex(t0).runNow()), setInputValue = js.Any.fromFunction1((t0: String) => setInputValue(t0).runNow()), toggleMenu = toggleMenu.toJsFn)
    __obj.asInstanceOf[UseComboboxActions[Item]]
  }
  
  extension [Self <: UseComboboxActions[?], Item](x: Self & UseComboboxActions[Item]) {
    
    inline def setCloseMenu(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "closeMenu", value.toJsFn)
    
    inline def setOpenMenu(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "openMenu", value.toJsFn)
    
    inline def setReset(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSelectItem(value: Item => japgolly.scalajs.react.Callback): Self = StObject.set(x, "selectItem", js.Any.fromFunction1((t0: Item) => value(t0).runNow()))
    
    inline def setSetHighlightedIndex(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setHighlightedIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetInputValue(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setInputValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToggleMenu(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "toggleMenu", value.toJsFn)
  }
}
