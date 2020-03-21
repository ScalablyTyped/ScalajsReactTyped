package typingsJapgolly.arcgisRestApi.mod

import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriSLS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleLineSymbol extends Symbol {
  var color: js.UndefOr[Color] = js.undefined
  @JSName("style")
  var style_SimpleLineSymbol: js.UndefOr[SimpleLineSymbolStyle] = js.undefined
  @JSName("type")
  var type_SimpleLineSymbol: esriSLS
  var width: js.UndefOr[Double] = js.undefined
}

object SimpleLineSymbol {
  @scala.inline
  def apply(
    `type`: esriSLS,
    color: Color = null,
    style: SimpleLineSymbolStyle = null,
    width: Int | Double = null
  ): SimpleLineSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleLineSymbol]
  }
}

