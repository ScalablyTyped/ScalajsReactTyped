package typingsJapgolly.stellarBase.mod.OperationOptions

import typingsJapgolly.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePassiveSellOffer extends BaseOptions {
  var amount: String
  var buying: Asset
  var price: Double | String | js.Object
  var selling: Asset
}

object CreatePassiveSellOffer {
  @scala.inline
  def apply(
    amount: String,
    buying: Asset,
    price: Double | String | js.Object,
    selling: Asset,
    source: String = null
  ): CreatePassiveSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePassiveSellOffer]
  }
}

