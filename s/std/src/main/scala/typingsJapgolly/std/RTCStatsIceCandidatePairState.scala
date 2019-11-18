package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.frozen
  - typings.std.stdStrings.waiting
  - typings.std.stdStrings.inprogress
  - typings.std.stdStrings.failed
  - typings.std.stdStrings.succeeded
  - typings.std.stdStrings.cancelled
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

