package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerTargetGroupsType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
    */
  var TargetGroupARNs: typingsJapgolly.awsSdk.autoscalingMod.TargetGroupARNs = js.native
}

object AttachLoadBalancerTargetGroupsType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, TargetGroupARNs: TargetGroupARNs): AttachLoadBalancerTargetGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], TargetGroupARNs = TargetGroupARNs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachLoadBalancerTargetGroupsType]
  }
}

