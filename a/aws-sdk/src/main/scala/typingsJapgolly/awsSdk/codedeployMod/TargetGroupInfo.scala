package typingsJapgolly.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupInfo extends js.Object {
  /**
    * For blue/green deployments, the name of the target group that instances in the original environment are deregistered from, and instances in the replacement environment are registered with. For in-place deployments, the name of the target group that instances are deregistered from, so they are not serving traffic during a deployment, and then re-registered with after the deployment is complete. 
    */
  var name: js.UndefOr[TargetGroupName] = js.native
}

object TargetGroupInfo {
  @scala.inline
  def apply(name: TargetGroupName = null): TargetGroupInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupInfo]
  }
}

