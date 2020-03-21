package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.cancelled
  - typingsJapgolly.std.stdStrings.failed
  - typingsJapgolly.std.stdStrings.frozen
  - typingsJapgolly.std.stdStrings.inprogress
  - typingsJapgolly.std.stdStrings.succeeded
  - typingsJapgolly.std.stdStrings.waiting
*/
trait RTCStatsIceCandidatePairState extends js.Object

object RTCStatsIceCandidatePairState {
  @scala.inline
  def cancelled: typingsJapgolly.std.stdStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsJapgolly.std.stdStrings.failed = this.cast("failed")
  @scala.inline
  def frozen: typingsJapgolly.std.stdStrings.frozen = this.cast("frozen")
  @scala.inline
  def inprogress: typingsJapgolly.std.stdStrings.inprogress = this.cast("inprogress")
  @scala.inline
  def succeeded: typingsJapgolly.std.stdStrings.succeeded = this.cast("succeeded")
  @scala.inline
  def waiting: typingsJapgolly.std.stdStrings.waiting = this.cast("waiting")
}

