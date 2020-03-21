package typingsJapgolly.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<stripe.stripe.IAddress> */
trait PartialIAddress extends js.Object {
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var line1: js.UndefOr[String] = js.undefined
  var line2: js.UndefOr[String] = js.undefined
  var postal_code: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object PartialIAddress {
  @scala.inline
  def apply(
    city: String = null,
    country: String = null,
    line1: String = null,
    line2: String = null,
    postal_code: String = null,
    state: String = null
  ): PartialIAddress = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (line1 != null) __obj.updateDynamic("line1")(line1.asInstanceOf[js.Any])
    if (line2 != null) __obj.updateDynamic("line2")(line2.asInstanceOf[js.Any])
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIAddress]
  }
}

