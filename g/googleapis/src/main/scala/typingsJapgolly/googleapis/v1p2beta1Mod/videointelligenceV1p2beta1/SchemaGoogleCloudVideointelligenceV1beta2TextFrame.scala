package typingsJapgolly.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotation results for text annotation (OCR). Contains
  * information regarding timestamp and bounding box locations for the frames
  * containing detected OCR text snippets.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2TextFrame extends js.Object {
  /**
    * Bounding polygon of the detected text for this frame.
    */
  var rotatedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly] = js.native
  /**
    * Timestamp of this frame.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2TextFrame {
  @scala.inline
  def apply(
    rotatedBoundingBox: SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly = null,
    timeOffset: String = null
  ): SchemaGoogleCloudVideointelligenceV1beta2TextFrame = {
    val __obj = js.Dynamic.literal()
    if (rotatedBoundingBox != null) __obj.updateDynamic("rotatedBoundingBox")(rotatedBoundingBox.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2TextFrame]
  }
}

