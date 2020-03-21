package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorAPI extends js.Object {
  var tryGetLock: TryGetLock
  def canGetLock(id: DraggableId): Boolean
  def findClosestDraggableId(event: Event_): DraggableId | Null
  def findOptionsForDraggable(id: DraggableId): DraggableOptions | Null
  def isLockClaimed(): Boolean
  def tryReleaseLock(): Unit
}

object SensorAPI {
  @scala.inline
  def apply(
    canGetLock: DraggableId => CallbackTo[Boolean],
    findClosestDraggableId: Event_ => CallbackTo[DraggableId | Null],
    findOptionsForDraggable: DraggableId => CallbackTo[DraggableOptions | Null],
    isLockClaimed: CallbackTo[Boolean],
    tryGetLock: (/* draggableId */ DraggableId, /* forceStop */ js.UndefOr[js.Function0[Unit]], /* options */ js.UndefOr[TryGetLockOptions]) => CallbackTo[PreDragActions | Null],
    tryReleaseLock: Callback
  ): SensorAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canGetLock")(js.Any.fromFunction1((t0: typingsJapgolly.reactBeautifulDnd.mod.DraggableId) => canGetLock(t0).runNow()))
    __obj.updateDynamic("findClosestDraggableId")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => findClosestDraggableId(t0).runNow()))
    __obj.updateDynamic("findOptionsForDraggable")(js.Any.fromFunction1((t0: typingsJapgolly.reactBeautifulDnd.mod.DraggableId) => findOptionsForDraggable(t0).runNow()))
    __obj.updateDynamic("isLockClaimed")(isLockClaimed.toJsFn)
    __obj.updateDynamic("tryGetLock")(js.Any.fromFunction3((t0: /* draggableId */ typingsJapgolly.reactBeautifulDnd.mod.DraggableId, t1: /* forceStop */ js.UndefOr[js.Function0[scala.Unit]], t2: /* options */ js.UndefOr[typingsJapgolly.reactBeautifulDnd.mod.TryGetLockOptions]) => tryGetLock(t0, t1, t2).runNow()))
    __obj.updateDynamic("tryReleaseLock")(tryReleaseLock.toJsFn)
    __obj.asInstanceOf[SensorAPI]
  }
}

