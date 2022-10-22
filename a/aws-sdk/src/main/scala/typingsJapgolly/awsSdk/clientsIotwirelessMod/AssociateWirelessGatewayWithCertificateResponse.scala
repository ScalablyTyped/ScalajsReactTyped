package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWirelessGatewayWithCertificateResponse extends StObject {
  
  /**
    * The ID of the certificate associated with the wireless gateway.
    */
  var IotCertificateId: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.IotCertificateId] = js.undefined
}
object AssociateWirelessGatewayWithCertificateResponse {
  
  inline def apply(): AssociateWirelessGatewayWithCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateWirelessGatewayWithCertificateResponse]
  }
  
  extension [Self <: AssociateWirelessGatewayWithCertificateResponse](x: Self) {
    
    inline def setIotCertificateId(value: IotCertificateId): Self = StObject.set(x, "IotCertificateId", value.asInstanceOf[js.Any])
    
    inline def setIotCertificateIdUndefined: Self = StObject.set(x, "IotCertificateId", js.undefined)
  }
}
