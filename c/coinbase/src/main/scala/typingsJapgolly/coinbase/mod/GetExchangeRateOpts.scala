package typingsJapgolly.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExchangeRateOpts extends js.Object {
  /**
    * Base currency, default USD
    */
  var currency: js.UndefOr[String] = js.undefined
}

object GetExchangeRateOpts {
  @scala.inline
  def apply(currency: String = null): GetExchangeRateOpts = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExchangeRateOpts]
  }
}

