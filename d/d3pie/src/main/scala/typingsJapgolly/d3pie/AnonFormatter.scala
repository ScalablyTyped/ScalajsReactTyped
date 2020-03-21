package typingsJapgolly.d3pie

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.d3pie.d3pie.ID3PieLabelsOptions
import typingsJapgolly.d3pie.d3pie.ID3PieStyleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatter extends js.Object {
  var formatter: js.UndefOr[js.Function1[/* context */ AnonSection, String]] = js.undefined
  var inner: js.UndefOr[ID3PieLabelsOptions] = js.undefined
  var lines: js.UndefOr[AnonEnabled] = js.undefined
  var mainLabel: js.UndefOr[ID3PieStyleOptions] = js.undefined
  var outer: js.UndefOr[pieDistancenumberID3PieLa] = js.undefined
  var percentage: js.UndefOr[decimalPlacesnumberID3Pie] = js.undefined
  var truncation: js.UndefOr[AnonTruncateLength] = js.undefined
  var value: js.UndefOr[ID3PieStyleOptions] = js.undefined
}

object AnonFormatter {
  @scala.inline
  def apply(
    formatter: /* context */ AnonSection => CallbackTo[String] = null,
    inner: ID3PieLabelsOptions = null,
    lines: AnonEnabled = null,
    mainLabel: ID3PieStyleOptions = null,
    outer: pieDistancenumberID3PieLa = null,
    percentage: decimalPlacesnumberID3Pie = null,
    truncation: AnonTruncateLength = null,
    value: ID3PieStyleOptions = null
  ): AnonFormatter = {
    val __obj = js.Dynamic.literal()
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.d3pie.AnonSection) => formatter(t0).runNow()))
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (mainLabel != null) __obj.updateDynamic("mainLabel")(mainLabel.asInstanceOf[js.Any])
    if (outer != null) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (truncation != null) __obj.updateDynamic("truncation")(truncation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatter]
  }
}

