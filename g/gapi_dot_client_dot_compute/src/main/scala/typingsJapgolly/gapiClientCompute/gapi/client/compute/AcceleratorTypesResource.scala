package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAcceleratorType
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorTypesResource extends js.Object {
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(request: AnonAlt): Request_[AcceleratorTypeAggregatedList]
  /** Returns the specified accelerator type. Get a list of available accelerator types by making a list() request. */
  def get(request: AnonAcceleratorType): Request_[AcceleratorType]
  /** Retrieves a list of accelerator types available to the specified project. */
  def list(request: AnonFields): Request_[AcceleratorTypeList]
}

object AcceleratorTypesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[AcceleratorTypeAggregatedList]],
    get: AnonAcceleratorType => CallbackTo[Request_[AcceleratorType]],
    list: AnonFields => CallbackTo[Request_[AcceleratorTypeList]]
  ): AcceleratorTypesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAcceleratorType) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[AcceleratorTypesResource]
  }
}

