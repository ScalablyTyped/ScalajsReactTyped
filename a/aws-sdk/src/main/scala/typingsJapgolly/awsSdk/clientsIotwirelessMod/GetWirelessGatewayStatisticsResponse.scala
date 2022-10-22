package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayStatisticsResponse extends StObject {
  
  /**
    * The connection status of the wireless gateway.
    */
  var ConnectionStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.ConnectionStatus] = js.undefined
  
  /**
    * The date and time when the most recent uplink was received.
    */
  var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined
  
  /**
    * The ID of the wireless gateway.
    */
  var WirelessGatewayId: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.WirelessGatewayId] = js.undefined
}
object GetWirelessGatewayStatisticsResponse {
  
  inline def apply(): GetWirelessGatewayStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWirelessGatewayStatisticsResponse]
  }
  
  extension [Self <: GetWirelessGatewayStatisticsResponse](x: Self) {
    
    inline def setConnectionStatus(value: ConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setLastUplinkReceivedAt(value: ISODateTimeString): Self = StObject.set(x, "LastUplinkReceivedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUplinkReceivedAtUndefined: Self = StObject.set(x, "LastUplinkReceivedAt", js.undefined)
    
    inline def setWirelessGatewayId(value: WirelessGatewayId): Self = StObject.set(x, "WirelessGatewayId", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewayIdUndefined: Self = StObject.set(x, "WirelessGatewayId", js.undefined)
  }
}
