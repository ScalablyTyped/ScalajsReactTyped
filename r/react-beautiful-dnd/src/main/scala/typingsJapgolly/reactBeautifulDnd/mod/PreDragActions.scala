package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreDragActions extends js.Object {
  // cancel the pre drag without starting a drag. Releases the lock
  def abort(): Unit
  // lift the current item
  def fluidLift(clientSelection: Position): FluidDragActions
  // discover if the lock is still active
  def isActive(): Boolean
  // whether it has been indicated if force press should be respected
  def shouldRespectForcePress(): Boolean
  def snapLift(): SnapDragActions
}

object PreDragActions {
  @scala.inline
  def apply(
    abort: Callback,
    fluidLift: Position => CallbackTo[FluidDragActions],
    isActive: CallbackTo[Boolean],
    shouldRespectForcePress: CallbackTo[Boolean],
    snapLift: CallbackTo[SnapDragActions]
  ): PreDragActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("fluidLift")(js.Any.fromFunction1((t0: typingsJapgolly.reactBeautifulDnd.mod.Position) => fluidLift(t0).runNow()))
    __obj.updateDynamic("isActive")(isActive.toJsFn)
    __obj.updateDynamic("shouldRespectForcePress")(shouldRespectForcePress.toJsFn)
    __obj.updateDynamic("snapLift")(snapLift.toJsFn)
    __obj.asInstanceOf[PreDragActions]
  }
}

