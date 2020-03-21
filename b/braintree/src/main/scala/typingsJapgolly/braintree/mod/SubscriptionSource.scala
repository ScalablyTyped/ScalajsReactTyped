package typingsJapgolly.braintree.mod

import typingsJapgolly.braintree.braintreeStrings.api_
import typingsJapgolly.braintree.braintreeStrings.recurring_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.api_
  - typingsJapgolly.braintree.braintreeStrings.control_panel
  - typingsJapgolly.braintree.braintreeStrings.recurring_
*/
trait SubscriptionSource extends js.Object

object SubscriptionSource {
  @scala.inline
  def api: api_ = this.cast("api")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def control_panel: typingsJapgolly.braintree.braintreeStrings.control_panel = this.cast("control_panel")
  @scala.inline
  def recurring: recurring_ = this.cast("recurring")
}

