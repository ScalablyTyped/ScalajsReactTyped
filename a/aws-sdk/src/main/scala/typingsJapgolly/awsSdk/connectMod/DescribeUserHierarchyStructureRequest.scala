package typingsJapgolly.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserHierarchyStructureRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.connectMod.InstanceId = js.native
}

object DescribeUserHierarchyStructureRequest {
  @scala.inline
  def apply(InstanceId: InstanceId): DescribeUserHierarchyStructureRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeUserHierarchyStructureRequest]
  }
}

