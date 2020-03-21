package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonAlt
import typingsJapgolly.gapiClientAndroidenterprise.AnonDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallsResource extends js.Object {
  /** Requests to remove an app from a device. A call to get or list will still show the app as installed on the device until it is actually removed. */
  def delete(request: AnonDeviceId): Request_[Unit]
  /** Retrieves details of an installation of an app on a device. */
  def get(request: AnonDeviceId): Request_[Install]
  /** Retrieves the details of all apps installed on the specified device. */
  def list(request: AnonAlt): Request_[InstallsListResponse]
  /**
    * Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary.
    * This method supports patch semantics.
    */
  def patch(request: AnonDeviceId): Request_[Install]
  /** Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary. */
  def update(request: AnonDeviceId): Request_[Install]
}

object InstallsResource {
  @scala.inline
  def apply(
    delete: AnonDeviceId => CallbackTo[Request_[Unit]],
    get: AnonDeviceId => CallbackTo[Request_[Install]],
    list: AnonAlt => CallbackTo[Request_[InstallsListResponse]],
    patch: AnonDeviceId => CallbackTo[Request_[Install]],
    update: AnonDeviceId => CallbackTo[Request_[Install]]
  ): InstallsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonDeviceId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonDeviceId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonDeviceId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonDeviceId) => update(t0).runNow()))
    __obj.asInstanceOf[InstallsResource]
  }
}

