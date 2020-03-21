package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFields
import typingsJapgolly.gapiClientCompute.AnonMachineType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineTypesResource extends js.Object {
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(request: AnonAlt): Request_[MachineTypeAggregatedList]
  /** Returns the specified machine type. Get a list of available machine types by making a list() request. */
  def get(request: AnonMachineType): Request_[MachineType]
  /** Retrieves a list of machine types available to the specified project. */
  def list(request: AnonFields): Request_[MachineTypeList]
}

object MachineTypesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[MachineTypeAggregatedList]],
    get: AnonMachineType => CallbackTo[Request_[MachineType]],
    list: AnonFields => CallbackTo[Request_[MachineTypeList]]
  ): MachineTypesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonMachineType) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[MachineTypesResource]
  }
}

