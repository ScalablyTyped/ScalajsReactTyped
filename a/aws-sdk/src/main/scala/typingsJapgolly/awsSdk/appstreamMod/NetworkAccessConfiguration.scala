package typingsJapgolly.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAccessConfiguration extends js.Object {
  /**
    * The resource identifier of the elastic network interface that is attached to instances in your VPC. All network interfaces have the eni-xxxxxxxx resource identifier.
    */
  var EniId: js.UndefOr[String] = js.native
  /**
    * The private IP address of the elastic network interface that is attached to instances in your VPC.
    */
  var EniPrivateIpAddress: js.UndefOr[String] = js.native
}

object NetworkAccessConfiguration {
  @scala.inline
  def apply(EniId: String = null, EniPrivateIpAddress: String = null): NetworkAccessConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EniId != null) __obj.updateDynamic("EniId")(EniId.asInstanceOf[js.Any])
    if (EniPrivateIpAddress != null) __obj.updateDynamic("EniPrivateIpAddress")(EniPrivateIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAccessConfiguration]
  }
}

