package typingsJapgolly.pulumiAws.inputMod.route53

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordFailoverRoutingPolicy extends js.Object {
  /**
    * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
    */
  var `type`: Input[String] = js.native
}

object RecordFailoverRoutingPolicy {
  @scala.inline
  def apply(`type`: Input[String]): RecordFailoverRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFailoverRoutingPolicy]
  }
}

