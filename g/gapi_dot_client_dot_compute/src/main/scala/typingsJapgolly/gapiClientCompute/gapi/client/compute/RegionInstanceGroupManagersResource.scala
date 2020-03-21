package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonInstanceGroupManagerKey
import typingsJapgolly.gapiClientCompute.AnonPageToken
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonQuotaUserRegion
import typingsJapgolly.gapiClientCompute.AnonRegionRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupManagersResource extends js.Object {
  /**
    * Schedules a group action to remove the specified instances from the managed instance group. Abandoning an instance does not delete the instance, but it
    * does remove the instance from any target pools that are applied by the managed instance group. This method reduces the targetSize of the managed
    * instance group by the number of instances that you abandon. This operation is marked as DONE when the action is scheduled even if the instances have
    * not yet been removed from the group. You must separately verify the status of the abandoning action with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def abandonInstances(request: AnonInstanceGroupManagerKey): Request_[Operation]
  /** Deletes the specified managed instance group and all of the instances in that group. */
  def delete(request: AnonInstanceGroupManagerKey): Request_[Operation]
  /**
    * Schedules a group action to delete the specified instances in the managed instance group. The instances are also removed from any target pools of which
    * they were a member. This method reduces the targetSize of the managed instance group by the number of instances that you delete. This operation is
    * marked as DONE when the action is scheduled even if the instances are still being deleted. You must separately verify the status of the deleting action
    * with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def deleteInstances(request: AnonInstanceGroupManagerKey): Request_[Operation]
  /** Returns all of the details about the specified managed instance group. */
  def get(request: AnonQuotaUserRegion): Request_[InstanceGroupManager]
  /**
    * Creates a managed instance group using the information that you specify in the request. After the group is created, it schedules an action to create
    * instances in the group using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the
    * group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method.
    *
    * A regional managed instance group can contain up to 2000 instances.
    */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves the list of managed instance groups that are contained within the specified region. */
  def list(request: AnonFilter): Request_[RegionInstanceGroupManagerList]
  /**
    * Lists the instances in the managed instance group and instances that are scheduled to be created. The list includes any current actions that the group
    * has scheduled for its instances.
    */
  def listManagedInstances(request: AnonPageToken): Request_[RegionInstanceGroupManagersListInstancesResponse]
  /**
    * Schedules a group action to recreate the specified instances in the managed instance group. The instances are deleted and recreated using the current
    * instance template for the managed instance group. This operation is marked as DONE when the action is scheduled even if the instances have not yet been
    * recreated. You must separately verify the status of the recreating action with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def recreateInstances(request: AnonInstanceGroupManagerKey): Request_[Operation]
  /**
    * Changes the intended size for the managed instance group. If you increase the size, the group schedules actions to create new instances using the
    * current instance template. If you decrease the size, the group schedules delete actions on one or more instances. The resize operation is marked DONE
    * when the resize actions are scheduled even if the group has not yet added or deleted any instances. You must separately verify the status of the
    * creating or deleting actions with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    */
  def resize(request: AnonRegionRequestId): Request_[Operation]
  /** Sets the instance template to use when creating new instances or recreating instances in this group. Existing instances are not affected. */
  def setInstanceTemplate(request: AnonInstanceGroupManagerKey): Request_[Operation]
  /** Modifies the target pools to which all new instances in this group are assigned. Existing instances in the group are not affected. */
  def setTargetPools(request: AnonInstanceGroupManagerKey): Request_[Operation]
}

object RegionInstanceGroupManagersResource {
  @scala.inline
  def apply(
    abandonInstances: AnonInstanceGroupManagerKey => CallbackTo[Request_[Operation]],
    delete: AnonInstanceGroupManagerKey => CallbackTo[Request_[Operation]],
    deleteInstances: AnonInstanceGroupManagerKey => CallbackTo[Request_[Operation]],
    get: AnonQuotaUserRegion => CallbackTo[Request_[InstanceGroupManager]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[RegionInstanceGroupManagerList]],
    listManagedInstances: AnonPageToken => CallbackTo[Request_[RegionInstanceGroupManagersListInstancesResponse]],
    recreateInstances: AnonInstanceGroupManagerKey => CallbackTo[Request_[Operation]],
    resize: AnonRegionRequestId => CallbackTo[Request_[Operation]],
    setInstanceTemplate: AnonInstanceGroupManagerKey => CallbackTo[Request_[Operation]],
    setTargetPools: AnonInstanceGroupManagerKey => CallbackTo[Request_[Operation]]
  ): RegionInstanceGroupManagersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abandonInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManagerKey) => abandonInstances(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManagerKey) => delete(t0).runNow()))
    __obj.updateDynamic("deleteInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManagerKey) => deleteInstances(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserRegion) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("listManagedInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPageToken) => listManagedInstances(t0).runNow()))
    __obj.updateDynamic("recreateInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManagerKey) => recreateInstances(t0).runNow()))
    __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegionRequestId) => resize(t0).runNow()))
    __obj.updateDynamic("setInstanceTemplate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManagerKey) => setInstanceTemplate(t0).runNow()))
    __obj.updateDynamic("setTargetPools")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManagerKey) => setTargetPools(t0).runNow()))
    __obj.asInstanceOf[RegionInstanceGroupManagersResource]
  }
}

