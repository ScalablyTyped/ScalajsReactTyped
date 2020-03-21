package typingsJapgolly.pulumiAws.inputMod.servicediscovery

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDnsConfigDnsRecord extends js.Object {
  /**
    * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
    */
  var ttl: Input[Double] = js.native
  /**
    * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
    */
  var `type`: Input[String] = js.native
}

object ServiceDnsConfigDnsRecord {
  @scala.inline
  def apply(ttl: Input[Double], `type`: Input[String]): ServiceDnsConfigDnsRecord = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDnsConfigDnsRecord]
  }
}

