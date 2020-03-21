package typingsJapgolly.gapiClientVideointelligence.gapi.client.videointelligence

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientVideointelligence.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /**
    * Performs asynchronous video annotation. Progress and results can be
    * retrieved through the `google.longrunning.Operations` interface.
    * `Operation.metadata` contains `AnnotateVideoProgress` (progress).
    * `Operation.response` contains `AnnotateVideoResponse` (results).
    */
  def annotate(request: AnonAccesstoken): Request_[GoogleLongrunningOperation]
}

object VideosResource {
  @scala.inline
  def apply(annotate: AnonAccesstoken => CallbackTo[Request_[GoogleLongrunningOperation]]): VideosResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVideointelligence.AnonAccesstoken) => annotate(t0).runNow()))
    __obj.asInstanceOf[VideosResource]
  }
}

