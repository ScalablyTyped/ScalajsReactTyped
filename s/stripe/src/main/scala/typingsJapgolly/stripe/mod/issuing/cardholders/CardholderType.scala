package typingsJapgolly.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.individual
  - typingsJapgolly.stripe.stripeStrings.business_entity
*/
trait CardholderType extends js.Object

object CardholderType {
  @scala.inline
  def business_entity: typingsJapgolly.stripe.stripeStrings.business_entity = this.cast("business_entity")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def individual: typingsJapgolly.stripe.stripeStrings.individual = this.cast("individual")
}

