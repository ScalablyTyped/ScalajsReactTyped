package typingsJapgolly.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.`no-fetch-yet`
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.success
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.failure
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.throttle
*/
trait FetchStatus extends js.Object

object FetchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.failure = this.cast("failure")
  @scala.inline
  def `no-fetch-yet`: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.`no-fetch-yet` = this.cast("no-fetch-yet")
  @scala.inline
  def success: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.success = this.cast("success")
  @scala.inline
  def throttle: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.throttle = this.cast("throttle")
}

