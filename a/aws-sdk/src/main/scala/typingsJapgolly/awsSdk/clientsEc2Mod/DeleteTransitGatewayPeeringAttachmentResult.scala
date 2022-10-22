package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayPeeringAttachmentResult extends StObject {
  
  /**
    * The transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachment: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.TransitGatewayPeeringAttachment] = js.undefined
}
object DeleteTransitGatewayPeeringAttachmentResult {
  
  inline def apply(): DeleteTransitGatewayPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayPeeringAttachmentResult]
  }
  
  extension [Self <: DeleteTransitGatewayPeeringAttachmentResult](x: Self) {
    
    inline def setTransitGatewayPeeringAttachment(value: TransitGatewayPeeringAttachment): Self = StObject.set(x, "TransitGatewayPeeringAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPeeringAttachmentUndefined: Self = StObject.set(x, "TransitGatewayPeeringAttachment", js.undefined)
  }
}
