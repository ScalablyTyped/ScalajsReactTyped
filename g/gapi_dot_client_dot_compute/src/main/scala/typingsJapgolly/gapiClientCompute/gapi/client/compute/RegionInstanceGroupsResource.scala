package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonFieldsFilter
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonInstanceGroupKey
import typingsJapgolly.gapiClientCompute.AnonRequestIdUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupsResource extends js.Object {
  /** Returns the specified instance group resource. */
  def get(request: AnonInstanceGroupKey): Request_[InstanceGroup]
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(request: AnonFilter): Request_[RegionInstanceGroupList]
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can
    * list all instances or only the instances that are running.
    */
  def listInstances(request: AnonFieldsFilter): Request_[RegionInstanceGroupsListInstances]
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: AnonRequestIdUserIp): Request_[Operation]
}

object RegionInstanceGroupsResource {
  @scala.inline
  def apply(
    get: AnonInstanceGroupKey => CallbackTo[Request_[InstanceGroup]],
    list: AnonFilter => CallbackTo[Request_[RegionInstanceGroupList]],
    listInstances: AnonFieldsFilter => CallbackTo[Request_[RegionInstanceGroupsListInstances]],
    setNamedPorts: AnonRequestIdUserIp => CallbackTo[Request_[Operation]]
  ): RegionInstanceGroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("listInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsFilter) => listInstances(t0).runNow()))
    __obj.updateDynamic("setNamedPorts")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRequestIdUserIp) => setNamedPorts(t0).runNow()))
    __obj.asInstanceOf[RegionInstanceGroupsResource]
  }
}

