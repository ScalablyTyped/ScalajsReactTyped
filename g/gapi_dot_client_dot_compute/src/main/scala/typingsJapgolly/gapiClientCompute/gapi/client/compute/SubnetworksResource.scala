package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonRegionSubnetwork
import typingsJapgolly.gapiClientCompute.AnonSubnetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksResource extends js.Object {
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(request: AnonAlt): Request_[SubnetworkAggregatedList]
  /** Deletes the specified subnetwork. */
  def delete(request: AnonSubnetwork): Request_[Operation]
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(request: AnonSubnetwork): Request_[Operation]
  /** Returns the specified subnetwork. Get a list of available subnetworks list() request. */
  def get(request: AnonRegionSubnetwork): Request_[Subnetwork]
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(request: AnonFilter): Request_[SubnetworkList]
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(request: AnonSubnetwork): Request_[Operation]
}

object SubnetworksResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[SubnetworkAggregatedList]],
    delete: AnonSubnetwork => CallbackTo[Request_[Operation]],
    expandIpCidrRange: AnonSubnetwork => CallbackTo[Request_[Operation]],
    get: AnonRegionSubnetwork => CallbackTo[Request_[Subnetwork]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[SubnetworkList]],
    setPrivateIpGoogleAccess: AnonSubnetwork => CallbackTo[Request_[Operation]]
  ): SubnetworksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonSubnetwork) => delete(t0).runNow()))
    __obj.updateDynamic("expandIpCidrRange")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonSubnetwork) => expandIpCidrRange(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegionSubnetwork) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("setPrivateIpGoogleAccess")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonSubnetwork) => setPrivateIpGoogleAccess(t0).runNow()))
    __obj.asInstanceOf[SubnetworksResource]
  }
}

