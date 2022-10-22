package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.anon.AppNameEmail
import typingsJapgolly.firebaseAuth.anon.ErrorMapAuthErrorCode
import typingsJapgolly.firebaseAuth.distCordovaSrcCoreCredentialsMod.AuthCredential
import typingsJapgolly.firebaseAuth.distCordovaSrcModelAuthMod.AppName
import typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.AuthErrorMap
import typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`account-exists-with-different-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`admin-restricted-operation`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`already-initialized`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`app-deleted`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`app-not-authorized`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`app-not-installed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`argument-error`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`auth-domain-config-required`
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
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`cancelled-popup-request`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`captcha-check-failed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`code-expired`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`cordova-not-ready`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`cors-unsupported`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`credential-already-in-use`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`custom-token-mismatch`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`dependent-sdk-initialized-before-auth`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`dynamic-link-not-activated`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`email-already-in-use`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`email-change-needs-verification`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`emulator-config-failed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`expired-action-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`internal-error`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-action-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-api-key`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-app-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-app-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-auth-event`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-cert-hash`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-continue-uri`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-cordova-configuration`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-custom-token`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-dynamic-link-domain`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-email`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-emulator-scheme`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-message-payload`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-multi-factor-session`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-oauth-client-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-oauth-provider`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-persistence-type`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-phone-number`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-provider-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-recipient-email`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-sender`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-tenant-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-user-token`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-verification-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-verification-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`login-blocked`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`maximum-second-factor-count-exceeded`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-android-pkg-name`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-app-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-continue-uri`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-iframe-start`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-ios-bundle-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-info`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-session`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-or-invalid-nonce`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-phone-number`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-verification-code`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-verification-id`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`multi-factor-auth-required`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`multi-factor-info-not-found`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`network-request-failed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`no-auth-event`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`no-such-provider`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`null-user`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`operation-not-allowed`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`operation-not-supported-in-this-environment`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`popup-blocked`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`popup-closed-by-user`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`provider-already-linked`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`quota-exceeded`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`redirect-cancelled-by-user`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`redirect-operation-pending`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`rejected-credential`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`requires-recent-login`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`second-factor-already-in-use`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`tenant-id-mismatch`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`too-many-requests`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unauthorized-continue-uri`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unauthorized-domain`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unsupported-first-factor`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unsupported-persistence-type`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unsupported-tenant-operation`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unverified-email`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-cancelled`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-disabled`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-mismatch`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-not-found`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-signed-out`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-token-expired`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`weak-password`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`web-storage-unsupported`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.`wrong-password`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.authSlashtimeout
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.timeout
import typingsJapgolly.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcCoreErrorsMod {
  
  object AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY {
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.ADMIN_ONLY_OPERATION")
    @js.native
    val ADMIN_ONLY_OPERATION: `authSlashadmin-restricted-operation` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.ALREADY_INITIALIZED")
    @js.native
    val ALREADY_INITIALIZED: `authSlashalready-initialized` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.APP_NOT_AUTHORIZED")
    @js.native
    val APP_NOT_AUTHORIZED: `authSlashapp-not-authorized` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.APP_NOT_INSTALLED")
    @js.native
    val APP_NOT_INSTALLED: `authSlashapp-not-installed` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.ARGUMENT_ERROR")
    @js.native
    val ARGUMENT_ERROR: `authSlashargument-error` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CAPTCHA_CHECK_FAILED")
    @js.native
    val CAPTCHA_CHECK_FAILED: `authSlashcaptcha-check-failed` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CODE_EXPIRED")
    @js.native
    val CODE_EXPIRED: `authSlashcode-expired` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CORDOVA_NOT_READY")
    @js.native
    val CORDOVA_NOT_READY: `authSlashcordova-not-ready` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CORS_UNSUPPORTED")
    @js.native
    val CORS_UNSUPPORTED: `authSlashcors-unsupported` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CREDENTIAL_ALREADY_IN_USE")
    @js.native
    val CREDENTIAL_ALREADY_IN_USE: `authSlashcredential-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CREDENTIAL_MISMATCH")
    @js.native
    val CREDENTIAL_MISMATCH: `authSlashcustom-token-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CREDENTIAL_TOO_OLD_LOGIN_AGAIN")
    @js.native
    val CREDENTIAL_TOO_OLD_LOGIN_AGAIN: `authSlashrequires-recent-login` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.DEPENDENT_SDK_INIT_BEFORE_AUTH")
    @js.native
    val DEPENDENT_SDK_INIT_BEFORE_AUTH: `authSlashdependent-sdk-initialized-before-auth` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.DYNAMIC_LINK_NOT_ACTIVATED")
    @js.native
    val DYNAMIC_LINK_NOT_ACTIVATED: `authSlashdynamic-link-not-activated` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EMAIL_CHANGE_NEEDS_VERIFICATION")
    @js.native
    val EMAIL_CHANGE_NEEDS_VERIFICATION: `authSlashemail-change-needs-verification` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EMAIL_EXISTS")
    @js.native
    val EMAIL_EXISTS: `authSlashemail-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EMULATOR_CONFIG_FAILED")
    @js.native
    val EMULATOR_CONFIG_FAILED: `authSlashemulator-config-failed` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EXPIRED_OOB_CODE")
    @js.native
    val EXPIRED_OOB_CODE: `authSlashexpired-action-code` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EXPIRED_POPUP_REQUEST")
    @js.native
    val EXPIRED_POPUP_REQUEST: `authSlashcancelled-popup-request` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INTERNAL_ERROR")
    @js.native
    val INTERNAL_ERROR: `authSlashinternal-error` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_API_KEY")
    @js.native
    val INVALID_API_KEY: `authSlashinvalid-api-key` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_APP_CREDENTIAL")
    @js.native
    val INVALID_APP_CREDENTIAL: `authSlashinvalid-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_APP_ID")
    @js.native
    val INVALID_APP_ID: `authSlashinvalid-app-id` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_AUTH")
    @js.native
    val INVALID_AUTH: `authSlashinvalid-user-token` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_AUTH_EVENT")
    @js.native
    val INVALID_AUTH_EVENT: `authSlashinvalid-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CERT_HASH")
    @js.native
    val INVALID_CERT_HASH: `authSlashinvalid-cert-hash` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CODE")
    @js.native
    val INVALID_CODE: `authSlashinvalid-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CONTINUE_URI")
    @js.native
    val INVALID_CONTINUE_URI: `authSlashinvalid-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CORDOVA_CONFIGURATION")
    @js.native
    val INVALID_CORDOVA_CONFIGURATION: `authSlashinvalid-cordova-configuration` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CUSTOM_TOKEN")
    @js.native
    val INVALID_CUSTOM_TOKEN: `authSlashinvalid-custom-token` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_DYNAMIC_LINK_DOMAIN")
    @js.native
    val INVALID_DYNAMIC_LINK_DOMAIN: `authSlashinvalid-dynamic-link-domain` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_EMAIL")
    @js.native
    val INVALID_EMAIL: `authSlashinvalid-email` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_EMULATOR_SCHEME")
    @js.native
    val INVALID_EMULATOR_SCHEME: `authSlashinvalid-emulator-scheme` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_IDP_RESPONSE")
    @js.native
    val INVALID_IDP_RESPONSE: `authSlashinvalid-credential` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_MESSAGE_PAYLOAD")
    @js.native
    val INVALID_MESSAGE_PAYLOAD: `authSlashinvalid-message-payload` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_MFA_SESSION")
    @js.native
    val INVALID_MFA_SESSION: `authSlashinvalid-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_OAUTH_CLIENT_ID")
    @js.native
    val INVALID_OAUTH_CLIENT_ID: `authSlashinvalid-oauth-client-id` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_OAUTH_PROVIDER")
    @js.native
    val INVALID_OAUTH_PROVIDER: `authSlashinvalid-oauth-provider` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_OOB_CODE")
    @js.native
    val INVALID_OOB_CODE: `authSlashinvalid-action-code` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_ORIGIN")
    @js.native
    val INVALID_ORIGIN: `authSlashunauthorized-domain` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_PASSWORD")
    @js.native
    val INVALID_PASSWORD: `authSlashwrong-password` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_PERSISTENCE")
    @js.native
    val INVALID_PERSISTENCE: `authSlashinvalid-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_PHONE_NUMBER")
    @js.native
    val INVALID_PHONE_NUMBER: `authSlashinvalid-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_PROVIDER_ID")
    @js.native
    val INVALID_PROVIDER_ID: `authSlashinvalid-provider-id` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_RECIPIENT_EMAIL")
    @js.native
    val INVALID_RECIPIENT_EMAIL: `authSlashinvalid-recipient-email` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_SENDER")
    @js.native
    val INVALID_SENDER: `authSlashinvalid-sender` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_SESSION_INFO")
    @js.native
    val INVALID_SESSION_INFO: `authSlashinvalid-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_TENANT_ID")
    @js.native
    val INVALID_TENANT_ID: `authSlashinvalid-tenant-id` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MFA_INFO_NOT_FOUND")
    @js.native
    val MFA_INFO_NOT_FOUND: `authSlashmulti-factor-info-not-found` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MFA_REQUIRED")
    @js.native
    val MFA_REQUIRED: `authSlashmulti-factor-auth-required` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_ANDROID_PACKAGE_NAME")
    @js.native
    val MISSING_ANDROID_PACKAGE_NAME: `authSlashmissing-android-pkg-name` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_APP_CREDENTIAL")
    @js.native
    val MISSING_APP_CREDENTIAL: `authSlashmissing-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_AUTH_DOMAIN")
    @js.native
    val MISSING_AUTH_DOMAIN: `authSlashauth-domain-config-required` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_CODE")
    @js.native
    val MISSING_CODE: `authSlashmissing-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_CONTINUE_URI")
    @js.native
    val MISSING_CONTINUE_URI: `authSlashmissing-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_IFRAME_START")
    @js.native
    val MISSING_IFRAME_START: `authSlashmissing-iframe-start` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_IOS_BUNDLE_ID")
    @js.native
    val MISSING_IOS_BUNDLE_ID: `authSlashmissing-ios-bundle-id` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_MFA_INFO")
    @js.native
    val MISSING_MFA_INFO: `authSlashmissing-multi-factor-info` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_MFA_SESSION")
    @js.native
    val MISSING_MFA_SESSION: `authSlashmissing-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_OR_INVALID_NONCE")
    @js.native
    val MISSING_OR_INVALID_NONCE: `authSlashmissing-or-invalid-nonce` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_PHONE_NUMBER")
    @js.native
    val MISSING_PHONE_NUMBER: `authSlashmissing-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_SESSION_INFO")
    @js.native
    val MISSING_SESSION_INFO: `authSlashmissing-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MODULE_DESTROYED")
    @js.native
    val MODULE_DESTROYED: `authSlashapp-deleted` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NEED_CONFIRMATION")
    @js.native
    val NEED_CONFIRMATION: `authSlashaccount-exists-with-different-credential` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NETWORK_REQUEST_FAILED")
    @js.native
    val NETWORK_REQUEST_FAILED: `authSlashnetwork-request-failed` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NO_AUTH_EVENT")
    @js.native
    val NO_AUTH_EVENT: `authSlashno-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NO_SUCH_PROVIDER")
    @js.native
    val NO_SUCH_PROVIDER: `authSlashno-such-provider` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NULL_USER")
    @js.native
    val NULL_USER: `authSlashnull-user` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.OPERATION_NOT_ALLOWED")
    @js.native
    val OPERATION_NOT_ALLOWED: `authSlashoperation-not-allowed` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.OPERATION_NOT_SUPPORTED")
    @js.native
    val OPERATION_NOT_SUPPORTED: `authSlashoperation-not-supported-in-this-environment` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.POPUP_BLOCKED")
    @js.native
    val POPUP_BLOCKED: `authSlashpopup-blocked` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.POPUP_CLOSED_BY_USER")
    @js.native
    val POPUP_CLOSED_BY_USER: `authSlashpopup-closed-by-user` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.PROVIDER_ALREADY_LINKED")
    @js.native
    val PROVIDER_ALREADY_LINKED: `authSlashprovider-already-linked` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.QUOTA_EXCEEDED")
    @js.native
    val QUOTA_EXCEEDED: `authSlashquota-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.REDIRECT_CANCELLED_BY_USER")
    @js.native
    val REDIRECT_CANCELLED_BY_USER: `authSlashredirect-cancelled-by-user` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.REDIRECT_OPERATION_PENDING")
    @js.native
    val REDIRECT_OPERATION_PENDING: `authSlashredirect-operation-pending` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.REJECTED_CREDENTIAL")
    @js.native
    val REJECTED_CREDENTIAL: `authSlashrejected-credential` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.SECOND_FACTOR_ALREADY_ENROLLED")
    @js.native
    val SECOND_FACTOR_ALREADY_ENROLLED: `authSlashsecond-factor-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.SECOND_FACTOR_LIMIT_EXCEEDED")
    @js.native
    val SECOND_FACTOR_LIMIT_EXCEEDED: `authSlashmaximum-second-factor-count-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.TENANT_ID_MISMATCH")
    @js.native
    val TENANT_ID_MISMATCH: `authSlashtenant-id-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.TIMEOUT")
    @js.native
    val TIMEOUT: authSlashtimeout = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.TOKEN_EXPIRED")
    @js.native
    val TOKEN_EXPIRED: `authSlashuser-token-expired` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.TOO_MANY_ATTEMPTS_TRY_LATER")
    @js.native
    val TOO_MANY_ATTEMPTS_TRY_LATER: `authSlashtoo-many-requests` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNAUTHORIZED_DOMAIN")
    @js.native
    val UNAUTHORIZED_DOMAIN: `authSlashunauthorized-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNSUPPORTED_FIRST_FACTOR")
    @js.native
    val UNSUPPORTED_FIRST_FACTOR: `authSlashunsupported-first-factor` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNSUPPORTED_PERSISTENCE")
    @js.native
    val UNSUPPORTED_PERSISTENCE: `authSlashunsupported-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNSUPPORTED_TENANT_OPERATION")
    @js.native
    val UNSUPPORTED_TENANT_OPERATION: `authSlashunsupported-tenant-operation` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNVERIFIED_EMAIL")
    @js.native
    val UNVERIFIED_EMAIL: `authSlashunverified-email` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_CANCELLED")
    @js.native
    val USER_CANCELLED: `authSlashuser-cancelled` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_DELETED")
    @js.native
    val USER_DELETED: `authSlashuser-not-found` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_DISABLED")
    @js.native
    val USER_DISABLED: `authSlashuser-disabled` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_MISMATCH")
    @js.native
    val USER_MISMATCH: `authSlashuser-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_SIGNED_OUT")
    @js.native
    val USER_SIGNED_OUT: `authSlashuser-signed-out` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.WEAK_PASSWORD")
    @js.native
    val WEAK_PASSWORD: `authSlashweak-password` = js.native
    
    @JSImport("@firebase/auth/dist/cordova/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.WEB_STORAGE_UNSUPPORTED")
    @js.native
    val WEB_STORAGE_UNSUPPORTED: `authSlashweb-storage-unsupported` = js.native
  }
  
  @JSImport("@firebase/auth/dist/cordova/src/core/errors", "_DEFAULT_AUTH_ERROR_FACTORY")
  @js.native
  val _DEFAULT_AUTH_ERROR_FACTORY: ErrorFactory[AuthErrorCode, AuthErrorParams] = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/core/errors", "debugErrorMap")
  @js.native
  val debugErrorMap: AuthErrorMap = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/core/errors", "prodErrorMap")
  @js.native
  val prodErrorMap: AuthErrorMap = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`admin-restricted-operation`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`argument-error`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`app-not-authorized`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`app-not-installed`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`captcha-check-failed`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`code-expired`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`cordova-not-ready`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`cors-unsupported`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`credential-already-in-use`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`custom-token-mismatch`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`requires-recent-login`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`dependent-sdk-initialized-before-auth`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`dynamic-link-not-activated`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`email-change-needs-verification`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`email-already-in-use`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`emulator-config-failed`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`expired-action-code`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`cancelled-popup-request`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`internal-error`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-api-key`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-app-credential`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-app-id`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-user-token`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-auth-event`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-cert-hash`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-verification-code`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-continue-uri`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-cordova-configuration`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-custom-token`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-dynamic-link-domain`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-email`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-emulator-scheme`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-credential`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-message-payload`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-multi-factor-session`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-oauth-client-id`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-oauth-provider`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-action-code`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unauthorized-domain`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`wrong-password`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-persistence-type`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-phone-number`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-provider-id`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-recipient-email`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-sender`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-verification-id`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`invalid-tenant-id`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`login-blocked`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`multi-factor-info-not-found`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`multi-factor-auth-required`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-android-pkg-name`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-app-credential`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`auth-domain-config-required`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-verification-code`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-continue-uri`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-iframe-start`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-ios-bundle-id`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-or-invalid-nonce`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-info`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-session`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-phone-number`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`missing-verification-id`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`app-deleted`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`account-exists-with-different-credential`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`network-request-failed`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`null-user`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`no-auth-event`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`no-such-provider`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`operation-not-allowed`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`operation-not-supported-in-this-environment`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`popup-blocked`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`popup-closed-by-user`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`provider-already-linked`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`quota-exceeded`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`redirect-cancelled-by-user`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`redirect-operation-pending`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`rejected-credential`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`second-factor-already-in-use`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`maximum-second-factor-count-exceeded`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`tenant-id-mismatch`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.timeout
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-token-expired`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`too-many-requests`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unauthorized-continue-uri`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unsupported-first-factor`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unsupported-persistence-type`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unsupported-tenant-operation`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`unverified-email`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-cancelled`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-not-found`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-disabled`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-mismatch`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`user-signed-out`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`weak-password`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`web-storage-unsupported`
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.`already-initialized`
  */
  trait AuthErrorCode extends StObject
  object AuthErrorCode {
    
    inline def ADMIN_ONLY_OPERATION: `admin-restricted-operation` = "admin-restricted-operation".asInstanceOf[`admin-restricted-operation`]
    
    inline def ALREADY_INITIALIZED: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
    
    inline def APP_NOT_AUTHORIZED: `app-not-authorized` = "app-not-authorized".asInstanceOf[`app-not-authorized`]
    
    inline def APP_NOT_INSTALLED: `app-not-installed` = "app-not-installed".asInstanceOf[`app-not-installed`]
    
    inline def ARGUMENT_ERROR: `argument-error` = "argument-error".asInstanceOf[`argument-error`]
    
    inline def CAPTCHA_CHECK_FAILED: `captcha-check-failed` = "captcha-check-failed".asInstanceOf[`captcha-check-failed`]
    
    inline def CODE_EXPIRED: `code-expired` = "code-expired".asInstanceOf[`code-expired`]
    
    inline def CORDOVA_NOT_READY: `cordova-not-ready` = "cordova-not-ready".asInstanceOf[`cordova-not-ready`]
    
    inline def CORS_UNSUPPORTED: `cors-unsupported` = "cors-unsupported".asInstanceOf[`cors-unsupported`]
    
    inline def CREDENTIAL_ALREADY_IN_USE: `credential-already-in-use` = "credential-already-in-use".asInstanceOf[`credential-already-in-use`]
    
    inline def CREDENTIAL_MISMATCH: `custom-token-mismatch` = "custom-token-mismatch".asInstanceOf[`custom-token-mismatch`]
    
    inline def CREDENTIAL_TOO_OLD_LOGIN_AGAIN: `requires-recent-login` = "requires-recent-login".asInstanceOf[`requires-recent-login`]
    
    inline def DEPENDENT_SDK_INIT_BEFORE_AUTH: `dependent-sdk-initialized-before-auth` = "dependent-sdk-initialized-before-auth".asInstanceOf[`dependent-sdk-initialized-before-auth`]
    
    inline def DYNAMIC_LINK_NOT_ACTIVATED: `dynamic-link-not-activated` = "dynamic-link-not-activated".asInstanceOf[`dynamic-link-not-activated`]
    
    inline def EMAIL_CHANGE_NEEDS_VERIFICATION: `email-change-needs-verification` = "email-change-needs-verification".asInstanceOf[`email-change-needs-verification`]
    
    inline def EMAIL_EXISTS: `email-already-in-use` = "email-already-in-use".asInstanceOf[`email-already-in-use`]
    
    inline def EMULATOR_CONFIG_FAILED: `emulator-config-failed` = "emulator-config-failed".asInstanceOf[`emulator-config-failed`]
    
    inline def EXPIRED_OOB_CODE: `expired-action-code` = "expired-action-code".asInstanceOf[`expired-action-code`]
    
    inline def EXPIRED_POPUP_REQUEST: `cancelled-popup-request` = "cancelled-popup-request".asInstanceOf[`cancelled-popup-request`]
    
    inline def INTERNAL_ERROR: `internal-error` = "internal-error".asInstanceOf[`internal-error`]
    
    inline def INVALID_API_KEY: `invalid-api-key` = "invalid-api-key".asInstanceOf[`invalid-api-key`]
    
    inline def INVALID_APP_CREDENTIAL: `invalid-app-credential` = "invalid-app-credential".asInstanceOf[`invalid-app-credential`]
    
    inline def INVALID_APP_ID: `invalid-app-id` = "invalid-app-id".asInstanceOf[`invalid-app-id`]
    
    inline def INVALID_AUTH: `invalid-user-token` = "invalid-user-token".asInstanceOf[`invalid-user-token`]
    
    inline def INVALID_AUTH_EVENT: `invalid-auth-event` = "invalid-auth-event".asInstanceOf[`invalid-auth-event`]
    
    inline def INVALID_CERT_HASH: `invalid-cert-hash` = "invalid-cert-hash".asInstanceOf[`invalid-cert-hash`]
    
    inline def INVALID_CODE: `invalid-verification-code` = "invalid-verification-code".asInstanceOf[`invalid-verification-code`]
    
    inline def INVALID_CONTINUE_URI: `invalid-continue-uri` = "invalid-continue-uri".asInstanceOf[`invalid-continue-uri`]
    
    inline def INVALID_CORDOVA_CONFIGURATION: `invalid-cordova-configuration` = "invalid-cordova-configuration".asInstanceOf[`invalid-cordova-configuration`]
    
    inline def INVALID_CUSTOM_TOKEN: `invalid-custom-token` = "invalid-custom-token".asInstanceOf[`invalid-custom-token`]
    
    inline def INVALID_DYNAMIC_LINK_DOMAIN: `invalid-dynamic-link-domain` = "invalid-dynamic-link-domain".asInstanceOf[`invalid-dynamic-link-domain`]
    
    inline def INVALID_EMAIL: `invalid-email` = "invalid-email".asInstanceOf[`invalid-email`]
    
    inline def INVALID_EMULATOR_SCHEME: `invalid-emulator-scheme` = "invalid-emulator-scheme".asInstanceOf[`invalid-emulator-scheme`]
    
    inline def INVALID_IDP_RESPONSE: `invalid-credential` = "invalid-credential".asInstanceOf[`invalid-credential`]
    
    inline def INVALID_MESSAGE_PAYLOAD: `invalid-message-payload` = "invalid-message-payload".asInstanceOf[`invalid-message-payload`]
    
    inline def INVALID_MFA_SESSION: `invalid-multi-factor-session` = "invalid-multi-factor-session".asInstanceOf[`invalid-multi-factor-session`]
    
    inline def INVALID_OAUTH_CLIENT_ID: `invalid-oauth-client-id` = "invalid-oauth-client-id".asInstanceOf[`invalid-oauth-client-id`]
    
    inline def INVALID_OAUTH_PROVIDER: `invalid-oauth-provider` = "invalid-oauth-provider".asInstanceOf[`invalid-oauth-provider`]
    
    inline def INVALID_OOB_CODE: `invalid-action-code` = "invalid-action-code".asInstanceOf[`invalid-action-code`]
    
    inline def INVALID_ORIGIN: `unauthorized-domain` = "unauthorized-domain".asInstanceOf[`unauthorized-domain`]
    
    inline def INVALID_PASSWORD: `wrong-password` = "wrong-password".asInstanceOf[`wrong-password`]
    
    inline def INVALID_PERSISTENCE: `invalid-persistence-type` = "invalid-persistence-type".asInstanceOf[`invalid-persistence-type`]
    
    inline def INVALID_PHONE_NUMBER: `invalid-phone-number` = "invalid-phone-number".asInstanceOf[`invalid-phone-number`]
    
    inline def INVALID_PROVIDER_ID: `invalid-provider-id` = "invalid-provider-id".asInstanceOf[`invalid-provider-id`]
    
    inline def INVALID_RECIPIENT_EMAIL: `invalid-recipient-email` = "invalid-recipient-email".asInstanceOf[`invalid-recipient-email`]
    
    inline def INVALID_SENDER: `invalid-sender` = "invalid-sender".asInstanceOf[`invalid-sender`]
    
    inline def INVALID_SESSION_INFO: `invalid-verification-id` = "invalid-verification-id".asInstanceOf[`invalid-verification-id`]
    
    inline def INVALID_TENANT_ID: `invalid-tenant-id` = "invalid-tenant-id".asInstanceOf[`invalid-tenant-id`]
    
    inline def LOGIN_BLOCKED: `login-blocked` = "login-blocked".asInstanceOf[`login-blocked`]
    
    inline def MFA_INFO_NOT_FOUND: `multi-factor-info-not-found` = "multi-factor-info-not-found".asInstanceOf[`multi-factor-info-not-found`]
    
    inline def MFA_REQUIRED: `multi-factor-auth-required` = "multi-factor-auth-required".asInstanceOf[`multi-factor-auth-required`]
    
    inline def MISSING_ANDROID_PACKAGE_NAME: `missing-android-pkg-name` = "missing-android-pkg-name".asInstanceOf[`missing-android-pkg-name`]
    
    inline def MISSING_APP_CREDENTIAL: `missing-app-credential` = "missing-app-credential".asInstanceOf[`missing-app-credential`]
    
    inline def MISSING_AUTH_DOMAIN: `auth-domain-config-required` = "auth-domain-config-required".asInstanceOf[`auth-domain-config-required`]
    
    inline def MISSING_CODE: `missing-verification-code` = "missing-verification-code".asInstanceOf[`missing-verification-code`]
    
    inline def MISSING_CONTINUE_URI: `missing-continue-uri` = "missing-continue-uri".asInstanceOf[`missing-continue-uri`]
    
    inline def MISSING_IFRAME_START: `missing-iframe-start` = "missing-iframe-start".asInstanceOf[`missing-iframe-start`]
    
    inline def MISSING_IOS_BUNDLE_ID: `missing-ios-bundle-id` = "missing-ios-bundle-id".asInstanceOf[`missing-ios-bundle-id`]
    
    inline def MISSING_MFA_INFO: `missing-multi-factor-info` = "missing-multi-factor-info".asInstanceOf[`missing-multi-factor-info`]
    
    inline def MISSING_MFA_SESSION: `missing-multi-factor-session` = "missing-multi-factor-session".asInstanceOf[`missing-multi-factor-session`]
    
    inline def MISSING_OR_INVALID_NONCE: `missing-or-invalid-nonce` = "missing-or-invalid-nonce".asInstanceOf[`missing-or-invalid-nonce`]
    
    inline def MISSING_PHONE_NUMBER: `missing-phone-number` = "missing-phone-number".asInstanceOf[`missing-phone-number`]
    
    inline def MISSING_SESSION_INFO: `missing-verification-id` = "missing-verification-id".asInstanceOf[`missing-verification-id`]
    
    inline def MODULE_DESTROYED: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
    
    inline def NEED_CONFIRMATION: `account-exists-with-different-credential` = "account-exists-with-different-credential".asInstanceOf[`account-exists-with-different-credential`]
    
    inline def NETWORK_REQUEST_FAILED: `network-request-failed` = "network-request-failed".asInstanceOf[`network-request-failed`]
    
    inline def NO_AUTH_EVENT: `no-auth-event` = "no-auth-event".asInstanceOf[`no-auth-event`]
    
    inline def NO_SUCH_PROVIDER: `no-such-provider` = "no-such-provider".asInstanceOf[`no-such-provider`]
    
    inline def NULL_USER: `null-user` = "null-user".asInstanceOf[`null-user`]
    
    inline def OPERATION_NOT_ALLOWED: `operation-not-allowed` = "operation-not-allowed".asInstanceOf[`operation-not-allowed`]
    
    inline def OPERATION_NOT_SUPPORTED: `operation-not-supported-in-this-environment` = "operation-not-supported-in-this-environment".asInstanceOf[`operation-not-supported-in-this-environment`]
    
    inline def POPUP_BLOCKED: `popup-blocked` = "popup-blocked".asInstanceOf[`popup-blocked`]
    
    inline def POPUP_CLOSED_BY_USER: `popup-closed-by-user` = "popup-closed-by-user".asInstanceOf[`popup-closed-by-user`]
    
    inline def PROVIDER_ALREADY_LINKED: `provider-already-linked` = "provider-already-linked".asInstanceOf[`provider-already-linked`]
    
    inline def QUOTA_EXCEEDED: `quota-exceeded` = "quota-exceeded".asInstanceOf[`quota-exceeded`]
    
    inline def REDIRECT_CANCELLED_BY_USER: `redirect-cancelled-by-user` = "redirect-cancelled-by-user".asInstanceOf[`redirect-cancelled-by-user`]
    
    inline def REDIRECT_OPERATION_PENDING: `redirect-operation-pending` = "redirect-operation-pending".asInstanceOf[`redirect-operation-pending`]
    
    inline def REJECTED_CREDENTIAL: `rejected-credential` = "rejected-credential".asInstanceOf[`rejected-credential`]
    
    inline def SECOND_FACTOR_ALREADY_ENROLLED: `second-factor-already-in-use` = "second-factor-already-in-use".asInstanceOf[`second-factor-already-in-use`]
    
    inline def SECOND_FACTOR_LIMIT_EXCEEDED: `maximum-second-factor-count-exceeded` = "maximum-second-factor-count-exceeded".asInstanceOf[`maximum-second-factor-count-exceeded`]
    
    inline def TENANT_ID_MISMATCH: `tenant-id-mismatch` = "tenant-id-mismatch".asInstanceOf[`tenant-id-mismatch`]
    
    inline def TIMEOUT: timeout = "timeout".asInstanceOf[timeout]
    
    inline def TOKEN_EXPIRED: `user-token-expired` = "user-token-expired".asInstanceOf[`user-token-expired`]
    
    inline def TOO_MANY_ATTEMPTS_TRY_LATER: `too-many-requests` = "too-many-requests".asInstanceOf[`too-many-requests`]
    
    inline def UNAUTHORIZED_DOMAIN: `unauthorized-continue-uri` = "unauthorized-continue-uri".asInstanceOf[`unauthorized-continue-uri`]
    
    inline def UNSUPPORTED_FIRST_FACTOR: `unsupported-first-factor` = "unsupported-first-factor".asInstanceOf[`unsupported-first-factor`]
    
    inline def UNSUPPORTED_PERSISTENCE: `unsupported-persistence-type` = "unsupported-persistence-type".asInstanceOf[`unsupported-persistence-type`]
    
    inline def UNSUPPORTED_TENANT_OPERATION: `unsupported-tenant-operation` = "unsupported-tenant-operation".asInstanceOf[`unsupported-tenant-operation`]
    
    inline def UNVERIFIED_EMAIL: `unverified-email` = "unverified-email".asInstanceOf[`unverified-email`]
    
    inline def USER_CANCELLED: `user-cancelled` = "user-cancelled".asInstanceOf[`user-cancelled`]
    
    inline def USER_DELETED: `user-not-found` = "user-not-found".asInstanceOf[`user-not-found`]
    
    inline def USER_DISABLED: `user-disabled` = "user-disabled".asInstanceOf[`user-disabled`]
    
    inline def USER_MISMATCH: `user-mismatch` = "user-mismatch".asInstanceOf[`user-mismatch`]
    
    inline def USER_SIGNED_OUT: `user-signed-out` = "user-signed-out".asInstanceOf[`user-signed-out`]
    
    inline def WEAK_PASSWORD: `weak-password` = "weak-password".asInstanceOf[`weak-password`]
    
    inline def WEB_STORAGE_UNSUPPORTED: `web-storage-unsupported` = "web-storage-unsupported".asInstanceOf[`web-storage-unsupported`]
  }
  
  @js.native
  trait AuthErrorParams
    extends StObject
       with GenericAuthErrorParams
  
  @js.native
  trait ErrorMapRetriever
    extends StObject
       with AuthErrorMap {
    
    def apply(): ErrorMapAuthErrorCode = js.native
  }
  
  /**
    * @internal
    */
  /* Inlined {[ key in std.Exclude<@firebase/auth.@firebase/auth/dist/cordova/src/core/errors.AuthErrorCode, @firebase/auth.@firebase/auth/dist/cordova/src/core/errors.AuthErrorCode.ARGUMENT_ERROR | @firebase/auth.@firebase/auth/dist/cordova/src/core/errors.AuthErrorCode.DEPENDENT_SDK_INIT_BEFORE_AUTH | @firebase/auth.@firebase/auth/dist/cordova/src/core/errors.AuthErrorCode.INTERNAL_ERROR | @firebase/auth.@firebase/auth/dist/cordova/src/core/errors.AuthErrorCode.MFA_REQUIRED | @firebase/auth.@firebase/auth/dist/cordova/src/core/errors.AuthErrorCode.NO_AUTH_EVENT | @firebase/auth.@firebase/auth/dist/cordova/src/core/errors.AuthErrorCode.OPERATION_NOT_SUPPORTED> ]: {  appName :@firebase/auth.@firebase/auth/dist/cordova/src/model/auth.AppName | undefined,   email :string | undefined,   phoneNumber :string | undefined,   message :string | undefined}} */
  trait GenericAuthErrorParams extends StObject {
    
    var `account-exists-with-different-credential`: AppNameEmail
    
    var `admin-restricted-operation`: AppNameEmail
    
    var `already-initialized`: AppNameEmail
    
    var `app-deleted`: AppNameEmail
    
    var `app-not-authorized`: AppNameEmail
    
    var `app-not-installed`: AppNameEmail
    
    var `auth-domain-config-required`: AppNameEmail
    
    var `cancelled-popup-request`: AppNameEmail
    
    var `captcha-check-failed`: AppNameEmail
    
    var `code-expired`: AppNameEmail
    
    var `cordova-not-ready`: AppNameEmail
    
    var `cors-unsupported`: AppNameEmail
    
    var `credential-already-in-use`: AppNameEmail
    
    var `custom-token-mismatch`: AppNameEmail
    
    var `dynamic-link-not-activated`: AppNameEmail
    
    var `email-already-in-use`: AppNameEmail
    
    var `email-change-needs-verification`: AppNameEmail
    
    var `emulator-config-failed`: AppNameEmail
    
    var `expired-action-code`: AppNameEmail
    
    var `invalid-action-code`: AppNameEmail
    
    var `invalid-api-key`: AppNameEmail
    
    var `invalid-app-credential`: AppNameEmail
    
    var `invalid-app-id`: AppNameEmail
    
    var `invalid-auth-event`: AppNameEmail
    
    var `invalid-cert-hash`: AppNameEmail
    
    var `invalid-continue-uri`: AppNameEmail
    
    var `invalid-cordova-configuration`: AppNameEmail
    
    var `invalid-credential`: AppNameEmail
    
    var `invalid-custom-token`: AppNameEmail
    
    var `invalid-dynamic-link-domain`: AppNameEmail
    
    var `invalid-email`: AppNameEmail
    
    var `invalid-emulator-scheme`: AppNameEmail
    
    var `invalid-message-payload`: AppNameEmail
    
    var `invalid-multi-factor-session`: AppNameEmail
    
    var `invalid-oauth-client-id`: AppNameEmail
    
    var `invalid-oauth-provider`: AppNameEmail
    
    var `invalid-persistence-type`: AppNameEmail
    
    var `invalid-phone-number`: AppNameEmail
    
    var `invalid-provider-id`: AppNameEmail
    
    var `invalid-recipient-email`: AppNameEmail
    
    var `invalid-sender`: AppNameEmail
    
    var `invalid-tenant-id`: AppNameEmail
    
    var `invalid-user-token`: AppNameEmail
    
    var `invalid-verification-code`: AppNameEmail
    
    var `invalid-verification-id`: AppNameEmail
    
    var `login-blocked`: AppNameEmail
    
    var `maximum-second-factor-count-exceeded`: AppNameEmail
    
    var `missing-android-pkg-name`: AppNameEmail
    
    var `missing-app-credential`: AppNameEmail
    
    var `missing-continue-uri`: AppNameEmail
    
    var `missing-iframe-start`: AppNameEmail
    
    var `missing-ios-bundle-id`: AppNameEmail
    
    var `missing-multi-factor-info`: AppNameEmail
    
    var `missing-multi-factor-session`: AppNameEmail
    
    var `missing-or-invalid-nonce`: AppNameEmail
    
    var `missing-phone-number`: AppNameEmail
    
    var `missing-verification-code`: AppNameEmail
    
    var `missing-verification-id`: AppNameEmail
    
    var `multi-factor-info-not-found`: AppNameEmail
    
    var `network-request-failed`: AppNameEmail
    
    var `no-such-provider`: AppNameEmail
    
    var `null-user`: AppNameEmail
    
    var `operation-not-allowed`: AppNameEmail
    
    var `popup-blocked`: AppNameEmail
    
    var `popup-closed-by-user`: AppNameEmail
    
    var `provider-already-linked`: AppNameEmail
    
    var `quota-exceeded`: AppNameEmail
    
    var `redirect-cancelled-by-user`: AppNameEmail
    
    var `redirect-operation-pending`: AppNameEmail
    
    var `rejected-credential`: AppNameEmail
    
    var `requires-recent-login`: AppNameEmail
    
    var `second-factor-already-in-use`: AppNameEmail
    
    var `tenant-id-mismatch`: AppNameEmail
    
    var timeout: AppNameEmail
    
    var `too-many-requests`: AppNameEmail
    
    var `unauthorized-continue-uri`: AppNameEmail
    
    var `unauthorized-domain`: AppNameEmail
    
    var `unsupported-first-factor`: AppNameEmail
    
    var `unsupported-persistence-type`: AppNameEmail
    
    var `unsupported-tenant-operation`: AppNameEmail
    
    var `unverified-email`: AppNameEmail
    
    var `user-cancelled`: AppNameEmail
    
    var `user-disabled`: AppNameEmail
    
    var `user-mismatch`: AppNameEmail
    
    var `user-not-found`: AppNameEmail
    
    var `user-signed-out`: AppNameEmail
    
    var `user-token-expired`: AppNameEmail
    
    var `weak-password`: AppNameEmail
    
    var `web-storage-unsupported`: AppNameEmail
    
    var `wrong-password`: AppNameEmail
  }
  object GenericAuthErrorParams {
    
    inline def apply(
      `account-exists-with-different-credential`: AppNameEmail,
      `admin-restricted-operation`: AppNameEmail,
      `already-initialized`: AppNameEmail,
      `app-deleted`: AppNameEmail,
      `app-not-authorized`: AppNameEmail,
      `app-not-installed`: AppNameEmail,
      `auth-domain-config-required`: AppNameEmail,
      `cancelled-popup-request`: AppNameEmail,
      `captcha-check-failed`: AppNameEmail,
      `code-expired`: AppNameEmail,
      `cordova-not-ready`: AppNameEmail,
      `cors-unsupported`: AppNameEmail,
      `credential-already-in-use`: AppNameEmail,
      `custom-token-mismatch`: AppNameEmail,
      `dynamic-link-not-activated`: AppNameEmail,
      `email-already-in-use`: AppNameEmail,
      `email-change-needs-verification`: AppNameEmail,
      `emulator-config-failed`: AppNameEmail,
      `expired-action-code`: AppNameEmail,
      `invalid-action-code`: AppNameEmail,
      `invalid-api-key`: AppNameEmail,
      `invalid-app-credential`: AppNameEmail,
      `invalid-app-id`: AppNameEmail,
      `invalid-auth-event`: AppNameEmail,
      `invalid-cert-hash`: AppNameEmail,
      `invalid-continue-uri`: AppNameEmail,
      `invalid-cordova-configuration`: AppNameEmail,
      `invalid-credential`: AppNameEmail,
      `invalid-custom-token`: AppNameEmail,
      `invalid-dynamic-link-domain`: AppNameEmail,
      `invalid-email`: AppNameEmail,
      `invalid-emulator-scheme`: AppNameEmail,
      `invalid-message-payload`: AppNameEmail,
      `invalid-multi-factor-session`: AppNameEmail,
      `invalid-oauth-client-id`: AppNameEmail,
      `invalid-oauth-provider`: AppNameEmail,
      `invalid-persistence-type`: AppNameEmail,
      `invalid-phone-number`: AppNameEmail,
      `invalid-provider-id`: AppNameEmail,
      `invalid-recipient-email`: AppNameEmail,
      `invalid-sender`: AppNameEmail,
      `invalid-tenant-id`: AppNameEmail,
      `invalid-user-token`: AppNameEmail,
      `invalid-verification-code`: AppNameEmail,
      `invalid-verification-id`: AppNameEmail,
      `login-blocked`: AppNameEmail,
      `maximum-second-factor-count-exceeded`: AppNameEmail,
      `missing-android-pkg-name`: AppNameEmail,
      `missing-app-credential`: AppNameEmail,
      `missing-continue-uri`: AppNameEmail,
      `missing-iframe-start`: AppNameEmail,
      `missing-ios-bundle-id`: AppNameEmail,
      `missing-multi-factor-info`: AppNameEmail,
      `missing-multi-factor-session`: AppNameEmail,
      `missing-or-invalid-nonce`: AppNameEmail,
      `missing-phone-number`: AppNameEmail,
      `missing-verification-code`: AppNameEmail,
      `missing-verification-id`: AppNameEmail,
      `multi-factor-info-not-found`: AppNameEmail,
      `network-request-failed`: AppNameEmail,
      `no-such-provider`: AppNameEmail,
      `null-user`: AppNameEmail,
      `operation-not-allowed`: AppNameEmail,
      `popup-blocked`: AppNameEmail,
      `popup-closed-by-user`: AppNameEmail,
      `provider-already-linked`: AppNameEmail,
      `quota-exceeded`: AppNameEmail,
      `redirect-cancelled-by-user`: AppNameEmail,
      `redirect-operation-pending`: AppNameEmail,
      `rejected-credential`: AppNameEmail,
      `requires-recent-login`: AppNameEmail,
      `second-factor-already-in-use`: AppNameEmail,
      `tenant-id-mismatch`: AppNameEmail,
      timeout: AppNameEmail,
      `too-many-requests`: AppNameEmail,
      `unauthorized-continue-uri`: AppNameEmail,
      `unauthorized-domain`: AppNameEmail,
      `unsupported-first-factor`: AppNameEmail,
      `unsupported-persistence-type`: AppNameEmail,
      `unsupported-tenant-operation`: AppNameEmail,
      `unverified-email`: AppNameEmail,
      `user-cancelled`: AppNameEmail,
      `user-disabled`: AppNameEmail,
      `user-mismatch`: AppNameEmail,
      `user-not-found`: AppNameEmail,
      `user-signed-out`: AppNameEmail,
      `user-token-expired`: AppNameEmail,
      `weak-password`: AppNameEmail,
      `web-storage-unsupported`: AppNameEmail,
      `wrong-password`: AppNameEmail
    ): GenericAuthErrorParams = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.updateDynamic("account-exists-with-different-credential")(`account-exists-with-different-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("admin-restricted-operation")(`admin-restricted-operation`.asInstanceOf[js.Any])
      __obj.updateDynamic("already-initialized")(`already-initialized`.asInstanceOf[js.Any])
      __obj.updateDynamic("app-deleted")(`app-deleted`.asInstanceOf[js.Any])
      __obj.updateDynamic("app-not-authorized")(`app-not-authorized`.asInstanceOf[js.Any])
      __obj.updateDynamic("app-not-installed")(`app-not-installed`.asInstanceOf[js.Any])
      __obj.updateDynamic("auth-domain-config-required")(`auth-domain-config-required`.asInstanceOf[js.Any])
      __obj.updateDynamic("cancelled-popup-request")(`cancelled-popup-request`.asInstanceOf[js.Any])
      __obj.updateDynamic("captcha-check-failed")(`captcha-check-failed`.asInstanceOf[js.Any])
      __obj.updateDynamic("code-expired")(`code-expired`.asInstanceOf[js.Any])
      __obj.updateDynamic("cordova-not-ready")(`cordova-not-ready`.asInstanceOf[js.Any])
      __obj.updateDynamic("cors-unsupported")(`cors-unsupported`.asInstanceOf[js.Any])
      __obj.updateDynamic("credential-already-in-use")(`credential-already-in-use`.asInstanceOf[js.Any])
      __obj.updateDynamic("custom-token-mismatch")(`custom-token-mismatch`.asInstanceOf[js.Any])
      __obj.updateDynamic("dynamic-link-not-activated")(`dynamic-link-not-activated`.asInstanceOf[js.Any])
      __obj.updateDynamic("email-already-in-use")(`email-already-in-use`.asInstanceOf[js.Any])
      __obj.updateDynamic("email-change-needs-verification")(`email-change-needs-verification`.asInstanceOf[js.Any])
      __obj.updateDynamic("emulator-config-failed")(`emulator-config-failed`.asInstanceOf[js.Any])
      __obj.updateDynamic("expired-action-code")(`expired-action-code`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-action-code")(`invalid-action-code`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-api-key")(`invalid-api-key`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-app-credential")(`invalid-app-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-app-id")(`invalid-app-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-auth-event")(`invalid-auth-event`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-cert-hash")(`invalid-cert-hash`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-continue-uri")(`invalid-continue-uri`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-cordova-configuration")(`invalid-cordova-configuration`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-credential")(`invalid-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-custom-token")(`invalid-custom-token`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-dynamic-link-domain")(`invalid-dynamic-link-domain`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-email")(`invalid-email`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-emulator-scheme")(`invalid-emulator-scheme`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-message-payload")(`invalid-message-payload`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-multi-factor-session")(`invalid-multi-factor-session`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-oauth-client-id")(`invalid-oauth-client-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-oauth-provider")(`invalid-oauth-provider`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-persistence-type")(`invalid-persistence-type`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-phone-number")(`invalid-phone-number`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-provider-id")(`invalid-provider-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-recipient-email")(`invalid-recipient-email`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-sender")(`invalid-sender`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-tenant-id")(`invalid-tenant-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-user-token")(`invalid-user-token`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-verification-code")(`invalid-verification-code`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-verification-id")(`invalid-verification-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("login-blocked")(`login-blocked`.asInstanceOf[js.Any])
      __obj.updateDynamic("maximum-second-factor-count-exceeded")(`maximum-second-factor-count-exceeded`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-android-pkg-name")(`missing-android-pkg-name`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-app-credential")(`missing-app-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-continue-uri")(`missing-continue-uri`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-iframe-start")(`missing-iframe-start`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-ios-bundle-id")(`missing-ios-bundle-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-multi-factor-info")(`missing-multi-factor-info`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-multi-factor-session")(`missing-multi-factor-session`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-or-invalid-nonce")(`missing-or-invalid-nonce`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-phone-number")(`missing-phone-number`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-verification-code")(`missing-verification-code`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-verification-id")(`missing-verification-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("multi-factor-info-not-found")(`multi-factor-info-not-found`.asInstanceOf[js.Any])
      __obj.updateDynamic("network-request-failed")(`network-request-failed`.asInstanceOf[js.Any])
      __obj.updateDynamic("no-such-provider")(`no-such-provider`.asInstanceOf[js.Any])
      __obj.updateDynamic("null-user")(`null-user`.asInstanceOf[js.Any])
      __obj.updateDynamic("operation-not-allowed")(`operation-not-allowed`.asInstanceOf[js.Any])
      __obj.updateDynamic("popup-blocked")(`popup-blocked`.asInstanceOf[js.Any])
      __obj.updateDynamic("popup-closed-by-user")(`popup-closed-by-user`.asInstanceOf[js.Any])
      __obj.updateDynamic("provider-already-linked")(`provider-already-linked`.asInstanceOf[js.Any])
      __obj.updateDynamic("quota-exceeded")(`quota-exceeded`.asInstanceOf[js.Any])
      __obj.updateDynamic("redirect-cancelled-by-user")(`redirect-cancelled-by-user`.asInstanceOf[js.Any])
      __obj.updateDynamic("redirect-operation-pending")(`redirect-operation-pending`.asInstanceOf[js.Any])
      __obj.updateDynamic("rejected-credential")(`rejected-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("requires-recent-login")(`requires-recent-login`.asInstanceOf[js.Any])
      __obj.updateDynamic("second-factor-already-in-use")(`second-factor-already-in-use`.asInstanceOf[js.Any])
      __obj.updateDynamic("tenant-id-mismatch")(`tenant-id-mismatch`.asInstanceOf[js.Any])
      __obj.updateDynamic("too-many-requests")(`too-many-requests`.asInstanceOf[js.Any])
      __obj.updateDynamic("unauthorized-continue-uri")(`unauthorized-continue-uri`.asInstanceOf[js.Any])
      __obj.updateDynamic("unauthorized-domain")(`unauthorized-domain`.asInstanceOf[js.Any])
      __obj.updateDynamic("unsupported-first-factor")(`unsupported-first-factor`.asInstanceOf[js.Any])
      __obj.updateDynamic("unsupported-persistence-type")(`unsupported-persistence-type`.asInstanceOf[js.Any])
      __obj.updateDynamic("unsupported-tenant-operation")(`unsupported-tenant-operation`.asInstanceOf[js.Any])
      __obj.updateDynamic("unverified-email")(`unverified-email`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-cancelled")(`user-cancelled`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-disabled")(`user-disabled`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-mismatch")(`user-mismatch`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-not-found")(`user-not-found`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-signed-out")(`user-signed-out`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-token-expired")(`user-token-expired`.asInstanceOf[js.Any])
      __obj.updateDynamic("weak-password")(`weak-password`.asInstanceOf[js.Any])
      __obj.updateDynamic("web-storage-unsupported")(`web-storage-unsupported`.asInstanceOf[js.Any])
      __obj.updateDynamic("wrong-password")(`wrong-password`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericAuthErrorParams]
    }
    
    extension [Self <: GenericAuthErrorParams](x: Self) {
      
      inline def `setAccount-exists-with-different-credential`(value: AppNameEmail): Self = StObject.set(x, "account-exists-with-different-credential", value.asInstanceOf[js.Any])
      
      inline def `setAdmin-restricted-operation`(value: AppNameEmail): Self = StObject.set(x, "admin-restricted-operation", value.asInstanceOf[js.Any])
      
      inline def `setAlready-initialized`(value: AppNameEmail): Self = StObject.set(x, "already-initialized", value.asInstanceOf[js.Any])
      
      inline def `setApp-deleted`(value: AppNameEmail): Self = StObject.set(x, "app-deleted", value.asInstanceOf[js.Any])
      
      inline def `setApp-not-authorized`(value: AppNameEmail): Self = StObject.set(x, "app-not-authorized", value.asInstanceOf[js.Any])
      
      inline def `setApp-not-installed`(value: AppNameEmail): Self = StObject.set(x, "app-not-installed", value.asInstanceOf[js.Any])
      
      inline def `setAuth-domain-config-required`(value: AppNameEmail): Self = StObject.set(x, "auth-domain-config-required", value.asInstanceOf[js.Any])
      
      inline def `setCancelled-popup-request`(value: AppNameEmail): Self = StObject.set(x, "cancelled-popup-request", value.asInstanceOf[js.Any])
      
      inline def `setCaptcha-check-failed`(value: AppNameEmail): Self = StObject.set(x, "captcha-check-failed", value.asInstanceOf[js.Any])
      
      inline def `setCode-expired`(value: AppNameEmail): Self = StObject.set(x, "code-expired", value.asInstanceOf[js.Any])
      
      inline def `setCordova-not-ready`(value: AppNameEmail): Self = StObject.set(x, "cordova-not-ready", value.asInstanceOf[js.Any])
      
      inline def `setCors-unsupported`(value: AppNameEmail): Self = StObject.set(x, "cors-unsupported", value.asInstanceOf[js.Any])
      
      inline def `setCredential-already-in-use`(value: AppNameEmail): Self = StObject.set(x, "credential-already-in-use", value.asInstanceOf[js.Any])
      
      inline def `setCustom-token-mismatch`(value: AppNameEmail): Self = StObject.set(x, "custom-token-mismatch", value.asInstanceOf[js.Any])
      
      inline def `setDynamic-link-not-activated`(value: AppNameEmail): Self = StObject.set(x, "dynamic-link-not-activated", value.asInstanceOf[js.Any])
      
      inline def `setEmail-already-in-use`(value: AppNameEmail): Self = StObject.set(x, "email-already-in-use", value.asInstanceOf[js.Any])
      
      inline def `setEmail-change-needs-verification`(value: AppNameEmail): Self = StObject.set(x, "email-change-needs-verification", value.asInstanceOf[js.Any])
      
      inline def `setEmulator-config-failed`(value: AppNameEmail): Self = StObject.set(x, "emulator-config-failed", value.asInstanceOf[js.Any])
      
      inline def `setExpired-action-code`(value: AppNameEmail): Self = StObject.set(x, "expired-action-code", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-action-code`(value: AppNameEmail): Self = StObject.set(x, "invalid-action-code", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-api-key`(value: AppNameEmail): Self = StObject.set(x, "invalid-api-key", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-app-credential`(value: AppNameEmail): Self = StObject.set(x, "invalid-app-credential", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-app-id`(value: AppNameEmail): Self = StObject.set(x, "invalid-app-id", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-auth-event`(value: AppNameEmail): Self = StObject.set(x, "invalid-auth-event", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-cert-hash`(value: AppNameEmail): Self = StObject.set(x, "invalid-cert-hash", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-continue-uri`(value: AppNameEmail): Self = StObject.set(x, "invalid-continue-uri", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-cordova-configuration`(value: AppNameEmail): Self = StObject.set(x, "invalid-cordova-configuration", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-credential`(value: AppNameEmail): Self = StObject.set(x, "invalid-credential", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-custom-token`(value: AppNameEmail): Self = StObject.set(x, "invalid-custom-token", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-dynamic-link-domain`(value: AppNameEmail): Self = StObject.set(x, "invalid-dynamic-link-domain", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-email`(value: AppNameEmail): Self = StObject.set(x, "invalid-email", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-emulator-scheme`(value: AppNameEmail): Self = StObject.set(x, "invalid-emulator-scheme", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-message-payload`(value: AppNameEmail): Self = StObject.set(x, "invalid-message-payload", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-multi-factor-session`(value: AppNameEmail): Self = StObject.set(x, "invalid-multi-factor-session", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-oauth-client-id`(value: AppNameEmail): Self = StObject.set(x, "invalid-oauth-client-id", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-oauth-provider`(value: AppNameEmail): Self = StObject.set(x, "invalid-oauth-provider", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-persistence-type`(value: AppNameEmail): Self = StObject.set(x, "invalid-persistence-type", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-phone-number`(value: AppNameEmail): Self = StObject.set(x, "invalid-phone-number", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-provider-id`(value: AppNameEmail): Self = StObject.set(x, "invalid-provider-id", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-recipient-email`(value: AppNameEmail): Self = StObject.set(x, "invalid-recipient-email", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-sender`(value: AppNameEmail): Self = StObject.set(x, "invalid-sender", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-tenant-id`(value: AppNameEmail): Self = StObject.set(x, "invalid-tenant-id", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-user-token`(value: AppNameEmail): Self = StObject.set(x, "invalid-user-token", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-verification-code`(value: AppNameEmail): Self = StObject.set(x, "invalid-verification-code", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-verification-id`(value: AppNameEmail): Self = StObject.set(x, "invalid-verification-id", value.asInstanceOf[js.Any])
      
      inline def `setLogin-blocked`(value: AppNameEmail): Self = StObject.set(x, "login-blocked", value.asInstanceOf[js.Any])
      
      inline def `setMaximum-second-factor-count-exceeded`(value: AppNameEmail): Self = StObject.set(x, "maximum-second-factor-count-exceeded", value.asInstanceOf[js.Any])
      
      inline def `setMissing-android-pkg-name`(value: AppNameEmail): Self = StObject.set(x, "missing-android-pkg-name", value.asInstanceOf[js.Any])
      
      inline def `setMissing-app-credential`(value: AppNameEmail): Self = StObject.set(x, "missing-app-credential", value.asInstanceOf[js.Any])
      
      inline def `setMissing-continue-uri`(value: AppNameEmail): Self = StObject.set(x, "missing-continue-uri", value.asInstanceOf[js.Any])
      
      inline def `setMissing-iframe-start`(value: AppNameEmail): Self = StObject.set(x, "missing-iframe-start", value.asInstanceOf[js.Any])
      
      inline def `setMissing-ios-bundle-id`(value: AppNameEmail): Self = StObject.set(x, "missing-ios-bundle-id", value.asInstanceOf[js.Any])
      
      inline def `setMissing-multi-factor-info`(value: AppNameEmail): Self = StObject.set(x, "missing-multi-factor-info", value.asInstanceOf[js.Any])
      
      inline def `setMissing-multi-factor-session`(value: AppNameEmail): Self = StObject.set(x, "missing-multi-factor-session", value.asInstanceOf[js.Any])
      
      inline def `setMissing-or-invalid-nonce`(value: AppNameEmail): Self = StObject.set(x, "missing-or-invalid-nonce", value.asInstanceOf[js.Any])
      
      inline def `setMissing-phone-number`(value: AppNameEmail): Self = StObject.set(x, "missing-phone-number", value.asInstanceOf[js.Any])
      
      inline def `setMissing-verification-code`(value: AppNameEmail): Self = StObject.set(x, "missing-verification-code", value.asInstanceOf[js.Any])
      
      inline def `setMissing-verification-id`(value: AppNameEmail): Self = StObject.set(x, "missing-verification-id", value.asInstanceOf[js.Any])
      
      inline def `setMulti-factor-info-not-found`(value: AppNameEmail): Self = StObject.set(x, "multi-factor-info-not-found", value.asInstanceOf[js.Any])
      
      inline def `setNetwork-request-failed`(value: AppNameEmail): Self = StObject.set(x, "network-request-failed", value.asInstanceOf[js.Any])
      
      inline def `setNo-such-provider`(value: AppNameEmail): Self = StObject.set(x, "no-such-provider", value.asInstanceOf[js.Any])
      
      inline def `setNull-user`(value: AppNameEmail): Self = StObject.set(x, "null-user", value.asInstanceOf[js.Any])
      
      inline def `setOperation-not-allowed`(value: AppNameEmail): Self = StObject.set(x, "operation-not-allowed", value.asInstanceOf[js.Any])
      
      inline def `setPopup-blocked`(value: AppNameEmail): Self = StObject.set(x, "popup-blocked", value.asInstanceOf[js.Any])
      
      inline def `setPopup-closed-by-user`(value: AppNameEmail): Self = StObject.set(x, "popup-closed-by-user", value.asInstanceOf[js.Any])
      
      inline def `setProvider-already-linked`(value: AppNameEmail): Self = StObject.set(x, "provider-already-linked", value.asInstanceOf[js.Any])
      
      inline def `setQuota-exceeded`(value: AppNameEmail): Self = StObject.set(x, "quota-exceeded", value.asInstanceOf[js.Any])
      
      inline def `setRedirect-cancelled-by-user`(value: AppNameEmail): Self = StObject.set(x, "redirect-cancelled-by-user", value.asInstanceOf[js.Any])
      
      inline def `setRedirect-operation-pending`(value: AppNameEmail): Self = StObject.set(x, "redirect-operation-pending", value.asInstanceOf[js.Any])
      
      inline def `setRejected-credential`(value: AppNameEmail): Self = StObject.set(x, "rejected-credential", value.asInstanceOf[js.Any])
      
      inline def `setRequires-recent-login`(value: AppNameEmail): Self = StObject.set(x, "requires-recent-login", value.asInstanceOf[js.Any])
      
      inline def `setSecond-factor-already-in-use`(value: AppNameEmail): Self = StObject.set(x, "second-factor-already-in-use", value.asInstanceOf[js.Any])
      
      inline def `setTenant-id-mismatch`(value: AppNameEmail): Self = StObject.set(x, "tenant-id-mismatch", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: AppNameEmail): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def `setToo-many-requests`(value: AppNameEmail): Self = StObject.set(x, "too-many-requests", value.asInstanceOf[js.Any])
      
      inline def `setUnauthorized-continue-uri`(value: AppNameEmail): Self = StObject.set(x, "unauthorized-continue-uri", value.asInstanceOf[js.Any])
      
      inline def `setUnauthorized-domain`(value: AppNameEmail): Self = StObject.set(x, "unauthorized-domain", value.asInstanceOf[js.Any])
      
      inline def `setUnsupported-first-factor`(value: AppNameEmail): Self = StObject.set(x, "unsupported-first-factor", value.asInstanceOf[js.Any])
      
      inline def `setUnsupported-persistence-type`(value: AppNameEmail): Self = StObject.set(x, "unsupported-persistence-type", value.asInstanceOf[js.Any])
      
      inline def `setUnsupported-tenant-operation`(value: AppNameEmail): Self = StObject.set(x, "unsupported-tenant-operation", value.asInstanceOf[js.Any])
      
      inline def `setUnverified-email`(value: AppNameEmail): Self = StObject.set(x, "unverified-email", value.asInstanceOf[js.Any])
      
      inline def `setUser-cancelled`(value: AppNameEmail): Self = StObject.set(x, "user-cancelled", value.asInstanceOf[js.Any])
      
      inline def `setUser-disabled`(value: AppNameEmail): Self = StObject.set(x, "user-disabled", value.asInstanceOf[js.Any])
      
      inline def `setUser-mismatch`(value: AppNameEmail): Self = StObject.set(x, "user-mismatch", value.asInstanceOf[js.Any])
      
      inline def `setUser-not-found`(value: AppNameEmail): Self = StObject.set(x, "user-not-found", value.asInstanceOf[js.Any])
      
      inline def `setUser-signed-out`(value: AppNameEmail): Self = StObject.set(x, "user-signed-out", value.asInstanceOf[js.Any])
      
      inline def `setUser-token-expired`(value: AppNameEmail): Self = StObject.set(x, "user-token-expired", value.asInstanceOf[js.Any])
      
      inline def `setWeak-password`(value: AppNameEmail): Self = StObject.set(x, "weak-password", value.asInstanceOf[js.Any])
      
      inline def `setWeb-storage-unsupported`(value: AppNameEmail): Self = StObject.set(x, "web-storage-unsupported", value.asInstanceOf[js.Any])
      
      inline def `setWrong-password`(value: AppNameEmail): Self = StObject.set(x, "wrong-password", value.asInstanceOf[js.Any])
    }
  }
  
  trait NamedErrorParams extends StObject {
    
    var _serverResponse: js.UndefOr[js.Object] = js.undefined
    
    var appName: AppName
    
    var credential: js.UndefOr[AuthCredential] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[User] = js.undefined
  }
  object NamedErrorParams {
    
    inline def apply(appName: AppName): NamedErrorParams = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedErrorParams]
    }
    
    extension [Self <: NamedErrorParams](x: Self) {
      
      inline def setAppName(value: AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setCredential(value: AuthCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def set_serverResponse(value: js.Object): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
      
      inline def set_serverResponseUndefined: Self = StObject.set(x, "_serverResponse", js.undefined)
    }
  }
}
