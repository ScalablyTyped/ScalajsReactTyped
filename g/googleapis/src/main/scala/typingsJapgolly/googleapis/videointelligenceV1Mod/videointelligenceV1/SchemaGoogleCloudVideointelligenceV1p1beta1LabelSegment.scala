package typingsJapgolly.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment level annotation results for label detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment extends js.Object {
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Video segment where a label was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p1beta1VideoSegment] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    segment: SchemaGoogleCloudVideointelligenceV1p1beta1VideoSegment = null
  ): SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment]
  }
}

