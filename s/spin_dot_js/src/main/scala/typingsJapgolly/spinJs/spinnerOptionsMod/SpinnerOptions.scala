package typingsJapgolly.spinJs.spinnerOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerOptions extends js.Object {
  /**
    * The animation name used for the spinner lines. Defaults to 'spinner-line-fade-default'.
    */
  var animation: js.UndefOr[String] = js.undefined
  /**
    * The CSS class to assign to the spinner
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * A CSS color string, or array of strings to set the line color
    */
  var color: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Corner roundness (0..1)
    */
  var corners: js.UndefOr[Double] = js.undefined
  /**
    * 1: clockwise, -1: counterclockwise
    */
  var direction: js.UndefOr[Double] = js.undefined
  /**
    * A CSS color string, or array of strings to set the color that lines will fade to.
    * Defaults to transparent.
    */
  var fadeColor: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Left position relative to parent (defaults to 50%)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * The length of each line
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The number of lines to draw
    */
  var lines: js.UndefOr[Double] = js.undefined
  /**
    * Element positioning
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * The radius of the inner circle
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * The rotation offset
    */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
    * Scales overall size of the spinner
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * Whether to render the default shadow (boolean).
    * A string can be used to set a custom box-shadow value.
    */
  var shadow: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Rounds per second
    */
  var speed: js.UndefOr[Double] = js.undefined
  /**
    * Top position relative to parent (defaults to 50%)
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * The line thickness
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The z-index (defaults to 2000000000)
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object SpinnerOptions {
  @scala.inline
  def apply(
    animation: String = null,
    className: String = null,
    color: String | js.Array[String] = null,
    corners: Int | Double = null,
    direction: Int | Double = null,
    fadeColor: String | js.Array[String] = null,
    left: String = null,
    length: Int | Double = null,
    lines: Int | Double = null,
    position: String = null,
    radius: Int | Double = null,
    rotate: Int | Double = null,
    scale: Int | Double = null,
    shadow: Boolean | String = null,
    speed: Int | Double = null,
    top: String = null,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (corners != null) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (fadeColor != null) __obj.updateDynamic("fadeColor")(fadeColor.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerOptions]
  }
}

