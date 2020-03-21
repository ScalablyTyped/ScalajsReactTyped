package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCampaignRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: string = js.native
  var WriteCampaignRequest: typingsJapgolly.awsSdk.pinpointMod.WriteCampaignRequest = js.native
}

object UpdateCampaignRequest {
  @scala.inline
  def apply(ApplicationId: string, CampaignId: string, WriteCampaignRequest: WriteCampaignRequest): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
}

