package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.dragOffsetMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirtyHandlerIds extends js.Object {
  var dirtyHandlerIds: js.Array[String]
  var dragOffset: State
  var dragOperation: typingsJapgolly.dndCore.dragOperationMod.State
  var refCount: Double
  var stateId: Double
}

object AnonDirtyHandlerIds {
  @scala.inline
  def apply(
    dirtyHandlerIds: js.Array[String],
    dragOffset: State,
    dragOperation: typingsJapgolly.dndCore.dragOperationMod.State,
    refCount: Double,
    stateId: Double
  ): AnonDirtyHandlerIds = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirtyHandlerIds]
  }
}

