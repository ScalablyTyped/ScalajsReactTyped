package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementStrategiesResource extends js.Object {
  /** Deletes an existing placement strategy. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one placement strategy by ID. */
  def get(request: AnonFields): Request_[PlacementStrategy]
  /** Inserts a new placement strategy. */
  def insert(request: AnonKey): Request_[PlacementStrategy]
  /** Retrieves a list of placement strategies, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[PlacementStrategiesListResponse]
  /** Updates an existing placement strategy. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[PlacementStrategy]
  /** Updates an existing placement strategy. */
  def update(request: AnonKey): Request_[PlacementStrategy]
}

object PlacementStrategiesResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[PlacementStrategy]],
    insert: AnonKey => CallbackTo[Request_[PlacementStrategy]],
    list: AnonOauthtoken => CallbackTo[Request_[PlacementStrategiesListResponse]],
    patch: AnonFields => CallbackTo[Request_[PlacementStrategy]],
    update: AnonKey => CallbackTo[Request_[PlacementStrategy]]
  ): PlacementStrategiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonOauthtoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[PlacementStrategiesResource]
  }
}

