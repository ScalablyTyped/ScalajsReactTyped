package typingsJapgolly.dndCore.reducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var dirtyHandlerIds: typingsJapgolly.dndCore.dirtyHandlerIdsMod.State
  var dragOffset: typingsJapgolly.dndCore.dragOffsetMod.State
  var dragOperation: typingsJapgolly.dndCore.dragOperationMod.State
  var refCount: typingsJapgolly.dndCore.refCountMod.State
  var stateId: typingsJapgolly.dndCore.stateIdMod.State
}

object State {
  @scala.inline
  def apply(
    dirtyHandlerIds: typingsJapgolly.dndCore.dirtyHandlerIdsMod.State,
    dragOffset: typingsJapgolly.dndCore.dragOffsetMod.State,
    dragOperation: typingsJapgolly.dndCore.dragOperationMod.State,
    refCount: typingsJapgolly.dndCore.refCountMod.State,
    stateId: typingsJapgolly.dndCore.stateIdMod.State
  ): State = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

