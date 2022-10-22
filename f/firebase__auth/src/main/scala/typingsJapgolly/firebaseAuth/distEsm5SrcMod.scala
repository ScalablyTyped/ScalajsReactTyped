package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAuth.anon.DisableWarnings
import typingsJapgolly.firebaseAuth.anon.DisplayName
import typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredentialParams
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.ActionCodeInfo
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.ActionCodeSettings
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.AdditionalUserInfo
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.AuthErrorMap
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.Dependencies
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.IdTokenResult
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.MultiFactorError
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.MultiFactorResolver
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.MultiFactorUser
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.NextOrObserver
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.Persistence
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.UserCredential
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
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.twitterDotcom
import typingsJapgolly.firebaseUtil.mod.CompleteFn
import typingsJapgolly.firebaseUtil.mod.ErrorFn
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcMod {
  
  @JSImport("@firebase/auth/dist/esm5/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/esm5/src", "ActionCodeURL")
  @js.native
  open class ActionCodeURL protected ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.ActionCodeURL {
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
    
    @JSImport("@firebase/auth/dist/esm5/src", "ActionCodeURL")
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
    inline def parseLink(link: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreActionCodeUrlMod.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLink")(link.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreActionCodeUrlMod.ActionCodeURL | Null]
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "AuthCredential")
  @js.native
  open class AuthCredential protected ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.AuthCredential {
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
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.ADMIN_ONLY_OPERATION")
    @js.native
    val ADMIN_ONLY_OPERATION: `authSlashadmin-restricted-operation` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.ALREADY_INITIALIZED")
    @js.native
    val ALREADY_INITIALIZED: `authSlashalready-initialized` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.APP_NOT_AUTHORIZED")
    @js.native
    val APP_NOT_AUTHORIZED: `authSlashapp-not-authorized` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.APP_NOT_INSTALLED")
    @js.native
    val APP_NOT_INSTALLED: `authSlashapp-not-installed` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.ARGUMENT_ERROR")
    @js.native
    val ARGUMENT_ERROR: `authSlashargument-error` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.CAPTCHA_CHECK_FAILED")
    @js.native
    val CAPTCHA_CHECK_FAILED: `authSlashcaptcha-check-failed` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.CODE_EXPIRED")
    @js.native
    val CODE_EXPIRED: `authSlashcode-expired` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.CORDOVA_NOT_READY")
    @js.native
    val CORDOVA_NOT_READY: `authSlashcordova-not-ready` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.CORS_UNSUPPORTED")
    @js.native
    val CORS_UNSUPPORTED: `authSlashcors-unsupported` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.CREDENTIAL_ALREADY_IN_USE")
    @js.native
    val CREDENTIAL_ALREADY_IN_USE: `authSlashcredential-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.CREDENTIAL_MISMATCH")
    @js.native
    val CREDENTIAL_MISMATCH: `authSlashcustom-token-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.CREDENTIAL_TOO_OLD_LOGIN_AGAIN")
    @js.native
    val CREDENTIAL_TOO_OLD_LOGIN_AGAIN: `authSlashrequires-recent-login` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.DEPENDENT_SDK_INIT_BEFORE_AUTH")
    @js.native
    val DEPENDENT_SDK_INIT_BEFORE_AUTH: `authSlashdependent-sdk-initialized-before-auth` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.DYNAMIC_LINK_NOT_ACTIVATED")
    @js.native
    val DYNAMIC_LINK_NOT_ACTIVATED: `authSlashdynamic-link-not-activated` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.EMAIL_CHANGE_NEEDS_VERIFICATION")
    @js.native
    val EMAIL_CHANGE_NEEDS_VERIFICATION: `authSlashemail-change-needs-verification` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.EMAIL_EXISTS")
    @js.native
    val EMAIL_EXISTS: `authSlashemail-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.EMULATOR_CONFIG_FAILED")
    @js.native
    val EMULATOR_CONFIG_FAILED: `authSlashemulator-config-failed` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.EXPIRED_OOB_CODE")
    @js.native
    val EXPIRED_OOB_CODE: `authSlashexpired-action-code` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.EXPIRED_POPUP_REQUEST")
    @js.native
    val EXPIRED_POPUP_REQUEST: `authSlashcancelled-popup-request` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INTERNAL_ERROR")
    @js.native
    val INTERNAL_ERROR: `authSlashinternal-error` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_API_KEY")
    @js.native
    val INVALID_API_KEY: `authSlashinvalid-api-key` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_APP_CREDENTIAL")
    @js.native
    val INVALID_APP_CREDENTIAL: `authSlashinvalid-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_APP_ID")
    @js.native
    val INVALID_APP_ID: `authSlashinvalid-app-id` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_AUTH")
    @js.native
    val INVALID_AUTH: `authSlashinvalid-user-token` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_AUTH_EVENT")
    @js.native
    val INVALID_AUTH_EVENT: `authSlashinvalid-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_CERT_HASH")
    @js.native
    val INVALID_CERT_HASH: `authSlashinvalid-cert-hash` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_CODE")
    @js.native
    val INVALID_CODE: `authSlashinvalid-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_CONTINUE_URI")
    @js.native
    val INVALID_CONTINUE_URI: `authSlashinvalid-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_CORDOVA_CONFIGURATION")
    @js.native
    val INVALID_CORDOVA_CONFIGURATION: `authSlashinvalid-cordova-configuration` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_CUSTOM_TOKEN")
    @js.native
    val INVALID_CUSTOM_TOKEN: `authSlashinvalid-custom-token` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_DYNAMIC_LINK_DOMAIN")
    @js.native
    val INVALID_DYNAMIC_LINK_DOMAIN: `authSlashinvalid-dynamic-link-domain` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_EMAIL")
    @js.native
    val INVALID_EMAIL: `authSlashinvalid-email` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_EMULATOR_SCHEME")
    @js.native
    val INVALID_EMULATOR_SCHEME: `authSlashinvalid-emulator-scheme` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_IDP_RESPONSE")
    @js.native
    val INVALID_IDP_RESPONSE: `authSlashinvalid-credential` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_MESSAGE_PAYLOAD")
    @js.native
    val INVALID_MESSAGE_PAYLOAD: `authSlashinvalid-message-payload` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_MFA_SESSION")
    @js.native
    val INVALID_MFA_SESSION: `authSlashinvalid-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_OAUTH_CLIENT_ID")
    @js.native
    val INVALID_OAUTH_CLIENT_ID: `authSlashinvalid-oauth-client-id` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_OAUTH_PROVIDER")
    @js.native
    val INVALID_OAUTH_PROVIDER: `authSlashinvalid-oauth-provider` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_OOB_CODE")
    @js.native
    val INVALID_OOB_CODE: `authSlashinvalid-action-code` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_ORIGIN")
    @js.native
    val INVALID_ORIGIN: `authSlashunauthorized-domain` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_PASSWORD")
    @js.native
    val INVALID_PASSWORD: `authSlashwrong-password` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_PERSISTENCE")
    @js.native
    val INVALID_PERSISTENCE: `authSlashinvalid-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_PHONE_NUMBER")
    @js.native
    val INVALID_PHONE_NUMBER: `authSlashinvalid-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_PROVIDER_ID")
    @js.native
    val INVALID_PROVIDER_ID: `authSlashinvalid-provider-id` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_RECIPIENT_EMAIL")
    @js.native
    val INVALID_RECIPIENT_EMAIL: `authSlashinvalid-recipient-email` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_SENDER")
    @js.native
    val INVALID_SENDER: `authSlashinvalid-sender` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_SESSION_INFO")
    @js.native
    val INVALID_SESSION_INFO: `authSlashinvalid-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.INVALID_TENANT_ID")
    @js.native
    val INVALID_TENANT_ID: `authSlashinvalid-tenant-id` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MFA_INFO_NOT_FOUND")
    @js.native
    val MFA_INFO_NOT_FOUND: `authSlashmulti-factor-info-not-found` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MFA_REQUIRED")
    @js.native
    val MFA_REQUIRED: `authSlashmulti-factor-auth-required` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_ANDROID_PACKAGE_NAME")
    @js.native
    val MISSING_ANDROID_PACKAGE_NAME: `authSlashmissing-android-pkg-name` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_APP_CREDENTIAL")
    @js.native
    val MISSING_APP_CREDENTIAL: `authSlashmissing-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_AUTH_DOMAIN")
    @js.native
    val MISSING_AUTH_DOMAIN: `authSlashauth-domain-config-required` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_CODE")
    @js.native
    val MISSING_CODE: `authSlashmissing-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_CONTINUE_URI")
    @js.native
    val MISSING_CONTINUE_URI: `authSlashmissing-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_IFRAME_START")
    @js.native
    val MISSING_IFRAME_START: `authSlashmissing-iframe-start` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_IOS_BUNDLE_ID")
    @js.native
    val MISSING_IOS_BUNDLE_ID: `authSlashmissing-ios-bundle-id` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_MFA_INFO")
    @js.native
    val MISSING_MFA_INFO: `authSlashmissing-multi-factor-info` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_MFA_SESSION")
    @js.native
    val MISSING_MFA_SESSION: `authSlashmissing-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_OR_INVALID_NONCE")
    @js.native
    val MISSING_OR_INVALID_NONCE: `authSlashmissing-or-invalid-nonce` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_PHONE_NUMBER")
    @js.native
    val MISSING_PHONE_NUMBER: `authSlashmissing-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MISSING_SESSION_INFO")
    @js.native
    val MISSING_SESSION_INFO: `authSlashmissing-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.MODULE_DESTROYED")
    @js.native
    val MODULE_DESTROYED: `authSlashapp-deleted` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.NEED_CONFIRMATION")
    @js.native
    val NEED_CONFIRMATION: `authSlashaccount-exists-with-different-credential` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.NETWORK_REQUEST_FAILED")
    @js.native
    val NETWORK_REQUEST_FAILED: `authSlashnetwork-request-failed` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.NO_AUTH_EVENT")
    @js.native
    val NO_AUTH_EVENT: `authSlashno-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.NO_SUCH_PROVIDER")
    @js.native
    val NO_SUCH_PROVIDER: `authSlashno-such-provider` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.NULL_USER")
    @js.native
    val NULL_USER: `authSlashnull-user` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.OPERATION_NOT_ALLOWED")
    @js.native
    val OPERATION_NOT_ALLOWED: `authSlashoperation-not-allowed` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.OPERATION_NOT_SUPPORTED")
    @js.native
    val OPERATION_NOT_SUPPORTED: `authSlashoperation-not-supported-in-this-environment` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.POPUP_BLOCKED")
    @js.native
    val POPUP_BLOCKED: `authSlashpopup-blocked` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.POPUP_CLOSED_BY_USER")
    @js.native
    val POPUP_CLOSED_BY_USER: `authSlashpopup-closed-by-user` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.PROVIDER_ALREADY_LINKED")
    @js.native
    val PROVIDER_ALREADY_LINKED: `authSlashprovider-already-linked` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.QUOTA_EXCEEDED")
    @js.native
    val QUOTA_EXCEEDED: `authSlashquota-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.REDIRECT_CANCELLED_BY_USER")
    @js.native
    val REDIRECT_CANCELLED_BY_USER: `authSlashredirect-cancelled-by-user` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.REDIRECT_OPERATION_PENDING")
    @js.native
    val REDIRECT_OPERATION_PENDING: `authSlashredirect-operation-pending` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.REJECTED_CREDENTIAL")
    @js.native
    val REJECTED_CREDENTIAL: `authSlashrejected-credential` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.SECOND_FACTOR_ALREADY_ENROLLED")
    @js.native
    val SECOND_FACTOR_ALREADY_ENROLLED: `authSlashsecond-factor-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.SECOND_FACTOR_LIMIT_EXCEEDED")
    @js.native
    val SECOND_FACTOR_LIMIT_EXCEEDED: `authSlashmaximum-second-factor-count-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.TENANT_ID_MISMATCH")
    @js.native
    val TENANT_ID_MISMATCH: `authSlashtenant-id-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.TIMEOUT")
    @js.native
    val TIMEOUT: authSlashtimeout = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.TOKEN_EXPIRED")
    @js.native
    val TOKEN_EXPIRED: `authSlashuser-token-expired` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.TOO_MANY_ATTEMPTS_TRY_LATER")
    @js.native
    val TOO_MANY_ATTEMPTS_TRY_LATER: `authSlashtoo-many-requests` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.UNAUTHORIZED_DOMAIN")
    @js.native
    val UNAUTHORIZED_DOMAIN: `authSlashunauthorized-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.UNSUPPORTED_FIRST_FACTOR")
    @js.native
    val UNSUPPORTED_FIRST_FACTOR: `authSlashunsupported-first-factor` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.UNSUPPORTED_PERSISTENCE")
    @js.native
    val UNSUPPORTED_PERSISTENCE: `authSlashunsupported-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.UNSUPPORTED_TENANT_OPERATION")
    @js.native
    val UNSUPPORTED_TENANT_OPERATION: `authSlashunsupported-tenant-operation` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.UNVERIFIED_EMAIL")
    @js.native
    val UNVERIFIED_EMAIL: `authSlashunverified-email` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.USER_CANCELLED")
    @js.native
    val USER_CANCELLED: `authSlashuser-cancelled` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.USER_DELETED")
    @js.native
    val USER_DELETED: `authSlashuser-not-found` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.USER_DISABLED")
    @js.native
    val USER_DISABLED: `authSlashuser-disabled` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.USER_MISMATCH")
    @js.native
    val USER_MISMATCH: `authSlashuser-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.USER_SIGNED_OUT")
    @js.native
    val USER_SIGNED_OUT: `authSlashuser-signed-out` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.WEAK_PASSWORD")
    @js.native
    val WEAK_PASSWORD: `authSlashweak-password` = js.native
    
    @JSImport("@firebase/auth/dist/esm5/src", "AuthErrorCodes.WEB_STORAGE_UNSUPPORTED")
    @js.native
    val WEB_STORAGE_UNSUPPORTED: `authSlashweb-storage-unsupported` = js.native
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "EmailAuthCredential")
  @js.native
  /** @internal */
  /* private */ open class EmailAuthCredential ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.EmailAuthCredential
  /* static members */
  object EmailAuthCredential {
    
    @JSImport("@firebase/auth/dist/esm5/src", "EmailAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromEmailAndCode(email: String, oobCode: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential]
    inline def _fromEmailAndCode(email: String, oobCode: String, tenantId: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    /** @internal */
    inline def _fromEmailAndPassword(email: String, password: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndPassword")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
    /**
      * Static method to deserialize a JSON representation of an object into an {@link  AuthCredential}.
      *
      * @param json - Either `object` or the stringified representation of the object. When string is
      * provided, `JSON.parse` would be called first.
      *
      * @returns If the JSON input does not represent an {@link AuthCredential}, null is returned.
      */
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "EmailAuthProvider")
  @js.native
  open class EmailAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.EmailAuthProvider
  /* static members */
  object EmailAuthProvider {
    
    @JSImport("@firebase/auth/dist/esm5/src", "EmailAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Always set to {@link SignInMethod}.EMAIL_LINK.
      */
    @JSImport("@firebase/auth/dist/esm5/src", "EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD")
    @js.native
    val EMAIL_LINK_SIGN_IN_METHOD: emailLink = js.native
    
    /**
      * Always set to {@link SignInMethod}.EMAIL_PASSWORD.
      */
    @JSImport("@firebase/auth/dist/esm5/src", "EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD")
    @js.native
    val EMAIL_PASSWORD_SIGN_IN_METHOD: password = js.native
    
    /**
      * Always set to {@link ProviderId}.PASSWORD, even for email link.
      */
    @JSImport("@firebase/auth/dist/esm5/src", "EmailAuthProvider.PROVIDER_ID")
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
    inline def credential(email: String, password: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential]
    
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
    inline def credentialWithLink(email: String, emailLink: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credentialWithLink")(email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsEmailMod.EmailAuthCredential]
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "FacebookAuthProvider")
  @js.native
  open class FacebookAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.FacebookAuthProvider
  /* static members */
  object FacebookAuthProvider {
    
    @JSImport("@firebase/auth/dist/esm5/src", "FacebookAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.FACEBOOK. */
    @JSImport("@firebase/auth/dist/esm5/src", "FacebookAuthProvider.FACEBOOK_SIGN_IN_METHOD")
    @js.native
    val FACEBOOK_SIGN_IN_METHOD: facebookDotcom = js.native
    
    /** Always set to {@link ProviderId}.FACEBOOK. */
    @JSImport("@firebase/auth/dist/esm5/src", "FacebookAuthProvider.PROVIDER_ID")
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
    inline def credential(accessToken: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/esm5/src", "FacebookAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "GithubAuthProvider")
  @js.native
  open class GithubAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.GithubAuthProvider
  /* static members */
  object GithubAuthProvider {
    
    @JSImport("@firebase/auth/dist/esm5/src", "GithubAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.GITHUB. */
    @JSImport("@firebase/auth/dist/esm5/src", "GithubAuthProvider.GITHUB_SIGN_IN_METHOD")
    @js.native
    val GITHUB_SIGN_IN_METHOD: githubDotcom = js.native
    
    /** Always set to {@link ProviderId}.GITHUB. */
    @JSImport("@firebase/auth/dist/esm5/src", "GithubAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: githubDotcom = js.native
    
    /**
      * Creates a credential for Github.
      *
      * @param accessToken - Github access token.
      */
    inline def credential(accessToken: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/esm5/src", "GithubAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "GoogleAuthProvider")
  @js.native
  open class GoogleAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.GoogleAuthProvider
  /* static members */
  object GoogleAuthProvider {
    
    @JSImport("@firebase/auth/dist/esm5/src", "GoogleAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.GOOGLE. */
    @JSImport("@firebase/auth/dist/esm5/src", "GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD")
    @js.native
    val GOOGLE_SIGN_IN_METHOD: googleDotcom = js.native
    
    /** Always set to {@link ProviderId}.GOOGLE. */
    @JSImport("@firebase/auth/dist/esm5/src", "GoogleAuthProvider.PROVIDER_ID")
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
    inline def credential(): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")().asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: String, accessToken: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: Null, accessToken: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    inline def credential(idToken: Unit, accessToken: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/esm5/src", "GoogleAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "OAuthCredential")
  @js.native
  open class OAuthCredential protected ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.OAuthCredential {
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
    
    @JSImport("@firebase/auth/dist/esm5/src", "OAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromParams(params: OAuthCredentialParams): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromParams")(params.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Static method to deserialize a JSON representation of an object into an
      * {@link  AuthCredential}.
      *
      * @param json - Input can be either Object or the stringified representation of the object.
      * When string is provided, JSON.parse would be called first.
      *
      * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
      */
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "OAuthProvider")
  @js.native
  open class OAuthProvider protected ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.OAuthProvider {
    /**
      * Constructor for generic OAuth providers.
      *
      * @param providerId - Provider for which credentials should be generated.
      */
    def this(providerId: String) = this()
  }
  /* static members */
  object OAuthProvider {
    
    @JSImport("@firebase/auth/dist/esm5/src", "OAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    inline def credentialFromJSON(json: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    /**
      * Creates an {@link OAuthCredential} from a JSON string or a plain object.
      * @param json - A plain object or a JSON string
      */
    inline def credentialFromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/esm5/src", "OAuthProvider.oauthCredentialFromTaggedObject")
    @js.native
    def oauthCredentialFromTaggedObject: Any = js.native
    inline def oauthCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oauthCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "PhoneAuthCredential")
  @js.native
  /* private */ open class PhoneAuthCredential ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.PhoneAuthCredential
  /* static members */
  object PhoneAuthCredential {
    
    @JSImport("@firebase/auth/dist/esm5/src", "PhoneAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromTokenResponse(phoneNumber: String, temporaryProof: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromTokenResponse")(phoneNumber.asInstanceOf[js.Any], temporaryProof.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    /** @internal */
    inline def _fromVerification(verificationId: String, verificationCode: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromVerification")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
    /** Generates a phone credential based on a plain object or a JSON string. */
    inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "SAMLAuthProvider")
  @js.native
  open class SAMLAuthProvider protected ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.SAMLAuthProvider {
    /**
      * Constructor. The providerId must start with "saml."
      * @param providerId - SAML provider ID.
      */
    def this(providerId: String) = this()
  }
  /* static members */
  object SAMLAuthProvider {
    
    @JSImport("@firebase/auth/dist/esm5/src", "SAMLAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential | Null]
    
    /**
      * Creates an {@link AuthCredential} from a JSON string or a plain object.
      * @param json - A plain object or a JSON string
      */
    inline def credentialFromJSON(json: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential]
    inline def credentialFromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential]
    
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
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/esm5/src", "SAMLAuthProvider.samlCredentialFromTaggedObject")
    @js.native
    def samlCredentialFromTaggedObject: Any = js.native
    inline def samlCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("samlCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/auth/dist/esm5/src", "TwitterAuthProvider")
  @js.native
  open class TwitterAuthProvider ()
    extends typingsJapgolly.firebaseAuth.distEsm5SrcCoreMod.TwitterAuthProvider
  /* static members */
  object TwitterAuthProvider {
    
    @JSImport("@firebase/auth/dist/esm5/src", "TwitterAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link ProviderId}.TWITTER. */
    @JSImport("@firebase/auth/dist/esm5/src", "TwitterAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: twitterDotcom = js.native
    
    /** Always set to {@link SignInMethod}.TWITTER. */
    @JSImport("@firebase/auth/dist/esm5/src", "TwitterAuthProvider.TWITTER_SIGN_IN_METHOD")
    @js.native
    val TWITTER_SIGN_IN_METHOD: twitterDotcom = js.native
    
    /**
      * Creates a credential for Twitter.
      *
      * @param token - Twitter access token.
      * @param secret - Twitter secret.
      */
    inline def credential(token: String, secret: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsOauthMod.OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/esm5/src", "TwitterAuthProvider.credentialFromTaggedObject")
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
  
  inline def checkActionCode(auth: Auth, oobCode: String): js.Promise[ActionCodeInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkActionCode")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ActionCodeInfo]]
  
  inline def confirmPasswordReset(auth: Auth, oobCode: String, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirmPasswordReset")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def connectAuthEmulator(auth: Auth, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectAuthEmulator(auth: Auth, url: String, options: DisableWarnings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createUserWithEmailAndPassword(auth: Auth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  @JSImport("@firebase/auth/dist/esm5/src", "debugErrorMap")
  @js.native
  val debugErrorMap: AuthErrorMap = js.native
  
  inline def deleteUser(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteUser")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def fetchSignInMethodsForEmail(auth: Auth, email: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchSignInMethodsForEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def getAdditionalUserInfo(userCredential: UserCredential): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalUserInfo")(userCredential.asInstanceOf[js.Any]).asInstanceOf[AdditionalUserInfo | Null]
  
  inline def getIdToken(user: User): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getIdToken(user: User, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getIdTokenResult(user: User): js.Promise[IdTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdTokenResult]]
  inline def getIdTokenResult(user: User, forceRefresh: Boolean): js.Promise[IdTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IdTokenResult]]
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  @JSImport("@firebase/auth/dist/esm5/src", "inMemoryPersistence")
  @js.native
  val inMemoryPersistence: Persistence = js.native
  
  inline def initializeAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  inline def initializeAuth(app: FirebaseApp, deps: Dependencies): Auth = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Auth]
  
  inline def isSignInWithEmailLink(auth: Auth, emailLink: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSignInWithEmailLink")(auth.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def linkWithCredential(user: User, credential: typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
  
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: Unit, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: Unit, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def parseActionCodeURL(link: String): typingsJapgolly.firebaseAuth.distEsm5SrcCoreActionCodeUrlMod.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseActionCodeURL")(link.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcCoreActionCodeUrlMod.ActionCodeURL | Null]
  
  @JSImport("@firebase/auth/dist/esm5/src", "prodErrorMap")
  @js.native
  val prodErrorMap: AuthErrorMap = js.native
  
  inline def reauthenticateWithCredential(user: User, credential: typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reload(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def sendEmailVerification(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def sendEmailVerification(user: User, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendPasswordResetEmail(auth: Auth, email: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def sendPasswordResetEmail(auth: Auth, email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendSignInLinkToEmail(auth: Auth, email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSignInLinkToEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPersistence(auth: Auth, persistence: Persistence): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistence")(auth.asInstanceOf[js.Any], persistence.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def signInAnonymously(auth: Auth): js.Promise[UserCredential] = ^.asInstanceOf[js.Dynamic].applyDynamic("signInAnonymously")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCredential(auth: Auth, credential: typingsJapgolly.firebaseAuth.distEsm5SrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCustomToken(auth: Auth, customToken: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCustomToken")(auth.asInstanceOf[js.Any], customToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithEmailAndPassword(auth: Auth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithEmailLink(auth: Auth, email: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def signInWithEmailLink(auth: Auth, email: String, emailLink: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
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
}
