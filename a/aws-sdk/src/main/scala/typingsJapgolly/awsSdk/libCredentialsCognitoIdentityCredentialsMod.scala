package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.anon.LoginId
import typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetCredentialsForIdentityResponse
import typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetIdInput
import typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetOpenIdTokenInput
import typingsJapgolly.awsSdk.clientsCognitoidentityMod.IdentityId
import typingsJapgolly.awsSdk.clientsCognitoidentityMod.IdentityPoolId
import typingsJapgolly.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest
import typingsJapgolly.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityResponse
import typingsJapgolly.awsSdk.clientsStsMod.arnType
import typingsJapgolly.awsSdk.clientsStsMod.clientTokenType
import typingsJapgolly.awsSdk.clientsStsMod.roleSessionNameType
import typingsJapgolly.awsSdk.libConfigBaseMod.ConfigurationOptions
import typingsJapgolly.awsSdk.libCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsCognitoIdentityCredentialsMod {
  
  @js.native
  trait CognitoIdentityCredentials extends Credentials {
    
    /**
      * Clears the cached Cognito ID associated with the currently configured identity pool ID.
      */
    def clearCachedId(): Unit = js.native
    
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
  }
  // Needed to expose interfaces on the class
  object CognitoIdentityCredentials {
    
    type ClientConfiguration = ConfigurationOptions
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetIdInput
      - typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetCredentialsForIdentityInput
      - typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetOpenIdTokenInput
      - typingsJapgolly.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest
    */
    trait CognitoIdentityCredentialsInputs extends StObject
    object CognitoIdentityCredentialsInputs {
      
      inline def AssumeRoleWithWebIdentityRequest(RoleArn: arnType, RoleSessionName: roleSessionNameType, WebIdentityToken: clientTokenType): typingsJapgolly.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest = {
        val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any], WebIdentityToken = WebIdentityToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest]
      }
      
      inline def GetCredentialsForIdentityInput(IdentityId: IdentityId): typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetCredentialsForIdentityInput = {
        val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetCredentialsForIdentityInput]
      }
      
      inline def GetIdInput(IdentityPoolId: IdentityPoolId): typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetIdInput = {
        val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetIdInput]
      }
      
      inline def GetOpenIdTokenInput(IdentityId: IdentityId): typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetOpenIdTokenInput = {
        val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.awsSdk.clientsCognitoidentityMod.GetOpenIdTokenInput]
      }
    }
    
    type CognitoIdentityOptions = CognitoIdentityCredentialsInputs & LoginId
  }
}
