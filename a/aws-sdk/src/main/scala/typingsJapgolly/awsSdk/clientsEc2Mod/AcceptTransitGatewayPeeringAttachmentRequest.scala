package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptTransitGatewayPeeringAttachmentRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the transit gateway attachment.
    */
  var TransitGatewayAttachmentId: typingsJapgolly.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId
}
object AcceptTransitGatewayPeeringAttachmentRequest {
  
  inline def apply(TransitGatewayAttachmentId: TransitGatewayAttachmentId): AcceptTransitGatewayPeeringAttachmentRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptTransitGatewayPeeringAttachmentRequest]
  }
  
  extension [Self <: AcceptTransitGatewayPeeringAttachmentRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
  }
}
