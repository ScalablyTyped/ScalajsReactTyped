package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceDealParty extends js.Object {
  /** The buyer/seller associated with the deal. One of buyer/seller is specified for a deal-party. */
  var buyer: js.UndefOr[Buyer] = js.undefined
  /** The buyer/seller associated with the deal. One of buyer/seller is specified for a deal party. */
  var seller: js.UndefOr[Seller] = js.undefined
}

object MarketplaceDealParty {
  @scala.inline
  def apply(buyer: Buyer = null, seller: Seller = null): MarketplaceDealParty = {
    val __obj = js.Dynamic.literal()
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketplaceDealParty]
  }
}

