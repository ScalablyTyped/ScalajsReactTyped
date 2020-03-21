package typingsJapgolly.awsSdk.mod

import typingsJapgolly.awsSdk.samlCredentialsMod.SAMLCredentialsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "SAMLCredentials")
@js.native
class SAMLCredentials protected ()
  extends typingsJapgolly.awsSdk.coreMod.SAMLCredentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
}

