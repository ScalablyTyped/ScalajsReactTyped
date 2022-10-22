package typingsJapgolly.loginWithAmazonSdkBrowser

import typingsJapgolly.loginWithAmazonSdkBrowser.amazon.Login.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object amazon {
    
    object Login {
      
      @JSGlobal("amazon.Login")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("amazon.Login.Region")
      @js.native
      object Region extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.loginWithAmazonSdkBrowser.amazon.Login.Region & Double] = js.native
        
        /* 2 */ val AsiaPacific: typingsJapgolly.loginWithAmazonSdkBrowser.amazon.Login.Region.AsiaPacific & Double = js.native
        
        /* 1 */ val Europe: typingsJapgolly.loginWithAmazonSdkBrowser.amazon.Login.Region.Europe & Double = js.native
        
        /* 0 */ val NorthAmerica: typingsJapgolly.loginWithAmazonSdkBrowser.amazon.Login.Region.NorthAmerica & Double = js.native
      }
      
      inline def authorize(options: AccessTokenAuthorizeOptions): AccessTokenRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[AccessTokenRequest]
      inline def authorize(options: AccessTokenAuthorizeOptions, next: String): AccessTokenRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[AccessTokenRequest]
      inline def authorize(options: AccessTokenAuthorizeOptions, next: NextCallback[AccessTokenRequest]): AccessTokenRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[AccessTokenRequest]
      inline def authorize(options: AuthorizeOptions): AuthorizeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[AuthorizeRequest]
      inline def authorize(options: AuthorizeOptions, next: String): AuthorizeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[AuthorizeRequest]
      inline def authorize(options: AuthorizeOptions, next: NextCallback[AuthorizeRequest]): AuthorizeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[AuthorizeRequest]
      inline def authorize(options: CodeAuthorizeOptions): CodeRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[CodeRequest]
      inline def authorize(options: CodeAuthorizeOptions, next: String): CodeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[CodeRequest]
      inline def authorize(options: CodeAuthorizeOptions, next: NextCallback[CodeRequest]): CodeRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[CodeRequest]
      
      /**
        * Gets the client identifier that will be used to request authorization.
        * You must call `setClientId` before calling this function.
        */
      inline def getClientId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientId")().asInstanceOf[String]
      
      /**
        * Logs out the current user after a call to `authorize`.
        */
      inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
      
      /**
        * Retrieves the customer profile and passes it to a callback function.
        * Uses an access token provided by `authorize`.
        * @param accessToken An access token. If this parameter is omitted, retrieveProfile will call authorize, requesting the profile scope.
        * @param callback Called with the profile data or an error string
        */
      inline def retrieveProfile(accessToken: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveProfile")(accessToken.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def retrieveProfile(accessToken: String, callback: RetrieveProfileCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveProfile")(accessToken.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /**
        * Retrieves the customer profile and passes it to a callback function.
        * If no `access_token` is provided, this function will call `authorize`
        * with a `profile` scope.
        * @param callback Called with the profile data or an error string
        */
      inline def retrieveProfile(callback: RetrieveProfileCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveProfile")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Sets the client identifier that will be used to request authorization.
        * You must call this function before calling `authorize`.
        */
      inline def setClientId(clientId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientId")(clientId.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Login With Amazon has multiple authorization and resource endpoints.
        * This API determines the region of the authorization and resource
        * endpoints Login with Amazon SDK should talk to. This needs to be
        * called before the authorize and retreiveProfile APIs.
        * When not set, it defaults to “NorthAmerica”
        */
      inline def setRegion(region: Region): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRegion")(region.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Determines whether or not Login with Amazon should use the
        * Amazon Pay sandbox for requests. To use the Amazon Pay sandbox,
        * call `setSandboxMode(true)` before calling `authorize`.
        */
      inline def setSandboxMode(sandboxMode: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSandboxMode")(sandboxMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Sets the domain to use for saving cookies.
        * The domain must match the origin of the current page.
        * Defaults to the full domain for the current page. For example, if
        * you have two pages using the Login with Amazon SDK for JavaScript,
        * `site1.example.com` and `site2.example.com`, you would set the site
        * domain to `example.com` in the header of each site.
        * This will ensure that the cookies on both sites have access
        * to the same cached tokens.
        */
      inline def setSiteDomain(siteDomain: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSiteDomain")(siteDomain.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Determines whether or not Login with Amazon should use access tokens
        * written to the `amazon_Login_accessToken` cookie. You can use this
        * value to share an access token with another page. Access tokens
        * will still only grant access to the registered account for whom they
        * were created. When `true`, the Login with Amazon SDK for JavaScript
        * will check this cookie for cached tokens, and store newly granted
        * tokens in that cookie.
        */
      inline def setUseCookie(useCookie: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseCookie")(useCookie.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
  }
}
