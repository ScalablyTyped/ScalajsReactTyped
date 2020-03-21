package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonFloodlightActivityGroupIds
import typingsJapgolly.gapiClientDfareporting.AnonFloodlightActivityId
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesResource extends js.Object {
  /** Deletes an existing floodlight activity. */
  def delete(request: AnonFields): Request_[Unit]
  /** Generates a tag for a floodlight activity. */
  def generatetag(request: AnonFloodlightActivityId): Request_[FloodlightActivitiesGenerateTagResponse]
  /** Gets one floodlight activity by ID. */
  def get(request: AnonFields): Request_[FloodlightActivity]
  /** Inserts a new floodlight activity. */
  def insert(request: AnonKey): Request_[FloodlightActivity]
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(request: AnonFloodlightActivityGroupIds): Request_[FloodlightActivitiesListResponse]
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[FloodlightActivity]
  /** Updates an existing floodlight activity. */
  def update(request: AnonKey): Request_[FloodlightActivity]
}

object FloodlightActivitiesResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    generatetag: AnonFloodlightActivityId => CallbackTo[Request_[FloodlightActivitiesGenerateTagResponse]],
    get: AnonFields => CallbackTo[Request_[FloodlightActivity]],
    insert: AnonKey => CallbackTo[Request_[FloodlightActivity]],
    list: AnonFloodlightActivityGroupIds => CallbackTo[Request_[FloodlightActivitiesListResponse]],
    patch: AnonFields => CallbackTo[Request_[FloodlightActivity]],
    update: AnonKey => CallbackTo[Request_[FloodlightActivity]]
  ): FloodlightActivitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("generatetag")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFloodlightActivityId) => generatetag(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFloodlightActivityGroupIds) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[FloodlightActivitiesResource]
  }
}

