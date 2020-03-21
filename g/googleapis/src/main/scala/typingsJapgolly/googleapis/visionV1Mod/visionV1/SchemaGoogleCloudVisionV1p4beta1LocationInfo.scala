package typingsJapgolly.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected entity location information.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1LocationInfo extends js.Object {
  /**
    * lat/long location coordinates.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1LocationInfo {
  @scala.inline
  def apply(latLng: SchemaLatLng = null): SchemaGoogleCloudVisionV1p4beta1LocationInfo = {
    val __obj = js.Dynamic.literal()
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1LocationInfo]
  }
}

