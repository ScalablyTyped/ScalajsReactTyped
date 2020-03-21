package typingsJapgolly.stripe.mod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.chip
  - typingsJapgolly.stripe.stripeStrings.contactless
  - typingsJapgolly.stripe.stripeStrings.keyed_in
  - typingsJapgolly.stripe.stripeStrings.online
  - typingsJapgolly.stripe.stripeStrings.swipe
*/
trait AuthorizationMethod extends js.Object

object AuthorizationMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chip: typingsJapgolly.stripe.stripeStrings.chip = this.cast("chip")
  @scala.inline
  def contactless: typingsJapgolly.stripe.stripeStrings.contactless = this.cast("contactless")
  @scala.inline
  def keyed_in: typingsJapgolly.stripe.stripeStrings.keyed_in = this.cast("keyed_in")
  @scala.inline
  def online: typingsJapgolly.stripe.stripeStrings.online = this.cast("online")
  @scala.inline
  def swipe: typingsJapgolly.stripe.stripeStrings.swipe = this.cast("swipe")
}

