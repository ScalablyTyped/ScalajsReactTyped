package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLinkAssociationsRequest extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.DeviceId] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.LinkId] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetLinkAssociationsRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetLinkAssociationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinkAssociationsRequest]
  }
  
  extension [Self <: GetLinkAssociationsRequest](x: Self) {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
