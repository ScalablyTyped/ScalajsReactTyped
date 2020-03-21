package typingsJapgolly.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotateImageRequest extends js.Object {
  /** Requested features. */
  var features: js.UndefOr[js.Array[Feature]] = js.undefined
  /** The image to be processed. */
  var image: js.UndefOr[Image] = js.undefined
  /** Additional context that may accompany the image. */
  var imageContext: js.UndefOr[ImageContext] = js.undefined
}

object AnnotateImageRequest {
  @scala.inline
  def apply(features: js.Array[Feature] = null, image: Image = null, imageContext: ImageContext = null): AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageContext != null) __obj.updateDynamic("imageContext")(imageContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotateImageRequest]
  }
}

