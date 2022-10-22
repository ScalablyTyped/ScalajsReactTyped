package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`failed-service-worker-registration`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`indexed-db-unsupported`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`invalid-bg-handler`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`invalid-sw-registration`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`invalid-vapid-key`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`missing-app-config-values`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`only-available-in-sw`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`only-available-in-window`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`permission-blocked`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`permission-default`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-failed`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-no-token`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-unsubscribe-failed`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-update-failed`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-update-no-token`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`unsupported-browser`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`use-sw-after-get-token`
import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`use-vapid-key-after-get-token`
import typingsJapgolly.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilErrorsMod {
  
  @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[ErrorCode, ErrorParams] = js.native
  
  /* Inlined @firebase/util.@firebase/util.ErrorMap<@firebase/messaging.@firebase/messaging/dist/src/util/errors.ErrorCode> */
  object ERROR_MAP {
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.failed-service-worker-registration")
    @js.native
    val failedServiceWorkerRegistration: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.indexed-db-unsupported")
    @js.native
    val indexedDbUnsupported: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.invalid-bg-handler")
    @js.native
    val invalidBgHandler: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.invalid-sw-registration")
    @js.native
    val invalidSwRegistration: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.invalid-vapid-key")
    @js.native
    val invalidVapidKey: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.missing-app-config-values")
    @js.native
    val missingAppConfigValues: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.only-available-in-sw")
    @js.native
    val onlyAvailableInSw: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.only-available-in-window")
    @js.native
    val onlyAvailableInWindow: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.permission-blocked")
    @js.native
    val permissionBlocked: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.permission-default")
    @js.native
    val permissionDefault: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.token-subscribe-failed")
    @js.native
    val tokenSubscribeFailed: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.token-subscribe-no-token")
    @js.native
    val tokenSubscribeNoToken: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.token-unsubscribe-failed")
    @js.native
    val tokenUnsubscribeFailed: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.token-update-failed")
    @js.native
    val tokenUpdateFailed: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.token-update-no-token")
    @js.native
    val tokenUpdateNoToken: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.unsupported-browser")
    @js.native
    val unsupportedBrowser: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.use-sw-after-get-token")
    @js.native
    val useSwAfterGetToken: String = js.native
    
    @JSImport("@firebase/messaging/dist/src/util/errors", "ERROR_MAP.use-vapid-key-after-get-token")
    @js.native
    val useVapidKeyAfterGetToken: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`missing-app-config-values`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`only-available-in-window`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`only-available-in-sw`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`permission-default`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`permission-blocked`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`unsupported-browser`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`indexed-db-unsupported`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`failed-service-worker-registration`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-failed`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-no-token`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-unsubscribe-failed`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-update-failed`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`token-update-no-token`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`invalid-bg-handler`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`use-sw-after-get-token`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`invalid-sw-registration`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`use-vapid-key-after-get-token`
    - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`invalid-vapid-key`
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def AVAILABLE_IN_SW: `only-available-in-sw` = "only-available-in-sw".asInstanceOf[`only-available-in-sw`]
    
    inline def AVAILABLE_IN_WINDOW: `only-available-in-window` = "only-available-in-window".asInstanceOf[`only-available-in-window`]
    
    inline def FAILED_DEFAULT_REGISTRATION: `failed-service-worker-registration` = "failed-service-worker-registration".asInstanceOf[`failed-service-worker-registration`]
    
    inline def INDEXED_DB_UNSUPPORTED: `indexed-db-unsupported` = "indexed-db-unsupported".asInstanceOf[`indexed-db-unsupported`]
    
    inline def INVALID_BG_HANDLER: `invalid-bg-handler` = "invalid-bg-handler".asInstanceOf[`invalid-bg-handler`]
    
    inline def INVALID_SW_REGISTRATION: `invalid-sw-registration` = "invalid-sw-registration".asInstanceOf[`invalid-sw-registration`]
    
    inline def INVALID_VAPID_KEY: `invalid-vapid-key` = "invalid-vapid-key".asInstanceOf[`invalid-vapid-key`]
    
    inline def MISSING_APP_CONFIG_VALUES: `missing-app-config-values` = "missing-app-config-values".asInstanceOf[`missing-app-config-values`]
    
    inline def PERMISSION_BLOCKED: `permission-blocked` = "permission-blocked".asInstanceOf[`permission-blocked`]
    
    inline def PERMISSION_DEFAULT: `permission-default` = "permission-default".asInstanceOf[`permission-default`]
    
    inline def TOKEN_SUBSCRIBE_FAILED: `token-subscribe-failed` = "token-subscribe-failed".asInstanceOf[`token-subscribe-failed`]
    
    inline def TOKEN_SUBSCRIBE_NO_TOKEN: `token-subscribe-no-token` = "token-subscribe-no-token".asInstanceOf[`token-subscribe-no-token`]
    
    inline def TOKEN_UNSUBSCRIBE_FAILED: `token-unsubscribe-failed` = "token-unsubscribe-failed".asInstanceOf[`token-unsubscribe-failed`]
    
    inline def TOKEN_UPDATE_FAILED: `token-update-failed` = "token-update-failed".asInstanceOf[`token-update-failed`]
    
    inline def TOKEN_UPDATE_NO_TOKEN: `token-update-no-token` = "token-update-no-token".asInstanceOf[`token-update-no-token`]
    
    inline def UNSUPPORTED_BROWSER: `unsupported-browser` = "unsupported-browser".asInstanceOf[`unsupported-browser`]
    
    inline def USE_SW_AFTER_GET_TOKEN: `use-sw-after-get-token` = "use-sw-after-get-token".asInstanceOf[`use-sw-after-get-token`]
    
    inline def USE_VAPID_KEY_AFTER_GET_TOKEN: `use-vapid-key-after-get-token` = "use-vapid-key-after-get-token".asInstanceOf[`use-vapid-key-after-get-token`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
