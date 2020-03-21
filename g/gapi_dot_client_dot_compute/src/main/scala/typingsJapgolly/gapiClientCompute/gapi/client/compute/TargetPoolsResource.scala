package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFailoverRatio
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonRegionTargetPool
import typingsJapgolly.gapiClientCompute.AnonTargetPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsResource extends js.Object {
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: AnonTargetPool): Request_[Operation]
  /** Adds an instance to a target pool. */
  def addInstance(request: AnonTargetPool): Request_[Operation]
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(request: AnonAlt): Request_[TargetPoolAggregatedList]
  /** Deletes the specified target pool. */
  def delete(request: AnonTargetPool): Request_[Operation]
  /** Returns the specified target pool. Get a list of available target pools by making a list() request. */
  def get(request: AnonRegionTargetPool): Request_[TargetPool]
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: AnonRegionTargetPool): Request_[TargetPoolInstanceHealth]
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(request: AnonFilter): Request_[TargetPoolList]
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: AnonTargetPool): Request_[Operation]
  /** Removes instance URL from a target pool. */
  def removeInstance(request: AnonTargetPool): Request_[Operation]
  /** Changes a backup target pool's configurations. */
  def setBackup(request: AnonFailoverRatio): Request_[Operation]
}

object TargetPoolsResource {
  @scala.inline
  def apply(
    addHealthCheck: AnonTargetPool => CallbackTo[Request_[Operation]],
    addInstance: AnonTargetPool => CallbackTo[Request_[Operation]],
    aggregatedList: AnonAlt => CallbackTo[Request_[TargetPoolAggregatedList]],
    delete: AnonTargetPool => CallbackTo[Request_[Operation]],
    get: AnonRegionTargetPool => CallbackTo[Request_[TargetPool]],
    getHealth: AnonRegionTargetPool => CallbackTo[Request_[TargetPoolInstanceHealth]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[TargetPoolList]],
    removeHealthCheck: AnonTargetPool => CallbackTo[Request_[Operation]],
    removeInstance: AnonTargetPool => CallbackTo[Request_[Operation]],
    setBackup: AnonFailoverRatio => CallbackTo[Request_[Operation]]
  ): TargetPoolsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHealthCheck")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetPool) => addHealthCheck(t0).runNow()))
    __obj.updateDynamic("addInstance")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetPool) => addInstance(t0).runNow()))
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetPool) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegionTargetPool) => get(t0).runNow()))
    __obj.updateDynamic("getHealth")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegionTargetPool) => getHealth(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("removeHealthCheck")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetPool) => removeHealthCheck(t0).runNow()))
    __obj.updateDynamic("removeInstance")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonTargetPool) => removeInstance(t0).runNow()))
    __obj.updateDynamic("setBackup")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFailoverRatio) => setBackup(t0).runNow()))
    __obj.asInstanceOf[TargetPoolsResource]
  }
}

