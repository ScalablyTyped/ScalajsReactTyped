package typingsJapgolly.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a batch image annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse extends js.Object {
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse]] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse] = null): SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse]
  }
}

