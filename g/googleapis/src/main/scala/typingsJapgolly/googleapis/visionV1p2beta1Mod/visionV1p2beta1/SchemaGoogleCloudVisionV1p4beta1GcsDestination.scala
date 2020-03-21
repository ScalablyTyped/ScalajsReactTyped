package typingsJapgolly.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Google Cloud Storage location where the output will be written to.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1GcsDestination extends js.Object {
  /**
    * Google Cloud Storage URI where the results will be stored. Results will
    * be in JSON format and preceded by its corresponding input URI. This field
    * can either represent a single file, or a prefix for multiple outputs.
    * Prefixes must end in a `/`.  Examples:  *    File:
    * gs://bucket-name/filename.json *    Prefix: gs://bucket-name/prefix/here/
    * *    File: gs://bucket-name/prefix/here  If multiple outputs, each
    * response is still AnnotateFileResponse, each of which contains some
    * subset of the full list of AnnotateImageResponse. Multiple outputs can
    * happen if, for example, the output JSON is too large and overflows into
    * multiple sharded files.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1GcsDestination {
  @scala.inline
  def apply(uri: String = null): SchemaGoogleCloudVisionV1p4beta1GcsDestination = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1GcsDestination]
  }
}

