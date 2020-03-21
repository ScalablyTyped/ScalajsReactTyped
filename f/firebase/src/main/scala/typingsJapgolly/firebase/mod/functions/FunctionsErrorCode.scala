package typingsJapgolly.firebase.mod.functions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebase.firebaseStrings.ok
  - typingsJapgolly.firebase.firebaseStrings.cancelled
  - typingsJapgolly.firebase.firebaseStrings.unknown
  - typingsJapgolly.firebase.firebaseStrings.`invalid-argument`
  - typingsJapgolly.firebase.firebaseStrings.`deadline-exceeded`
  - typingsJapgolly.firebase.firebaseStrings.`not-found`
  - typingsJapgolly.firebase.firebaseStrings.`already-exists`
  - typingsJapgolly.firebase.firebaseStrings.`permission-denied`
  - typingsJapgolly.firebase.firebaseStrings.`resource-exhausted`
  - typingsJapgolly.firebase.firebaseStrings.`failed-precondition`
  - typingsJapgolly.firebase.firebaseStrings.aborted
  - typingsJapgolly.firebase.firebaseStrings.`out-of-range`
  - typingsJapgolly.firebase.firebaseStrings.unimplemented
  - typingsJapgolly.firebase.firebaseStrings.internal
  - typingsJapgolly.firebase.firebaseStrings.unavailable
  - typingsJapgolly.firebase.firebaseStrings.`data-loss`
  - typingsJapgolly.firebase.firebaseStrings.unauthenticated
*/
trait FunctionsErrorCode extends js.Object

object FunctionsErrorCode {
  @scala.inline
  def aborted: typingsJapgolly.firebase.firebaseStrings.aborted = this.cast("aborted")
  @scala.inline
  def `already-exists`: typingsJapgolly.firebase.firebaseStrings.`already-exists` = this.cast("already-exists")
  @scala.inline
  def cancelled: typingsJapgolly.firebase.firebaseStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `data-loss`: typingsJapgolly.firebase.firebaseStrings.`data-loss` = this.cast("data-loss")
  @scala.inline
  def `deadline-exceeded`: typingsJapgolly.firebase.firebaseStrings.`deadline-exceeded` = this.cast("deadline-exceeded")
  @scala.inline
  def `failed-precondition`: typingsJapgolly.firebase.firebaseStrings.`failed-precondition` = this.cast("failed-precondition")
  @scala.inline
  def internal: typingsJapgolly.firebase.firebaseStrings.internal = this.cast("internal")
  @scala.inline
  def `invalid-argument`: typingsJapgolly.firebase.firebaseStrings.`invalid-argument` = this.cast("invalid-argument")
  @scala.inline
  def `not-found`: typingsJapgolly.firebase.firebaseStrings.`not-found` = this.cast("not-found")
  @scala.inline
  def ok: typingsJapgolly.firebase.firebaseStrings.ok = this.cast("ok")
  @scala.inline
  def `out-of-range`: typingsJapgolly.firebase.firebaseStrings.`out-of-range` = this.cast("out-of-range")
  @scala.inline
  def `permission-denied`: typingsJapgolly.firebase.firebaseStrings.`permission-denied` = this.cast("permission-denied")
  @scala.inline
  def `resource-exhausted`: typingsJapgolly.firebase.firebaseStrings.`resource-exhausted` = this.cast("resource-exhausted")
  @scala.inline
  def unauthenticated: typingsJapgolly.firebase.firebaseStrings.unauthenticated = this.cast("unauthenticated")
  @scala.inline
  def unavailable: typingsJapgolly.firebase.firebaseStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unimplemented: typingsJapgolly.firebase.firebaseStrings.unimplemented = this.cast("unimplemented")
  @scala.inline
  def unknown: typingsJapgolly.firebase.firebaseStrings.unknown = this.cast("unknown")
}

