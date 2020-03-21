package typingsJapgolly.pulumiAws.getVpnGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.ec2.GetVpnGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnGatewayArgs extends js.Object {
  /**
    * The Autonomous System Number (ASN) for the Amazon side of the specific VPN Gateway to retrieve.
    */
  val amazonSideAsn: js.UndefOr[String] = js.native
  /**
    * The ID of a VPC attached to the specific VPN Gateway to retrieve.
    */
  val attachedVpcId: js.UndefOr[String] = js.native
  /**
    * The Availability Zone of the specific VPN Gateway to retrieve.
    */
  val availabilityZone: js.UndefOr[String] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpnGatewayFilter]] = js.native
  /**
    * The ID of the specific VPN Gateway to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The state of the specific VPN Gateway to retrieve.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPN Gateway.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpnGatewayArgs {
  @scala.inline
  def apply(
    amazonSideAsn: String = null,
    attachedVpcId: String = null,
    availabilityZone: String = null,
    filters: js.Array[GetVpnGatewayFilter] = null,
    id: String = null,
    state: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetVpnGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (amazonSideAsn != null) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn.asInstanceOf[js.Any])
    if (attachedVpcId != null) __obj.updateDynamic("attachedVpcId")(attachedVpcId.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnGatewayArgs]
  }
}

