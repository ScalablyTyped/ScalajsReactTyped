package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOrdersRequest extends js.Object {
  /** The list of proposals to create. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.undefined
  /** Web property id of the seller creating these orders */
  var webPropertyCode: js.UndefOr[String] = js.undefined
}

object CreateOrdersRequest {
  @scala.inline
  def apply(proposals: js.Array[Proposal] = null, webPropertyCode: String = null): CreateOrdersRequest = {
    val __obj = js.Dynamic.literal()
    if (proposals != null) __obj.updateDynamic("proposals")(proposals.asInstanceOf[js.Any])
    if (webPropertyCode != null) __obj.updateDynamic("webPropertyCode")(webPropertyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrdersRequest]
  }
}

