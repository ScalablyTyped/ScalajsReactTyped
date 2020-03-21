package typingsJapgolly.awsSdk.coreMod

import typingsJapgolly.awsSdk.samlCredentialsMod.SAMLCredentialsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "SAMLCredentials")
@js.native
class SAMLCredentials protected ()
  extends typingsJapgolly.awsSdk.samlCredentialsMod.SAMLCredentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
}

