package typingsJapgolly.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAutoScalingPolicyInput extends js.Object {
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: typingsJapgolly.awsSdk.emrMod.ClusterId = js.native
  /**
    * Specifies the ID of the instance group to which the scaling policy is applied.
    */
  var InstanceGroupId: typingsJapgolly.awsSdk.emrMod.InstanceGroupId = js.native
}

object RemoveAutoScalingPolicyInput {
  @scala.inline
  def apply(ClusterId: ClusterId, InstanceGroupId: InstanceGroupId): RemoveAutoScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveAutoScalingPolicyInput]
  }
}

