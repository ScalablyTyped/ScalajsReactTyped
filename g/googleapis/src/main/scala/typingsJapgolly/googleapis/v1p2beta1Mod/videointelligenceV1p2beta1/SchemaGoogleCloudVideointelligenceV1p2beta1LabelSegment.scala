package typingsJapgolly.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment level annotation results for label detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment extends js.Object {
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Video segment where a label was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    segment: SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment = null
  ): SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment]
  }
}

