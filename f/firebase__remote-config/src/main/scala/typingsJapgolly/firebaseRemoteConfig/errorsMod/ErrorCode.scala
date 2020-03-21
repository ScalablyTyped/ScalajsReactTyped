package typingsJapgolly.firebaseRemoteConfig.errorsMod

import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-network`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-parse`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-status`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-throttle`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-timeout`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-api-key`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-app-id`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-project-id`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-window`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-delete`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-get`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-open`
import typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-set`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-window`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-project-id`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-api-key`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-app-id`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-open`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-get`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-set`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-delete`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-network`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-timeout`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-throttle`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-parse`
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-status`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def FETCH_NETWORK: `fetch-client-network` = this.cast("fetch-client-network")
  @scala.inline
  def FETCH_PARSE: `fetch-client-parse` = this.cast("fetch-client-parse")
  @scala.inline
  def FETCH_STATUS: `fetch-status` = this.cast("fetch-status")
  @scala.inline
  def FETCH_THROTTLE: `fetch-throttle` = this.cast("fetch-throttle")
  @scala.inline
  def FETCH_TIMEOUT: `fetch-timeout` = this.cast("fetch-timeout")
  @scala.inline
  def REGISTRATION_API_KEY: `registration-api-key` = this.cast("registration-api-key")
  @scala.inline
  def REGISTRATION_APP_ID: `registration-app-id` = this.cast("registration-app-id")
  @scala.inline
  def REGISTRATION_PROJECT_ID: `registration-project-id` = this.cast("registration-project-id")
  @scala.inline
  def REGISTRATION_WINDOW: `registration-window` = this.cast("registration-window")
  @scala.inline
  def STORAGE_DELETE: `storage-delete` = this.cast("storage-delete")
  @scala.inline
  def STORAGE_GET: `storage-get` = this.cast("storage-get")
  @scala.inline
  def STORAGE_OPEN: `storage-open` = this.cast("storage-open")
  @scala.inline
  def STORAGE_SET: `storage-set` = this.cast("storage-set")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

