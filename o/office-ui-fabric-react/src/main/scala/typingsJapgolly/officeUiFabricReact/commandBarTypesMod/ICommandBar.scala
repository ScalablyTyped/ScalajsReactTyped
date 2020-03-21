package typingsJapgolly.officeUiFabricReact.commandBarTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBar extends js.Object {
  /**
    * Sets focus to the active command in the list.
    */
  def focus(): Unit
  /**
    * Remeasures the available space.
    */
  def remeasure(): Unit
}

object ICommandBar {
  @scala.inline
  def apply(focus: Callback, remeasure: Callback): ICommandBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("remeasure")(remeasure.toJsFn)
    __obj.asInstanceOf[ICommandBar]
  }
}

