package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCACertificateRequest extends StObject {
  
  /**
    * The CA certificate identifier.
    */
  var certificateId: CertificateId
  
  /**
    * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
    */
  var newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined
  
  /**
    * The updated status of the CA certificate.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var newStatus: js.UndefOr[CACertificateStatus] = js.undefined
  
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
  
  /**
    * If true, removes auto registration.
    */
  var removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.undefined
}
object UpdateCACertificateRequest {
  
  inline def apply(certificateId: CertificateId): UpdateCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCACertificateRequest]
  }
  
  extension [Self <: UpdateCACertificateRequest](x: Self) {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setNewAutoRegistrationStatus(value: AutoRegistrationStatus): Self = StObject.set(x, "newAutoRegistrationStatus", value.asInstanceOf[js.Any])
    
    inline def setNewAutoRegistrationStatusUndefined: Self = StObject.set(x, "newAutoRegistrationStatus", js.undefined)
    
    inline def setNewStatus(value: CACertificateStatus): Self = StObject.set(x, "newStatus", value.asInstanceOf[js.Any])
    
    inline def setNewStatusUndefined: Self = StObject.set(x, "newStatus", js.undefined)
    
    inline def setRegistrationConfig(value: RegistrationConfig): Self = StObject.set(x, "registrationConfig", value.asInstanceOf[js.Any])
    
    inline def setRegistrationConfigUndefined: Self = StObject.set(x, "registrationConfig", js.undefined)
    
    inline def setRemoveAutoRegistration(value: RemoveAutoRegistration): Self = StObject.set(x, "removeAutoRegistration", value.asInstanceOf[js.Any])
    
    inline def setRemoveAutoRegistrationUndefined: Self = StObject.set(x, "removeAutoRegistration", js.undefined)
  }
}
