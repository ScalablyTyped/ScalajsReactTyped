package typingsJapgolly.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A vertex represents a 2D point in the image. NOTE: the normalized vertex
  * coordinates are relative to the original image and range from 0 to 1.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1NormalizedVertex extends js.Object {
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1NormalizedVertex {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): SchemaGoogleCloudVisionV1p4beta1NormalizedVertex = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1NormalizedVertex]
  }
}

