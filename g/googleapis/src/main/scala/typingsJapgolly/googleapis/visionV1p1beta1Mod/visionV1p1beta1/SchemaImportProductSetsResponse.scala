package typingsJapgolly.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ImportProductSets` method.  This message is
  * returned by the google.longrunning.Operations.GetOperation method in the
  * returned google.longrunning.Operation.response field.
  */
@js.native
trait SchemaImportProductSetsResponse extends js.Object {
  /**
    * The list of reference_images that are imported successfully.
    */
  var referenceImages: js.UndefOr[js.Array[SchemaReferenceImage]] = js.native
  /**
    * The rpc status for each ImportProductSet request, including both
    * successes and errors.  The number of statuses here matches the number of
    * lines in the csv file, and statuses[i] stores the success or failure
    * status of processing the i-th line of the csv, starting from line 0.
    */
  var statuses: js.UndefOr[js.Array[SchemaStatus]] = js.native
}

object SchemaImportProductSetsResponse {
  @scala.inline
  def apply(referenceImages: js.Array[SchemaReferenceImage] = null, statuses: js.Array[SchemaStatus] = null): SchemaImportProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (referenceImages != null) __obj.updateDynamic("referenceImages")(referenceImages.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportProductSetsResponse]
  }
}

