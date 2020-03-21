package typingsJapgolly.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends Geometry {
  var m: js.UndefOr[Double] = js.undefined
  var x: Double
  var y: Double
  var z: js.UndefOr[Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(
    x: Double,
    y: Double,
    m: Int | Double = null,
    spatialReference: SpatialReference = null,
    z: Int | Double = null
  ): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

