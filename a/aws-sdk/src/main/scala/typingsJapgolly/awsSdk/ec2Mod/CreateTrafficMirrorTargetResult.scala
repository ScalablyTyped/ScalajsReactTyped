package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficMirrorTargetResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the Traffic Mirror target.
    */
  var TrafficMirrorTarget: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.TrafficMirrorTarget] = js.native
}

object CreateTrafficMirrorTargetResult {
  @scala.inline
  def apply(ClientToken: String = null, TrafficMirrorTarget: TrafficMirrorTarget = null): CreateTrafficMirrorTargetResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (TrafficMirrorTarget != null) __obj.updateDynamic("TrafficMirrorTarget")(TrafficMirrorTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficMirrorTargetResult]
  }
}

