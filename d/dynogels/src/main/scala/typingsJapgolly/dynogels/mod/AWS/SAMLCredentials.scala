package typingsJapgolly.dynogels.mod.AWS

import typingsJapgolly.awsSdk.samlCredentialsMod.SAMLCredentialsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.SAMLCredentials")
@js.native
class SAMLCredentials protected ()
  extends typingsJapgolly.awsSdk.mod.SAMLCredentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
}

