package typingsJapgolly.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webappsecCredentialManagement.PasswordCredential
  - typingsJapgolly.webappsecCredentialManagement.FederatedCredential
  - typingsJapgolly.webappsecCredentialManagement.PublicKeyCredential
*/
trait CredentialType extends StObject
object CredentialType {
  
  inline def FederatedCredential(id: String, provider: String): typingsJapgolly.webappsecCredentialManagement.FederatedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], iconURL = null, name = null, protocol = null)
    __obj.updateDynamic("type")("federated")
    __obj.asInstanceOf[typingsJapgolly.webappsecCredentialManagement.FederatedCredential]
  }
  
  inline def PasswordCredential(id: String, idName: String, passwordName: String): typingsJapgolly.webappsecCredentialManagement.PasswordCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], idName = idName.asInstanceOf[js.Any], passwordName = passwordName.asInstanceOf[js.Any], additionalData = null, iconURL = null, name = null)
    __obj.updateDynamic("type")("password")
    __obj.asInstanceOf[typingsJapgolly.webappsecCredentialManagement.PasswordCredential]
  }
  
  inline def PublicKeyCredential(id: String, rawId: js.typedarray.ArrayBuffer, response: AuthenticatorResponse): typingsJapgolly.webappsecCredentialManagement.PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public-key")
    __obj.asInstanceOf[typingsJapgolly.webappsecCredentialManagement.PublicKeyCredential]
  }
}
