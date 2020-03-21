package typingsJapgolly.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotation results for explicit content.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame extends js.Object {
  /**
    * Likelihood of the pornography content..
    */
  var pornographyLikelihood: js.UndefOr[String] = js.native
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame {
  @scala.inline
  def apply(pornographyLikelihood: String = null, timeOffset: String = null): SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    if (pornographyLikelihood != null) __obj.updateDynamic("pornographyLikelihood")(pornographyLikelihood.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame]
  }
}

