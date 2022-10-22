package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionsRequest extends StObject {
  
  /**
    * One or more connection IDs.
    */
  var ConnectionIds: js.UndefOr[ConnectionIdList] = js.undefined
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.DeviceId] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetConnectionsRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetConnectionsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionsRequest]
  }
  
  extension [Self <: GetConnectionsRequest](x: Self) {
    
    inline def setConnectionIds(value: ConnectionIdList): Self = StObject.set(x, "ConnectionIds", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdsUndefined: Self = StObject.set(x, "ConnectionIds", js.undefined)
    
    inline def setConnectionIdsVarargs(value: ConnectionId*): Self = StObject.set(x, "ConnectionIds", js.Array(value*))
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
