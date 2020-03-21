package typingsJapgolly.firebaseMessaging.errorsMod

import typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`failed-service-worker-registration`
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`missing-app-config-values`
  - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`only-available-in-window`
  - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`only-available-in-sw`
  - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`permission-default`
  - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`permission-blocked`
  - typingsJapgolly.firebaseMessaging.firebaseMessagingStrings.`unsupported-browser`
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
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def AVAILABLE_IN_SW: `only-available-in-sw` = this.cast("only-available-in-sw")
  @scala.inline
  def AVAILABLE_IN_WINDOW: `only-available-in-window` = this.cast("only-available-in-window")
  @scala.inline
  def FAILED_DEFAULT_REGISTRATION: `failed-service-worker-registration` = this.cast("failed-service-worker-registration")
  @scala.inline
  def INVALID_BG_HANDLER: `invalid-bg-handler` = this.cast("invalid-bg-handler")
  @scala.inline
  def INVALID_SW_REGISTRATION: `invalid-sw-registration` = this.cast("invalid-sw-registration")
  @scala.inline
  def INVALID_VAPID_KEY: `invalid-vapid-key` = this.cast("invalid-vapid-key")
  @scala.inline
  def MISSING_APP_CONFIG_VALUES: `missing-app-config-values` = this.cast("missing-app-config-values")
  @scala.inline
  def PERMISSION_BLOCKED: `permission-blocked` = this.cast("permission-blocked")
  @scala.inline
  def PERMISSION_DEFAULT: `permission-default` = this.cast("permission-default")
  @scala.inline
  def TOKEN_SUBSCRIBE_FAILED: `token-subscribe-failed` = this.cast("token-subscribe-failed")
  @scala.inline
  def TOKEN_SUBSCRIBE_NO_TOKEN: `token-subscribe-no-token` = this.cast("token-subscribe-no-token")
  @scala.inline
  def TOKEN_UNSUBSCRIBE_FAILED: `token-unsubscribe-failed` = this.cast("token-unsubscribe-failed")
  @scala.inline
  def TOKEN_UPDATE_FAILED: `token-update-failed` = this.cast("token-update-failed")
  @scala.inline
  def TOKEN_UPDATE_NO_TOKEN: `token-update-no-token` = this.cast("token-update-no-token")
  @scala.inline
  def UNSUPPORTED_BROWSER: `unsupported-browser` = this.cast("unsupported-browser")
  @scala.inline
  def USE_SW_AFTER_GET_TOKEN: `use-sw-after-get-token` = this.cast("use-sw-after-get-token")
  @scala.inline
  def USE_VAPID_KEY_AFTER_GET_TOKEN: `use-vapid-key-after-get-token` = this.cast("use-vapid-key-after-get-token")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

