package typingsJapgolly.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectByHeapObjectIdParameterType extends js.Object {
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.undefined
  var objectId: HeapSnapshotObjectId
}

object GetObjectByHeapObjectIdParameterType {
  @scala.inline
  def apply(objectId: HeapSnapshotObjectId, objectGroup: String = null): GetObjectByHeapObjectIdParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    if (objectGroup != null) __obj.updateDynamic("objectGroup")(objectGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectByHeapObjectIdParameterType]
  }
}

