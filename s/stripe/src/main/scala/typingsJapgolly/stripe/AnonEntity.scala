package typingsJapgolly.stripe

import typingsJapgolly.stripe.stripeStrings.account
import typingsJapgolly.stripe.stripeStrings.allowed_categories
import typingsJapgolly.stripe.stripeStrings.blocked_categories
import typingsJapgolly.stripe.stripeStrings.card
import typingsJapgolly.stripe.stripeStrings.cardholder
import typingsJapgolly.stripe.stripeStrings.max_amount
import typingsJapgolly.stripe.stripeStrings.max_approvals
import typingsJapgolly.stripe.stripeStrings.spending_limits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntity extends js.Object {
  /**
    * Entity which the authorization control acts on. One of account, card, or cardholder.
    */
  var entity: account | cardholder | card
  /**
    * Name of the authorization control. One of allowed_categories, blocked_categories, max_amount, max_approvals, or spending_limits.
    */
  var name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits
}

object AnonEntity {
  @scala.inline
  def apply(
    entity: account | cardholder | card,
    name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits
  ): AnonEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntity]
  }
}

