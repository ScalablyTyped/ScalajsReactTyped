package typingsJapgolly.node.inspectorMod.HeapProfiler

import typingsJapgolly.node.inspectorMod.Runtime.RemoteObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHeapObjectIdParameterType extends js.Object {
  /**
    * Identifier of the object to get heap object id for.
    */
  var objectId: RemoteObjectId
}

object GetHeapObjectIdParameterType {
  @scala.inline
  def apply(objectId: RemoteObjectId): GetHeapObjectIdParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetHeapObjectIdParameterType]
  }
}

