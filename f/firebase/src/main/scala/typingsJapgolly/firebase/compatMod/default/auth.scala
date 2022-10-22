package typingsJapgolly.firebase.compatMod.default

import typingsJapgolly.firebase.compatMod.firebase.app.App
import typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation
import typingsJapgolly.firebase.compatMod.firebase.auth.Auth
import typingsJapgolly.firebase.compatMod.firebase.auth.AuthProvider
import typingsJapgolly.firebase.compatMod.firebase.auth.MultiFactorInfo
import typingsJapgolly.firebase.compatMod.firebase.auth.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  /**
    * Gets the {@link firebase.auth.Auth `Auth`} service for the default app or a
    * given app.
    *
    * `firebase.auth()` can be called with no arguments to access the default app's
    * {@link firebase.auth.Auth `Auth`} service or as `firebase.auth(app)` to
    * access the {@link firebase.auth.Auth `Auth`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    *
    * // Get the Auth service for the default app
    * var defaultAuth = firebase.auth();
    * ```
    * @example
    * ```javascript
    *
    * // Get the Auth service for a given app
    * var otherAuth = firebase.auth(otherApp);
    * ```
    * @param app
    */
  inline def apply(): Auth = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Auth]
  inline def apply(app: App): Auth = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  
  @JSImport("firebase/compat", "default.auth")
  @js.native
  val ^ : js.Any = js.native
  
  object ActionCodeInfo {
    
    /**
      * An enumeration of the possible email action types.
      */
    object Operation {
      
      @JSImport("firebase/compat", "default.auth.ActionCodeInfo.Operation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The email link sign-in action.
        */
      @JSImport("firebase/compat", "default.auth.ActionCodeInfo.Operation.EMAIL_SIGNIN")
      @js.native
      def EMAIL_SIGNIN: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def EMAIL_SIGNIN_=(x: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_SIGNIN")(x.asInstanceOf[js.Any])
      
      /**
        * The password reset action.
        */
      @JSImport("firebase/compat", "default.auth.ActionCodeInfo.Operation.PASSWORD_RESET")
      @js.native
      def PASSWORD_RESET: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def PASSWORD_RESET_=(x: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PASSWORD_RESET")(x.asInstanceOf[js.Any])
      
      /**
        * The email revocation action.
        */
      @JSImport("firebase/compat", "default.auth.ActionCodeInfo.Operation.RECOVER_EMAIL")
      @js.native
      def RECOVER_EMAIL: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def RECOVER_EMAIL_=(x: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RECOVER_EMAIL")(x.asInstanceOf[js.Any])
      
      /**
        * The revert second factor addition email action.
        */
      @JSImport("firebase/compat", "default.auth.ActionCodeInfo.Operation.REVERT_SECOND_FACTOR_ADDITION")
      @js.native
      def REVERT_SECOND_FACTOR_ADDITION: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def REVERT_SECOND_FACTOR_ADDITION_=(x: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVERT_SECOND_FACTOR_ADDITION")(x.asInstanceOf[js.Any])
      
      /**
        * The verify and update email action.
        */
      @JSImport("firebase/compat", "default.auth.ActionCodeInfo.Operation.VERIFY_AND_CHANGE_EMAIL")
      @js.native
      def VERIFY_AND_CHANGE_EMAIL: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def VERIFY_AND_CHANGE_EMAIL_=(x: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERIFY_AND_CHANGE_EMAIL")(x.asInstanceOf[js.Any])
      
      /**
        * The email verification action.
        */
      @JSImport("firebase/compat", "default.auth.ActionCodeInfo.Operation.VERIFY_EMAIL")
      @js.native
      def VERIFY_EMAIL: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def VERIFY_EMAIL_=(x: typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERIFY_EMAIL")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A utility class to parse email action URLs.
    */
  @JSImport("firebase/compat", "default.auth.ActionCodeURL")
  @js.native
  /* private */ open class ActionCodeURL ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeURL {
    
    /**
      * The API key of the email action link.
      */
    /* CompleteClass */
    var apiKey: String = js.native
    
    /**
      * The action code of the email action link.
      */
    /* CompleteClass */
    var code: String = js.native
    
    /**
      * The continue URL of the email action link. Null if not provided.
      */
    /* CompleteClass */
    var continueUrl: String | Null = js.native
    
    /**
      * The language code of the email action link. Null if not provided.
      */
    /* CompleteClass */
    var languageCode: String | Null = js.native
    
    /**
      * The action performed by the email action link. It returns from one
      * of the types from {@link firebase.auth.ActionCodeInfo}.
      */
    /* CompleteClass */
    var operation: Operation = js.native
    
    /**
      * The tenant ID of the email action link. Null if the email action
      * is from the parent project.
      */
    /* CompleteClass */
    var tenantId: String | Null = js.native
  }
  object ActionCodeURL {
    
    @JSImport("firebase/compat", "default.auth.ActionCodeURL")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the email action link string and returns an ActionCodeURL object
      * if the link is valid, otherwise returns null.
      *
      * @param link The email action link string.
      * @return The ActionCodeURL object, or null if the link is invalid.
      */
    /* static member */
    inline def parseLink(link: String): typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLink")(link.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.ActionCodeURL | Null]
  }
  
  object Auth {
    
    /**
      * An enumeration of the possible persistence mechanism types.
      */
    object Persistence {
      
      @JSImport("firebase/compat", "default.auth.Auth.Persistence")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Indicates that the state will be persisted even when the browser window is
        * closed or the activity is destroyed in react-native.
        */
      @JSImport("firebase/compat", "default.auth.Auth.Persistence.LOCAL")
      @js.native
      def LOCAL: typingsJapgolly.firebase.compatMod.firebase.auth.Auth.Persistence = js.native
      inline def LOCAL_=(x: typingsJapgolly.firebase.compatMod.firebase.auth.Auth.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
      
      /**
        * Indicates that the state will only be stored in memory and will be cleared
        * when the window or activity is refreshed.
        */
      @JSImport("firebase/compat", "default.auth.Auth.Persistence.NONE")
      @js.native
      def NONE: typingsJapgolly.firebase.compatMod.firebase.auth.Auth.Persistence = js.native
      inline def NONE_=(x: typingsJapgolly.firebase.compatMod.firebase.auth.Auth.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
      
      /**
        * Indicates that the state will only persist in current session/tab, relevant
        * to web only, and will be cleared when the tab is closed.
        */
      @JSImport("firebase/compat", "default.auth.Auth.Persistence.SESSION")
      @js.native
      def SESSION: typingsJapgolly.firebase.compatMod.firebase.auth.Auth.Persistence = js.native
      inline def SESSION_=(x: typingsJapgolly.firebase.compatMod.firebase.auth.Auth.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface that represents the credentials returned by an auth provider.
    * Implementations specify the details about each auth provider's credential
    * requirements.
    *
    */
  /* note: abstract class */ @JSImport("firebase/compat", "default.auth.AuthCredential")
  @js.native
  open class AuthCredential ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential {
    
    /**
      * The authentication provider ID for the credential.
      * For example, 'facebook.com', or 'google.com'.
      */
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * The authentication sign in method for the credential.
      * For example, 'password', or 'emailLink. This corresponds to the sign-in
      * method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* CompleteClass */
    var signInMethod: String = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      */
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  object AuthCredential {
    
    @JSImport("firebase/compat", "default.auth.AuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: String): typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential | Null]
    /**
      * Static method to deserialize a JSON representation of an object into an
      * {@link firebase.auth.AuthCredential}. Input can be either Object or the
      * stringified representation of the object. When string is provided,
      * JSON.parse would be called first. If the JSON input does not represent
      * an`AuthCredential`, null is returned.
      * @param json The plain object representation of an
      *     AuthCredential.
      */
    /* static member */
    inline def fromJSON(json: js.Object): typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential | Null]
  }
  
  /**
    * Email and password auth provider implementation.
    *
    * To authenticate: {@link firebase.auth.Auth.createUserWithEmailAndPassword}
    * and {@link firebase.auth.Auth.signInWithEmailAndPassword}.
    */
  @JSImport("firebase/compat", "default.auth.EmailAuthProvider")
  @js.native
  open class EmailAuthProvider ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.EmailAuthProviderInstance {
    
    /* CompleteClass */
    var providerId: String = js.native
  }
  object EmailAuthProvider {
    
    @JSImport("firebase/compat", "default.auth.EmailAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSImport("firebase/compat", "default.auth.EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD")
    @js.native
    def EMAIL_LINK_SIGN_IN_METHOD: String = js.native
    inline def EMAIL_LINK_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_LINK_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSImport("firebase/compat", "default.auth.EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD")
    @js.native
    def EMAIL_PASSWORD_SIGN_IN_METHOD: String = js.native
    inline def EMAIL_PASSWORD_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_PASSWORD_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("firebase/compat", "default.auth.EmailAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
    /**
      * @example
      * ```javascript
      * var cred = firebase.auth.EmailAuthProvider.credential(
      *     email,
      *     password
      * );
      * ```
      *
      * @param email Email address.
      * @param password User account password.
      * @return The auth provider credential.
      */
    /* static member */
    inline def credential(email: String, password: String): typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential]
    
    /**
      * Initialize an `EmailAuthProvider` credential using an email and an email link
      * after a sign in with email link operation.
      *
      * @example
      * ```javascript
      * var cred = firebase.auth.EmailAuthProvider.credentialWithLink(
      *     email,
      *     emailLink
      * );
      * ```
      *
      * @param email Email address.
      * @param emailLink Sign-in email link.
      * @return The auth provider credential.
      */
    /* static member */
    inline def credentialWithLink(email: String, emailLink: String): typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credentialWithLink")(email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSImport("firebase/compat", "default.auth.EmailAuthProvider_Instance")
  @js.native
  open class EmailAuthProviderInstance ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.EmailAuthProviderInstance {
    
    /* CompleteClass */
    var providerId: String = js.native
  }
  
  /**
    * Facebook auth provider.
    *
    * @example
    * ```javascript
    * // Sign in using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // This gives you a Google Access Token.
    *     var token = result.credential.accessToken;
    *   }
    *   var user = result.user;
    * })
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.FacebookAuthProvider();
    * provider.addScope('user_birthday');
    * firebase.auth().signInWithRedirect(provider);
    * ```
    *
    * @example
    * ```javascript
    * // Sign in using a popup.
    * var provider = new firebase.auth.FacebookAuthProvider();
    * provider.addScope('user_birthday');
    * firebase.auth().signInWithPopup(provider).then(function(result) {
    *   // This gives you a Facebook Access Token.
    *   var token = result.credential.accessToken;
    *   // The signed-in user info.
    *   var user = result.user;
    * });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    */
  @JSImport("firebase/compat", "default.auth.FacebookAuthProvider")
  @js.native
  open class FacebookAuthProvider ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.FacebookAuthProviderInstance {
    
    /**
      * @param scope Facebook OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: String): AuthProvider = js.native
    
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * Sets the OAuth custom parameters to pass in a Facebook OAuth request for
      * popup and redirect sign-in operations.
      * Valid parameters include 'auth_type', 'display' and 'locale'.
      * For a detailed list, check the
      * {@link https://goo.gl/pve4fo Facebook}
      * documentation.
      * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
      * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  object FacebookAuthProvider {
    
    @JSImport("firebase/compat", "default.auth.FacebookAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSImport("firebase/compat", "default.auth.FacebookAuthProvider.FACEBOOK_SIGN_IN_METHOD")
    @js.native
    def FACEBOOK_SIGN_IN_METHOD: String = js.native
    inline def FACEBOOK_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACEBOOK_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("firebase/compat", "default.auth.FacebookAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
    /**
      * @example
      * ```javascript
      * var cred = firebase.auth.FacebookAuthProvider.credential(
      *     // `event` from the Facebook auth.authResponseChange callback.
      *     event.authResponse.accessToken
      * );
      * ```
      *
      * @param token Facebook access token.
      */
    /* static member */
    inline def credential(token: String): typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSImport("firebase/compat", "default.auth.FacebookAuthProvider_Instance")
  @js.native
  open class FacebookAuthProviderInstance ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.FacebookAuthProviderInstance {
    
    /**
      * @param scope Facebook OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: String): AuthProvider = js.native
    
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * Sets the OAuth custom parameters to pass in a Facebook OAuth request for
      * popup and redirect sign-in operations.
      * Valid parameters include 'auth_type', 'display' and 'locale'.
      * For a detailed list, check the
      * {@link https://goo.gl/pve4fo Facebook}
      * documentation.
      * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
      * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  
  /**
    * GitHub auth provider.
    *
    * GitHub requires an OAuth 2.0 redirect, so you can either handle the redirect
    * directly, or use the signInWithPopup handler:
    *
    * @example
    * ```javascript
    * // Using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // This gives you a GitHub Access Token.
    *     var token = result.credential.accessToken;
    *   }
    *   var user = result.user;
    * }).catch(function(error) {
    *   // Handle Errors here.
    *   var errorCode = error.code;
    *   var errorMessage = error.message;
    *   // The email of the user's account used.
    *   var email = error.email;
    *   // The firebase.auth.AuthCredential type that was used.
    *   var credential = error.credential;
    *   if (errorCode === 'auth/account-exists-with-different-credential') {
    *     alert('You have signed up with a different provider for that email.');
    *     // Handle linking here if your app allows it.
    *   } else {
    *     console.error(error);
    *   }
    * });
    *
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.GithubAuthProvider();
    * provider.addScope('repo');
    * firebase.auth().signInWithRedirect(provider);
    * ```
    *
    * @example
    * ```javascript
    * // With popup.
    * var provider = new firebase.auth.GithubAuthProvider();
    *  provider.addScope('repo');
    *  firebase.auth().signInWithPopup(provider).then(function(result) {
    *    // This gives you a GitHub Access Token.
    *    var token = result.credential.accessToken;
    *    // The signed-in user info.
    *    var user = result.user;
    *  }).catch(function(error) {
    *    // Handle Errors here.
    *    var errorCode = error.code;
    *    var errorMessage = error.message;
    *    // The email of the user's account used.
    *    var email = error.email;
    *    // The firebase.auth.AuthCredential type that was used.
    *    var credential = error.credential;
    *    if (errorCode === 'auth/account-exists-with-different-credential') {
    *      alert('You have signed up with a different provider for that email.');
    *      // Handle linking here if your app allows it.
    *    } else {
    *      console.error(error);
    *    }
    *  });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    */
  @JSImport("firebase/compat", "default.auth.GithubAuthProvider")
  @js.native
  open class GithubAuthProvider ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.GithubAuthProviderInstance {
    
    /**
      * @param scope Github OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: String): AuthProvider = js.native
    
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * Sets the OAuth custom parameters to pass in a GitHub OAuth request for popup
      * and redirect sign-in operations.
      * Valid parameters include 'allow_signup'.
      * For a detailed list, check the
      * {@link https://developer.github.com/v3/oauth/ GitHub} documentation.
      * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
      * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  object GithubAuthProvider {
    
    @JSImport("firebase/compat", "default.auth.GithubAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSImport("firebase/compat", "default.auth.GithubAuthProvider.GITHUB_SIGN_IN_METHOD")
    @js.native
    def GITHUB_SIGN_IN_METHOD: String = js.native
    inline def GITHUB_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GITHUB_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("firebase/compat", "default.auth.GithubAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
    /**
      * @example
      * ```javascript
      * var cred = firebase.auth.GithubAuthProvider.credential(
      *     // `event` from the Github auth.authResponseChange callback.
      *     event.authResponse.accessToken
      * );
      * ```
      *
      * @param token Github access token.
      * @return {!firebase.auth.OAuthCredential} The auth provider credential.
      */
    /* static member */
    inline def credential(token: String): typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSImport("firebase/compat", "default.auth.GithubAuthProvider_Instance")
  @js.native
  open class GithubAuthProviderInstance ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.GithubAuthProviderInstance {
    
    /**
      * @param scope Github OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: String): AuthProvider = js.native
    
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * Sets the OAuth custom parameters to pass in a GitHub OAuth request for popup
      * and redirect sign-in operations.
      * Valid parameters include 'allow_signup'.
      * For a detailed list, check the
      * {@link https://developer.github.com/v3/oauth/ GitHub} documentation.
      * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
      * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  
  /**
    * Google auth provider.
    *
    * @example
    * ```javascript
    * // Using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // This gives you a Google Access Token.
    *     var token = result.credential.accessToken;
    *   }
    *   var user = result.user;
    * });
    *
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.GoogleAuthProvider();
    * provider.addScope('profile');
    * provider.addScope('email');
    * firebase.auth().signInWithRedirect(provider);
    * ```
    *
    * @example
    * ```javascript
    * // Using a popup.
    * var provider = new firebase.auth.GoogleAuthProvider();
    * provider.addScope('profile');
    * provider.addScope('email');
    * firebase.auth().signInWithPopup(provider).then(function(result) {
    *  // This gives you a Google Access Token.
    *  var token = result.credential.accessToken;
    *  // The signed-in user info.
    *  var user = result.user;
    * });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    */
  @JSImport("firebase/compat", "default.auth.GoogleAuthProvider")
  @js.native
  open class GoogleAuthProvider ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.GoogleAuthProviderInstance {
    
    /**
      * @param scope Google OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: String): AuthProvider = js.native
    
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * Sets the OAuth custom parameters to pass in a Google OAuth request for popup
      * and redirect sign-in operations.
      * Valid parameters include 'hd', 'hl', 'include_granted_scopes', 'login_hint'
      * and 'prompt'.
      * For a detailed list, check the
      * {@link https://goo.gl/Xo01Jm Google}
      * documentation.
      * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
      * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  object GoogleAuthProvider {
    
    @JSImport("firebase/compat", "default.auth.GoogleAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSImport("firebase/compat", "default.auth.GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD")
    @js.native
    def GOOGLE_SIGN_IN_METHOD: String = js.native
    inline def GOOGLE_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOOGLE_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("firebase/compat", "default.auth.GoogleAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a credential for Google. At least one of ID token and access token
      * is required.
      *
      * @example
      * ```javascript
      * // \`googleUser\` from the onsuccess Google Sign In callback.
      * var credential = firebase.auth.GoogleAuthProvider.credential(
      googleUser.getAuthResponse().id_token);
      * firebase.auth().signInWithCredential(credential)
      * ```
      * @param idToken Google ID token.
      * @param accessToken Google access token.
      * @return The auth provider credential.
      */
    /* static member */
    inline def credential(): typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")().asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential]
    inline def credential(idToken: String): typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential]
    inline def credential(idToken: String, accessToken: String): typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential]
    inline def credential(idToken: Null, accessToken: String): typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential]
    inline def credential(idToken: Unit, accessToken: String): typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSImport("firebase/compat", "default.auth.GoogleAuthProvider_Instance")
  @js.native
  open class GoogleAuthProviderInstance ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.GoogleAuthProviderInstance {
    
    /**
      * @param scope Google OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: String): AuthProvider = js.native
    
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * Sets the OAuth custom parameters to pass in a Google OAuth request for popup
      * and redirect sign-in operations.
      * Valid parameters include 'hd', 'hl', 'include_granted_scopes', 'login_hint'
      * and 'prompt'.
      * For a detailed list, check the
      * {@link https://goo.gl/Xo01Jm Google}
      * documentation.
      * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
      * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  
  /**
    * The base class for asserting ownership of a second factor. This is used to
    * facilitate enrollment of a second factor on an existing user
    * or sign-in of a user who already verified the first factor.
    *
    */
  /* note: abstract class */ @JSImport("firebase/compat", "default.auth.MultiFactorAssertion")
  @js.native
  open class MultiFactorAssertion ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.MultiFactorAssertion {
    
    /**
      * The identifier of the second factor.
      */
    /* CompleteClass */
    var factorId: String = js.native
  }
  
  /**
    * The class used to facilitate recovery from
    * {@link firebase.auth.MultiFactorError} when a user needs to provide a second
    * factor to sign in.
    *
    * @example
    * ```javascript
    * firebase.auth().signInWithEmailAndPassword()
    *     .then(function(result) {
    *       // User signed in. No 2nd factor challenge is needed.
    *     })
    *     .catch(function(error) {
    *       if (error.code == 'auth/multi-factor-auth-required') {
    *         var resolver = error.resolver;
    *         // Show UI to let user select second factor.
    *         var multiFactorHints = resolver.hints;
    *       } else {
    *         // Handle other errors.
    *       }
    *     });
    *
    * // The enrolled second factors that can be used to complete
    * // sign-in are returned in the `MultiFactorResolver.hints` list.
    * // UI needs to be presented to allow the user to select a second factor
    * // from that list.
    *
    * var selectedHint = // ; selected from multiFactorHints
    * var phoneAuthProvider = new firebase.auth.PhoneAuthProvider();
    * var phoneInfoOptions = {
    *   multiFactorHint: selectedHint,
    *   session: resolver.session
    * };
    * phoneAuthProvider.verifyPhoneNumber(
    *   phoneInfoOptions,
    *   appVerifier
    * ).then(function(verificationId) {
    *   // store verificationID and show UI to let user enter verification code.
    * });
    *
    * // UI to enter verification code and continue.
    * // Continue button click handler
    * var phoneAuthCredential =
    *     firebase.auth.PhoneAuthProvider.credential(verificationId, verificationCode);
    * var multiFactorAssertion =
    *     firebase.auth.PhoneMultiFactorGenerator.assertion(phoneAuthCredential);
    * resolver.resolveSignIn(multiFactorAssertion)
    *     .then(function(userCredential) {
    *       // User signed in.
    *     });
    * ```
    */
  @JSImport("firebase/compat", "default.auth.MultiFactorResolver")
  @js.native
  /* private */ open class MultiFactorResolver ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.MultiFactorResolver {
    
    /**
      * The Auth instance used to sign in with the first factor.
      */
    /* CompleteClass */
    var auth: Auth = js.native
    
    /**
      * The list of hints for the second factors needed to complete the sign-in
      * for the current session.
      */
    /* CompleteClass */
    var hints: js.Array[MultiFactorInfo] = js.native
    
    /**
      * A helper function to help users complete sign in with a second factor
      * using an {@link firebase.auth.MultiFactorAssertion} confirming the user
      * successfully completed the second factor challenge.
      *
      * <h4>Error Codes</h4>
      * <dl>
      * <dt>auth/invalid-verification-code</dt>
      * <dd>Thrown if the verification code is not valid.</dd>
      * <dt>auth/missing-verification-code</dt>
      * <dd>Thrown if the verification code is missing.</dd>
      * <dt>auth/invalid-verification-id</dt>
      * <dd>Thrown if the credential is a
      *     {@link firebase.auth.PhoneAuthProvider.credential} and the verification
      *     ID of the credential is not valid.</dd>
      * <dt>auth/missing-verification-id</dt>
      * <dd>Thrown if the verification ID is missing.</dd>
      * <dt>auth/code-expired</dt>
      * <dd>Thrown if the verification code has expired.</dd>
      * <dt>auth/invalid-multi-factor-session</dt>
      * <dd>Thrown if the request does not contain a valid proof of first factor
      *     successful sign-in.</dd>
      * <dt>auth/missing-multi-factor-session</dt>
      * <dd>Thrown if The request is missing proof of first factor successful
      *     sign-in.</dd>
      * </dl>
      *
      * @param assertion The multi-factor assertion to resolve sign-in with.
      * @return The promise that resolves with the user credential object.
      */
    /* CompleteClass */
    override def resolveSignIn(assertion: typingsJapgolly.firebase.compatMod.firebase.auth.MultiFactorAssertion): js.Promise[UserCredential] = js.native
    
    /**
      * The session identifier for the current sign-in flow, which can be used
      * to complete the second factor sign-in.
      */
    /* CompleteClass */
    var session: typingsJapgolly.firebase.compatMod.firebase.auth.MultiFactorSession = js.native
  }
  
  /**
    * The multi-factor session object used for enrolling a second factor on a
    * user or helping sign in an enrolled user with a second factor.
    */
  @JSImport("firebase/compat", "default.auth.MultiFactorSession")
  @js.native
  /* private */ open class MultiFactorSession ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.MultiFactorSession
  
  /**
    * Interface that represents the OAuth credentials returned by an OAuth
    * provider. Implementations specify the details about each auth provider's
    * credential requirements.
    *
    */
  @JSImport("firebase/compat", "default.auth.OAuthCredential")
  @js.native
  /* private */ open class OAuthCredential ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential {
    
    /**
      * The authentication provider ID for the credential.
      * For example, 'facebook.com', or 'google.com'.
      */
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * The authentication sign in method for the credential.
      * For example, 'password', or 'emailLink. This corresponds to the sign-in
      * method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* CompleteClass */
    var signInMethod: String = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      */
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  /**
    * Generic OAuth provider.
    *
    * @example
    * ```javascript
    * // Using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // This gives you the OAuth Access Token for that provider.
    *     var token = result.credential.accessToken;
    *   }
    *   var user = result.user;
    * });
    *
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.OAuthProvider('google.com');
    * provider.addScope('profile');
    * provider.addScope('email');
    * firebase.auth().signInWithRedirect(provider);
    * ```
    * @example
    * ```javascript
    * // Using a popup.
    * var provider = new firebase.auth.OAuthProvider('google.com');
    * provider.addScope('profile');
    * provider.addScope('email');
    * firebase.auth().signInWithPopup(provider).then(function(result) {
    *  // This gives you the OAuth Access Token for that provider.
    *  var token = result.credential.accessToken;
    *  // The signed-in user info.
    *  var user = result.user;
    * });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    * @param providerId The associated provider ID, such as `github.com`.
    */
  @JSImport("firebase/compat", "default.auth.OAuthProvider")
  @js.native
  open class OAuthProvider protected ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.OAuthProvider {
    def this(providerId: String) = this()
    
    /* CompleteClass */
    var providerId: String = js.native
  }
  
  /**
    * Classes that represents the Phone Auth credentials returned by a
    * {@link firebase.auth.PhoneAuthProvider}.
    *
    */
  @JSImport("firebase/compat", "default.auth.PhoneAuthCredential")
  @js.native
  /* private */ open class PhoneAuthCredential ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential {
    
    /**
      * The authentication provider ID for the credential.
      * For example, 'facebook.com', or 'google.com'.
      */
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * The authentication sign in method for the credential.
      * For example, 'password', or 'emailLink. This corresponds to the sign-in
      * method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* CompleteClass */
    var signInMethod: String = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      */
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  /**
    * Phone number auth provider.
    *
    * @example
    * ```javascript
    * // 'recaptcha-container' is the ID of an element in the DOM.
    * var applicationVerifier = new firebase.auth.RecaptchaVerifier(
    *     'recaptcha-container');
    * var provider = new firebase.auth.PhoneAuthProvider();
    * provider.verifyPhoneNumber('+16505550101', applicationVerifier)
    *     .then(function(verificationId) {
    *       var verificationCode = window.prompt('Please enter the verification ' +
    *           'code that was sent to your mobile device.');
    *       return firebase.auth.PhoneAuthProvider.credential(verificationId,
    *           verificationCode);
    *     })
    *     .then(function(phoneCredential) {
    *       return firebase.auth().signInWithCredential(phoneCredential);
    *     });
    * ```
    * @param auth The Firebase Auth instance in which
    *     sign-ins should occur. Uses the default Auth instance if unspecified.
    */
  @JSImport("firebase/compat", "default.auth.PhoneAuthProvider")
  @js.native
  open class PhoneAuthProvider ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.PhoneAuthProviderInstance {
    
    /* CompleteClass */
    var providerId: String = js.native
  }
  object PhoneAuthProvider {
    
    @JSImport("firebase/compat", "default.auth.PhoneAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSImport("firebase/compat", "default.auth.PhoneAuthProvider.PHONE_SIGN_IN_METHOD")
    @js.native
    def PHONE_SIGN_IN_METHOD: String = js.native
    inline def PHONE_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHONE_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("firebase/compat", "default.auth.PhoneAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a phone auth credential, given the verification ID from
      * {@link firebase.auth.PhoneAuthProvider.verifyPhoneNumber} and the code
      * that was sent to the user's mobile device.
      *
      * <h4>Error Codes</h4>
      * <dl>
      * <dt>auth/missing-verification-code</dt>
      * <dd>Thrown if the verification code is missing.</dd>
      * <dt>auth/missing-verification-id</dt>
      * <dd>Thrown if the verification ID is missing.</dd>
      * </dl>
      *
      * @param verificationId The verification ID returned from
      *     {@link firebase.auth.PhoneAuthProvider.verifyPhoneNumber}.
      * @param verificationCode The verification code sent to the user's
      *     mobile device.
      * @return The auth provider credential.
      */
    /* static member */
    inline def credential(verificationId: String, verificationCode: String): typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.AuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSImport("firebase/compat", "default.auth.PhoneAuthProvider_Instance")
  @js.native
  open class PhoneAuthProviderInstance ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.PhoneAuthProviderInstance {
    def this(auth: Auth) = this()
    
    /* CompleteClass */
    var providerId: String = js.native
  }
  
  /**
    * The class for asserting ownership of a phone second factor.
    */
  @JSImport("firebase/compat", "default.auth.PhoneMultiFactorAssertion")
  @js.native
  /* private */ open class PhoneMultiFactorAssertion ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.MultiFactorAssertion {
    
    /**
      * The identifier of the second factor.
      */
    /* CompleteClass */
    var factorId: String = js.native
  }
  
  /**
    * The class used to initialize {@link firebase.auth.PhoneMultiFactorAssertion}.
    */
  @JSImport("firebase/compat", "default.auth.PhoneMultiFactorGenerator")
  @js.native
  /* private */ open class PhoneMultiFactorGenerator ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.PhoneMultiFactorGenerator
  object PhoneMultiFactorGenerator {
    
    @JSImport("firebase/compat", "default.auth.PhoneMultiFactorGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The identifier of the phone second factor: `phone`.
      */
    /* static member */
    @JSImport("firebase/compat", "default.auth.PhoneMultiFactorGenerator.FACTOR_ID")
    @js.native
    def FACTOR_ID: String = js.native
    inline def FACTOR_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACTOR_ID")(x.asInstanceOf[js.Any])
    
    /**
      * Initializes the {@link firebase.auth.PhoneMultiFactorAssertion} to confirm ownership
      * of the phone second factor.
      */
    /* static member */
    inline def assertion(phoneAuthCredential: typingsJapgolly.firebase.compatMod.firebase.auth.PhoneAuthCredential): typingsJapgolly.firebase.compatMod.firebase.auth.PhoneMultiFactorAssertion = ^.asInstanceOf[js.Dynamic].applyDynamic("assertion")(phoneAuthCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.PhoneMultiFactorAssertion]
  }
  
  /**
    * An {@link https://www.google.com/recaptcha/ reCAPTCHA}-based application
    * verifier.
    *
    * @webonly
    *
    * @param container The reCAPTCHA container parameter. This
    *     has different meaning depending on whether the reCAPTCHA is hidden or
    *     visible. For a visible reCAPTCHA the container must be empty. If a string
    *     is used, it has to correspond to an element ID. The corresponding element
    *     must also must be in the DOM at the time of initialization.
    * @param parameters The optional reCAPTCHA parameters. Check the
    *     reCAPTCHA docs for a comprehensive list. All parameters are accepted
    *     except for the sitekey. Firebase Auth backend provisions a reCAPTCHA for
    *     each project and will configure this upon rendering. For an invisible
    *     reCAPTCHA, a size key must have the value 'invisible'.
    * @param app The corresponding Firebase app. If none is
    *     provided, the default Firebase App instance is used. A Firebase App
    *     instance must be initialized with an API key, otherwise an error will be
    *     thrown.
    */
  @JSImport("firebase/compat", "default.auth.RecaptchaVerifier")
  @js.native
  open class RecaptchaVerifier ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.RecaptchaVerifierInstance {
    
    /**
      * Clears the reCAPTCHA widget from the page and destroys the current instance.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Renders the reCAPTCHA widget on the page.
      * @return A Promise that resolves with the
      *     reCAPTCHA widget ID.
      */
    /* CompleteClass */
    override def render(): js.Promise[Double] = js.native
    
    /**
      * Identifies the type of application verifier (e.g. "recaptcha").
      */
    /* CompleteClass */
    var `type`: String = js.native
    
    /**
      * Executes the verification process.
      * @return A Promise for a token that can be used to
      *     assert the validity of a request.
      */
    /* CompleteClass */
    override def verify(): js.Promise[String] = js.native
  }
  
  /**
    * @webonly
    * @hidden
    */
  @JSImport("firebase/compat", "default.auth.RecaptchaVerifier_Instance")
  @js.native
  open class RecaptchaVerifierInstance protected ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.RecaptchaVerifierInstance {
    def this(container: String) = this()
    def this(container: Any) = this()
    def this(container: String, parameters: js.Object) = this()
    def this(container: Any, parameters: js.Object) = this()
    def this(container: String, parameters: js.Object, app: App) = this()
    def this(container: String, parameters: Null, app: App) = this()
    def this(container: String, parameters: Unit, app: App) = this()
    def this(container: Any, parameters: js.Object, app: App) = this()
    def this(container: Any, parameters: Null, app: App) = this()
    def this(container: Any, parameters: Unit, app: App) = this()
    
    /**
      * Clears the reCAPTCHA widget from the page and destroys the current instance.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Renders the reCAPTCHA widget on the page.
      * @return A Promise that resolves with the
      *     reCAPTCHA widget ID.
      */
    /* CompleteClass */
    override def render(): js.Promise[Double] = js.native
    
    /**
      * Identifies the type of application verifier (e.g. "recaptcha").
      */
    /* CompleteClass */
    var `type`: String = js.native
    
    /**
      * Executes the verification process.
      * @return A Promise for a token that can be used to
      *     assert the validity of a request.
      */
    /* CompleteClass */
    override def verify(): js.Promise[String] = js.native
  }
  
  @JSImport("firebase/compat", "default.auth.SAMLAuthProvider")
  @js.native
  open class SAMLAuthProvider protected ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.SAMLAuthProvider {
    def this(providerId: String) = this()
    
    /* CompleteClass */
    var providerId: String = js.native
  }
  
  /**
    * Twitter auth provider.
    *
    * @example
    * ```javascript
    * // Using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // For accessing the Twitter API.
    *     var token = result.credential.accessToken;
    *     var secret = result.credential.secret;
    *   }
    *   var user = result.user;
    * });
    *
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.TwitterAuthProvider();
    * firebase.auth().signInWithRedirect(provider);
    * ```
    * @example
    * ```javascript
    * // Using a popup.
    * var provider = new firebase.auth.TwitterAuthProvider();
    * firebase.auth().signInWithPopup(provider).then(function(result) {
    *   // For accessing the Twitter API.
    *   var token = result.credential.accessToken;
    *   var secret = result.credential.secret;
    *   // The signed-in user info.
    *   var user = result.user;
    * });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    */
  @JSImport("firebase/compat", "default.auth.TwitterAuthProvider")
  @js.native
  open class TwitterAuthProvider ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.TwitterAuthProviderInstance {
    
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * Sets the OAuth custom parameters to pass in a Twitter OAuth request for popup
      * and redirect sign-in operations.
      * Valid parameters include 'lang'.
      * Reserved required OAuth 1.0 parameters such as 'oauth_consumer_key',
      * 'oauth_token', 'oauth_signature', etc are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  object TwitterAuthProvider {
    
    @JSImport("firebase/compat", "default.auth.TwitterAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("firebase/compat", "default.auth.TwitterAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      *
      */
    /* static member */
    @JSImport("firebase/compat", "default.auth.TwitterAuthProvider.TWITTER_SIGN_IN_METHOD")
    @js.native
    def TWITTER_SIGN_IN_METHOD: String = js.native
    inline def TWITTER_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWITTER_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /**
      * @param token Twitter access token.
      * @param secret Twitter secret.
      * @return The auth provider credential.
      */
    /* static member */
    inline def credential(token: String, secret: String): typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.auth.OAuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSImport("firebase/compat", "default.auth.TwitterAuthProvider_Instance")
  @js.native
  open class TwitterAuthProviderInstance ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.auth.TwitterAuthProviderInstance {
    
    /* CompleteClass */
    var providerId: String = js.native
    
    /**
      * Sets the OAuth custom parameters to pass in a Twitter OAuth request for popup
      * and redirect sign-in operations.
      * Valid parameters include 'lang'.
      * Reserved required OAuth 1.0 parameters such as 'oauth_consumer_key',
      * 'oauth_token', 'oauth_signature', etc are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
}
