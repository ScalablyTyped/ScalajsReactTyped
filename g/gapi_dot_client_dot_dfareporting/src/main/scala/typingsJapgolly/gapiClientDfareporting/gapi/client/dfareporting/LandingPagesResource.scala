package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAltCampaignId
import typingsJapgolly.gapiClientDfareporting.AnonCampaignId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPagesResource extends js.Object {
  /** Deletes an existing campaign landing page. */
  def delete(request: AnonAltCampaignId): Request_[Unit]
  /** Gets one campaign landing page by ID. */
  def get(request: AnonAltCampaignId): Request_[LandingPage]
  /** Inserts a new landing page for the specified campaign. */
  def insert(request: AnonCampaignId): Request_[LandingPage]
  /** Retrieves the list of landing pages for the specified campaign. */
  def list(request: AnonCampaignId): Request_[LandingPagesListResponse]
  /** Updates an existing campaign landing page. This method supports patch semantics. */
  def patch(request: AnonAltCampaignId): Request_[LandingPage]
  /** Updates an existing campaign landing page. */
  def update(request: AnonCampaignId): Request_[LandingPage]
}

object LandingPagesResource {
  @scala.inline
  def apply(
    delete: AnonAltCampaignId => CallbackTo[Request_[Unit]],
    get: AnonAltCampaignId => CallbackTo[Request_[LandingPage]],
    insert: AnonCampaignId => CallbackTo[Request_[LandingPage]],
    list: AnonCampaignId => CallbackTo[Request_[LandingPagesListResponse]],
    patch: AnonAltCampaignId => CallbackTo[Request_[LandingPage]],
    update: AnonCampaignId => CallbackTo[Request_[LandingPage]]
  ): LandingPagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAltCampaignId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAltCampaignId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCampaignId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCampaignId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAltCampaignId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCampaignId) => update(t0).runNow()))
    __obj.asInstanceOf[LandingPagesResource]
  }
}

