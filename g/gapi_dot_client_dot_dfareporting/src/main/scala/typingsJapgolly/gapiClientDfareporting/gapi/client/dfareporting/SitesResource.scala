package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAcceptsInterstitialPlacements
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets one site by ID. */
  def get(request: AnonFields): Request_[Site]
  /** Inserts a new site. */
  def insert(request: AnonKey): Request_[Site]
  /** Retrieves a list of sites, possibly filtered. This method supports paging. */
  def list(request: AnonAcceptsInterstitialPlacements): Request_[SitesListResponse]
  /** Updates an existing site. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Site]
  /** Updates an existing site. */
  def update(request: AnonKey): Request_[Site]
}

object SitesResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[Site]],
    insert: AnonKey => CallbackTo[Request_[Site]],
    list: AnonAcceptsInterstitialPlacements => CallbackTo[Request_[SitesListResponse]],
    patch: AnonFields => CallbackTo[Request_[Site]],
    update: AnonKey => CallbackTo[Request_[Site]]
  ): SitesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAcceptsInterstitialPlacements) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[SitesResource]
  }
}

