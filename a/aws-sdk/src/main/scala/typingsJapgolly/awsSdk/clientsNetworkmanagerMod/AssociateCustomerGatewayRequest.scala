package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateCustomerGatewayRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the customer gateway.
    */
  var CustomerGatewayArn: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.CustomerGatewayArn
  
  /**
    * The ID of the device.
    */
  var DeviceId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.DeviceId
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.LinkId] = js.undefined
}
object AssociateCustomerGatewayRequest {
  
  inline def apply(CustomerGatewayArn: CustomerGatewayArn, DeviceId: DeviceId, GlobalNetworkId: GlobalNetworkId): AssociateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayArn = CustomerGatewayArn.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCustomerGatewayRequest]
  }
  
  extension [Self <: AssociateCustomerGatewayRequest](x: Self) {
    
    inline def setCustomerGatewayArn(value: CustomerGatewayArn): Self = StObject.set(x, "CustomerGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
  }
}
