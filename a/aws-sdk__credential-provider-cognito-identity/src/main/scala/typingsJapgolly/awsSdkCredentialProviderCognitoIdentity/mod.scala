package typingsJapgolly.awsSdkCredentialProviderCognitoIdentity

import typingsJapgolly.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityMod.FromCognitoIdentityParameters
import typingsJapgolly.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityPoolMod.FromCognitoIdentityPoolParameters
import typingsJapgolly.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-cognito-identity", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fromCognitoIdentity(parameters: FromCognitoIdentityParameters): CredentialProvider = js.native
  def fromCognitoIdentityPool(
    hasAccountIdCacheClientCustomRoleArnIdentityPoolIdLoginsUserIdentifier: FromCognitoIdentityPoolParameters
  ): CredentialProvider = js.native
}

