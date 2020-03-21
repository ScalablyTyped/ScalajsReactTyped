package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonUserIpVpnTunnel
import typingsJapgolly.gapiClientCompute.AnonVpnTunnel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnelsResource extends js.Object {
  /** Retrieves an aggregated list of VPN tunnels. */
  def aggregatedList(request: AnonAlt): Request_[VpnTunnelAggregatedList]
  /** Deletes the specified VpnTunnel resource. */
  def delete(request: AnonVpnTunnel): Request_[Operation]
  /** Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request. */
  def get(request: AnonUserIpVpnTunnel): Request_[VpnTunnel]
  /** Creates a VpnTunnel resource in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of VpnTunnel resources contained in the specified project and region. */
  def list(request: AnonFilter): Request_[VpnTunnelList]
}

object VpnTunnelsResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[VpnTunnelAggregatedList]],
    delete: AnonVpnTunnel => CallbackTo[Request_[Operation]],
    get: AnonUserIpVpnTunnel => CallbackTo[Request_[VpnTunnel]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[VpnTunnelList]]
  ): VpnTunnelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonVpnTunnel) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonUserIpVpnTunnel) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[VpnTunnelsResource]
  }
}

