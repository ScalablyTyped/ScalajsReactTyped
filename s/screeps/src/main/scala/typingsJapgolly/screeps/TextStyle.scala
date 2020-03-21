package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsStrings.center
import typingsJapgolly.screeps.screepsStrings.left
import typingsJapgolly.screeps.screepsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  var align: js.UndefOr[center | left | right] = js.undefined
  /**
    * Background color in any web format, default is undefined (no background).When background is enabled, text vertical align is set to middle (default is baseline).
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Background rectangle padding, default is 0.3.
    */
  var backgroundPadding: js.UndefOr[Double] = js.undefined
  /**
    * Font color in any web format, default is #ffffff(white).
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Either a number or a string in one of the following forms:
    * 0.7 - relative size in game coordinates
    * 20px - absolute size in pixels
    * 0.7 serif
    * bold italic 1.5 Times New Roman
    */
  var font: js.UndefOr[Double | String] = js.undefined
  /**
    * Opacity value, default is 1.0.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Stroke color in any web format, default is undefined (no stroke).
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * Stroke width, default is 0.15.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    align: center | left | right = null,
    backgroundColor: String = null,
    backgroundPadding: Int | Double = null,
    color: String = null,
    font: Double | String = null,
    opacity: Int | Double = null,
    stroke: String = null,
    strokeWidth: Int | Double = null
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundPadding != null) __obj.updateDynamic("backgroundPadding")(backgroundPadding.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

