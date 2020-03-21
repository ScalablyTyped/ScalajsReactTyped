package typingsJapgolly.pulumiAws.outputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleTargetIp extends js.Object {
  /**
    * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
    */
  var ip: String = js.native
  /**
    * The port at `ip` that you want to forward DNS queries to. Default value is `53`
    */
  var port: js.UndefOr[Double] = js.native
}

object ResolverRuleTargetIp {
  @scala.inline
  def apply(ip: String, port: Int | Double = null): ResolverRuleTargetIp = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleTargetIp]
  }
}

