package typingsJapgolly.arcgisRestApi.mod

import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.baseline
import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.bottom
import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.center
import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriTS
import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.justify
import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.left
import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.middle
import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.right
import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSymbol extends MarkerSymbol {
  var backgroundColor: js.UndefOr[Color] = js.undefined
   // <size>;
  var borderLineColor: js.UndefOr[Color] = js.undefined
  var borderLineSize: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
   // <size>;
  var haloColor: js.UndefOr[Color] = js.undefined
  var haloSize: js.UndefOr[Double] = js.undefined
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.undefined
  var kerning: js.UndefOr[Boolean] = js.undefined
  var rightToLeft: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_TextSymbol: esriTS
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.undefined
}

object TextSymbol {
  @scala.inline
  def apply(
    `type`: esriTS,
    angle: Int | Double = null,
    backgroundColor: Color = null,
    borderLineColor: Color = null,
    borderLineSize: Int | Double = null,
    color: Color = null,
    font: Font = null,
    haloColor: Color = null,
    haloSize: Int | Double = null,
    horizontalAlignment: left | right | center | justify = null,
    kerning: js.UndefOr[Boolean] = js.undefined,
    rightToLeft: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    text: String = null,
    verticalAlignment: baseline | top | middle | bottom = null,
    xoffset: Int | Double = null,
    yoffset: Int | Double = null
  ): TextSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderLineColor != null) __obj.updateDynamic("borderLineColor")(borderLineColor.asInstanceOf[js.Any])
    if (borderLineSize != null) __obj.updateDynamic("borderLineSize")(borderLineSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (haloColor != null) __obj.updateDynamic("haloColor")(haloColor.asInstanceOf[js.Any])
    if (haloSize != null) __obj.updateDynamic("haloSize")(haloSize.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(kerning)) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbol]
  }
}

