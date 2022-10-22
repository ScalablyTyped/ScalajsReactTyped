package typingsJapgolly.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalAuthenticationProvider extends StObject {
  
  /**
    * The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon Cognito user pools, or Lambda.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
  
  /**
    * Configuration for Lambda function authorization.
    */
  var lambdaAuthorizerConfig: js.UndefOr[LambdaAuthorizerConfig] = js.undefined
  
  /**
    * The OIDC configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
  
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[CognitoUserPoolConfig] = js.undefined
}
object AdditionalAuthenticationProvider {
  
  inline def apply(): AdditionalAuthenticationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalAuthenticationProvider]
  }
  
  extension [Self <: AdditionalAuthenticationProvider](x: Self) {
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    inline def setLambdaAuthorizerConfig(value: LambdaAuthorizerConfig): Self = StObject.set(x, "lambdaAuthorizerConfig", value.asInstanceOf[js.Any])
    
    inline def setLambdaAuthorizerConfigUndefined: Self = StObject.set(x, "lambdaAuthorizerConfig", js.undefined)
    
    inline def setOpenIDConnectConfig(value: OpenIDConnectConfig): Self = StObject.set(x, "openIDConnectConfig", value.asInstanceOf[js.Any])
    
    inline def setOpenIDConnectConfigUndefined: Self = StObject.set(x, "openIDConnectConfig", js.undefined)
    
    inline def setUserPoolConfig(value: CognitoUserPoolConfig): Self = StObject.set(x, "userPoolConfig", value.asInstanceOf[js.Any])
    
    inline def setUserPoolConfigUndefined: Self = StObject.set(x, "userPoolConfig", js.undefined)
  }
}
