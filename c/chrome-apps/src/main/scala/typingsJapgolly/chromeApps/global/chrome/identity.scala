package typingsJapgolly.chromeApps.global.chrome

import typingsJapgolly.chromeApps.chrome.identity.AccountInfo
import typingsJapgolly.chromeApps.chrome.identity.TokenDetails
import typingsJapgolly.chromeApps.chrome.identity.TokenInformation
import typingsJapgolly.chromeApps.chrome.identity.UserInfo
import typingsJapgolly.chromeApps.chrome.identity.WebAuthFlowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.identity
//////////////
// Identity //
//////////////
/**
  * Use the chrome.identity API to get OAuth2 access tokens.
  * @requires Permissions: 'identity'
  * @see[Identity User]{@link https://developer.chrome.com/apps/app_identity}
  * @since Chrome 29.
  */
object identity {
  
  @JSGlobal("chrome.identity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @requires(dev) **Dev channel only.**
    * @description
    * Retrieves a list of AccountInfo objects describing the accounts present on the profile.
    * getAccounts is only supported on dev channel.
    */
  inline def getAccounts(callback: js.Function1[/* accounts */ js.Array[AccountInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccounts")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Gets an OAuth2 access token using the client ID and
    * scopes specified in the oauth2 section of manifest.json.
    *
    * The Identity API caches access tokens in memory,
    * so it's ok to call getAuthToken non-interactively any time a token is required.
    * The token cache automatically handles expiration.
    *
    * For a good user experience it is important interactive token requests are initiated by
    * UI in your app explaining what the authorization is for. Failing to do this will cause
    * your users to get authorization requests, or Chrome sign in screens if they are not
    * signed in, with with no context. In particular, do not use getAuthToken interactively
    * when your app is first launched.
    *
    * @param details Token options.
    * @param [callback] Called with an OAuth2 access token as specified by the manifest,
    *                   or undefined if there was an error.
    */
  inline def getAuthToken(details: TokenDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getAuthToken(details: TokenDetails, callback: js.Function1[/* token */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Retrieves email address and obfuscated gaia id of the user signed into a profile.
    * This API is different from identity.getAccounts in two ways.
    * The information returned is available offline, and it only applies to the primary account for the profile.
    * @since Chrome 37.
    */
  inline def getProfileUserInfo(callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileUserInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Generates a redirect URL to be used in launchWebAuthFlow.
    * The generated URLs match the pattern https://<app-id>.chromiumapp.org/ *.
    * @since Chrome 33.
    * @param path The path appended to the end of the generated URL.
    */
  inline def getRedirectURL(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")().asInstanceOf[String]
  inline def getRedirectURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Starts an auth flow at the specified URL.
    * This method enables auth flows with non-Google identity providers by launching
    * a web view and navigating it to the first URL in the provider's auth flow.
    * When the provider redirects to a URL matching the pattern https://<app-id>.chromiumapp.org/ *,
    * the window will close, and the final redirect URL will be passed to the callback function.
    * For a good user experience it is important interactive auth flows are initiated by UI in
    * your app explaining what the authorization is for. Failing to do this will cause your
    * users to get authorization requests with no context.
    * In particular, do not launch an interactive auth flow when your app is first launched.
    * @param details WebAuth flow options.
    * @param callback Called with the URL redirected back to your application.
    * The callback parameter should be a function that looks like this:
    * function(string responseUrl) {...};
    */
  inline def launchWebAuthFlow(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("launchWebAuthFlow")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when signin state changes for an account on the user's profile.
    * @since Chrome 33.
    */
  @JSGlobal("chrome.identity.onSignInChanged")
  @js.native
  val onSignInChanged: typingsJapgolly.chromeApps.chrome.events.Event[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]] = js.native
  
  /**
    * Removes an OAuth2 access token from the Identity API's token cache.
    * If an access token is discovered to be invalid,
    * it should be passed to removeCachedAuthToken to remove it from the cache.
    * The app may then retrieve a fresh token with getAuthToken.
    * @param details Token information.
    * @param callback Called when the token has been removed from the cache.
    */
  inline def removeCachedAuthToken(details: TokenInformation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCachedAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeCachedAuthToken(details: TokenInformation, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCachedAuthToken")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
