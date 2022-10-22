package typingsJapgolly.paypalCheckoutServerSdk

import typingsJapgolly.paypalCheckoutServerSdk.libCoreAccessTokenRequestMod.AccessTokenRequestHeaders
import typingsJapgolly.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment
import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.POST
import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.authorization_code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreRefreshTokenRequestMod {
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/refresh_token_request", "RefreshTokenRequest")
  @js.native
  open class RefreshTokenRequest protected () extends StObject {
    /**
      * @param environment - The environment for this request (sandbox or live)
      * @param code - The authorization code provided at the end of the user consent OAuth flow.
      */
    def this(environment: PayPalEnvironment, code: String) = this()
    
    val body: RefreshTokenRequestBody = js.native
    
    val headers: AccessTokenRequestHeaders = js.native
    
    val path: String = js.native
    
    val verb: POST = js.native
  }
  
  trait RefreshTokenRequestBody extends StObject {
    
    var code: String
    
    var grant_type: authorization_code
  }
  object RefreshTokenRequestBody {
    
    inline def apply(code: String): RefreshTokenRequestBody = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], grant_type = "authorization_code")
      __obj.asInstanceOf[RefreshTokenRequestBody]
    }
    
    extension [Self <: RefreshTokenRequestBody](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setGrant_type(value: authorization_code): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    }
  }
}
