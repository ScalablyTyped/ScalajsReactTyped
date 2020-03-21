package typingsJapgolly.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectActions[Item] extends js.Object {
  def closeMenu(): Unit
  def openMenu(): Unit
  def reset(): Unit
  def selectItem(item: Item): Unit
  def setHighlightedIndex(index: Double): Unit
  def toggleMenu(): Unit
}

object UseSelectActions {
  @scala.inline
  def apply[Item](
    closeMenu: japgolly.scalajs.react.Callback,
    openMenu: japgolly.scalajs.react.Callback,
    reset: japgolly.scalajs.react.Callback,
    selectItem: Item => japgolly.scalajs.react.Callback,
    setHighlightedIndex: Double => japgolly.scalajs.react.Callback,
    toggleMenu: japgolly.scalajs.react.Callback
  ): UseSelectActions[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeMenu")(closeMenu.toJsFn)
    __obj.updateDynamic("openMenu")(openMenu.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("selectItem")(js.Any.fromFunction1((t0: Item) => selectItem(t0).runNow()))
    __obj.updateDynamic("setHighlightedIndex")(js.Any.fromFunction1((t0: scala.Double) => setHighlightedIndex(t0).runNow()))
    __obj.updateDynamic("toggleMenu")(toggleMenu.toJsFn)
    __obj.asInstanceOf[UseSelectActions[Item]]
  }
}

