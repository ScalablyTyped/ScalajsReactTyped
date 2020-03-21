package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.MaterialProperty
import typingsJapgolly.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFill extends js.Object {
  var cornerType: js.UndefOr[Property] = js.undefined
  var extrudedHeight: js.UndefOr[Property] = js.undefined
  var fill: js.UndefOr[Property] = js.undefined
  var granularity: js.UndefOr[Property] = js.undefined
  var height: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var outline: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Property] = js.undefined
  var outlineWidth: js.UndefOr[Property] = js.undefined
  var positions: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var width: js.UndefOr[Property] = js.undefined
}

object AnonFill {
  @scala.inline
  def apply(
    cornerType: Property = null,
    extrudedHeight: Property = null,
    fill: Property = null,
    granularity: Property = null,
    height: Property = null,
    material: MaterialProperty = null,
    outline: Property = null,
    outlineColor: Property = null,
    outlineWidth: Property = null,
    positions: Property = null,
    show: Property = null,
    width: Property = null
  ): AnonFill = {
    val __obj = js.Dynamic.literal()
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType.asInstanceOf[js.Any])
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFill]
  }
}

