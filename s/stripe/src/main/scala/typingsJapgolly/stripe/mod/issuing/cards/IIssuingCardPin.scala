package typingsJapgolly.stripe.mod.issuing.cards

import typingsJapgolly.stripe.stripeStrings.active
import typingsJapgolly.stripe.stripeStrings.blocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about the PIN on the card.
  */
trait IIssuingCardPin extends js.Object {
  var status: blocked | active
}

object IIssuingCardPin {
  @scala.inline
  def apply(status: blocked | active): IIssuingCardPin = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIssuingCardPin]
  }
}

