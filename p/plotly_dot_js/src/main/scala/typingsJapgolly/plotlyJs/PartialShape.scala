package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.mod.Datum
import typingsJapgolly.plotlyJs.plotlyJsStrings.above
import typingsJapgolly.plotlyJs.plotlyJsStrings.below
import typingsJapgolly.plotlyJs.plotlyJsStrings.circle
import typingsJapgolly.plotlyJs.plotlyJsStrings.line
import typingsJapgolly.plotlyJs.plotlyJsStrings.paper
import typingsJapgolly.plotlyJs.plotlyJsStrings.path
import typingsJapgolly.plotlyJs.plotlyJsStrings.pixel
import typingsJapgolly.plotlyJs.plotlyJsStrings.rect
import typingsJapgolly.plotlyJs.plotlyJsStrings.scaled
import typingsJapgolly.plotlyJs.plotlyJsStrings.x
import typingsJapgolly.plotlyJs.plotlyJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Shape> */
trait PartialShape extends js.Object {
  var fillcolor: js.UndefOr[String] = js.undefined
  var layer: js.UndefOr[below | above] = js.undefined
  var line: js.UndefOr[PartialShapeLine] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var templateitemname: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[rect | circle | line | path] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var x0: js.UndefOr[Datum] = js.undefined
  var x1: js.UndefOr[Datum] = js.undefined
  var xanchor: js.UndefOr[Double | String] = js.undefined
  var xref: js.UndefOr[x | paper] = js.undefined
  var xsizemode: js.UndefOr[scaled | pixel] = js.undefined
  var y0: js.UndefOr[Datum] = js.undefined
  var y1: js.UndefOr[Datum] = js.undefined
  var yanchor: js.UndefOr[Double | String] = js.undefined
  var yref: js.UndefOr[paper | y] = js.undefined
  var ysizemode: js.UndefOr[scaled | pixel] = js.undefined
}

object PartialShape {
  @scala.inline
  def apply(
    fillcolor: String = null,
    layer: below | above = null,
    line: PartialShapeLine = null,
    name: String = null,
    opacity: Int | Double = null,
    path: String = null,
    templateitemname: String = null,
    `type`: rect | circle | line | path = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x0: Datum = null,
    x1: Datum = null,
    xanchor: Double | String = null,
    xref: x | paper = null,
    xsizemode: scaled | pixel = null,
    y0: Datum = null,
    y1: Datum = null,
    yanchor: Double | String = null,
    yref: paper | y = null,
    ysizemode: scaled | pixel = null
  ): PartialShape = {
    val __obj = js.Dynamic.literal()
    if (fillcolor != null) __obj.updateDynamic("fillcolor")(fillcolor.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (templateitemname != null) __obj.updateDynamic("templateitemname")(templateitemname.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x0 != null) __obj.updateDynamic("x0")(x0.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (xref != null) __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    if (xsizemode != null) __obj.updateDynamic("xsizemode")(xsizemode.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    if (yref != null) __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    if (ysizemode != null) __obj.updateDynamic("ysizemode")(ysizemode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialShape]
  }
}

