package typingsJapgolly.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Google Cloud Storage location where the input will be read from.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1GcsSource extends js.Object {
  /**
    * Google Cloud Storage URI for the input file. This must only be a Google
    * Cloud Storage object. Wildcards are not currently supported.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1GcsSource {
  @scala.inline
  def apply(uri: String = null): SchemaGoogleCloudVisionV1p3beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1GcsSource]
  }
}

