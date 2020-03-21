package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTagmanager.AnonAlt
import typingsJapgolly.gapiClientTagmanager.AnonIncludeDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionHeadersResource extends js.Object {
  /** Gets the latest container version header */
  def latest(request: AnonAlt): Request_[ContainerVersionHeader]
  /** Lists all Container Versions of a GTM Container. */
  def list(request: AnonIncludeDeleted): Request_[ListContainerVersionsResponse]
}

object VersionHeadersResource {
  @scala.inline
  def apply(
    latest: AnonAlt => CallbackTo[Request_[ContainerVersionHeader]],
    list: AnonIncludeDeleted => CallbackTo[Request_[ListContainerVersionsResponse]]
  ): VersionHeadersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latest")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => latest(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonIncludeDeleted) => list(t0).runNow()))
    __obj.asInstanceOf[VersionHeadersResource]
  }
}

