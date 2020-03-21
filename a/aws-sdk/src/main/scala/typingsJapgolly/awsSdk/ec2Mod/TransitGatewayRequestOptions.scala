package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayRequestOptions extends js.Object {
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  /**
    * Enable or disable automatic acceptance of attachment requests. The default is disable.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.native
  /**
    * Enable or disable automatic association with the default association route table. The default is enable.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.native
  /**
    * Enable or disable automatic propagation of routes to the default propagation route table. The default is enable.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.native
  /**
    * Enable or disable DNS support.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  /**
    * Indicates whether multicast is enabled on the transit gateway
    */
  var MulticastSupport: js.UndefOr[MulticastSupportValue] = js.native
  /**
    * Enable or disable Equal Cost Multipath Protocol support.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.native
}

object TransitGatewayRequestOptions {
  @scala.inline
  def apply(
    AmazonSideAsn: Int | scala.Double = null,
    AutoAcceptSharedAttachments: AutoAcceptSharedAttachmentsValue = null,
    DefaultRouteTableAssociation: DefaultRouteTableAssociationValue = null,
    DefaultRouteTablePropagation: DefaultRouteTablePropagationValue = null,
    DnsSupport: DnsSupportValue = null,
    MulticastSupport: MulticastSupportValue = null,
    VpnEcmpSupport: VpnEcmpSupportValue = null
  ): TransitGatewayRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (AmazonSideAsn != null) __obj.updateDynamic("AmazonSideAsn")(AmazonSideAsn.asInstanceOf[js.Any])
    if (AutoAcceptSharedAttachments != null) __obj.updateDynamic("AutoAcceptSharedAttachments")(AutoAcceptSharedAttachments.asInstanceOf[js.Any])
    if (DefaultRouteTableAssociation != null) __obj.updateDynamic("DefaultRouteTableAssociation")(DefaultRouteTableAssociation.asInstanceOf[js.Any])
    if (DefaultRouteTablePropagation != null) __obj.updateDynamic("DefaultRouteTablePropagation")(DefaultRouteTablePropagation.asInstanceOf[js.Any])
    if (DnsSupport != null) __obj.updateDynamic("DnsSupport")(DnsSupport.asInstanceOf[js.Any])
    if (MulticastSupport != null) __obj.updateDynamic("MulticastSupport")(MulticastSupport.asInstanceOf[js.Any])
    if (VpnEcmpSupport != null) __obj.updateDynamic("VpnEcmpSupport")(VpnEcmpSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayRequestOptions]
  }
}

