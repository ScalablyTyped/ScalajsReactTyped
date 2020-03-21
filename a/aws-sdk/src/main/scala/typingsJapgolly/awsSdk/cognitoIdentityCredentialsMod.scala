package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typingsJapgolly.awsSdk.cognitoidentityMod.GetCredentialsForIdentityResponse
import typingsJapgolly.awsSdk.cognitoidentityMod.GetIdInput
import typingsJapgolly.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
import typingsJapgolly.awsSdk.configMod.ConfigurationOptions
import typingsJapgolly.awsSdk.credentialsMod.Credentials
import typingsJapgolly.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
import typingsJapgolly.awsSdk.stsMod.AssumeRoleWithWebIdentityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/cognito_identity_credentials", JSImport.Namespace)
@js.native
object cognitoIdentityCredentialsMod extends js.Object {
  @js.native
  /**
    * Creates a new credentials object.
    */
  class CognitoIdentityCredentials () extends Credentials {
    /**
      * Creates a new credentials object with optional configuration.
      */
    def this(options: CognitoIdentityOptions) = this()
    def this(options: CognitoIdentityOptions, clientConfig: ConfigurationOptions) = this()
    /**
      * The raw data response from the call to AWS.CognitoIdentity.getCredentialsForIdentity(), or AWS.STS.assumeRoleWithWebIdentity().
      */
    var data: GetCredentialsForIdentityResponse | AssumeRoleWithWebIdentityResponse = js.native
    /**
      * The Cognito ID returned by the last call to AWS.CognitoIdentity.getOpenIdToken().
      */
    var identityId: String = js.native
    /**
      * The map of params passed to AWS.CognitoIdentity.getId(), AWS.CognitoIdentity.getOpenIdToken(), and AWS.STS.assumeRoleWithWebIdentity().
      */
    var params: GetIdInput | GetOpenIdTokenInput | AssumeRoleWithWebIdentityRequest = js.native
    /**
      * Clears the cached Cognito ID associated with the currently configured identity pool ID.
      */
    def clearCachedId(): Unit = js.native
  }
  
  // Needed to expose interfaces on the class
  @js.native
  object CognitoIdentityCredentials extends js.Object {
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.awsSdk.cognitoidentityMod.GetIdInput
      - typingsJapgolly.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput
      - typingsJapgolly.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
      - typingsJapgolly.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
    */
    trait CognitoIdentityCredentialsInputs extends js.Object
    
    type ClientConfiguration = ConfigurationOptions
    type CognitoIdentityOptions = CognitoIdentityCredentialsInputs with AnonLoginId
  }
  
}

