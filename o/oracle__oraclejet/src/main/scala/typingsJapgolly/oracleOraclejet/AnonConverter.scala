package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.PieCenterContext
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.billion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.million
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverter extends js.Object {
  var converter: js.Object
  var label: String
  var labelStyle: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  def renderer(context: PieCenterContext): AnonInsert | AnonPreventDefault
}

object AnonConverter {
  @scala.inline
  def apply(
    converter: js.Object,
    label: String,
    labelStyle: js.Object,
    renderer: PieCenterContext => CallbackTo[AnonInsert | AnonPreventDefault],
    scaling: none | thousand | million | billion | trillion | quadrillion | auto
  ): AnonConverter = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any])
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.PieCenterContext) => renderer(t0).runNow()))
    __obj.asInstanceOf[AnonConverter]
  }
}

