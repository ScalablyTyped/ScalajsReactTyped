package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectTransitGatewayPeeringAttachmentResult extends js.Object {
  /**
    * The transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachment: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayPeeringAttachment] = js.native
}

object RejectTransitGatewayPeeringAttachmentResult {
  @scala.inline
  def apply(TransitGatewayPeeringAttachment: TransitGatewayPeeringAttachment = null): RejectTransitGatewayPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayPeeringAttachment != null) __obj.updateDynamic("TransitGatewayPeeringAttachment")(TransitGatewayPeeringAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectTransitGatewayPeeringAttachmentResult]
  }
}

