package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCertificateFromCsrResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate. You can use the ARN as a principal for policy operations.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The ID of the certificate. Certificate management operations only take a certificateId.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
}
object CreateCertificateFromCsrResponse {
  
  inline def apply(): CreateCertificateFromCsrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCertificateFromCsrResponse]
  }
  
  extension [Self <: CreateCertificateFromCsrResponse](x: Self) {
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    inline def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    inline def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
  }
}
