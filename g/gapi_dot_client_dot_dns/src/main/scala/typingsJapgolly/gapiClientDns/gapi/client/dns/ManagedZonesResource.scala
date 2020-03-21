package typingsJapgolly.gapiClientDns.gapi.client.dns

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDns.AnonAlt
import typingsJapgolly.gapiClientDns.AnonDnsName
import typingsJapgolly.gapiClientDns.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedZonesResource extends js.Object {
  /** Create a new ManagedZone. */
  def create(request: AnonKey): Request_[ManagedZone]
  /** Delete a previously created ManagedZone. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Fetch the representation of an existing ManagedZone. */
  def get(request: AnonAlt): Request_[ManagedZone]
  /** Enumerate ManagedZones that have been created but not yet deleted. */
  def list(request: AnonDnsName): Request_[ManagedZonesListResponse]
}

object ManagedZonesResource {
  @scala.inline
  def apply(
    create: AnonKey => CallbackTo[Request_[ManagedZone]],
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[ManagedZone]],
    list: AnonDnsName => CallbackTo[Request_[ManagedZonesListResponse]]
  ): ManagedZonesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDns.AnonKey) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDns.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDns.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDns.AnonDnsName) => list(t0).runNow()))
    __obj.asInstanceOf[ManagedZonesResource]
  }
}

