package typingsJapgolly.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWebsiteCertificateAuthorityRequest extends StObject {
  
  /**
    * The root certificate of the CA.
    */
  var Certificate: typingsJapgolly.awsSdk.clientsWorklinkMod.Certificate
  
  /**
    * The certificate name to display.
    */
  var DisplayName: js.UndefOr[typingsJapgolly.awsSdk.clientsWorklinkMod.DisplayName] = js.undefined
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsJapgolly.awsSdk.clientsWorklinkMod.FleetArn
}
object AssociateWebsiteCertificateAuthorityRequest {
  
  inline def apply(Certificate: Certificate, FleetArn: FleetArn): AssociateWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityRequest]
  }
  
  extension [Self <: AssociateWebsiteCertificateAuthorityRequest](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
