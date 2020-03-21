package typingsJapgolly.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderHeightWidthRadiusProps extends LoaderHeightWidthProps {
  var margin: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var radiusUnit: js.UndefOr[String] = js.undefined
}

object LoaderHeightWidthRadiusProps {
  @scala.inline
  def apply(
    color: String = null,
    css: String | PrecompiledCss = null,
    height: Int | Double = null,
    heightUnit: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    margin: String = null,
    radius: Int | Double = null,
    radiusUnit: String = null,
    width: Int | Double = null,
    widthUnit: String = null
  ): LoaderHeightWidthRadiusProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightUnit != null) __obj.updateDynamic("heightUnit")(heightUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusUnit != null) __obj.updateDynamic("radiusUnit")(radiusUnit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthUnit != null) __obj.updateDynamic("widthUnit")(widthUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderHeightWidthRadiusProps]
  }
}

