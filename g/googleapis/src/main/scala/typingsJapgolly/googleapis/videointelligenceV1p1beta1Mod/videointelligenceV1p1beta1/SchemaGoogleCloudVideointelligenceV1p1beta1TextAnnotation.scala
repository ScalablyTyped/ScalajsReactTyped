package typingsJapgolly.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotations related to one detected OCR text snippet. This will contain the
  * corresponding text, confidence value, and frame level information for each
  * detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p1beta1TextAnnotation extends js.Object {
  /**
    * All video segments where OCR detected text appears.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1TextSegment]] = js.native
  /**
    * The detected text.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p1beta1TextAnnotation {
  @scala.inline
  def apply(
    segments: js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1TextSegment] = null,
    text: String = null
  ): SchemaGoogleCloudVideointelligenceV1p1beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1TextAnnotation]
  }
}

