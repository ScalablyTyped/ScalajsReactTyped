package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltDisk
import typingsJapgolly.gapiClientCompute.AnonDisk
import typingsJapgolly.gapiClientCompute.AnonFields
import typingsJapgolly.gapiClientCompute.AnonResource
import typingsJapgolly.gapiClientCompute.AnonSourceImage
import typingsJapgolly.gapiClientCompute.AnonZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksResource extends js.Object {
  /** Retrieves an aggregated list of persistent disks. */
  def aggregatedList(request: AnonAlt): Request_[DiskAggregatedList]
  /** Creates a snapshot of a specified persistent disk. */
  def createSnapshot(request: AnonDisk): Request_[Operation]
  /**
    * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any
    * snapshots previously made from the disk. You must separately delete snapshots.
    */
  def delete(request: AnonZone): Request_[Operation]
  /** Returns a specified persistent disk. Get a list of available persistent disks by making a list() request. */
  def get(request: AnonAltDisk): Request_[Disk]
  /**
    * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create
    * an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb
    * property.
    */
  def insert(request: AnonSourceImage): Request_[Operation]
  /** Retrieves a list of persistent disks contained within the specified zone. */
  def list(request: AnonFields): Request_[DiskList]
  /** Resizes the specified persistent disk. */
  def resize(request: AnonZone): Request_[Operation]
  /** Sets the labels on a disk. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonResource): Request_[Operation]
}

object DisksResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[DiskAggregatedList]],
    createSnapshot: AnonDisk => CallbackTo[Request_[Operation]],
    delete: AnonZone => CallbackTo[Request_[Operation]],
    get: AnonAltDisk => CallbackTo[Request_[Disk]],
    insert: AnonSourceImage => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[DiskList]],
    resize: AnonZone => CallbackTo[Request_[Operation]],
    setLabels: AnonResource => CallbackTo[Request_[Operation]]
  ): DisksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("createSnapshot")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonDisk) => createSnapshot(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonZone) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltDisk) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonSourceImage) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonZone) => resize(t0).runNow()))
    __obj.updateDynamic("setLabels")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonResource) => setLabels(t0).runNow()))
    __obj.asInstanceOf[DisksResource]
  }
}

