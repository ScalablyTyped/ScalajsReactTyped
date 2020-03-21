package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.Yes
  - typingsJapgolly.braintree.braintreeStrings.No
  - typingsJapgolly.braintree.braintreeStrings.Unknown
*/
trait Prepaid extends js.Object

object Prepaid {
  @scala.inline
  def No: typingsJapgolly.braintree.braintreeStrings.No = this.cast("No")
  @scala.inline
  def Unknown: typingsJapgolly.braintree.braintreeStrings.Unknown = this.cast("Unknown")
  @scala.inline
  def Yes: typingsJapgolly.braintree.braintreeStrings.Yes = this.cast("Yes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

