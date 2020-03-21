package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAutoscaler
import typingsJapgolly.gapiClientCompute.AnonFields
import typingsJapgolly.gapiClientCompute.AnonProject
import typingsJapgolly.gapiClientCompute.AnonQuotaUser
import typingsJapgolly.gapiClientCompute.AnonRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalersResource extends js.Object {
  /** Retrieves an aggregated list of autoscalers. */
  def aggregatedList(request: AnonAlt): Request_[AutoscalerAggregatedList]
  /** Deletes the specified autoscaler. */
  def delete(request: AnonAutoscaler): Request_[Operation]
  /** Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request. */
  def get(request: AnonProject): Request_[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation]
  /** Retrieves a list of autoscalers contained within the specified zone. */
  def list(request: AnonFields): Request_[AutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: AnonRequestId): Request_[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: AnonRequestId): Request_[Operation]
}

object AutoscalersResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[AutoscalerAggregatedList]],
    delete: AnonAutoscaler => CallbackTo[Request_[Operation]],
    get: AnonProject => CallbackTo[Request_[Autoscaler]],
    insert: AnonQuotaUser => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[AutoscalerList]],
    patch: AnonRequestId => CallbackTo[Request_[Operation]],
    update: AnonRequestId => CallbackTo[Request_[Operation]]
  ): AutoscalersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAutoscaler) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonProject) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRequestId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRequestId) => update(t0).runNow()))
    __obj.asInstanceOf[AutoscalersResource]
  }
}

