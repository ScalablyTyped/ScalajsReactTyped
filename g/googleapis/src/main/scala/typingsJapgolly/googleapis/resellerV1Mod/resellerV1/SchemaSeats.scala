package typingsJapgolly.googleapis.resellerV1Mod.resellerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for subscription seats.
  */
@js.native
trait SchemaSeats extends js.Object {
  /**
    * Identifies the resource as a subscription seat setting. Value:
    * subscriptions#seats
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Read-only field containing the current number of users that are assigned
    * a license for the product defined in skuId. This field&#39;s value is
    * equivalent to the numerical count of users returned by the Enterprise
    * License Manager API method: listForProductAndSku
    */
  var licensedNumberOfSeats: js.UndefOr[Double] = js.native
  /**
    * This is a required property and is exclusive to subscriptions with
    * FLEXIBLE or TRIAL plans. This property sets the maximum number of
    * licensed users allowed on a subscription. This quantity can be increased
    * up to the maximum limit defined in the reseller&#39;s contract. The
    * minimum quantity is the current number of users in the customer account.
    * Note: G Suite subscriptions automatically assign a license to every user.
    */
  var maximumNumberOfSeats: js.UndefOr[Double] = js.native
  /**
    * This is a required property and is exclusive to subscriptions with
    * ANNUAL_MONTHLY_PAY and ANNUAL_YEARLY_PAY plans. This property sets the
    * maximum number of licenses assignable to users on a subscription. The
    * reseller can add more licenses, but once set, the numberOfSeats cannot be
    * reduced until renewal. The reseller is invoiced based on the
    * numberOfSeats value regardless of how many of these user licenses are
    * assigned. Note: G Suite subscriptions automatically assign a license to
    * every user.
    */
  var numberOfSeats: js.UndefOr[Double] = js.native
}

object SchemaSeats {
  @scala.inline
  def apply(
    kind: String = null,
    licensedNumberOfSeats: Int | Double = null,
    maximumNumberOfSeats: Int | Double = null,
    numberOfSeats: Int | Double = null
  ): SchemaSeats = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (licensedNumberOfSeats != null) __obj.updateDynamic("licensedNumberOfSeats")(licensedNumberOfSeats.asInstanceOf[js.Any])
    if (maximumNumberOfSeats != null) __obj.updateDynamic("maximumNumberOfSeats")(maximumNumberOfSeats.asInstanceOf[js.Any])
    if (numberOfSeats != null) __obj.updateDynamic("numberOfSeats")(numberOfSeats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSeats]
  }
}

