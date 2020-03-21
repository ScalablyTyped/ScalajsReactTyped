package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.billion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.insideIndicatorEdge
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.million
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.number
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outsideIndicatorEdge
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outsidePlotArea
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.percent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.trillion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.withLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverterPosition extends js.Object {
  var converter: js.UndefOr[Converter[String]] = js.undefined
  var position: js.UndefOr[
    center | insideIndicatorEdge | outsideIndicatorEdge | outsidePlotArea | withLabel | auto
  ] = js.undefined
  var rendered: js.UndefOr[on | off | auto] = js.undefined
  var scaling: js.UndefOr[none | thousand | million | billion | trillion | quadrillion | auto] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textType: js.UndefOr[percent | number] = js.undefined
}

object AnonConverterPosition {
  @scala.inline
  def apply(
    converter: Converter[String] = null,
    position: center | insideIndicatorEdge | outsideIndicatorEdge | outsidePlotArea | withLabel | auto = null,
    rendered: on | off | auto = null,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto = null,
    style: js.Object = null,
    text: String = null,
    textType: percent | number = null
  ): AnonConverterPosition = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textType != null) __obj.updateDynamic("textType")(textType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConverterPosition]
  }
}

