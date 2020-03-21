package typingsJapgolly.gapiClientToolresults.gapi.client.toolresults

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientToolresults.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailsResource extends js.Object {
  /**
    * Lists thumbnails of images attached to a step.
    *
    * May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read from the project, or from any of the
    * images - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the step does not exist, or if any of the images do not exist
    */
  def list(request: AnonOauthtoken): Request_[ListStepThumbnailsResponse]
}

object ThumbnailsResource {
  @scala.inline
  def apply(list: AnonOauthtoken => CallbackTo[Request_[ListStepThumbnailsResponse]]): ThumbnailsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonOauthtoken) => list(t0).runNow()))
    __obj.asInstanceOf[ThumbnailsResource]
  }
}

