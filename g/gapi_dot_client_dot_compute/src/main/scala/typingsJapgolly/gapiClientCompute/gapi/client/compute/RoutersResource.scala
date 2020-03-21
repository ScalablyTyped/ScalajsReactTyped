package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonRegionRouter
import typingsJapgolly.gapiClientCompute.AnonRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutersResource extends js.Object {
  /** Retrieves an aggregated list of routers. */
  def aggregatedList(request: AnonAlt): Request_[RouterAggregatedList]
  /** Deletes the specified Router resource. */
  def delete(request: AnonRouter): Request_[Operation]
  /** Returns the specified Router resource. Get a list of available routers by making a list() request. */
  def get(request: AnonRegionRouter): Request_[Router]
  /** Retrieves runtime information of the specified router. */
  def getRouterStatus(request: AnonRegionRouter): Request_[RouterStatusResponse]
  /** Creates a Router resource in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of Router resources available to the specified project. */
  def list(request: AnonFilter): Request_[RouterList]
  /**
    * Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and
    * processing rules.
    */
  def patch(request: AnonRouter): Request_[Operation]
  /** Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router. */
  def preview(request: AnonRegionRouter): Request_[RoutersPreviewResponse]
  /** Updates the specified Router resource with the data included in the request. */
  def update(request: AnonRouter): Request_[Operation]
}

object RoutersResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[RouterAggregatedList]],
    delete: AnonRouter => CallbackTo[Request_[Operation]],
    get: AnonRegionRouter => CallbackTo[Request_[Router]],
    getRouterStatus: AnonRegionRouter => CallbackTo[Request_[RouterStatusResponse]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[RouterList]],
    patch: AnonRouter => CallbackTo[Request_[Operation]],
    preview: AnonRegionRouter => CallbackTo[Request_[RoutersPreviewResponse]],
    update: AnonRouter => CallbackTo[Request_[Operation]]
  ): RoutersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRouter) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegionRouter) => get(t0).runNow()))
    __obj.updateDynamic("getRouterStatus")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegionRouter) => getRouterStatus(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRouter) => patch(t0).runNow()))
    __obj.updateDynamic("preview")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegionRouter) => preview(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRouter) => update(t0).runNow()))
    __obj.asInstanceOf[RoutersResource]
  }
}

