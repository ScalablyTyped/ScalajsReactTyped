package typingsJapgolly.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDeploymentmanager.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypesResource extends js.Object {
  /** Lists all resource types for Deployment Manager. */
  def list(request: AnonFilter): Request_[TypesListResponse]
}

object TypesResource {
  @scala.inline
  def apply(list: AnonFilter => CallbackTo[Request_[TypesListResponse]]): TypesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[TypesResource]
  }
}

