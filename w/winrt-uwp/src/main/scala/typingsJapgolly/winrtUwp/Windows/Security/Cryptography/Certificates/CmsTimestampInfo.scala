package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an RFC3161 unauthenticated timestamp attribute in a signed CMS message. */
trait CmsTimestampInfo extends StObject {
  
  /** Gets the list of certificates that is used for chain building for the signing certificate. */
  var certificates: IVectorView[Certificate]
  
  /** Gets the certificate that is used to sign the timestamp. */
  var signingCertificate: Certificate
  
  /** Gets the date and time of the timestamp. */
  var timestamp: js.Date
}
object CmsTimestampInfo {
  
  inline def apply(certificates: IVectorView[Certificate], signingCertificate: Certificate, timestamp: js.Date): CmsTimestampInfo = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], signingCertificate = signingCertificate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmsTimestampInfo]
  }
  
  extension [Self <: CmsTimestampInfo](x: Self) {
    
    inline def setCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setSigningCertificate(value: Certificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
