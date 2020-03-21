package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAdvertiserIds
import typingsJapgolly.gapiClientDfareporting.AnonDefaultLandingPageName
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsResource extends js.Object {
  /** Gets one campaign by ID. */
  def get(request: AnonFields): Request_[Campaign]
  /** Inserts a new campaign. */
  def insert(request: AnonDefaultLandingPageName): Request_[Campaign]
  /** Retrieves a list of campaigns, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserIds): Request_[CampaignsListResponse]
  /** Updates an existing campaign. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Campaign]
  /** Updates an existing campaign. */
  def update(request: AnonKey): Request_[Campaign]
}

object CampaignsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[Campaign]],
    insert: AnonDefaultLandingPageName => CallbackTo[Request_[Campaign]],
    list: AnonAdvertiserIds => CallbackTo[Request_[CampaignsListResponse]],
    patch: AnonFields => CallbackTo[Request_[Campaign]],
    update: AnonKey => CallbackTo[Request_[Campaign]]
  ): CampaignsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonDefaultLandingPageName) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAdvertiserIds) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[CampaignsResource]
  }
}

