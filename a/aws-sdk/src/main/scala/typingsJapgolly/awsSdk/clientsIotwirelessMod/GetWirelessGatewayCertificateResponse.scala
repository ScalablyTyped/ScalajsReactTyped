package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayCertificateResponse extends StObject {
  
  /**
    * The ID of the certificate associated with the wireless gateway.
    */
  var IotCertificateId: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.IotCertificateId] = js.undefined
  
  /**
    * The ID of the certificate that is associated with the wireless gateway and used for the LoRaWANNetworkServer endpoint.
    */
  var LoRaWANNetworkServerCertificateId: js.UndefOr[IotCertificateId] = js.undefined
}
object GetWirelessGatewayCertificateResponse {
  
  inline def apply(): GetWirelessGatewayCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWirelessGatewayCertificateResponse]
  }
  
  extension [Self <: GetWirelessGatewayCertificateResponse](x: Self) {
    
    inline def setIotCertificateId(value: IotCertificateId): Self = StObject.set(x, "IotCertificateId", value.asInstanceOf[js.Any])
    
    inline def setIotCertificateIdUndefined: Self = StObject.set(x, "IotCertificateId", js.undefined)
    
    inline def setLoRaWANNetworkServerCertificateId(value: IotCertificateId): Self = StObject.set(x, "LoRaWANNetworkServerCertificateId", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANNetworkServerCertificateIdUndefined: Self = StObject.set(x, "LoRaWANNetworkServerCertificateId", js.undefined)
  }
}
