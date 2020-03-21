package typingsJapgolly.gapiClientFirestore.gapi.client.firestore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFirestore.AnonFilter
import typingsJapgolly.gapiClientFirestore.AnonKey
import typingsJapgolly.gapiClientFirestore.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexesResource extends js.Object {
  /**
    * Creates the specified index.
    * A newly created index's initial state is `CREATING`. On completion of the
    * returned google.longrunning.Operation, the state will be `READY`.
    * If the index already exists, the call will return an `ALREADY_EXISTS`
    * status.
    *
    * During creation, the process could result in an error, in which case the
    * index will move to the `ERROR` state. The process can be recovered by
    * fixing the data that caused the error, removing the index with
    * delete, then re-creating the index with
    * create.
    *
    * Indexes with a single field cannot be created.
    */
  def create(request: AnonKey): Request_[Operation]
  /** Deletes an index. */
  def delete(request: AnonName): Request_[js.Object]
  /** Gets an index. */
  def get(request: AnonName): Request_[Index]
  /** Lists the indexes that match the specified filters. */
  def list(request: AnonFilter): Request_[ListIndexesResponse]
}

object IndexesResource {
  @scala.inline
  def apply(
    create: AnonKey => CallbackTo[Request_[Operation]],
    delete: AnonName => CallbackTo[Request_[js.Object]],
    get: AnonName => CallbackTo[Request_[Index]],
    list: AnonFilter => CallbackTo[Request_[ListIndexesResponse]]
  ): IndexesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonKey) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonName) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonName) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirestore.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[IndexesResource]
  }
}

