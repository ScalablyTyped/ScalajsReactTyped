package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNetworkInterfaceAttributeRequest extends js.Object {
  /**
    * The attribute of the network interface. This parameter is required.
    */
  var Attribute: js.UndefOr[NetworkInterfaceAttribute] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: String = js.native
}

object DescribeNetworkInterfaceAttributeRequest {
  @scala.inline
  def apply(
    NetworkInterfaceId: String,
    Attribute: NetworkInterfaceAttribute = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeNetworkInterfaceAttributeRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNetworkInterfaceAttributeRequest]
  }
}

