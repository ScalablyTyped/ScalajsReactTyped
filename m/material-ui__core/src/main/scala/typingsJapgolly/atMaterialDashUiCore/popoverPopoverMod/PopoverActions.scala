package typingsJapgolly.atMaterialDashUiCore.popoverPopoverMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverActions extends js.Object {
  def updatePosition(): Unit
}

object PopoverActions {
  @scala.inline
  def apply(updatePosition: Callback): PopoverActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updatePosition")(updatePosition.toJsFn)
    __obj.asInstanceOf[PopoverActions]
  }
}

