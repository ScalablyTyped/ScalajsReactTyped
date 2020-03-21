package typingsJapgolly.proj4leaflet.mod.leafletAugmentingMod.Proj

import typingsJapgolly.leaflet.mod.Bounds_
import typingsJapgolly.leaflet.mod.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjCRSOptions extends js.Object {
  var bounds: js.UndefOr[Bounds_] = js.undefined
  var origin: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var scales: js.UndefOr[js.Array[Double]] = js.undefined
  var transformation: js.UndefOr[Transformation] = js.undefined
}

object ProjCRSOptions {
  @scala.inline
  def apply(
    bounds: Bounds_ = null,
    origin: js.Tuple2[Double, Double] = null,
    resolutions: js.Array[Double] = null,
    scales: js.Array[Double] = null,
    transformation: Transformation = null
  ): ProjCRSOptions = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (transformation != null) __obj.updateDynamic("transformation")(transformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjCRSOptions]
  }
}

