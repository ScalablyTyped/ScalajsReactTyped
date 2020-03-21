package typingsJapgolly.reactSvgPanZoom

import typingsJapgolly.reactSvgPanZoom.mod.ToolbarPosition
import typingsJapgolly.reactSvgPanZoom.reactSvgPanZoomStrings.bottom
import typingsJapgolly.reactSvgPanZoom.reactSvgPanZoomStrings.center
import typingsJapgolly.reactSvgPanZoom.reactSvgPanZoomStrings.left
import typingsJapgolly.reactSvgPanZoom.reactSvgPanZoomStrings.right
import typingsJapgolly.reactSvgPanZoom.reactSvgPanZoomStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var SVGAlignX: js.UndefOr[center | left | right] = js.undefined
  var SVGAlignY: js.UndefOr[center | top | bottom] = js.undefined
  var position: js.UndefOr[ToolbarPosition] = js.undefined
}

object AnonPosition {
  @scala.inline
  def apply(
    SVGAlignX: center | left | right = null,
    SVGAlignY: center | top | bottom = null,
    position: ToolbarPosition = null
  ): AnonPosition = {
    val __obj = js.Dynamic.literal()
    if (SVGAlignX != null) __obj.updateDynamic("SVGAlignX")(SVGAlignX.asInstanceOf[js.Any])
    if (SVGAlignY != null) __obj.updateDynamic("SVGAlignY")(SVGAlignY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

