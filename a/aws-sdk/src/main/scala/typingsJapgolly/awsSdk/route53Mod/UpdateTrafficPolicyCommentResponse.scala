package typingsJapgolly.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrafficPolicyCommentResponse extends js.Object {
  /**
    * A complex type that contains settings for the specified traffic policy.
    */
  var TrafficPolicy: typingsJapgolly.awsSdk.route53Mod.TrafficPolicy = js.native
}

object UpdateTrafficPolicyCommentResponse {
  @scala.inline
  def apply(TrafficPolicy: TrafficPolicy): UpdateTrafficPolicyCommentResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateTrafficPolicyCommentResponse]
  }
}

