package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.mod.Color
import typingsJapgolly.plotlyJs.mod.Dash
import typingsJapgolly.plotlyJs.plotlyJsStrings.hv
import typingsJapgolly.plotlyJs.plotlyJsStrings.hvh
import typingsJapgolly.plotlyJs.plotlyJsStrings.linear
import typingsJapgolly.plotlyJs.plotlyJsStrings.spline
import typingsJapgolly.plotlyJs.plotlyJsStrings.vh
import typingsJapgolly.plotlyJs.plotlyJsStrings.vhv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ScatterLine> */
trait PartialScatterLine extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var dash: js.UndefOr[Dash] = js.undefined
  var shape: js.UndefOr[linear | spline | hv | vh | hvh | vhv] = js.undefined
  var simplify: js.UndefOr[Boolean] = js.undefined
  var smoothing: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialScatterLine {
  @scala.inline
  def apply(
    color: Color = null,
    dash: Dash = null,
    shape: linear | spline | hv | vh | hvh | vhv = null,
    simplify: js.UndefOr[Boolean] = js.undefined,
    smoothing: Int | Double = null,
    width: Int | Double = null
  ): PartialScatterLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(simplify)) __obj.updateDynamic("simplify")(simplify.asInstanceOf[js.Any])
    if (smoothing != null) __obj.updateDynamic("smoothing")(smoothing.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScatterLine]
  }
}

