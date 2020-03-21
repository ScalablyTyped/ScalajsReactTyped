package typingsJapgolly.authmosphere.oauthconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.authmosphere.oauthconfigMod.CredentialsDirConfig
  - typingsJapgolly.authmosphere.oauthconfigMod.CredentialsClientConfig
*/
trait CredentialsConfig extends js.Object

object CredentialsConfig {
  @scala.inline
  def CredentialsDirConfig(credentialsDir: String): CredentialsConfig = {
    val __obj = js.Dynamic.literal(credentialsDir = credentialsDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialsConfig]
  }
  @scala.inline
  def CredentialsClientConfig(clientId: String, clientSecret: String): CredentialsConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialsConfig]
  }
}

