package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFields
import typingsJapgolly.gapiClientCompute.AnonFieldsInstanceGroup
import typingsJapgolly.gapiClientCompute.AnonInstanceGroup
import typingsJapgolly.gapiClientCompute.AnonOrderBy_
import typingsJapgolly.gapiClientCompute.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupsResource extends js.Object {
  /**
    * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read
    * Adding instances for more information.
    */
  def addInstances(request: AnonInstanceGroup): Request_[Operation]
  /** Retrieves the list of instance groups and sorts them by zone. */
  def aggregatedList(request: AnonAlt): Request_[InstanceGroupAggregatedList]
  /**
    * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read
    * Deleting an instance group for more information.
    */
  def delete(request: AnonInstanceGroup): Request_[Operation]
  /** Returns the specified instance group. Get a list of available instance groups by making a list() request. */
  def get(request: AnonFieldsInstanceGroup): Request_[InstanceGroup]
  /** Creates an instance group in the specified project using the parameters that are included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation]
  /** Retrieves the list of instance groups that are located in the specified project and zone. */
  def list(request: AnonFields): Request_[InstanceGroupList]
  /** Lists the instances in the specified instance group. */
  def listInstances(request: AnonOrderBy_): Request_[InstanceGroupsListInstances]
  /**
    * Removes one or more instances from the specified instance group, but does not delete those instances.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration
    * before the VM instance is removed or deleted.
    */
  def removeInstances(request: AnonInstanceGroup): Request_[Operation]
  /** Sets the named ports for the specified instance group. */
  def setNamedPorts(request: AnonInstanceGroup): Request_[Operation]
}

object InstanceGroupsResource {
  @scala.inline
  def apply(
    addInstances: AnonInstanceGroup => CallbackTo[Request_[Operation]],
    aggregatedList: AnonAlt => CallbackTo[Request_[InstanceGroupAggregatedList]],
    delete: AnonInstanceGroup => CallbackTo[Request_[Operation]],
    get: AnonFieldsInstanceGroup => CallbackTo[Request_[InstanceGroup]],
    insert: AnonQuotaUser => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[InstanceGroupList]],
    listInstances: AnonOrderBy_ => CallbackTo[Request_[InstanceGroupsListInstances]],
    removeInstances: AnonInstanceGroup => CallbackTo[Request_[Operation]],
    setNamedPorts: AnonInstanceGroup => CallbackTo[Request_[Operation]]
  ): InstanceGroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroup) => addInstances(t0).runNow()))
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroup) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstanceGroup) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("listInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOrderBy_) => listInstances(t0).runNow()))
    __obj.updateDynamic("removeInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroup) => removeInstances(t0).runNow()))
    __obj.updateDynamic("setNamedPorts")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroup) => setNamedPorts(t0).runNow()))
    __obj.asInstanceOf[InstanceGroupsResource]
  }
}

