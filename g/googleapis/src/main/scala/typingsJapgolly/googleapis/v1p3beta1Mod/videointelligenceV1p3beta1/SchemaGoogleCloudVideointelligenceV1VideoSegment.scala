package typingsJapgolly.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1VideoSegment extends js.Object {
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * end of the segment (inclusive).
    */
  var endTimeOffset: js.UndefOr[String] = js.native
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * start of the segment (inclusive).
    */
  var startTimeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1VideoSegment {
  @scala.inline
  def apply(endTimeOffset: String = null, startTimeOffset: String = null): SchemaGoogleCloudVideointelligenceV1VideoSegment = {
    val __obj = js.Dynamic.literal()
    if (endTimeOffset != null) __obj.updateDynamic("endTimeOffset")(endTimeOffset.asInstanceOf[js.Any])
    if (startTimeOffset != null) __obj.updateDynamic("startTimeOffset")(startTimeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1VideoSegment]
  }
}

