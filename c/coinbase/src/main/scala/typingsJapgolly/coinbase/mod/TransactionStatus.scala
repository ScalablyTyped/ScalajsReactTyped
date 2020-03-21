package typingsJapgolly.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.coinbase.coinbaseStrings.pending
  - typingsJapgolly.coinbase.coinbaseStrings.completed
  - typingsJapgolly.coinbase.coinbaseStrings.failed
  - typingsJapgolly.coinbase.coinbaseStrings.expired
  - typingsJapgolly.coinbase.coinbaseStrings.canceled
  - typingsJapgolly.coinbase.coinbaseStrings.waiting_for_signature
  - typingsJapgolly.coinbase.coinbaseStrings.waiting_for_clearing
*/
trait TransactionStatus extends js.Object

object TransactionStatus {
  @scala.inline
  def canceled: typingsJapgolly.coinbase.coinbaseStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsJapgolly.coinbase.coinbaseStrings.completed = this.cast("completed")
  @scala.inline
  def expired: typingsJapgolly.coinbase.coinbaseStrings.expired = this.cast("expired")
  @scala.inline
  def failed: typingsJapgolly.coinbase.coinbaseStrings.failed = this.cast("failed")
  @scala.inline
  def pending: typingsJapgolly.coinbase.coinbaseStrings.pending = this.cast("pending")
  @scala.inline
  def waiting_for_clearing: typingsJapgolly.coinbase.coinbaseStrings.waiting_for_clearing = this.cast("waiting_for_clearing")
  @scala.inline
  def waiting_for_signature: typingsJapgolly.coinbase.coinbaseStrings.waiting_for_signature = this.cast("waiting_for_signature")
}

