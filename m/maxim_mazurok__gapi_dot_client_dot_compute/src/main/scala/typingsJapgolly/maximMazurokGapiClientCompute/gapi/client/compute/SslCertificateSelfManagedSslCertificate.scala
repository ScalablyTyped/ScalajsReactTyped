package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslCertificateSelfManagedSslCertificate extends StObject {
  
  /** A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert. */
  var certificate: js.UndefOr[String] = js.undefined
  
  /** A write-only private key in PEM format. Only insert requests will include this field. */
  var privateKey: js.UndefOr[String] = js.undefined
}
object SslCertificateSelfManagedSslCertificate {
  
  inline def apply(): SslCertificateSelfManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertificateSelfManagedSslCertificate]
  }
  
  extension [Self <: SslCertificateSelfManagedSslCertificate](x: Self) {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
  }
}
