package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.area
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.back
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.curved
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.front
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.line
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.segmented
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.solid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stepped
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.straight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayInLegend extends js.Object {
  var categories: js.Array[String]
  var color: String
  var displayInLegend: on | off
  var high: Double
  var id: String
  var items: js.Array[AnonHigh]
  var lineStyle: dotted | dashed | solid
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | straight
  var lineWidth: Double
  var location: front | back
  var low: Double
  var shortDesc: String
  var svgClassName: String
  var svgStyle: js.Object
  var text: String
  var `type`: area | line
  var value: Double
}

object AnonDisplayInLegend {
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    displayInLegend: on | off,
    high: Double,
    id: String,
    items: js.Array[AnonHigh],
    lineStyle: dotted | dashed | solid,
    lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | straight,
    lineWidth: Double,
    location: front | back,
    low: Double,
    shortDesc: String,
    svgClassName: String,
    svgStyle: js.Object,
    text: String,
    `type`: area | line,
    value: Double
  ): AnonDisplayInLegend = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], displayInLegend = displayInLegend.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayInLegend]
  }
}

