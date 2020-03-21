package typingsJapgolly.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Multiple async file annotation requests are batched into a single service
  * call.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest extends js.Object {
  /**
    * Individual async file annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileRequest]] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest {
  @scala.inline
  def apply(requests: js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileRequest] = null): SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesRequest]
  }
}

