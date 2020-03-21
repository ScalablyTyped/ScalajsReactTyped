package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAdvertiserId
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsResource extends js.Object {
  /** Gets one ad by ID. */
  def get(request: AnonFields): Request_[Ad]
  /** Inserts a new ad. */
  def insert(request: AnonKey): Request_[Ad]
  /** Retrieves a list of ads, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserId): Request_[AdsListResponse]
  /** Updates an existing ad. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Ad]
  /** Updates an existing ad. */
  def update(request: AnonKey): Request_[Ad]
}

object AdsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[Ad]],
    insert: AnonKey => CallbackTo[Request_[Ad]],
    list: AnonAdvertiserId => CallbackTo[Request_[AdsListResponse]],
    patch: AnonFields => CallbackTo[Request_[Ad]],
    update: AnonKey => CallbackTo[Request_[Ad]]
  ): AdsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAdvertiserId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[AdsResource]
  }
}

