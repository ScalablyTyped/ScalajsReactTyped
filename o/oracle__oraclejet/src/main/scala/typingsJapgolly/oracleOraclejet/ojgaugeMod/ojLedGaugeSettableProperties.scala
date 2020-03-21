package typingsJapgolly.oracleOraclejet.ojgaugeMod

import typingsJapgolly.oracleOraclejet.Anon8
import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.AnonText
import typingsJapgolly.oracleOraclejet.AnonTextType
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`0`
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`180`
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`270`
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`90`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.human
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.square
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.star
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLedGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var borderColor: String
  var color: String
  var label: AnonText
  var max: Double
  var metricLabel: AnonTextType
  var min: Double
  var rotation: `90` | `180` | `270` | `0`
  var size: Double
  var svgClassName: String
  var svgStyle: js.Object
  var thresholds: js.Array[Threshold]
  var tooltip: Anon8
  var `type`: arrow | diamond | square | rectangle | triangle | star | human | circle
  var value: Double | Null
  var visualEffects: none | auto
}

object ojLedGaugeSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    label: AnonText,
    max: Double,
    metricLabel: AnonTextType,
    min: Double,
    rotation: `90` | `180` | `270` | `0`,
    size: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholds: js.Array[Threshold],
    tooltip: Anon8,
    trackResize: on | off,
    translations: AnonLabelAndValue,
    `type`: arrow | diamond | square | rectangle | triangle | star | human | circle,
    visualEffects: none | auto,
    value: Int | Double = null
  ): ojLedGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeSettableProperties]
  }
}

