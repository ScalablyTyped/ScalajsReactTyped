package typingsJapgolly.oracleOraclejet.ojchartMod

import typingsJapgolly.oracleOraclejet.Anon0
import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.area
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bar
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.curved
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.human
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.line
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.min
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.plus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.segmented
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.solid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.square
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.star
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stepped
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.straight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSparkChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double | Null
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var areaColor: String
  var areaSvgClassName: String
  var areaSvgStyle: js.Object
  var as: String
  var barGapRatio: Double
  var baselineScaling: zero | min
  var color: String
  var data: (DataProvider[K, D]) | Null
  var firstColor: String
  var highColor: String
  var lastColor: String
  var lineStyle: dotted | dashed | solid
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
  var lineWidth: Double
  var lowColor: String
  var markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  var markerSize: Double
  var referenceObjects: js.Array[ReferenceObject]
  var svgClassName: String
  var svgStyle: js.Object
  var tooltip: Anon0
  @JSName("translations")
  var translations_ojSparkChartSettableProperties: AnonLabelAndValue
  var `type`: area | lineWithArea | bar | line
  var visualEffects: none | auto
}

object ojSparkChartSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    areaColor: String,
    areaSvgClassName: String,
    areaSvgStyle: js.Object,
    as: String,
    barGapRatio: Double,
    baselineScaling: zero | min,
    color: String,
    firstColor: String,
    highColor: String,
    lastColor: String,
    lineStyle: dotted | dashed | solid,
    lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight,
    lineWidth: Double,
    lowColor: String,
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String,
    markerSize: Double,
    referenceObjects: js.Array[ReferenceObject],
    svgClassName: String,
    svgStyle: js.Object,
    tooltip: Anon0,
    trackResize: on | off,
    translations: AnonLabelAndValue,
    `type`: area | lineWithArea | bar | line,
    visualEffects: none | auto,
    animationDuration: Int | Double = null,
    data: DataProvider[K, D] = null
  ): ojSparkChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], areaColor = areaColor.asInstanceOf[js.Any], areaSvgClassName = areaSvgClassName.asInstanceOf[js.Any], areaSvgStyle = areaSvgStyle.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], barGapRatio = barGapRatio.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], firstColor = firstColor.asInstanceOf[js.Any], highColor = highColor.asInstanceOf[js.Any], lastColor = lastColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], lowColor = lowColor.asInstanceOf[js.Any], markerShape = markerShape.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartSettableProperties[K, D]]
  }
}

