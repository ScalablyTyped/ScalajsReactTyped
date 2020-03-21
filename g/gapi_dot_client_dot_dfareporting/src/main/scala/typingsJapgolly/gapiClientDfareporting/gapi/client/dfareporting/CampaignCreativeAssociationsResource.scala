package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonCampaignId
import typingsJapgolly.gapiClientDfareporting.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignCreativeAssociationsResource extends js.Object {
  /**
    * Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a
    * default ad does not exist already.
    */
  def insert(request: AnonCampaignId): Request_[CampaignCreativeAssociation]
  /** Retrieves the list of creative IDs associated with the specified campaign. This method supports paging. */
  def list(request: AnonPageToken): Request_[CampaignCreativeAssociationsListResponse]
}

object CampaignCreativeAssociationsResource {
  @scala.inline
  def apply(
    insert: AnonCampaignId => CallbackTo[Request_[CampaignCreativeAssociation]],
    list: AnonPageToken => CallbackTo[Request_[CampaignCreativeAssociationsListResponse]]
  ): CampaignCreativeAssociationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCampaignId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonPageToken) => list(t0).runNow()))
    __obj.asInstanceOf[CampaignCreativeAssociationsResource]
  }
}

