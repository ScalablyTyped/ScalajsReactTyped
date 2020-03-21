package typingsJapgolly.gapiClientVision.gapi.client.vision

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientVision.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Run image detection and annotation for a batch of images. */
  def annotate(request: AnonAccesstoken): Request_[BatchAnnotateImagesResponse]
}

object ImagesResource {
  @scala.inline
  def apply(annotate: AnonAccesstoken => CallbackTo[Request_[BatchAnnotateImagesResponse]]): ImagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVision.AnonAccesstoken) => annotate(t0).runNow()))
    __obj.asInstanceOf[ImagesResource]
  }
}

