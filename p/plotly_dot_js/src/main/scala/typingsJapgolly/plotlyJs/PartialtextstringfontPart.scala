package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.center
import typingsJapgolly.plotlyJs.plotlyJsStrings.container
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.middle
import typingsJapgolly.plotlyJs.plotlyJsStrings.paper
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  text  :string,   font  :std.Partial<plotly.js.plotly.js.Font>,   xref  :'container' | 'paper',   yref  :'container' | 'paper',   x  :number,   y  :number,   xanchor  :'auto' | 'left' | 'center' | 'right',   yanchor  :'auto' | 'top' | 'middle' | 'bottom',   pad  :std.Partial<plotly.js.plotly.js.Padding>}> */
trait PartialtextstringfontPart extends js.Object {
  var font: js.UndefOr[PartialFont] = js.undefined
  var pad: js.UndefOr[PartialPadding] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  var xref: js.UndefOr[container | paper] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
  var yref: js.UndefOr[container | paper] = js.undefined
}

object PartialtextstringfontPart {
  @scala.inline
  def apply(
    font: PartialFont = null,
    pad: PartialPadding = null,
    text: String = null,
    x: Int | Double = null,
    xanchor: auto | left | center | right = null,
    xref: container | paper = null,
    y: Int | Double = null,
    yanchor: auto | top | middle | bottom = null,
    yref: container | paper = null
  ): PartialtextstringfontPart = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (xref != null) __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    if (yref != null) __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialtextstringfontPart]
  }
}

