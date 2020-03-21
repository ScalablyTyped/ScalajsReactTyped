package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAltAutoscaler
import typingsJapgolly.gapiClientCompute.AnonAutoscalerFields
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonPrettyPrintProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionAutoscalersResource extends js.Object {
  /** Deletes the specified autoscaler. */
  def delete(request: AnonAltAutoscaler): Request_[Operation]
  /** Returns the specified autoscaler. */
  def get(request: AnonAutoscalerFields): Request_[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(request: AnonFilter): Request_[RegionAutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: AnonPrettyPrintProject): Request_[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: AnonPrettyPrintProject): Request_[Operation]
}

object RegionAutoscalersResource {
  @scala.inline
  def apply(
    delete: AnonAltAutoscaler => CallbackTo[Request_[Operation]],
    get: AnonAutoscalerFields => CallbackTo[Request_[Autoscaler]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[RegionAutoscalerList]],
    patch: AnonPrettyPrintProject => CallbackTo[Request_[Operation]],
    update: AnonPrettyPrintProject => CallbackTo[Request_[Operation]]
  ): RegionAutoscalersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltAutoscaler) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAutoscalerFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrintProject) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrintProject) => update(t0).runNow()))
    __obj.asInstanceOf[RegionAutoscalersResource]
  }
}

