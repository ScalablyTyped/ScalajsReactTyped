package typingsJapgolly.jimpPluginResize

import typingsJapgolly.jimpPluginResize.jimpPluginResizeStrings.bezierInterpolation
import typingsJapgolly.jimpPluginResize.jimpPluginResizeStrings.bicubicInterpolation
import typingsJapgolly.jimpPluginResize.jimpPluginResizeStrings.bilinearInterpolation
import typingsJapgolly.jimpPluginResize.jimpPluginResizeStrings.hermiteInterpolation
import typingsJapgolly.jimpPluginResize.jimpPluginResizeStrings.nearestNeighbor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRESIZEBEZIER extends js.Object {
  var RESIZE_BEZIER: bezierInterpolation
  var RESIZE_BICUBIC: bicubicInterpolation
  var RESIZE_BILINEAR: bilinearInterpolation
  var RESIZE_HERMITE: hermiteInterpolation
  // resize methods
  var RESIZE_NEAREST_NEIGHBOR: nearestNeighbor
}

object AnonRESIZEBEZIER {
  @scala.inline
  def apply(
    RESIZE_BEZIER: bezierInterpolation,
    RESIZE_BICUBIC: bicubicInterpolation,
    RESIZE_BILINEAR: bilinearInterpolation,
    RESIZE_HERMITE: hermiteInterpolation,
    RESIZE_NEAREST_NEIGHBOR: nearestNeighbor
  ): AnonRESIZEBEZIER = {
    val __obj = js.Dynamic.literal(RESIZE_BEZIER = RESIZE_BEZIER.asInstanceOf[js.Any], RESIZE_BICUBIC = RESIZE_BICUBIC.asInstanceOf[js.Any], RESIZE_BILINEAR = RESIZE_BILINEAR.asInstanceOf[js.Any], RESIZE_HERMITE = RESIZE_HERMITE.asInstanceOf[js.Any], RESIZE_NEAREST_NEIGHBOR = RESIZE_NEAREST_NEIGHBOR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRESIZEBEZIER]
  }
}

