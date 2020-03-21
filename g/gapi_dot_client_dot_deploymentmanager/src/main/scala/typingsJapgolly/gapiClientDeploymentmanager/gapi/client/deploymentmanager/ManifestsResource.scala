package typingsJapgolly.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDeploymentmanager.AnonDeployment
import typingsJapgolly.gapiClientDeploymentmanager.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestsResource extends js.Object {
  /** Gets information about a specific manifest. */
  def get(request: AnonDeployment): Request_[Manifest]
  /** Lists all manifests for a given deployment. */
  def list(request: AnonMaxResults): Request_[ManifestsListResponse]
}

object ManifestsResource {
  @scala.inline
  def apply(
    get: AnonDeployment => CallbackTo[Request_[Manifest]],
    list: AnonMaxResults => CallbackTo[Request_[ManifestsListResponse]]
  ): ManifestsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonDeployment) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[ManifestsResource]
  }
}

