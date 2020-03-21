package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.US
  - typingsJapgolly.braintree.braintreeStrings.International
*/
trait CustomerLocation extends js.Object

object CustomerLocation {
  @scala.inline
  def International: typingsJapgolly.braintree.braintreeStrings.International = this.cast("International")
  @scala.inline
  def US: typingsJapgolly.braintree.braintreeStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

