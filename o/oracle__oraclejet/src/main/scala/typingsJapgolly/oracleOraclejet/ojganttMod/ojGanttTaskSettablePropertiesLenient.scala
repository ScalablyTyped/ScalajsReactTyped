package typingsJapgolly.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.AnonEnd
import typingsJapgolly.oracleOraclejet.AnonValue
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTaskSettableProperties> */
trait ojGanttTaskSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var baseline: js.UndefOr[AnonEnd] = js.undefined
  var borderRadius: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[start | innerCenter | innerStart | innerEnd | end | none] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var progress: js.UndefOr[AnonValue] = js.undefined
  var rowId: js.UndefOr[js.Any] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[normal | milestone | summary | auto] = js.undefined
}

object ojGanttTaskSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    baseline: AnonEnd = null,
    borderRadius: String = null,
    end: String = null,
    height: Int | Double = null,
    label: String = null,
    labelPosition: start | innerCenter | innerStart | innerEnd | end | none = null,
    labelStyle: js.Object = null,
    progress: AnonValue = null,
    rowId: js.Any = null,
    shortDesc: String = null,
    start: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    `type`: normal | milestone | summary | auto = null
  ): ojGanttTaskSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttTaskSettablePropertiesLenient]
  }
}

