package typingsJapgolly.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEMCert extends StObject {
  
  /**
    * Path to the certificate file, relative to project root.
    */
  var cert: String
  
  /**
    * Path to the private key file, relative to project root.
    */
  var key: String
  
  /**
    * Path to a text file containing the passphrase, relative to project root.
    */
  var passphrase: js.UndefOr[String] = js.undefined
}
object PEMCert {
  
  inline def apply(cert: String, key: String): PEMCert = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEMCert]
  }
  
  extension [Self <: PEMCert](x: Self) {
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}
