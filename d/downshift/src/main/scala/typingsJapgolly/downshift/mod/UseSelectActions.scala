package typingsJapgolly.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseSelectActions[Item] extends StObject {
  
  def closeMenu(): Unit
  
  def openMenu(): Unit
  
  def reset(): Unit
  
  def selectItem(item: Item): Unit
  
  def setHighlightedIndex(index: Double): Unit
  
  def toggleMenu(): Unit
}
object UseSelectActions {
  
  inline def apply[Item](
    closeMenu: japgolly.scalajs.react.Callback,
    openMenu: japgolly.scalajs.react.Callback,
    reset: japgolly.scalajs.react.Callback,
    selectItem: Item => japgolly.scalajs.react.Callback,
    setHighlightedIndex: Double => japgolly.scalajs.react.Callback,
    toggleMenu: japgolly.scalajs.react.Callback
  ): UseSelectActions[Item] = {
    val __obj = js.Dynamic.literal(closeMenu = closeMenu.toJsFn, openMenu = openMenu.toJsFn, reset = reset.toJsFn, selectItem = js.Any.fromFunction1((t0: Item) => selectItem(t0).runNow()), setHighlightedIndex = js.Any.fromFunction1((t0: Double) => setHighlightedIndex(t0).runNow()), toggleMenu = toggleMenu.toJsFn)
    __obj.asInstanceOf[UseSelectActions[Item]]
  }
  
  extension [Self <: UseSelectActions[?], Item](x: Self & UseSelectActions[Item]) {
    
    inline def setCloseMenu(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "closeMenu", value.toJsFn)
    
    inline def setOpenMenu(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "openMenu", value.toJsFn)
    
    inline def setReset(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSelectItem(value: Item => japgolly.scalajs.react.Callback): Self = StObject.set(x, "selectItem", js.Any.fromFunction1((t0: Item) => value(t0).runNow()))
    
    inline def setSetHighlightedIndex(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setHighlightedIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setToggleMenu(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "toggleMenu", value.toJsFn)
  }
}
