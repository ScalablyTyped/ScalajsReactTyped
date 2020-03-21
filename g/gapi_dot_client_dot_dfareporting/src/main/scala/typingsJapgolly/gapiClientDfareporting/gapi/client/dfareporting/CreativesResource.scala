package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonArchived
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Gets one creative by ID. */
  def get(request: AnonFields): Request_[Creative]
  /** Inserts a new creative. */
  def insert(request: AnonKey): Request_[Creative]
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(request: AnonArchived): Request_[CreativesListResponse]
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Creative]
  /** Updates an existing creative. */
  def update(request: AnonKey): Request_[Creative]
}

object CreativesResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[Creative]],
    insert: AnonKey => CallbackTo[Request_[Creative]],
    list: AnonArchived => CallbackTo[Request_[CreativesListResponse]],
    patch: AnonFields => CallbackTo[Request_[Creative]],
    update: AnonKey => CallbackTo[Request_[Creative]]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonArchived) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[CreativesResource]
  }
}

