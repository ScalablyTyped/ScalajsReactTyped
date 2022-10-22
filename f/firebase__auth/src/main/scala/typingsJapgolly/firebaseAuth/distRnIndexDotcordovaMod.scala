package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAuth.anon.DisableWarnings
import typingsJapgolly.firebaseAuth.anon.DisplayName
import typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredentialParams
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.ActionCodeInfo
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.ActionCodeSettings
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.AdditionalUserInfo
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.AuthErrorMap
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.AuthProvider
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.Dependencies
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.IdTokenResult
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.MultiFactorError
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.MultiFactorResolver
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.MultiFactorUser
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.NextOrObserver
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.Persistence
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.PopupRedirectResolver
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.UserCredential
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashaccount-exists-with-different-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashadmin-restricted-operation`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashalready-initialized`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashapp-deleted`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashapp-not-authorized`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashapp-not-installed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashargument-error`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashauth-domain-config-required`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcancelled-popup-request`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcaptcha-check-failed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcode-expired`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcordova-not-ready`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcors-unsupported`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcredential-already-in-use`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashcustom-token-mismatch`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashdependent-sdk-initialized-before-auth`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashdynamic-link-not-activated`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashemail-already-in-use`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashemail-change-needs-verification`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashemulator-config-failed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashexpired-action-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinternal-error`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-action-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-api-key`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-app-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-app-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-auth-event`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-cert-hash`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-continue-uri`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-cordova-configuration`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-custom-token`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-dynamic-link-domain`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-email`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-emulator-scheme`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-message-payload`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-multi-factor-session`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-oauth-client-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-oauth-provider`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-persistence-type`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-phone-number`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-provider-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-recipient-email`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-sender`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-tenant-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-user-token`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-verification-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-verification-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmaximum-second-factor-count-exceeded`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-android-pkg-name`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-app-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-continue-uri`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-iframe-start`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-ios-bundle-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-multi-factor-info`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-multi-factor-session`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-or-invalid-nonce`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-phone-number`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-verification-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmissing-verification-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmulti-factor-auth-required`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashmulti-factor-info-not-found`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashnetwork-request-failed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashno-auth-event`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashno-such-provider`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashnull-user`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashoperation-not-allowed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashoperation-not-supported-in-this-environment`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashpopup-blocked`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashpopup-closed-by-user`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashprovider-already-linked`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashquota-exceeded`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashredirect-cancelled-by-user`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashredirect-operation-pending`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashrejected-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashrequires-recent-login`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashsecond-factor-already-in-use`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashtenant-id-mismatch`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashtoo-many-requests`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunauthorized-continue-uri`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunauthorized-domain`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunsupported-first-factor`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunsupported-persistence-type`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunsupported-tenant-operation`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashunverified-email`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-cancelled`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-disabled`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-mismatch`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-not-found`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-signed-out`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashuser-token-expired`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashweak-password`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashweb-storage-unsupported`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`authSlashwrong-password`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.authSlashtimeout
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.emailLink
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.facebookDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.githubDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.googleDotcom
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.link
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.reauthenticate
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.signIn
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
import typingsJapgolly.firebaseUtil.mod.CompleteFn
import typingsJapgolly.firebaseUtil.mod.ErrorFn
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnIndexDotcordovaMod {
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ActionCodeOperation {
    
    /** The email link sign-in action. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ActionCodeOperation.EMAIL_SIGNIN")
    @js.native
    val EMAIL_SIGNIN: typingsJapgolly.firebaseAuth.firebaseAuthStrings.EMAIL_SIGNIN = js.native
    
    /** The password reset action. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ActionCodeOperation.PASSWORD_RESET")
    @js.native
    val PASSWORD_RESET: typingsJapgolly.firebaseAuth.firebaseAuthStrings.PASSWORD_RESET = js.native
    
    /** The email revocation action. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ActionCodeOperation.RECOVER_EMAIL")
    @js.native
    val RECOVER_EMAIL: typingsJapgolly.firebaseAuth.firebaseAuthStrings.RECOVER_EMAIL = js.native
    
    /** The revert second factor addition email action. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ActionCodeOperation.REVERT_SECOND_FACTOR_ADDITION")
    @js.native
    val REVERT_SECOND_FACTOR_ADDITION: typingsJapgolly.firebaseAuth.firebaseAuthStrings.REVERT_SECOND_FACTOR_ADDITION = js.native
    
    /** The revert second factor addition email action. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ActionCodeOperation.VERIFY_AND_CHANGE_EMAIL")
    @js.native
    val VERIFY_AND_CHANGE_EMAIL: typingsJapgolly.firebaseAuth.firebaseAuthStrings.VERIFY_AND_CHANGE_EMAIL = js.native
    
    /** The email verification action. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ActionCodeOperation.VERIFY_EMAIL")
    @js.native
    val VERIFY_EMAIL: typingsJapgolly.firebaseAuth.firebaseAuthStrings.VERIFY_EMAIL = js.native
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "ActionCodeURL")
  @js.native
  open class ActionCodeURL protected ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.ActionCodeURL {
    /**
      * @param actionLink - The link from which to extract the URL.
      * @returns The {@link ActionCodeURL} object, or null if the link is invalid.
      *
      * @internal
      */
    def this(actionLink: String) = this()
  }
  /* static members */
  object ActionCodeURL {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ActionCodeURL")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the email action link string and returns an {@link ActionCodeURL} if the link is valid,
      * otherwise returns null.
      *
      * @param link  - The email action link string.
      * @returns The {@link ActionCodeURL} object, or null if the link is invalid.
      *
      * @public
      */
    inline def parseLink(link: String): typingsJapgolly.firebaseAuth.distRnSrcCoreActionCodeUrlMod.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLink")(link.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreActionCodeUrlMod.ActionCodeURL | Null]
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthCredential")
  @js.native
  open class AuthCredential protected ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.AuthCredential {
    /** @internal */
    /* protected */ def this(
      /**
      * The authentication provider ID for the credential.
      *
      * @remarks
      * For example, 'facebook.com', or 'google.com'.
      */
    providerId: String,
      /**
      * The authentication sign in method for the credential.
      *
      * @remarks
      * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
      * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
      * identifier as returned in {@link fetchSignInMethodsForEmail}.
      */
    signInMethod: String
    ) = this()
  }
  
  object AuthErrorCodes {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.ADMIN_ONLY_OPERATION")
    @js.native
    val ADMIN_ONLY_OPERATION: `authSlashadmin-restricted-operation` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.ALREADY_INITIALIZED")
    @js.native
    val ALREADY_INITIALIZED: `authSlashalready-initialized` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.APP_NOT_AUTHORIZED")
    @js.native
    val APP_NOT_AUTHORIZED: `authSlashapp-not-authorized` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.APP_NOT_INSTALLED")
    @js.native
    val APP_NOT_INSTALLED: `authSlashapp-not-installed` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.ARGUMENT_ERROR")
    @js.native
    val ARGUMENT_ERROR: `authSlashargument-error` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.CAPTCHA_CHECK_FAILED")
    @js.native
    val CAPTCHA_CHECK_FAILED: `authSlashcaptcha-check-failed` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.CODE_EXPIRED")
    @js.native
    val CODE_EXPIRED: `authSlashcode-expired` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.CORDOVA_NOT_READY")
    @js.native
    val CORDOVA_NOT_READY: `authSlashcordova-not-ready` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.CORS_UNSUPPORTED")
    @js.native
    val CORS_UNSUPPORTED: `authSlashcors-unsupported` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.CREDENTIAL_ALREADY_IN_USE")
    @js.native
    val CREDENTIAL_ALREADY_IN_USE: `authSlashcredential-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.CREDENTIAL_MISMATCH")
    @js.native
    val CREDENTIAL_MISMATCH: `authSlashcustom-token-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.CREDENTIAL_TOO_OLD_LOGIN_AGAIN")
    @js.native
    val CREDENTIAL_TOO_OLD_LOGIN_AGAIN: `authSlashrequires-recent-login` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.DEPENDENT_SDK_INIT_BEFORE_AUTH")
    @js.native
    val DEPENDENT_SDK_INIT_BEFORE_AUTH: `authSlashdependent-sdk-initialized-before-auth` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.DYNAMIC_LINK_NOT_ACTIVATED")
    @js.native
    val DYNAMIC_LINK_NOT_ACTIVATED: `authSlashdynamic-link-not-activated` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.EMAIL_CHANGE_NEEDS_VERIFICATION")
    @js.native
    val EMAIL_CHANGE_NEEDS_VERIFICATION: `authSlashemail-change-needs-verification` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.EMAIL_EXISTS")
    @js.native
    val EMAIL_EXISTS: `authSlashemail-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.EMULATOR_CONFIG_FAILED")
    @js.native
    val EMULATOR_CONFIG_FAILED: `authSlashemulator-config-failed` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.EXPIRED_OOB_CODE")
    @js.native
    val EXPIRED_OOB_CODE: `authSlashexpired-action-code` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.EXPIRED_POPUP_REQUEST")
    @js.native
    val EXPIRED_POPUP_REQUEST: `authSlashcancelled-popup-request` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INTERNAL_ERROR")
    @js.native
    val INTERNAL_ERROR: `authSlashinternal-error` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_API_KEY")
    @js.native
    val INVALID_API_KEY: `authSlashinvalid-api-key` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_APP_CREDENTIAL")
    @js.native
    val INVALID_APP_CREDENTIAL: `authSlashinvalid-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_APP_ID")
    @js.native
    val INVALID_APP_ID: `authSlashinvalid-app-id` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_AUTH")
    @js.native
    val INVALID_AUTH: `authSlashinvalid-user-token` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_AUTH_EVENT")
    @js.native
    val INVALID_AUTH_EVENT: `authSlashinvalid-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_CERT_HASH")
    @js.native
    val INVALID_CERT_HASH: `authSlashinvalid-cert-hash` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_CODE")
    @js.native
    val INVALID_CODE: `authSlashinvalid-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_CONTINUE_URI")
    @js.native
    val INVALID_CONTINUE_URI: `authSlashinvalid-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_CORDOVA_CONFIGURATION")
    @js.native
    val INVALID_CORDOVA_CONFIGURATION: `authSlashinvalid-cordova-configuration` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_CUSTOM_TOKEN")
    @js.native
    val INVALID_CUSTOM_TOKEN: `authSlashinvalid-custom-token` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_DYNAMIC_LINK_DOMAIN")
    @js.native
    val INVALID_DYNAMIC_LINK_DOMAIN: `authSlashinvalid-dynamic-link-domain` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_EMAIL")
    @js.native
    val INVALID_EMAIL: `authSlashinvalid-email` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_EMULATOR_SCHEME")
    @js.native
    val INVALID_EMULATOR_SCHEME: `authSlashinvalid-emulator-scheme` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_IDP_RESPONSE")
    @js.native
    val INVALID_IDP_RESPONSE: `authSlashinvalid-credential` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_MESSAGE_PAYLOAD")
    @js.native
    val INVALID_MESSAGE_PAYLOAD: `authSlashinvalid-message-payload` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_MFA_SESSION")
    @js.native
    val INVALID_MFA_SESSION: `authSlashinvalid-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_OAUTH_CLIENT_ID")
    @js.native
    val INVALID_OAUTH_CLIENT_ID: `authSlashinvalid-oauth-client-id` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_OAUTH_PROVIDER")
    @js.native
    val INVALID_OAUTH_PROVIDER: `authSlashinvalid-oauth-provider` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_OOB_CODE")
    @js.native
    val INVALID_OOB_CODE: `authSlashinvalid-action-code` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_ORIGIN")
    @js.native
    val INVALID_ORIGIN: `authSlashunauthorized-domain` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_PASSWORD")
    @js.native
    val INVALID_PASSWORD: `authSlashwrong-password` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_PERSISTENCE")
    @js.native
    val INVALID_PERSISTENCE: `authSlashinvalid-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_PHONE_NUMBER")
    @js.native
    val INVALID_PHONE_NUMBER: `authSlashinvalid-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_PROVIDER_ID")
    @js.native
    val INVALID_PROVIDER_ID: `authSlashinvalid-provider-id` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_RECIPIENT_EMAIL")
    @js.native
    val INVALID_RECIPIENT_EMAIL: `authSlashinvalid-recipient-email` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_SENDER")
    @js.native
    val INVALID_SENDER: `authSlashinvalid-sender` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_SESSION_INFO")
    @js.native
    val INVALID_SESSION_INFO: `authSlashinvalid-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.INVALID_TENANT_ID")
    @js.native
    val INVALID_TENANT_ID: `authSlashinvalid-tenant-id` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MFA_INFO_NOT_FOUND")
    @js.native
    val MFA_INFO_NOT_FOUND: `authSlashmulti-factor-info-not-found` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MFA_REQUIRED")
    @js.native
    val MFA_REQUIRED: `authSlashmulti-factor-auth-required` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_ANDROID_PACKAGE_NAME")
    @js.native
    val MISSING_ANDROID_PACKAGE_NAME: `authSlashmissing-android-pkg-name` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_APP_CREDENTIAL")
    @js.native
    val MISSING_APP_CREDENTIAL: `authSlashmissing-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_AUTH_DOMAIN")
    @js.native
    val MISSING_AUTH_DOMAIN: `authSlashauth-domain-config-required` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_CODE")
    @js.native
    val MISSING_CODE: `authSlashmissing-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_CONTINUE_URI")
    @js.native
    val MISSING_CONTINUE_URI: `authSlashmissing-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_IFRAME_START")
    @js.native
    val MISSING_IFRAME_START: `authSlashmissing-iframe-start` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_IOS_BUNDLE_ID")
    @js.native
    val MISSING_IOS_BUNDLE_ID: `authSlashmissing-ios-bundle-id` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_MFA_INFO")
    @js.native
    val MISSING_MFA_INFO: `authSlashmissing-multi-factor-info` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_MFA_SESSION")
    @js.native
    val MISSING_MFA_SESSION: `authSlashmissing-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_OR_INVALID_NONCE")
    @js.native
    val MISSING_OR_INVALID_NONCE: `authSlashmissing-or-invalid-nonce` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_PHONE_NUMBER")
    @js.native
    val MISSING_PHONE_NUMBER: `authSlashmissing-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MISSING_SESSION_INFO")
    @js.native
    val MISSING_SESSION_INFO: `authSlashmissing-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.MODULE_DESTROYED")
    @js.native
    val MODULE_DESTROYED: `authSlashapp-deleted` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.NEED_CONFIRMATION")
    @js.native
    val NEED_CONFIRMATION: `authSlashaccount-exists-with-different-credential` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.NETWORK_REQUEST_FAILED")
    @js.native
    val NETWORK_REQUEST_FAILED: `authSlashnetwork-request-failed` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.NO_AUTH_EVENT")
    @js.native
    val NO_AUTH_EVENT: `authSlashno-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.NO_SUCH_PROVIDER")
    @js.native
    val NO_SUCH_PROVIDER: `authSlashno-such-provider` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.NULL_USER")
    @js.native
    val NULL_USER: `authSlashnull-user` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.OPERATION_NOT_ALLOWED")
    @js.native
    val OPERATION_NOT_ALLOWED: `authSlashoperation-not-allowed` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.OPERATION_NOT_SUPPORTED")
    @js.native
    val OPERATION_NOT_SUPPORTED: `authSlashoperation-not-supported-in-this-environment` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.POPUP_BLOCKED")
    @js.native
    val POPUP_BLOCKED: `authSlashpopup-blocked` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.POPUP_CLOSED_BY_USER")
    @js.native
    val POPUP_CLOSED_BY_USER: `authSlashpopup-closed-by-user` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.PROVIDER_ALREADY_LINKED")
    @js.native
    val PROVIDER_ALREADY_LINKED: `authSlashprovider-already-linked` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.QUOTA_EXCEEDED")
    @js.native
    val QUOTA_EXCEEDED: `authSlashquota-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.REDIRECT_CANCELLED_BY_USER")
    @js.native
    val REDIRECT_CANCELLED_BY_USER: `authSlashredirect-cancelled-by-user` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.REDIRECT_OPERATION_PENDING")
    @js.native
    val REDIRECT_OPERATION_PENDING: `authSlashredirect-operation-pending` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.REJECTED_CREDENTIAL")
    @js.native
    val REJECTED_CREDENTIAL: `authSlashrejected-credential` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.SECOND_FACTOR_ALREADY_ENROLLED")
    @js.native
    val SECOND_FACTOR_ALREADY_ENROLLED: `authSlashsecond-factor-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.SECOND_FACTOR_LIMIT_EXCEEDED")
    @js.native
    val SECOND_FACTOR_LIMIT_EXCEEDED: `authSlashmaximum-second-factor-count-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.TENANT_ID_MISMATCH")
    @js.native
    val TENANT_ID_MISMATCH: `authSlashtenant-id-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.TIMEOUT")
    @js.native
    val TIMEOUT: authSlashtimeout = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.TOKEN_EXPIRED")
    @js.native
    val TOKEN_EXPIRED: `authSlashuser-token-expired` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.TOO_MANY_ATTEMPTS_TRY_LATER")
    @js.native
    val TOO_MANY_ATTEMPTS_TRY_LATER: `authSlashtoo-many-requests` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.UNAUTHORIZED_DOMAIN")
    @js.native
    val UNAUTHORIZED_DOMAIN: `authSlashunauthorized-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.UNSUPPORTED_FIRST_FACTOR")
    @js.native
    val UNSUPPORTED_FIRST_FACTOR: `authSlashunsupported-first-factor` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.UNSUPPORTED_PERSISTENCE")
    @js.native
    val UNSUPPORTED_PERSISTENCE: `authSlashunsupported-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.UNSUPPORTED_TENANT_OPERATION")
    @js.native
    val UNSUPPORTED_TENANT_OPERATION: `authSlashunsupported-tenant-operation` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.UNVERIFIED_EMAIL")
    @js.native
    val UNVERIFIED_EMAIL: `authSlashunverified-email` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.USER_CANCELLED")
    @js.native
    val USER_CANCELLED: `authSlashuser-cancelled` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.USER_DELETED")
    @js.native
    val USER_DELETED: `authSlashuser-not-found` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.USER_DISABLED")
    @js.native
    val USER_DISABLED: `authSlashuser-disabled` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.USER_MISMATCH")
    @js.native
    val USER_MISMATCH: `authSlashuser-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.USER_SIGNED_OUT")
    @js.native
    val USER_SIGNED_OUT: `authSlashuser-signed-out` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.WEAK_PASSWORD")
    @js.native
    val WEAK_PASSWORD: `authSlashweak-password` = js.native
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "AuthErrorCodes.WEB_STORAGE_UNSUPPORTED")
    @js.native
    val WEB_STORAGE_UNSUPPORTED: `authSlashweb-storage-unsupported` = js.native
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "EmailAuthCredential")
  @js.native
  /** @internal */
  /* private */ open class EmailAuthCredential ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.EmailAuthCredential
  /* static members */
  object EmailAuthCredential {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "EmailAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromEmailAndCode(email: String, oobCode: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential]
    inline def _fromEmailAndCode(email: String, oobCode: String, tenantId: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    /** @internal */
    inline def _fromEmailAndPassword(email: String, password: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndPassword")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
    /**
      * Static method to deserialize a JSON representation of an object into an {@link  AuthCredential}.
      *
      * @param json - Either `object` or the stringified representation of the object. When string is
      * provided, `JSON.parse` would be called first.
      *
      * @returns If the JSON input does not represent an {@link AuthCredential}, null is returned.
      */
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "EmailAuthProvider")
  @js.native
  open class EmailAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.EmailAuthProvider
  /* static members */
  object EmailAuthProvider {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "EmailAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Always set to {@link SignInMethod}.EMAIL_LINK.
      */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD")
    @js.native
    val EMAIL_LINK_SIGN_IN_METHOD: emailLink = js.native
    
    /**
      * Always set to {@link SignInMethod}.EMAIL_PASSWORD.
      */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD")
    @js.native
    val EMAIL_PASSWORD_SIGN_IN_METHOD: password = js.native
    
    /**
      * Always set to {@link ProviderId}.PASSWORD, even for email link.
      */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "EmailAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: password = js.native
    
    /**
      * Initialize an {@link AuthCredential} using an email and password.
      *
      * @example
      * ```javascript
      * const authCredential = EmailAuthProvider.credential(email, password);
      * const userCredential = await signInWithCredential(auth, authCredential);
      * ```
      *
      * @example
      * ```javascript
      * const userCredential = await signInWithEmailAndPassword(auth, email, password);
      * ```
      *
      * @param email - Email address.
      * @param password - User account password.
      * @returns The auth provider credential.
      */
    inline def credential(email: String, password: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    /**
      * Initialize an {@link AuthCredential} using an email and an email link after a sign in with
      * email link operation.
      *
      * @example
      * ```javascript
      * const authCredential = EmailAuthProvider.credentialWithLink(auth, email, emailLink);
      * const userCredential = await signInWithCredential(auth, authCredential);
      * ```
      *
      * @example
      * ```javascript
      * await sendSignInLinkToEmail(auth, email);
      * // Obtain emailLink from user.
      * const userCredential = await signInWithEmailLink(auth, email, emailLink);
      * ```
      *
      * @param auth - The {@link Auth} instance used to verify the link.
      * @param email - Email address.
      * @param emailLink - Sign-in email link.
      * @returns - The auth provider credential.
      */
    inline def credentialWithLink(email: String, emailLink: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credentialWithLink")(email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential]
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "FacebookAuthProvider")
  @js.native
  open class FacebookAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.FacebookAuthProvider
  /* static members */
  object FacebookAuthProvider {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "FacebookAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.FACEBOOK. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "FacebookAuthProvider.FACEBOOK_SIGN_IN_METHOD")
    @js.native
    val FACEBOOK_SIGN_IN_METHOD: facebookDotcom = js.native
    
    /** Always set to {@link ProviderId}.FACEBOOK. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "FacebookAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: facebookDotcom = js.native
    
    /**
      * Creates a credential for Facebook.
      *
      * @example
      * ```javascript
      * // `event` from the Facebook auth.authResponseChange callback.
      * const credential = FacebookAuthProvider.credential(event.authResponse.accessToken);
      * const result = await signInWithCredential(credential);
      * ```
      *
      * @param accessToken - Facebook access token.
      */
    inline def credential(accessToken: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "FacebookAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  object FactorId {
    
    /** Phone as second factor */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "FactorId.PHONE")
    @js.native
    val PHONE: phone = js.native
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "GithubAuthProvider")
  @js.native
  open class GithubAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.GithubAuthProvider
  /* static members */
  object GithubAuthProvider {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "GithubAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.GITHUB. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "GithubAuthProvider.GITHUB_SIGN_IN_METHOD")
    @js.native
    val GITHUB_SIGN_IN_METHOD: githubDotcom = js.native
    
    /** Always set to {@link ProviderId}.GITHUB. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "GithubAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: githubDotcom = js.native
    
    /**
      * Creates a credential for Github.
      *
      * @param accessToken - Github access token.
      */
    inline def credential(accessToken: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "GithubAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "GoogleAuthProvider")
  @js.native
  open class GoogleAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.GoogleAuthProvider
  /* static members */
  object GoogleAuthProvider {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "GoogleAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.GOOGLE. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD")
    @js.native
    val GOOGLE_SIGN_IN_METHOD: googleDotcom = js.native
    
    /** Always set to {@link ProviderId}.GOOGLE. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "GoogleAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: googleDotcom = js.native
    
    /**
      * Creates a credential for Google. At least one of ID token and access token is required.
      *
      * @example
      * ```javascript
      * // \`googleUser\` from the onsuccess Google Sign In callback.
      * const credential = GoogleAuthProvider.credential(googleUser.getAuthResponse().id_token);
      * const result = await signInWithCredential(credential);
      * ```
      *
      * @param idToken - Google ID token.
      * @param accessToken - Google access token.
      */
    inline def credential(): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")().asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: String, accessToken: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: Null, accessToken: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: Unit, accessToken: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "GoogleAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "OAuthCredential")
  @js.native
  open class OAuthCredential protected ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.OAuthCredential {
    /** @internal */
    /* protected */ def this(
      /**
      * The authentication provider ID for the credential.
      *
      * @remarks
      * For example, 'facebook.com', or 'google.com'.
      */
    providerId: String,
      /**
      * The authentication sign in method for the credential.
      *
      * @remarks
      * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
      * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
      * identifier as returned in {@link fetchSignInMethodsForEmail}.
      */
    signInMethod: String
    ) = this()
  }
  /* static members */
  object OAuthCredential {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "OAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromParams(params: OAuthCredentialParams): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromParams")(params.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Static method to deserialize a JSON representation of an object into an
      * {@link  AuthCredential}.
      *
      * @param json - Input can be either Object or the stringified representation of the object.
      * When string is provided, JSON.parse would be called first.
      *
      * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
      */
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "OAuthProvider")
  @js.native
  open class OAuthProvider protected ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.OAuthProvider {
    /**
      * Constructor for generic OAuth providers.
      *
      * @param providerId - Provider for which credentials should be generated.
      */
    def this(providerId: String) = this()
  }
  /* static members */
  object OAuthProvider {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "OAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    inline def credentialFromJSON(json: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    /**
      * Creates an {@link OAuthCredential} from a JSON string or a plain object.
      * @param json - A plain object or a JSON string
      */
    inline def credentialFromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "OAuthProvider.oauthCredentialFromTaggedObject")
    @js.native
    def oauthCredentialFromTaggedObject: Any = js.native
    inline def oauthCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oauthCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  object OperationType {
    
    /** Operation involving linking an additional provider to an already signed-in user. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "OperationType.LINK")
    @js.native
    val LINK: link = js.native
    
    /** Operation involving using a provider to reauthenticate an already signed-in user. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "OperationType.REAUTHENTICATE")
    @js.native
    val REAUTHENTICATE: reauthenticate = js.native
    
    /** Operation involving signing in a user. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "OperationType.SIGN_IN")
    @js.native
    val SIGN_IN: signIn = js.native
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "PhoneAuthCredential")
  @js.native
  /* private */ open class PhoneAuthCredential ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.PhoneAuthCredential
  /* static members */
  object PhoneAuthCredential {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "PhoneAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromTokenResponse(phoneNumber: String, temporaryProof: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromTokenResponse")(phoneNumber.asInstanceOf[js.Any], temporaryProof.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    /** @internal */
    inline def _fromVerification(verificationId: String, verificationCode: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromVerification")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
    /** Generates a phone credential based on a plain object or a JSON string. */
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
  }
  
  object ProviderId {
    
    /** Facebook provider ID */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ProviderId.FACEBOOK")
    @js.native
    val FACEBOOK: facebookDotcom = js.native
    
    /** GitHub provider ID */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ProviderId.GITHUB")
    @js.native
    val GITHUB: githubDotcom = js.native
    
    /** Google provider ID */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ProviderId.GOOGLE")
    @js.native
    val GOOGLE: googleDotcom = js.native
    
    /** Password provider */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ProviderId.PASSWORD")
    @js.native
    val PASSWORD: password = js.native
    
    /** Phone provider */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ProviderId.PHONE")
    @js.native
    val PHONE: phone = js.native
    
    /** Twitter provider ID */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "ProviderId.TWITTER")
    @js.native
    val TWITTER: twitterDotcom = js.native
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "SAMLAuthProvider")
  @js.native
  open class SAMLAuthProvider protected ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.SAMLAuthProvider {
    /**
      * Constructor. The providerId must start with "saml."
      * @param providerId - SAML provider ID.
      */
    def this(providerId: String) = this()
  }
  /* static members */
  object SAMLAuthProvider {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "SAMLAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential | Null]
    
    /**
      * Creates an {@link AuthCredential} from a JSON string or a plain object.
      * @param json - A plain object or a JSON string
      */
    inline def credentialFromJSON(json: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential]
    inline def credentialFromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential]
    
    /**
      * Generates an {@link AuthCredential} from a {@link UserCredential} after a
      * successful SAML flow completes.
      *
      * @remarks
      *
      * For example, to get an {@link AuthCredential}, you could write the
      * following code:
      *
      * ```js
      * const userCredential = await signInWithPopup(auth, samlProvider);
      * const credential = SAMLAuthProvider.credentialFromResult(userCredential);
      * ```
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "SAMLAuthProvider.samlCredentialFromTaggedObject")
    @js.native
    def samlCredentialFromTaggedObject: Any = js.native
    inline def samlCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("samlCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  object SignInMethod {
    
    /** Email link sign in method */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "SignInMethod.EMAIL_LINK")
    @js.native
    val EMAIL_LINK: emailLink = js.native
    
    /** Email/password sign in method */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "SignInMethod.EMAIL_PASSWORD")
    @js.native
    val EMAIL_PASSWORD: password = js.native
    
    /** Facebook sign in method */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "SignInMethod.FACEBOOK")
    @js.native
    val FACEBOOK: facebookDotcom = js.native
    
    /** GitHub sign in method */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "SignInMethod.GITHUB")
    @js.native
    val GITHUB: githubDotcom = js.native
    
    /** Google sign in method */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "SignInMethod.GOOGLE")
    @js.native
    val GOOGLE: googleDotcom = js.native
    
    /** Phone sign in method */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "SignInMethod.PHONE")
    @js.native
    val PHONE: phone = js.native
    
    /** Twitter sign in method */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "SignInMethod.TWITTER")
    @js.native
    val TWITTER: twitterDotcom = js.native
  }
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "TwitterAuthProvider")
  @js.native
  open class TwitterAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distRnIndexDotsharedMod.TwitterAuthProvider
  /* static members */
  object TwitterAuthProvider {
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "TwitterAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link ProviderId}.TWITTER. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "TwitterAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: twitterDotcom = js.native
    
    /** Always set to {@link SignInMethod}.TWITTER. */
    @JSImport("@firebase/auth/dist/rn/index.cordova", "TwitterAuthProvider.TWITTER_SIGN_IN_METHOD")
    @js.native
    val TWITTER_SIGN_IN_METHOD: twitterDotcom = js.native
    
    /**
      * Creates a credential for Twitter.
      *
      * @param token - Twitter access token.
      * @param secret - Twitter secret.
      */
    inline def credential(token: String, secret: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/rn/index.cordova", "TwitterAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  inline def applyActionCode(auth: Auth, oobCode: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActionCode")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def beforeAuthStateChanged(auth: Auth, callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAuthStateChanged")(auth.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def beforeAuthStateChanged(
    auth: Auth,
    callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]],
    onAbort: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAuthStateChanged")(auth.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "browserLocalPersistence")
  @js.native
  val browserLocalPersistence: Persistence = js.native
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "browserSessionPersistence")
  @js.native
  val browserSessionPersistence: Persistence = js.native
  
  inline def checkActionCode(auth: Auth, oobCode: String): js.Promise[ActionCodeInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkActionCode")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ActionCodeInfo]]
  
  inline def confirmPasswordReset(auth: Auth, oobCode: String, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirmPasswordReset")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def connectAuthEmulator(auth: Auth, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectAuthEmulator(auth: Auth, url: String, options: DisableWarnings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "cordovaPopupRedirectResolver")
  @js.native
  val cordovaPopupRedirectResolver: PopupRedirectResolver = js.native
  
  inline def createUserWithEmailAndPassword(auth: Auth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "debugErrorMap")
  @js.native
  val debugErrorMap: AuthErrorMap = js.native
  
  inline def deleteUser(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteUser")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def fetchSignInMethodsForEmail(auth: Auth, email: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchSignInMethodsForEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def getAdditionalUserInfo(userCredential: UserCredential): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalUserInfo")(userCredential.asInstanceOf[js.Any]).asInstanceOf[AdditionalUserInfo | Null]
  
  inline def getAuth(): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[Auth]
  inline def getAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  
  inline def getIdToken(user: User): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getIdToken(user: User, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getIdTokenResult(user: User): js.Promise[IdTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdTokenResult]]
  inline def getIdTokenResult(user: User, forceRefresh: Boolean): js.Promise[IdTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IdTokenResult]]
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def getRedirectResult(auth: Auth): js.Promise[UserCredential | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectResult")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential | Null]]
  inline def getRedirectResult(auth: Auth, resolver: PopupRedirectResolver): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectResult")(auth.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "inMemoryPersistence")
  @js.native
  val inMemoryPersistence: Persistence = js.native
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "indexedDBLocalPersistence")
  @js.native
  val indexedDBLocalPersistence: Persistence = js.native
  
  inline def initializeAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  inline def initializeAuth(app: FirebaseApp, deps: Dependencies): Auth = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Auth]
  
  inline def isSignInWithEmailLink(auth: Auth, emailLink: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSignInWithEmailLink")(auth.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def linkWithCredential(user: User, credential: typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def linkWithRedirect(user: User, provider: AuthProvider): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def linkWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
  
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: Unit, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: Unit, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def parseActionCodeURL(link: String): typingsJapgolly.firebaseAuth.distRnSrcCoreActionCodeUrlMod.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseActionCodeURL")(link.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreActionCodeUrlMod.ActionCodeURL | Null]
  
  @JSImport("@firebase/auth/dist/rn/index.cordova", "prodErrorMap")
  @js.native
  val prodErrorMap: AuthErrorMap = js.native
  
  inline def reauthenticateWithCredential(user: User, credential: typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reauthenticateWithRedirect(user: User, provider: AuthProvider): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reauthenticateWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def reload(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def sendEmailVerification(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def sendEmailVerification(user: User, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendPasswordResetEmail(auth: Auth, email: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def sendPasswordResetEmail(auth: Auth, email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendSignInLinkToEmail(auth: Auth, email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSignInLinkToEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPersistence(auth: Auth, persistence: Persistence): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistence")(auth.asInstanceOf[js.Any], persistence.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def signInAnonymously(auth: Auth): js.Promise[UserCredential] = ^.asInstanceOf[js.Dynamic].applyDynamic("signInAnonymously")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCredential(auth: Auth, credential: typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCustomToken(auth: Auth, customToken: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCustomToken")(auth.asInstanceOf[js.Any], customToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithEmailAndPassword(auth: Auth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithEmailLink(auth: Auth, email: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def signInWithEmailLink(auth: Auth, email: String, emailLink: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithRedirect(auth: Auth, provider: AuthProvider): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def signInWithRedirect(auth: Auth, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def signOut(auth: Auth): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def unlink(user: User, providerId: String): js.Promise[User] = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], providerId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[User]]
  
  inline def updateCurrentUser(auth: Auth): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCurrentUser")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateCurrentUser(auth: Auth, user: User): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCurrentUser")(auth.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateEmail(user: User, newEmail: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updatePassword(user: User, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePassword")(user.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateProfile(user: User, hasDisplayNamePhotoUrl: DisplayName): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProfile")(user.asInstanceOf[js.Any], hasDisplayNamePhotoUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def useDeviceLanguage(auth: Auth): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeviceLanguage")(auth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def verifyBeforeUpdateEmail(user: User, newEmail: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBeforeUpdateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyBeforeUpdateEmail(user: User, newEmail: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBeforeUpdateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyPasswordResetCode(auth: Auth, code: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPasswordResetCode")(auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var auth: Auth
    }
    object NameServiceMapping {
      
      inline def apply(auth: Auth): NameServiceMapping = {
        val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      }
    }
  }
}
