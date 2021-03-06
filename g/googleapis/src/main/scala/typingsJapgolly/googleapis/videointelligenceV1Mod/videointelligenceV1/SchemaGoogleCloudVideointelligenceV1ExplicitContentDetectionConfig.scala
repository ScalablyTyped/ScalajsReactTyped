package typingsJapgolly.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for EXPLICIT_CONTENT_DETECTION.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1ExplicitContentDetectionConfig extends js.Object {
  /**
    * Model to use for explicit content detection. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1ExplicitContentDetectionConfig {
  @scala.inline
  def apply(model: String = null): SchemaGoogleCloudVideointelligenceV1ExplicitContentDetectionConfig = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1ExplicitContentDetectionConfig]
  }
}

