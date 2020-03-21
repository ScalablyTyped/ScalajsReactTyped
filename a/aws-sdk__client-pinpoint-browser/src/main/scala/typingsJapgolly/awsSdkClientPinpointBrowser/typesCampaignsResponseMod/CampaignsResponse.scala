package typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignsResponseMod

import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignResponseMod.CampaignResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsResponse extends js.Object {
  /**
    * A list of campaigns.
    */
  var Item: js.UndefOr[js.Array[CampaignResponse] | js.Iterable[CampaignResponse]] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object CampaignsResponse {
  @scala.inline
  def apply(Item: js.Array[CampaignResponse] | js.Iterable[CampaignResponse] = null, NextToken: String = null): CampaignsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignsResponse]
  }
}

