package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonCompatibilities
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonPlacementIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: AnonPlacementIds): Request_[PlacementsGenerateTagsResponse]
  /** Gets one placement by ID. */
  def get(request: AnonFields): Request_[Placement]
  /** Inserts a new placement. */
  def insert(request: AnonKey): Request_[Placement]
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: AnonCompatibilities): Request_[PlacementsListResponse]
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Placement]
  /** Updates an existing placement. */
  def update(request: AnonKey): Request_[Placement]
}

object PlacementsResource {
  @scala.inline
  def apply(
    generatetags: AnonPlacementIds => CallbackTo[Request_[PlacementsGenerateTagsResponse]],
    get: AnonFields => CallbackTo[Request_[Placement]],
    insert: AnonKey => CallbackTo[Request_[Placement]],
    list: AnonCompatibilities => CallbackTo[Request_[PlacementsListResponse]],
    patch: AnonFields => CallbackTo[Request_[Placement]],
    update: AnonKey => CallbackTo[Request_[Placement]]
  ): PlacementsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generatetags")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonPlacementIds) => generatetags(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCompatibilities) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[PlacementsResource]
  }
}

