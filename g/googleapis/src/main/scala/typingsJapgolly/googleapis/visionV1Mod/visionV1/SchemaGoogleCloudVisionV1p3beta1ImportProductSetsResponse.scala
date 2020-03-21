package typingsJapgolly.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ImportProductSets` method.  This message is
  * returned by the google.longrunning.Operations.GetOperation method in the
  * returned google.longrunning.Operation.response field.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1ImportProductSetsResponse extends js.Object {
  /**
    * The list of reference_images that are imported successfully.
    */
  var referenceImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1ReferenceImage]] = js.native
  /**
    * The rpc status for each ImportProductSet request, including both
    * successes and errors.  The number of statuses here matches the number of
    * lines in the csv file, and statuses[i] stores the success or failure
    * status of processing the i-th line of the csv, starting from line 0.
    */
  var statuses: js.UndefOr[js.Array[SchemaStatus]] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1ImportProductSetsResponse {
  @scala.inline
  def apply(
    referenceImages: js.Array[SchemaGoogleCloudVisionV1p3beta1ReferenceImage] = null,
    statuses: js.Array[SchemaStatus] = null
  ): SchemaGoogleCloudVisionV1p3beta1ImportProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (referenceImages != null) __obj.updateDynamic("referenceImages")(referenceImages.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1ImportProductSetsResponse]
  }
}

