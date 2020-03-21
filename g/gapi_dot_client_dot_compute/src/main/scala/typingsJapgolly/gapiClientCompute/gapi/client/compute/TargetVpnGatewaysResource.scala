package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonRegionTargetVpnGateway
import typingsJapgolly.gapiClientCompute.AnonTargetVpnGateway
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGatewaysResource extends js.Object {
  /** Retrieves an aggregated list of target VPN gateways. */
  def aggregatedList(request: AnonAlt): Request_[TargetVpnGatewayAggregatedList]
  /** Deletes the specified target VPN gateway. */
  def delete(request: AnonTargetVpnGateway): Request_[Operation]
  /** Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request. */
  def get(request: AnonRegionTargetVpnGateway): Request_[TargetVpnGateway]
  /** Creates a target VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of target VPN gateways available to the specified project and region. */
  def list(request: AnonFilter): Request_[TargetVpnGatewayList]
}

object TargetVpnGatewaysResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[TargetVpnGatewayAggregatedList]],
    delete: AnonTargetVpnGateway => CallbackTo[Request_[Operation]],
    get: AnonRegionTargetVpnGateway => CallbackTo[Request_[TargetVpnGateway]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[TargetVpnGatewayList]]
  ): TargetVpnGatewaysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetVpnGateway) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegionTargetVpnGateway) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[TargetVpnGatewaysResource]
  }
}

