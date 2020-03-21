package typingsJapgolly.stripe

import typingsJapgolly.stripe.stripeStrings.exact
import typingsJapgolly.stripe.stripeStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEarliest extends js.Object {
  /**
    * If type is "exact", date will be the expected delivery date in the format YYYY-MM-DD
    */
  var date: String
  /**
    * If type is "range", earliest will be be the earliest delivery date in the format YYYY-MM-DD
    */
  var earliest: String
  /**
    * If type is "range", latest will be the latest delivery date in the format YYYY-MM-DD
    */
  var latest: String
  /**
    * The type of estimate. Must be either "range" or "exact"
    */
  var `type`: range | exact
}

object AnonEarliest {
  @scala.inline
  def apply(date: String, earliest: String, latest: String, `type`: range | exact): AnonEarliest = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], earliest = earliest.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEarliest]
  }
}

