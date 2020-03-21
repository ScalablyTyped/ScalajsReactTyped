package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAccessConfig
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAutoDelete
import typingsJapgolly.gapiClientCompute.AnonDeviceName
import typingsJapgolly.gapiClientCompute.AnonFields
import typingsJapgolly.gapiClientCompute.AnonFieldsInstance
import typingsJapgolly.gapiClientCompute.AnonInstance
import typingsJapgolly.gapiClientCompute.AnonInstanceKey
import typingsJapgolly.gapiClientCompute.AnonPort
import typingsJapgolly.gapiClientCompute.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /** Adds an access config to an instance's network interface. */
  def addAccessConfig(request: AnonInstance): Request_[Operation]
  /** Retrieves aggregated list of instances. */
  def aggregatedList(request: AnonAlt): Request_[InstanceAggregatedList]
  /**
    * Attaches an existing Disk resource to an instance. You must first create the disk before you can attach it. It is not possible to create and attach a
    * disk at the same time. For more information, read Adding a persistent disk to your instance.
    */
  def attachDisk(request: AnonFieldsInstance): Request_[Operation]
  /** Deletes the specified Instance resource. For more information, see Stopping or Deleting an Instance. */
  def delete(request: AnonFieldsInstance): Request_[Operation]
  /** Deletes an access config from an instance's network interface. */
  def deleteAccessConfig(request: AnonAccessConfig): Request_[Operation]
  /** Detaches a disk from an instance. */
  def detachDisk(request: AnonDeviceName): Request_[Operation]
  /** Returns the specified Instance resource. Get a list of available instances by making a list() request. */
  def get(request: AnonInstanceKey): Request_[Instance]
  /** Returns the specified instance's serial port output. */
  def getSerialPortOutput(request: AnonPort): Request_[SerialPortOutput]
  /** Creates an instance resource in the specified project using the data included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation]
  /** Retrieves the list of instances contained within the specified zone. */
  def list(request: AnonFields): Request_[InstanceList]
  /** Performs a reset on the instance. For more information, see Resetting an instance. */
  def reset(request: AnonFieldsInstance): Request_[Operation]
  /** Sets the auto-delete flag for a disk attached to an instance. */
  def setDiskAutoDelete(request: AnonAutoDelete): Request_[Operation]
  /** Sets labels on an instance. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonFieldsInstance): Request_[Operation]
  /** Changes the number and/or type of accelerator for a stopped instance to the values specified in the request. */
  def setMachineResources(request: AnonFieldsInstance): Request_[Operation]
  /** Changes the machine type for a stopped instance to the machine type specified in the request. */
  def setMachineType(request: AnonFieldsInstance): Request_[Operation]
  /** Sets metadata for the specified instance to the data included in the request. */
  def setMetadata(request: AnonFieldsInstance): Request_[Operation]
  /**
    * Changes the minimum CPU platform that this instance should use. This method can only be called on a stopped instance. For more information, read
    * Specifying a Minimum CPU Platform.
    */
  def setMinCpuPlatform(request: AnonFieldsInstance): Request_[Operation]
  /** Sets an instance's scheduling options. */
  def setScheduling(request: AnonFieldsInstance): Request_[Operation]
  /** Sets the service account on the instance. For more information, read Changing the service account and access scopes for an instance. */
  def setServiceAccount(request: AnonFieldsInstance): Request_[Operation]
  /** Sets tags for the specified instance to the data included in the request. */
  def setTags(request: AnonFieldsInstance): Request_[Operation]
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def start(request: AnonFieldsInstance): Request_[Operation]
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def startWithEncryptionKey(request: AnonFieldsInstance): Request_[Operation]
  /**
    * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur per-minute,
    * virtual machine usage charges while they are stopped, but any resources that the virtual machine is using, such as persistent disks and static IP
    * addresses, will continue to be charged until they are deleted. For more information, see Stopping an instance.
    */
  def stop(request: AnonFieldsInstance): Request_[Operation]
}

object InstancesResource {
  @scala.inline
  def apply(
    addAccessConfig: AnonInstance => CallbackTo[Request_[Operation]],
    aggregatedList: AnonAlt => CallbackTo[Request_[InstanceAggregatedList]],
    attachDisk: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    delete: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    deleteAccessConfig: AnonAccessConfig => CallbackTo[Request_[Operation]],
    detachDisk: AnonDeviceName => CallbackTo[Request_[Operation]],
    get: AnonInstanceKey => CallbackTo[Request_[Instance]],
    getSerialPortOutput: AnonPort => CallbackTo[Request_[SerialPortOutput]],
    insert: AnonQuotaUser => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[InstanceList]],
    reset: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    setDiskAutoDelete: AnonAutoDelete => CallbackTo[Request_[Operation]],
    setLabels: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    setMachineResources: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    setMachineType: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    setMetadata: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    setMinCpuPlatform: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    setScheduling: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    setServiceAccount: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    setTags: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    start: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    startWithEncryptionKey: AnonFieldsInstance => CallbackTo[Request_[Operation]],
    stop: AnonFieldsInstance => CallbackTo[Request_[Operation]]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAccessConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstance) => addAccessConfig(t0).runNow()))
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("attachDisk")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => attachDisk(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => delete(t0).runNow()))
    __obj.updateDynamic("deleteAccessConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAccessConfig) => deleteAccessConfig(t0).runNow()))
    __obj.updateDynamic("detachDisk")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonDeviceName) => detachDisk(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceKey) => get(t0).runNow()))
    __obj.updateDynamic("getSerialPortOutput")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPort) => getSerialPortOutput(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => reset(t0).runNow()))
    __obj.updateDynamic("setDiskAutoDelete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAutoDelete) => setDiskAutoDelete(t0).runNow()))
    __obj.updateDynamic("setLabels")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => setLabels(t0).runNow()))
    __obj.updateDynamic("setMachineResources")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => setMachineResources(t0).runNow()))
    __obj.updateDynamic("setMachineType")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => setMachineType(t0).runNow()))
    __obj.updateDynamic("setMetadata")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => setMetadata(t0).runNow()))
    __obj.updateDynamic("setMinCpuPlatform")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => setMinCpuPlatform(t0).runNow()))
    __obj.updateDynamic("setScheduling")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => setScheduling(t0).runNow()))
    __obj.updateDynamic("setServiceAccount")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => setServiceAccount(t0).runNow()))
    __obj.updateDynamic("setTags")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => setTags(t0).runNow()))
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => start(t0).runNow()))
    __obj.updateDynamic("startWithEncryptionKey")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => startWithEncryptionKey(t0).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstance) => stop(t0).runNow()))
    __obj.asInstanceOf[InstancesResource]
  }
}

