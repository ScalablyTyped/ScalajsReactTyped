package typingsJapgolly.firebase.mod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebase.firebaseStrings.`no-fetch-yet`
  - typingsJapgolly.firebase.firebaseStrings.success
  - typingsJapgolly.firebase.firebaseStrings.failure
  - typingsJapgolly.firebase.firebaseStrings.throttle
*/
trait FetchStatus extends js.Object

object FetchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typingsJapgolly.firebase.firebaseStrings.failure = this.cast("failure")
  @scala.inline
  def `no-fetch-yet`: typingsJapgolly.firebase.firebaseStrings.`no-fetch-yet` = this.cast("no-fetch-yet")
  @scala.inline
  def success: typingsJapgolly.firebase.firebaseStrings.success = this.cast("success")
  @scala.inline
  def throttle: typingsJapgolly.firebase.firebaseStrings.throttle = this.cast("throttle")
}

