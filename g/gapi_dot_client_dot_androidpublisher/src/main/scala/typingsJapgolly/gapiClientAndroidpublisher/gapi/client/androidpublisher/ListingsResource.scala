package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonEditId
import typingsJapgolly.gapiClientAndroidpublisher.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListingsResource extends js.Object {
  /** Deletes the specified localized store listing from an edit. */
  def delete(request: AnonKey): Request_[Unit]
  /** Deletes all localized listings from an edit. */
  def deleteall(request: AnonEditId): Request_[Unit]
  /** Fetches information about a localized store listing. */
  def get(request: AnonKey): Request_[Listing]
  /** Returns all of the localized store listings attached to this edit. */
  def list(request: AnonEditId): Request_[ListingsListResponse]
  /** Creates or updates a localized store listing. This method supports patch semantics. */
  def patch(request: AnonKey): Request_[Listing]
  /** Creates or updates a localized store listing. */
  def update(request: AnonKey): Request_[Listing]
}

object ListingsResource {
  @scala.inline
  def apply(
    delete: AnonKey => CallbackTo[Request_[Unit]],
    deleteall: AnonEditId => CallbackTo[Request_[Unit]],
    get: AnonKey => CallbackTo[Request_[Listing]],
    list: AnonEditId => CallbackTo[Request_[ListingsListResponse]],
    patch: AnonKey => CallbackTo[Request_[Listing]],
    update: AnonKey => CallbackTo[Request_[Listing]]
  ): ListingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonKey) => delete(t0).runNow()))
    __obj.updateDynamic("deleteall")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => deleteall(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEditId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonKey) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[ListingsResource]
  }
}

