package typingsJapgolly.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDeploymentmanager.AnonMaxResults
import typingsJapgolly.gapiClientDeploymentmanager.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesResource extends js.Object {
  /** Gets information about a single resource. */
  def get(request: AnonPrettyPrint): Request_[Resource]
  /** Lists all resources in a given deployment. */
  def list(request: AnonMaxResults): Request_[ResourcesListResponse]
}

object ResourcesResource {
  @scala.inline
  def apply(
    get: AnonPrettyPrint => CallbackTo[Request_[Resource]],
    list: AnonMaxResults => CallbackTo[Request_[ResourcesListResponse]]
  ): ResourcesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonPrettyPrint) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[ResourcesResource]
  }
}

