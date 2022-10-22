package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateResponse extends StObject {
  
  /**
    * An array of identifiers for the imported certificates. You use this identifier for working with profiles and partner profiles.
    */
  var CertificateId: typingsJapgolly.awsSdk.clientsTransferMod.CertificateId
}
object ImportCertificateResponse {
  
  inline def apply(CertificateId: CertificateId): ImportCertificateResponse = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateResponse]
  }
  
  extension [Self <: ImportCertificateResponse](x: Self) {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
  }
}
