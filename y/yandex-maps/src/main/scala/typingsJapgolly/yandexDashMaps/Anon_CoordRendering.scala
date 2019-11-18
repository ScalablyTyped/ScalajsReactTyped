package typingsJapgolly.yandexDashMaps

import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IProjection
import typingsJapgolly.yandexDashMaps.yandexDashMapsStrings.jumpy
import typingsJapgolly.yandexDashMaps.yandexDashMapsStrings.shortestPath
import typingsJapgolly.yandexDashMaps.yandexDashMapsStrings.static
import typingsJapgolly.yandexDashMaps.yandexDashMapsStrings.straightPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoordRendering extends js.Object {
  var coordRendering: js.UndefOr[shortestPath | straightPath] = js.undefined
  var geodesic: js.UndefOr[Boolean] = js.undefined
  var pixelRendering: js.UndefOr[jumpy | static] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
  var simplification: js.UndefOr[Boolean] = js.undefined
}

object Anon_CoordRendering {
  @scala.inline
  def apply(
    coordRendering: shortestPath | straightPath = null,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    pixelRendering: jumpy | static = null,
    projection: IProjection = null,
    simplification: js.UndefOr[Boolean] = js.undefined
  ): Anon_CoordRendering = {
    val __obj = js.Dynamic.literal()
    if (coordRendering != null) __obj.updateDynamic("coordRendering")(coordRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic.asInstanceOf[js.Any])
    if (pixelRendering != null) __obj.updateDynamic("pixelRendering")(pixelRendering.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(simplification)) __obj.updateDynamic("simplification")(simplification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CoordRendering]
  }
}

