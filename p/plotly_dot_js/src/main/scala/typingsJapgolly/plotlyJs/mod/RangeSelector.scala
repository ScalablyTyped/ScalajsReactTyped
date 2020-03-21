package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.PartialFont
import typingsJapgolly.plotlyJs.PartialRangeSelectorButto
import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.center
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.middle
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelector extends Label {
  var activecolor: String
  var borderwidth: Double
  var buttons: js.Array[PartialRangeSelectorButto]
  var visible: Boolean
  var x: Double
  var xanchor: auto | left | center | right
  var y: Double
  var yanchor: auto | top | middle | bottom
}

object RangeSelector {
  @scala.inline
  def apply(
    activecolor: String,
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    buttons: js.Array[PartialRangeSelectorButto],
    font: PartialFont,
    visible: Boolean,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): RangeSelector = {
    val __obj = js.Dynamic.literal(activecolor = activecolor.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeSelector]
  }
}

