package typingsJapgolly.ol.projectionMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var axisOrientation: js.UndefOr[String] = js.undefined
  var code: String
  var extent: js.UndefOr[Extent] = js.undefined
  var getPointResolution: js.UndefOr[js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var metersPerUnit: js.UndefOr[Double] = js.undefined
  var units: js.UndefOr[Units | String] = js.undefined
  var worldExtent: js.UndefOr[Extent] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    code: String,
    axisOrientation: String = null,
    extent: Extent = null,
    getPointResolution: (/* p0 */ Double, /* p1 */ Coordinate) => CallbackTo[Double] = null,
    global: js.UndefOr[Boolean] = js.undefined,
    metersPerUnit: Int | Double = null,
    units: Units | String = null,
    worldExtent: Extent = null
  ): Options = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (axisOrientation != null) __obj.updateDynamic("axisOrientation")(axisOrientation.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (getPointResolution != null) __obj.updateDynamic("getPointResolution")(js.Any.fromFunction2((t0: /* p0 */ scala.Double, t1: /* p1 */ typingsJapgolly.ol.coordinateMod.Coordinate) => getPointResolution(t0, t1).runNow()))
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (metersPerUnit != null) __obj.updateDynamic("metersPerUnit")(metersPerUnit.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (worldExtent != null) __obj.updateDynamic("worldExtent")(worldExtent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

