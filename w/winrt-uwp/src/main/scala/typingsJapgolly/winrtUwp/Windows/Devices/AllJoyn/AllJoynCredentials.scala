package typingsJapgolly.winrtUwp.Windows.Devices.AllJoyn

import typingsJapgolly.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines properties used when passing credentials during authentication. */
trait AllJoynCredentials extends StObject {
  
  /** The mechanism used for credential authentication. */
  var authenticationMechanism: AllJoynAuthenticationMechanism
  
  /** The cryptography certificate used for the Rsa and EcdheEcdsa authentication mechanisms. */
  var certificate: Certificate
  
  /** The user name, if any, and password used for authentication. */
  var passwordCredential: PasswordCredential
  
  /** The period of time before provided credentials expire. */
  var timeout: Double
}
object AllJoynCredentials {
  
  inline def apply(
    authenticationMechanism: AllJoynAuthenticationMechanism,
    certificate: Certificate,
    passwordCredential: PasswordCredential,
    timeout: Double
  ): AllJoynCredentials = {
    val __obj = js.Dynamic.literal(authenticationMechanism = authenticationMechanism.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], passwordCredential = passwordCredential.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynCredentials]
  }
  
  extension [Self <: AllJoynCredentials](x: Self) {
    
    inline def setAuthenticationMechanism(value: AllJoynAuthenticationMechanism): Self = StObject.set(x, "authenticationMechanism", value.asInstanceOf[js.Any])
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setPasswordCredential(value: PasswordCredential): Self = StObject.set(x, "passwordCredential", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
