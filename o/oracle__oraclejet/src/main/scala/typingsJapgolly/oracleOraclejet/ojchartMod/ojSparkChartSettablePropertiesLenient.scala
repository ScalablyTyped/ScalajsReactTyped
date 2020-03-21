package typingsJapgolly.oracleOraclejet.ojchartMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.Anon0
import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChartSettableProperties<K, D>> */
trait ojSparkChartSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  var areaColor: js.UndefOr[String] = js.undefined
  var areaSvgClassName: js.UndefOr[String] = js.undefined
  var areaSvgStyle: js.UndefOr[js.Object] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var barGapRatio: js.UndefOr[Double] = js.undefined
  var baselineScaling: js.UndefOr[zero | min] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var firstColor: js.UndefOr[String] = js.undefined
  var highColor: js.UndefOr[String] = js.undefined
  var lastColor: js.UndefOr[String] = js.undefined
  var lineStyle: js.UndefOr[dotted | dashed | solid] = js.undefined
  var lineType: js.UndefOr[
    curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
  ] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var lowColor: js.UndefOr[String] = js.undefined
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var markerSize: js.UndefOr[Double] = js.undefined
  var referenceObjects: js.UndefOr[js.Array[ReferenceObject]] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[Anon0] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
  var `type`: js.UndefOr[area | lineWithArea | bar | line] = js.undefined
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}

object ojSparkChartSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animationDuration: Int | Double = null,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | none = null,
    areaColor: String = null,
    areaSvgClassName: String = null,
    areaSvgStyle: js.Object = null,
    as: String = null,
    barGapRatio: Int | Double = null,
    baselineScaling: zero | min = null,
    color: String = null,
    data: DataProvider[K, D] = null,
    firstColor: String = null,
    highColor: String = null,
    lastColor: String = null,
    lineStyle: dotted | dashed | solid = null,
    lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = null,
    lineWidth: Int | Double = null,
    lowColor: String = null,
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = null,
    markerSize: Int | Double = null,
    referenceObjects: js.Array[ReferenceObject] = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    tooltip: Anon0 = null,
    trackResize: on | off = null,
    translations: AnonLabelAndValue = null,
    `type`: area | lineWithArea | bar | line = null,
    visualEffects: none | auto = null
  ): ojSparkChartSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (areaColor != null) __obj.updateDynamic("areaColor")(areaColor.asInstanceOf[js.Any])
    if (areaSvgClassName != null) __obj.updateDynamic("areaSvgClassName")(areaSvgClassName.asInstanceOf[js.Any])
    if (areaSvgStyle != null) __obj.updateDynamic("areaSvgStyle")(areaSvgStyle.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (barGapRatio != null) __obj.updateDynamic("barGapRatio")(barGapRatio.asInstanceOf[js.Any])
    if (baselineScaling != null) __obj.updateDynamic("baselineScaling")(baselineScaling.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (firstColor != null) __obj.updateDynamic("firstColor")(firstColor.asInstanceOf[js.Any])
    if (highColor != null) __obj.updateDynamic("highColor")(highColor.asInstanceOf[js.Any])
    if (lastColor != null) __obj.updateDynamic("lastColor")(lastColor.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (lowColor != null) __obj.updateDynamic("lowColor")(lowColor.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (referenceObjects != null) __obj.updateDynamic("referenceObjects")(referenceObjects.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visualEffects != null) __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartSettablePropertiesLenient[K, D]]
  }
}

