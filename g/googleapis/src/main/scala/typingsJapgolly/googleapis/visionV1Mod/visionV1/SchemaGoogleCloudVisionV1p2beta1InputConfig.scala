package typingsJapgolly.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired input location and metadata.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1InputConfig extends js.Object {
  /**
    * The Google Cloud Storage location to read the input from.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1GcsSource] = js.native
  /**
    * The type of the file. Currently only &quot;application/pdf&quot; and
    * &quot;image/tiff&quot; are supported. Wildcards are not supported.
    */
  var mimeType: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1InputConfig {
  @scala.inline
  def apply(gcsSource: SchemaGoogleCloudVisionV1p2beta1GcsSource = null, mimeType: String = null): SchemaGoogleCloudVisionV1p2beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1InputConfig]
  }
}

