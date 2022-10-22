package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateInfo extends StObject {
  
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.CertificateId] = js.undefined
  
  /**
    * The common name for the certificate.
    */
  var CommonName: js.UndefOr[CertificateCN] = js.undefined
  
  /**
    * The date and time when the certificate will expire.
    */
  var ExpiryDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the certificate.
    */
  var State: js.UndefOr[CertificateState] = js.undefined
  
  /**
    * The function that the registered certificate performs. Valid values include ClientLDAPS or ClientCertAuth. The default value is ClientLDAPS.
    */
  var Type: js.UndefOr[CertificateType] = js.undefined
}
object CertificateInfo {
  
  inline def apply(): CertificateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateInfo]
  }
  
  extension [Self <: CertificateInfo](x: Self) {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "CertificateId", js.undefined)
    
    inline def setCommonName(value: CertificateCN): Self = StObject.set(x, "CommonName", value.asInstanceOf[js.Any])
    
    inline def setCommonNameUndefined: Self = StObject.set(x, "CommonName", js.undefined)
    
    inline def setExpiryDateTime(value: js.Date): Self = StObject.set(x, "ExpiryDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpiryDateTimeUndefined: Self = StObject.set(x, "ExpiryDateTime", js.undefined)
    
    inline def setState(value: CertificateState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: CertificateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
