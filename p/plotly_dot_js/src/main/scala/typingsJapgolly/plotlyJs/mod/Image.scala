package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.above
import typingsJapgolly.plotlyJs.plotlyJsStrings.below
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.center
import typingsJapgolly.plotlyJs.plotlyJsStrings.contain
import typingsJapgolly.plotlyJs.plotlyJsStrings.fill
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.middle
import typingsJapgolly.plotlyJs.plotlyJsStrings.paper
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.stretch
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import typingsJapgolly.plotlyJs.plotlyJsStrings.x
import typingsJapgolly.plotlyJs.plotlyJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var layer: above | below
  var opacity: Double
  var sizex: Double
  var sizey: Double
  var sizing: fill | contain | stretch
  var source: String
  var visible: Boolean
  var x: Double | String
  var xanchor: left | center | right
  var xref: paper | x
  var y: Double | String
  var yanchor: top | middle | bottom
  var yref: paper | y
}

object Image {
  @scala.inline
  def apply(
    layer: above | below,
    opacity: Double,
    sizex: Double,
    sizey: Double,
    sizing: fill | contain | stretch,
    source: String,
    visible: Boolean,
    x: Double | String,
    xanchor: left | center | right,
    xref: paper | x,
    y: Double | String,
    yanchor: top | middle | bottom,
    yref: paper | y
  ): Image = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], sizex = sizex.asInstanceOf[js.Any], sizey = sizey.asInstanceOf[js.Any], sizing = sizing.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Image]
  }
}

