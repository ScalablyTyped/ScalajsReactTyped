package typingsJapgolly.firebaseRemoteConfig.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides type-safety for the "key" field used by {@link APP_NAMESPACE_STORE}.
  *
  * <p>This seems like a small price to avoid potentially subtle bugs caused by a typo.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings
  - typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata
*/
trait ProjectNamespaceKeyFieldValue extends js.Object

object ProjectNamespaceKeyFieldValue {
  @scala.inline
  def active_config: typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config = this.cast("active_config")
  @scala.inline
  def active_config_etag: typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag = this.cast("active_config_etag")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def last_fetch_status: typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status = this.cast("last_fetch_status")
  @scala.inline
  def last_successful_fetch_response: typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response = this.cast("last_successful_fetch_response")
  @scala.inline
  def last_successful_fetch_timestamp_millis: typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis = this.cast("last_successful_fetch_timestamp_millis")
  @scala.inline
  def settings: typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings = this.cast("settings")
  @scala.inline
  def throttle_metadata: typingsJapgolly.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata = this.cast("throttle_metadata")
}

