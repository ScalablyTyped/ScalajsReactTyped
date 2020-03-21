package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonDiskType
import typingsJapgolly.gapiClientCompute.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskTypesResource extends js.Object {
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(request: AnonAlt): Request_[DiskTypeAggregatedList]
  /** Returns the specified disk type. Get a list of available disk types by making a list() request. */
  def get(request: AnonDiskType): Request_[DiskType]
  /** Retrieves a list of disk types available to the specified project. */
  def list(request: AnonFields): Request_[DiskTypeList]
}

object DiskTypesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[DiskTypeAggregatedList]],
    get: AnonDiskType => CallbackTo[Request_[DiskType]],
    list: AnonFields => CallbackTo[Request_[DiskTypeList]]
  ): DiskTypesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonDiskType) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[DiskTypesResource]
  }
}

