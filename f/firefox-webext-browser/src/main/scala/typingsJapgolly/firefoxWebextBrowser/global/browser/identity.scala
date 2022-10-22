package typingsJapgolly.firefoxWebextBrowser.global.browser

import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import typingsJapgolly.firefoxWebextBrowser.browser.identity.AccountInfo
import typingsJapgolly.firefoxWebextBrowser.browser.identity.GetAuthTokenDetails
import typingsJapgolly.firefoxWebextBrowser.browser.identity.GetProfileUserInfoReturnUserinfo
import typingsJapgolly.firefoxWebextBrowser.browser.identity.LaunchWebAuthFlowDetails
import typingsJapgolly.firefoxWebextBrowser.browser.identity.RemoveCachedAuthTokenDetails
import typingsJapgolly.firefoxWebextBrowser.browser.identity.RemoveCachedAuthTokenReturnUserinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the browser.identity API to get OAuth2 access tokens.
  *
  * Permissions: `identity`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object identity {
  
  @JSGlobal("browser.identity")
  @js.native
  val ^ : js.Any = js.native
  
  /* identity functions */
  /**
    * Retrieves a list of AccountInfo objects describing the accounts present on the profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def getAccounts(): js.Promise[js.Array[AccountInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccounts")().asInstanceOf[js.Promise[js.Array[AccountInfo]]]
  
  /**
    * Gets an OAuth2 access token using the client ID and scopes specified in the oauth2 section of manifest.json.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def getAuthToken(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")().asInstanceOf[js.Promise[String]]
  inline def getAuthToken(details: GetAuthTokenDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /**
    * Retrieves email address and obfuscated gaia id of the user signed into a profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def getProfileUserInfo(): js.Promise[GetProfileUserInfoReturnUserinfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileUserInfo")().asInstanceOf[js.Promise[GetProfileUserInfoReturnUserinfo]]
  
  /**
    * Generates a redirect URL to be used in |launchWebAuthFlow|.
    * @param [path] The path appended to the end of the generated URL.
    */
  inline def getRedirectURL(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")().asInstanceOf[String]
  inline def getRedirectURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Starts an auth flow at the specified URL. */
  inline def launchWebAuthFlow(details: LaunchWebAuthFlowDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchWebAuthFlow")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /* identity events */
  /**
    * Fired when signin state changes for an account on the user's profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.identity.onSignInChanged")
  @js.native
  val onSignInChanged: js.UndefOr[
    WebExtEvent[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
  ] = js.native
  
  /**
    * Removes an OAuth2 access token from the Identity API's token cache.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def removeCachedAuthToken(details: RemoveCachedAuthTokenDetails): js.Promise[RemoveCachedAuthTokenReturnUserinfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCachedAuthToken")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RemoveCachedAuthTokenReturnUserinfo]]
}
