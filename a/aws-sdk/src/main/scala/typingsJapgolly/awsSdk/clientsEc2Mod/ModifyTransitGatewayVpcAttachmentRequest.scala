package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTransitGatewayVpcAttachmentRequest extends StObject {
  
  /**
    * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
    */
  var AddSubnetIds: js.UndefOr[TransitGatewaySubnetIdList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The new VPC attachment options.
    */
  var Options: js.UndefOr[ModifyTransitGatewayVpcAttachmentRequestOptions] = js.undefined
  
  /**
    * The IDs of one or more subnets to remove.
    */
  var RemoveSubnetIds: js.UndefOr[TransitGatewaySubnetIdList] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: typingsJapgolly.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId
}
object ModifyTransitGatewayVpcAttachmentRequest {
  
  inline def apply(TransitGatewayAttachmentId: TransitGatewayAttachmentId): ModifyTransitGatewayVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTransitGatewayVpcAttachmentRequest]
  }
  
  extension [Self <: ModifyTransitGatewayVpcAttachmentRequest](x: Self) {
    
    inline def setAddSubnetIds(value: TransitGatewaySubnetIdList): Self = StObject.set(x, "AddSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setAddSubnetIdsUndefined: Self = StObject.set(x, "AddSubnetIds", js.undefined)
    
    inline def setAddSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "AddSubnetIds", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setOptions(value: ModifyTransitGatewayVpcAttachmentRequestOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setRemoveSubnetIds(value: TransitGatewaySubnetIdList): Self = StObject.set(x, "RemoveSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveSubnetIdsUndefined: Self = StObject.set(x, "RemoveSubnetIds", js.undefined)
    
    inline def setRemoveSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "RemoveSubnetIds", js.Array(value*))
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
  }
}
