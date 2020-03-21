package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.mod.Color
import typingsJapgolly.plotlyJs.mod.ColorScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ScatterMarkerLine> */
trait PartialScatterMarkerLine extends js.Object {
  var autocolorscale: js.UndefOr[Boolean] = js.undefined
  var cauto: js.UndefOr[Boolean] = js.undefined
  var cmax: js.UndefOr[Double] = js.undefined
  var cmin: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var colorscale: js.UndefOr[ColorScale] = js.undefined
  var reversescale: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object PartialScatterMarkerLine {
  @scala.inline
  def apply(
    autocolorscale: js.UndefOr[Boolean] = js.undefined,
    cauto: js.UndefOr[Boolean] = js.undefined,
    cmax: Int | Double = null,
    cmin: Int | Double = null,
    color: Color = null,
    colorscale: ColorScale = null,
    reversescale: js.UndefOr[Boolean] = js.undefined,
    width: Double | js.Array[Double] = null
  ): PartialScatterMarkerLine = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autocolorscale)) __obj.updateDynamic("autocolorscale")(autocolorscale.asInstanceOf[js.Any])
    if (!js.isUndefined(cauto)) __obj.updateDynamic("cauto")(cauto.asInstanceOf[js.Any])
    if (cmax != null) __obj.updateDynamic("cmax")(cmax.asInstanceOf[js.Any])
    if (cmin != null) __obj.updateDynamic("cmin")(cmin.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorscale != null) __obj.updateDynamic("colorscale")(colorscale.asInstanceOf[js.Any])
    if (!js.isUndefined(reversescale)) __obj.updateDynamic("reversescale")(reversescale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScatterMarkerLine]
  }
}

