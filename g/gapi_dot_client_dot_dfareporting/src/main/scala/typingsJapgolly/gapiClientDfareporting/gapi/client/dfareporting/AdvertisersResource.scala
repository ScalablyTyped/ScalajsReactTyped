package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAdvertiserGroupIds
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertisersResource extends js.Object {
  /** Gets one advertiser by ID. */
  def get(request: AnonFields): Request_[Advertiser]
  /** Inserts a new advertiser. */
  def insert(request: AnonKey): Request_[Advertiser]
  /** Retrieves a list of advertisers, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserGroupIds): Request_[AdvertisersListResponse]
  /** Updates an existing advertiser. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Advertiser]
  /** Updates an existing advertiser. */
  def update(request: AnonKey): Request_[Advertiser]
}

object AdvertisersResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[Advertiser]],
    insert: AnonKey => CallbackTo[Request_[Advertiser]],
    list: AnonAdvertiserGroupIds => CallbackTo[Request_[AdvertisersListResponse]],
    patch: AnonFields => CallbackTo[Request_[Advertiser]],
    update: AnonKey => CallbackTo[Request_[Advertiser]]
  ): AdvertisersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAdvertiserGroupIds) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[AdvertisersResource]
  }
}

