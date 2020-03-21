package typingsJapgolly.gapiClientCloudbuild.gapi.client.cloudbuild

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudbuild.AnonBearertoken
import typingsJapgolly.gapiClientCloudbuild.AnonCallback
import typingsJapgolly.gapiClientCloudbuild.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildsResource extends js.Object {
  /** Cancels a requested build in progress. */
  def cancel(request: AnonBearertoken): Request_[Build]
  /**
    * Starts a build with the specified configuration.
    *
    * The long-running Operation returned by this method will include the ID of
    * the build, which can be passed to GetBuild to determine its status (e.g.,
    * success or failure).
    */
  def create(request: AnonCallback): Request_[Operation]
  /**
    * Returns information about a previously requested build.
    *
    * The Build that is returned includes its status (e.g., success or failure,
    * or in-progress), and timing information.
    */
  def get(request: AnonBearertoken): Request_[Build]
  /**
    * Lists previously requested builds.
    *
    * Previously requested builds may still be in-progress, or may have finished
    * successfully or unsuccessfully.
    */
  def list(request: AnonFields): Request_[ListBuildsResponse]
}

object BuildsResource {
  @scala.inline
  def apply(
    cancel: AnonBearertoken => CallbackTo[Request_[Build]],
    create: AnonCallback => CallbackTo[Request_[Operation]],
    get: AnonBearertoken => CallbackTo[Request_[Build]],
    list: AnonFields => CallbackTo[Request_[ListBuildsResponse]]
  ): BuildsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbuild.AnonBearertoken) => cancel(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbuild.AnonCallback) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbuild.AnonBearertoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbuild.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[BuildsResource]
  }
}

