package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHsmClientCertificateMessage extends StObject {
  
  /**
    * The identifier of the HSM client certificate to be deleted.
    */
  var HsmClientCertificateIdentifier: String
}
object DeleteHsmClientCertificateMessage {
  
  inline def apply(HsmClientCertificateIdentifier: String): DeleteHsmClientCertificateMessage = {
    val __obj = js.Dynamic.literal(HsmClientCertificateIdentifier = HsmClientCertificateIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmClientCertificateMessage]
  }
  
  extension [Self <: DeleteHsmClientCertificateMessage](x: Self) {
    
    inline def setHsmClientCertificateIdentifier(value: String): Self = StObject.set(x, "HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
  }
}
