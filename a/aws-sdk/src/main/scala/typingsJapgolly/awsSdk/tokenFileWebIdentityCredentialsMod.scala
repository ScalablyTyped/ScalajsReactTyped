package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.configMod.ConfigurationOptions
import typingsJapgolly.awsSdk.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/token_file_web_identity_credentials", JSImport.Namespace)
@js.native
object tokenFileWebIdentityCredentialsMod extends js.Object {
  @js.native
  /**
    * Creates a new credentials object with optional configuraion.
    * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
    */
  class TokenFileWebIdentityCredentials () extends Credentials {
    def this(clientConfig: ConfigurationOptions) = this()
  }
  
}

