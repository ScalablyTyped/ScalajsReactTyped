package typingsJapgolly.azureCoreHttp

import typingsJapgolly.azureCoreHttp.typesLatestSrcCredentialsServiceClientCredentialsMod.ServiceClientCredentials
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import typingsJapgolly.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesSigningPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/signingPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/signingPolicy", "SigningPolicy")
  @js.native
  open class SigningPolicy_ protected () extends BaseRequestPolicy {
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      authenticationProvider: ServiceClientCredentials
    ) = this()
    
    var authenticationProvider: ServiceClientCredentials = js.native
    
    def signRequest(request: WebResourceLike): js.Promise[WebResourceLike] = js.native
  }
  
  inline def signingPolicy(authenticationProvider: ServiceClientCredentials): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("signingPolicy")(authenticationProvider.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
}
