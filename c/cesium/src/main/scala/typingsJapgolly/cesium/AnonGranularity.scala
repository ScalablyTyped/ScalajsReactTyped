package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.CornerType
import typingsJapgolly.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGranularity extends js.Object {
  var cornerType: js.UndefOr[CornerType] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var positions: js.Array[Cartesian3]
  var width: Double
}

object AnonGranularity {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    width: Double,
    cornerType: CornerType = null,
    ellipsoid: Ellipsoid = null,
    extrudedHeight: Int | Double = null,
    granularity: Int | Double = null,
    height: Int | Double = null
  ): AnonGranularity = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGranularity]
  }
}

