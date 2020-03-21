package typingsJapgolly.stripe.mod.usageRecords

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.increment
  - typingsJapgolly.stripe.stripeStrings.set
*/
trait IUsageRecordAction extends js.Object

object IUsageRecordAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def increment: typingsJapgolly.stripe.stripeStrings.increment = this.cast("increment")
  @scala.inline
  def set: typingsJapgolly.stripe.stripeStrings.set = this.cast("set")
}

