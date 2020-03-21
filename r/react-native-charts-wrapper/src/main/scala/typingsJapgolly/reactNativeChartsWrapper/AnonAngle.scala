package typingsJapgolly.reactNativeChartsWrapper

import typingsJapgolly.reactNativeChartsWrapper.mod.Color
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BL_TR
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM_TOP
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BR_TL
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_RIGHT
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_LEFT
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TL_BR
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP_BOTTOM
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TR_BL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAngle extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var orientation: js.UndefOr[
    TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR
  ] = js.undefined
  var positions: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonAngle {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    colors: js.Array[Color] = null,
    orientation: TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR = null,
    positions: js.Array[Double] = null
  ): AnonAngle = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngle]
  }
}

