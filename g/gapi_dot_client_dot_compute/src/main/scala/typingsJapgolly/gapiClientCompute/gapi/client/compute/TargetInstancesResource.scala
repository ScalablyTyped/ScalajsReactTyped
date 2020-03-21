package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFields
import typingsJapgolly.gapiClientCompute.AnonQuotaUser
import typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetInstance
import typingsJapgolly.gapiClientCompute.AnonTargetInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInstancesResource extends js.Object {
  /** Retrieves an aggregated list of target instances. */
  def aggregatedList(request: AnonAlt): Request_[TargetInstanceAggregatedList]
  /** Deletes the specified TargetInstance resource. */
  def delete(request: AnonTargetInstance): Request_[Operation]
  /** Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request. */
  def get(request: AnonQuotaUserTargetInstance): Request_[TargetInstance]
  /** Creates a TargetInstance resource in the specified project and zone using the data included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation]
  /** Retrieves a list of TargetInstance resources available to the specified project and zone. */
  def list(request: AnonFields): Request_[TargetInstanceList]
}

object TargetInstancesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[TargetInstanceAggregatedList]],
    delete: AnonTargetInstance => CallbackTo[Request_[Operation]],
    get: AnonQuotaUserTargetInstance => CallbackTo[Request_[TargetInstance]],
    insert: AnonQuotaUser => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[TargetInstanceList]]
  ): TargetInstancesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetInstance) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserTargetInstance) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[TargetInstancesResource]
  }
}

