package typingsJapgolly.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrafficPolicyInstanceResponse extends js.Object {
  /**
    * A complex type that contains settings for the traffic policy instance.
    */
  var TrafficPolicyInstance: typingsJapgolly.awsSdk.route53Mod.TrafficPolicyInstance = js.native
}

object GetTrafficPolicyInstanceResponse {
  @scala.inline
  def apply(TrafficPolicyInstance: TrafficPolicyInstance): GetTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTrafficPolicyInstanceResponse]
  }
}

