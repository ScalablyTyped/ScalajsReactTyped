package typingsJapgolly.materialUiCore.popoverPopoverMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverActions extends js.Object {
  def updatePosition(): Unit = js.native
}

object PopoverActions {
  @scala.inline
  def apply(updatePosition: Callback): PopoverActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updatePosition")(updatePosition.toJsFn)
    __obj.asInstanceOf[PopoverActions]
  }
}

