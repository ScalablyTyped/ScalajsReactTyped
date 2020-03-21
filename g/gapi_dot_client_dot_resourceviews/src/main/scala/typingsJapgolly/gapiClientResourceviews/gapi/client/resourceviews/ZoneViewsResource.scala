package typingsJapgolly.gapiClientResourceviews.gapi.client.resourceviews

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientResourceviews.AnonFormat
import typingsJapgolly.gapiClientResourceviews.AnonMaxResults
import typingsJapgolly.gapiClientResourceviews.AnonOauthtoken
import typingsJapgolly.gapiClientResourceviews.AnonPrettyPrint
import typingsJapgolly.gapiClientResourceviews.AnonProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsResource extends js.Object {
  /** Add resources to the view. */
  def addResources(request: AnonOauthtoken): Request_[Operation]
  /** Delete a resource view. */
  def delete(request: AnonOauthtoken): Request_[Operation]
  /** Get the information of a zonal resource view. */
  def get(request: AnonOauthtoken): Request_[ResourceView]
  /** Get the service information of a resource view or a resource. */
  def getService(request: AnonPrettyPrint): Request_[ZoneViewsGetServiceResponse]
  /** Create a resource view. */
  def insert(request: AnonProject): Request_[Operation]
  /** List resource views. */
  def list(request: AnonMaxResults): Request_[ZoneViewsList]
  /** List the resources of the resource view. */
  def listResources(request: AnonFormat): Request_[ZoneViewsListResourcesResponse]
  /** Remove resources from the view. */
  def removeResources(request: AnonOauthtoken): Request_[Operation]
  /** Update the service information of a resource view or a resource. */
  def setService(request: AnonOauthtoken): Request_[Operation]
}

object ZoneViewsResource {
  @scala.inline
  def apply(
    addResources: AnonOauthtoken => CallbackTo[Request_[Operation]],
    delete: AnonOauthtoken => CallbackTo[Request_[Operation]],
    get: AnonOauthtoken => CallbackTo[Request_[ResourceView]],
    getService: AnonPrettyPrint => CallbackTo[Request_[ZoneViewsGetServiceResponse]],
    insert: AnonProject => CallbackTo[Request_[Operation]],
    list: AnonMaxResults => CallbackTo[Request_[ZoneViewsList]],
    listResources: AnonFormat => CallbackTo[Request_[ZoneViewsListResourcesResponse]],
    removeResources: AnonOauthtoken => CallbackTo[Request_[Operation]],
    setService: AnonOauthtoken => CallbackTo[Request_[Operation]]
  ): ZoneViewsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addResources")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonOauthtoken) => addResources(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonOauthtoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("getService")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonPrettyPrint) => getService(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonProject) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("listResources")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonFormat) => listResources(t0).runNow()))
    __obj.updateDynamic("removeResources")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonOauthtoken) => removeResources(t0).runNow()))
    __obj.updateDynamic("setService")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonOauthtoken) => setService(t0).runNow()))
    __obj.asInstanceOf[ZoneViewsResource]
  }
}

