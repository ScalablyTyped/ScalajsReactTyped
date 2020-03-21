package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.Api
  - typingsJapgolly.braintree.braintreeStrings.ControlPanel
  - typingsJapgolly.braintree.braintreeStrings.Recurring
*/
trait TransactionSource extends js.Object

object TransactionSource {
  @scala.inline
  def Api: typingsJapgolly.braintree.braintreeStrings.Api = this.cast("Api")
  @scala.inline
  def ControlPanel: typingsJapgolly.braintree.braintreeStrings.ControlPanel = this.cast("ControlPanel")
  @scala.inline
  def Recurring: typingsJapgolly.braintree.braintreeStrings.Recurring = this.cast("Recurring")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

