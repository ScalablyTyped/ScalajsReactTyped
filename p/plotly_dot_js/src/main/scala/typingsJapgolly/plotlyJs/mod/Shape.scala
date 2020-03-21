package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.PartialShapeLine
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

trait Shape extends js.Object {
  var fillcolor: String
  var layer: below | above
  var line: PartialShapeLine
  var name: String
  var opacity: Double
  var path: String
  var templateitemname: String
  var `type`: rect | circle | line | path
  var visible: Boolean
  var x0: Datum
  var x1: Datum
  var xanchor: Double | String
  // x-reference is assigned to the x-values
  var xref: x | paper
  var xsizemode: scaled | pixel
  var y0: Datum
  var y1: Datum
  var yanchor: Double | String
  // y-reference is assigned to the plot paper [0,1]
  var yref: paper | y
  var ysizemode: scaled | pixel
}

object Shape {
  @scala.inline
  def apply(
    fillcolor: String,
    layer: below | above,
    line: PartialShapeLine,
    name: String,
    opacity: Double,
    path: String,
    templateitemname: String,
    `type`: rect | circle | line | path,
    visible: Boolean,
    xanchor: Double | String,
    xref: x | paper,
    xsizemode: scaled | pixel,
    yanchor: Double | String,
    yref: paper | y,
    ysizemode: scaled | pixel,
    x0: Datum = null,
    x1: Datum = null,
    y0: Datum = null,
    y1: Datum = null
  ): Shape = {
    val __obj = js.Dynamic.literal(fillcolor = fillcolor.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], xsizemode = xsizemode.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any], ysizemode = ysizemode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (x0 != null) __obj.updateDynamic("x0")(x0.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

