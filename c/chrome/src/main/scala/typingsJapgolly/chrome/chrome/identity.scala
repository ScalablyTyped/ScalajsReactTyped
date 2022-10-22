package typingsJapgolly.chrome.chrome

import typingsJapgolly.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Identity
////////////////////
/**
  * Use the chrome.identity API to get OAuth2 access tokens.
  * Permissions:  "identity"
  * @since Chrome 29.
  */
object identity {
  
  @js.native
  sealed trait AccountStatus extends StObject
  @JSGlobal("chrome.identity.AccountStatus")
  @js.native
  object AccountStatus extends StObject {
    
    @js.native
    sealed trait ANY
      extends StObject
         with AccountStatus
    
    @js.native
    sealed trait SYNC
      extends StObject
         with AccountStatus
  }
  
  trait AccountInfo extends StObject {
    
    /** A unique identifier for the account. This ID will not change for the lifetime of the account. */
    var id: String
  }
  object AccountInfo {
    
    inline def apply(id: String): AccountInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfo]
    }
    
    extension [Self <: AccountInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProfileDetails extends StObject {
    
    /**
      * Optional.
      * A status of the primary account signed into a profile whose ProfileUserInfo should be returned. Defaults to SYNC account status.
      */
    var accountStatus: js.UndefOr[AccountStatus] = js.undefined
  }
  object ProfileDetails {
    
    inline def apply(): ProfileDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfileDetails]
    }
    
    extension [Self <: ProfileDetails](x: Self) {
      
      inline def setAccountStatus(value: AccountStatus): Self = StObject.set(x, "accountStatus", value.asInstanceOf[js.Any])
      
      inline def setAccountStatusUndefined: Self = StObject.set(x, "accountStatus", js.undefined)
    }
  }
  
  type SignInChangeEvent = Event[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
  
  trait TokenDetails extends StObject {
    
    /**
      * Optional.
      * The account ID whose token should be returned. If not specified, the primary account for the profile will be used.
      * account is only supported when the "enable-new-profile-management" flag is set.
      * @since Chrome 37.
      */
    var account: js.UndefOr[AccountInfo] = js.undefined
    
    /**
      * Optional.
      * Fetching a token may require the user to sign-in to Chrome, or approve the application's requested scopes. If the interactive flag is true, getAuthToken will prompt the user as necessary. When the flag is false or omitted, getAuthToken will return failure any time a prompt would be required.
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional.
      * A list of OAuth2 scopes to request.
      * When the scopes field is present, it overrides the list of scopes specified in manifest.json.
      * @since Chrome 37.
      */
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TokenDetails {
    
    inline def apply(): TokenDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenDetails]
    }
    
    extension [Self <: TokenDetails](x: Self) {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  trait TokenInformation extends StObject {
    
    /** The specific token that should be removed from the cache. */
    var token: String
  }
  object TokenInformation {
    
    inline def apply(token: String): TokenInformation = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenInformation]
    }
    
    extension [Self <: TokenInformation](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserInfo extends StObject {
    
    /** An email address for the user account signed into the current profile. Empty if the user is not signed in or the identity.email manifest permission is not specified. */
    var email: String
    
    /** A unique identifier for the account. This ID will not change for the lifetime of the account. Empty if the user is not signed in or (in M41+) the identity.email manifest permission is not specified. */
    var id: String
  }
  object UserInfo {
    
    inline def apply(email: String, id: String): UserInfo = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    extension [Self <: UserInfo](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAuthFlowOptions extends StObject {
    
    /**
      * Optional.
      * Whether to launch auth flow in interactive mode.
      * Since some auth flows may immediately redirect to a result URL, launchWebAuthFlow hides its web view until the first navigation either redirects to the final URL, or finishes loading a page meant to be displayed.
      * If the interactive flag is true, the window will be displayed when a page load completes. If the flag is false or omitted, launchWebAuthFlow will return with an error if the initial navigation does not complete the flow.
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /** The URL that initiates the auth flow. */
    var url: String
  }
  object WebAuthFlowOptions {
    
    inline def apply(url: String): WebAuthFlowOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAuthFlowOptions]
    }
    
    extension [Self <: WebAuthFlowOptions](x: Self) {
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
