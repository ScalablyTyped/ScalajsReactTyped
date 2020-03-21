package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonAlt
import typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Retrieves the details of a device. */
  def get(request: AnonAlt): Request_[Device]
  /**
    * Retrieves whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def getState(request: AnonAlt): Request_[DeviceState]
  /** Retrieves the IDs of all of a user's devices. */
  def list(request: AnonEnterpriseId): Request_[DevicesListResponse]
  /**
    * Sets whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def setState(request: AnonAlt): Request_[DeviceState]
}

object DevicesResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[Device]],
    getState: AnonAlt => CallbackTo[Request_[DeviceState]],
    list: AnonEnterpriseId => CallbackTo[Request_[DevicesListResponse]],
    setState: AnonAlt => CallbackTo[Request_[DeviceState]]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("getState")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonAlt) => getState(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => list(t0).runNow()))
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonAlt) => setState(t0).runNow()))
    __obj.asInstanceOf[DevicesResource]
  }
}

