package typingsJapgolly.oracleOraclejet.ojganttMod

import typingsJapgolly.oracleOraclejet.AnonEnd
import typingsJapgolly.oracleOraclejet.AnonValue
import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.innerCenter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.innerEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.innerStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.milestone
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.normal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttTaskSettableProperties extends JetSettableProperties {
  var baseline: AnonEnd
  var borderRadius: String
  var end: String
  var height: Double | Null
  var label: String
  var labelPosition: start | innerCenter | innerStart | innerEnd | end | none
  var labelStyle: js.Object
  var progress: AnonValue
  var rowId: js.UndefOr[js.Any] = js.undefined
  var shortDesc: String | Null
  var start: String
  var svgClassName: String
  var svgStyle: js.Object
  var `type`: normal | milestone | summary | auto
}

object ojGanttTaskSettableProperties {
  @scala.inline
  def apply(
    baseline: AnonEnd,
    borderRadius: String,
    end: String,
    label: String,
    labelPosition: start | innerCenter | innerStart | innerEnd | end | none,
    labelStyle: js.Object,
    progress: AnonValue,
    start: String,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: normal | milestone | summary | auto,
    height: Int | Double = null,
    rowId: js.Any = null,
    shortDesc: String = null
  ): ojGanttTaskSettableProperties = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttTaskSettableProperties]
  }
}

