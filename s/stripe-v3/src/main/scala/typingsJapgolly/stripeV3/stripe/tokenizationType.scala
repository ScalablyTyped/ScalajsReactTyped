package typingsJapgolly.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV3.stripeV3Strings.apple_pay
  - typingsJapgolly.stripeV3.stripeV3Strings.android_pay
*/
trait tokenizationType extends js.Object

object tokenizationType {
  @scala.inline
  def android_pay: typingsJapgolly.stripeV3.stripeV3Strings.android_pay = this.cast("android_pay")
  @scala.inline
  def apple_pay: typingsJapgolly.stripeV3.stripeV3Strings.apple_pay = this.cast("apple_pay")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

