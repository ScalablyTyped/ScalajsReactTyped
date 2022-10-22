package typingsJapgolly.paypalCheckoutServerSdk.libLibMod

import typingsJapgolly.paypalCheckoutServerSdk.libCoreAccessTokenMod.AccessTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.AccessToken")
  @js.native
  open class AccessToken protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libCoreLibMod.AccessToken {
    def this(options: AccessTokenOptions) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.AccessTokenRequest")
  @js.native
  open class AccessTokenRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libCoreLibMod.AccessTokenRequest {
    def this(environment: typingsJapgolly.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment) = this()
    def this(
      environment: typingsJapgolly.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
      refreshToken: String
    ) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.LiveEnvironment")
  @js.native
  open class LiveEnvironment protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libCoreLibMod.LiveEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.PayPalEnvironment")
  @js.native
  open class PayPalEnvironment protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libCoreLibMod.PayPalEnvironment {
    /**
      * @param clientId - The client id for this environment
      * @param clientSecret - The client secret
      * @param baseUrl - The base url to execute requests
      * @param webUrl - The web url to authorize user's consent
      */
    def this(clientId: String, clientSecret: String, baseUrl: String, webUrl: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.PayPalHttpClient")
  @js.native
  open class PayPalHttpClient protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libCoreLibMod.PayPalHttpClient {
    /**
      * @param environment - The environment for this client
      * @param refreshToken - The refreshToken to be used to generate the access Token.
      */
    def this(environment: typingsJapgolly.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment) = this()
    def this(
      environment: typingsJapgolly.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
      refreshToken: String
    ) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.RefreshTokenRequest")
  @js.native
  open class RefreshTokenRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libCoreLibMod.RefreshTokenRequest {
    /**
      * @param environment - The environment for this request (sandbox or live)
      * @param code - The authorization code provided at the end of the user consent OAuth flow.
      */
    def this(
      environment: typingsJapgolly.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
      code: String
    ) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.SandboxEnvironment")
  @js.native
  open class SandboxEnvironment protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libCoreLibMod.SandboxEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
}
