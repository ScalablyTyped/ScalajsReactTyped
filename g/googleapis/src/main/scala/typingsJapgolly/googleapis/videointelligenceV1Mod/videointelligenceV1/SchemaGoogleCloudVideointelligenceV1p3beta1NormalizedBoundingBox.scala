package typingsJapgolly.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Normalized bounding box. The normalized vertex coordinates are relative to
  * the original image. Range: [0, 1].
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox extends js.Object {
  /**
    * Bottom Y coordinate.
    */
  var bottom: js.UndefOr[Double] = js.native
  /**
    * Left X coordinate.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * Right X coordinate.
    */
  var right: js.UndefOr[Double] = js.native
  /**
    * Top Y coordinate.
    */
  var top: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox]
  }
}

