package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFields
import typingsJapgolly.gapiClientCompute.AnonFieldsInstanceGroupManager
import typingsJapgolly.gapiClientCompute.AnonInstanceGroupManager
import typingsJapgolly.gapiClientCompute.AnonMaxResults
import typingsJapgolly.gapiClientCompute.AnonQuotaUser
import typingsJapgolly.gapiClientCompute.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupManagersResource extends js.Object {
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
  def abandonInstances(request: AnonInstanceGroupManager): Request_[Operation]
  /** Retrieves the list of managed instance groups and groups them by zone. */
  def aggregatedList(request: AnonAlt): Request_[InstanceGroupManagerAggregatedList]
  /**
    * Deletes the specified managed instance group and all of the instances in that group. Note that the instance group must not belong to a backend service.
    * Read  Deleting an instance group for more information.
    */
  def delete(request: AnonInstanceGroupManager): Request_[Operation]
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
  def deleteInstances(request: AnonInstanceGroupManager): Request_[Operation]
  /** Returns all of the details about the specified managed instance group. Get a list of available managed instance groups by making a list() request. */
  def get(request: AnonFieldsInstanceGroupManager): Request_[InstanceGroupManager]
  /**
    * Creates a managed instance group using the information that you specify in the request. After the group is created, it schedules an action to create
    * instances in the group using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the
    * group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method.
    *
    * A managed instance group can have up to 1000 VM instances per group. Please contact Cloud Support if you need an increase in this limit.
    */
  def insert(request: AnonQuotaUser): Request_[Operation]
  /** Retrieves a list of managed instance groups that are contained within the specified project and zone. */
  def list(request: AnonFields): Request_[InstanceGroupManagerList]
  /**
    * Lists all of the instances in the managed instance group. Each instance in the list has a currentAction, which indicates the action that the managed
    * instance group is performing on the instance. For example, if the group is still creating an instance, the currentAction is CREATING. If a previous
    * action failed, the list displays the errors for that failed action.
    */
  def listManagedInstances(request: AnonMaxResults): Request_[InstanceGroupManagersListManagedInstancesResponse]
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
  def recreateInstances(request: AnonInstanceGroupManager): Request_[Operation]
  /**
    * Resizes the managed instance group. If you increase the size, the group creates new instances using the current instance template. If you decrease the
    * size, the group deletes instances. The resize operation is marked DONE when the resize actions are scheduled even if the group has not yet added or
    * deleted any instances. You must separately verify the status of the creating or deleting actions with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    */
  def resize(request: AnonSize): Request_[Operation]
  /**
    * Specifies the instance template to use when creating new instances in this group. The templates for existing instances in the group do not change
    * unless you recreate them.
    */
  def setInstanceTemplate(request: AnonInstanceGroupManager): Request_[Operation]
  /**
    * Modifies the target pools to which all instances in this managed instance group are assigned. The target pools automatically apply to all of the
    * instances in the managed instance group. This operation is marked DONE when you make the request even if the instances have not yet been added to their
    * target pools. The change might take some time to apply to all of the instances in the group depending on the size of the group.
    */
  def setTargetPools(request: AnonInstanceGroupManager): Request_[Operation]
}

object InstanceGroupManagersResource {
  @scala.inline
  def apply(
    abandonInstances: AnonInstanceGroupManager => CallbackTo[Request_[Operation]],
    aggregatedList: AnonAlt => CallbackTo[Request_[InstanceGroupManagerAggregatedList]],
    delete: AnonInstanceGroupManager => CallbackTo[Request_[Operation]],
    deleteInstances: AnonInstanceGroupManager => CallbackTo[Request_[Operation]],
    get: AnonFieldsInstanceGroupManager => CallbackTo[Request_[InstanceGroupManager]],
    insert: AnonQuotaUser => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[InstanceGroupManagerList]],
    listManagedInstances: AnonMaxResults => CallbackTo[Request_[InstanceGroupManagersListManagedInstancesResponse]],
    recreateInstances: AnonInstanceGroupManager => CallbackTo[Request_[Operation]],
    resize: AnonSize => CallbackTo[Request_[Operation]],
    setInstanceTemplate: AnonInstanceGroupManager => CallbackTo[Request_[Operation]],
    setTargetPools: AnonInstanceGroupManager => CallbackTo[Request_[Operation]]
  ): InstanceGroupManagersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abandonInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManager) => abandonInstances(t0).runNow()))
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManager) => delete(t0).runNow()))
    __obj.updateDynamic("deleteInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManager) => deleteInstances(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstanceGroupManager) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("listManagedInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonMaxResults) => listManagedInstances(t0).runNow()))
    __obj.updateDynamic("recreateInstances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManager) => recreateInstances(t0).runNow()))
    __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonSize) => resize(t0).runNow()))
    __obj.updateDynamic("setInstanceTemplate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManager) => setInstanceTemplate(t0).runNow()))
    __obj.updateDynamic("setTargetPools")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceGroupManager) => setTargetPools(t0).runNow()))
    __obj.asInstanceOf[InstanceGroupManagersResource]
  }
}

