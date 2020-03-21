package typingsJapgolly.gapiClientAppstate.gapi.client.appstate

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppstate.AnonAlt
import typingsJapgolly.gapiClientAppstate.AnonCurrentStateVersion
import typingsJapgolly.gapiClientAppstate.AnonFields
import typingsJapgolly.gapiClientAppstate.AnonIncludeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatesResource extends js.Object {
  /**
    * Clears (sets to empty) the data for the passed key if and only if the passed version matches the currently stored version. This method results in a
    * conflict error on version mismatch.
    */
  def clear(request: AnonAlt): Request_[WriteResult]
  /**
    * Deletes a key and the data associated with it. The key is removed and no longer counts against the key quota. Note that since this method is not safe
    * in the face of concurrent modifications, it should only be used for development and testing purposes. Invoking this method in shipping code can result
    * in data loss and data corruption.
    */
  def delete(request: AnonFields): Request_[Unit]
  /** Retrieves the data corresponding to the passed key. If the key does not exist on the server, an HTTP 404 will be returned. */
  def get(request: AnonFields): Request_[GetResponse]
  /** Lists all the states keys, and optionally the state data. */
  def list(request: AnonIncludeData): Request_[ListResponse]
  /**
    * Update the data associated with the input key if and only if the passed version matches the currently stored version. This method is safe in the face
    * of concurrent writes. Maximum per-key size is 128KB.
    */
  def update(request: AnonCurrentStateVersion): Request_[WriteResult]
}

object StatesResource {
  @scala.inline
  def apply(
    clear: AnonAlt => CallbackTo[Request_[WriteResult]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[GetResponse]],
    list: AnonIncludeData => CallbackTo[Request_[ListResponse]],
    update: AnonCurrentStateVersion => CallbackTo[Request_[WriteResult]]
  ): StatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppstate.AnonAlt) => clear(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppstate.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppstate.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppstate.AnonIncludeData) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppstate.AnonCurrentStateVersion) => update(t0).runNow()))
    __obj.asInstanceOf[StatesResource]
  }
}

