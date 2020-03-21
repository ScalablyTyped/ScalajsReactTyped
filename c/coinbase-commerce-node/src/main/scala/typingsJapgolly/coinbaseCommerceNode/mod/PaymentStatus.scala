package typingsJapgolly.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment status.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CONFIRMED
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED
*/
trait PaymentStatus extends js.Object

object PaymentStatus {
  @scala.inline
  def CANCELED: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def CONFIRMED: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CONFIRMED = this.cast("CONFIRMED")
  @scala.inline
  def EXPIRED: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED = this.cast("EXPIRED")
  @scala.inline
  def NEW: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW = this.cast("NEW")
  @scala.inline
  def PENDING: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING = this.cast("PENDING")
  @scala.inline
  def RESOLVED: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED = this.cast("RESOLVED")
  @scala.inline
  def UNRESOLVED: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED = this.cast("UNRESOLVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

