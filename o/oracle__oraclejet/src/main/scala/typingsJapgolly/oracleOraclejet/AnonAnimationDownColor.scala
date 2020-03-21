package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.aboveMarker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.afterMarker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.beforeMarker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.belowMarker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.color
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.curved
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.explode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.gradient
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightAndExplode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.human
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.insideBarEdge
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outsideBarEdge
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outsideSlice
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pattern
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.plus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.segmented
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.solid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.square
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.star
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stepped
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.straight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationDownColor extends js.Object {
  var animationDownColor: String
  var animationDuration: Double
  var animationIndicators: none | all
  var animationUpColor: String
  var barGapRatio: Double
  var borderColor: String
  var borderWidth: Double
  var boxPlot: AnonMedianSvgClassName
  var colors: js.Array[String]
  var dataCursor: AnonLineColor
  var dataItemGaps: String
  var dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  var dataLabelStyle: js.Object | js.Array[js.Object]
  var funnelBackgroundColor: String
  var groupSeparators: AnonRendered
  var hoverBehaviorDelay: Double
  var lineStyle: dotted | dashed | solid
  var lineType: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
  var lineWidth: Double
  var markerColor: String
  var markerDisplayed: on | off | auto
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var markerSize: Double
  var marqueeBorderColor: String
  var marqueeColor: String
  var maxBarWidth: Double
  var otherColor: String
  var patterns: js.Array[String]
  var pieFeelerColor: String
  var pieInnerRadius: Double
  var selectionEffect: explode | highlightAndExplode | highlight
  var seriesEffect: color | pattern | gradient
  var shapes: js.Array[String]
  var stackLabelStyle: js.Object
  var stockFallingColor: String
  var stockRangeColor: String
  var stockRisingColor: String
  var stockVolumeColor: String
  var threeDEffect: on | off
  var tooltipLabelStyle: js.Object
  var tooltipValueStyle: js.Object
}

object AnonAnimationDownColor {
  @scala.inline
  def apply(
    animationDownColor: String,
    animationDuration: Double,
    animationIndicators: none | all,
    animationUpColor: String,
    barGapRatio: Double,
    borderColor: String,
    borderWidth: Double,
    boxPlot: AnonMedianSvgClassName,
    colors: js.Array[String],
    dataCursor: AnonLineColor,
    dataItemGaps: String,
    dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto,
    dataLabelStyle: js.Object | js.Array[js.Object],
    funnelBackgroundColor: String,
    groupSeparators: AnonRendered,
    hoverBehaviorDelay: Double,
    lineStyle: dotted | dashed | solid,
    lineType: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto,
    lineWidth: Double,
    markerColor: String,
    markerDisplayed: on | off | auto,
    markerSize: Double,
    marqueeBorderColor: String,
    marqueeColor: String,
    maxBarWidth: Double,
    otherColor: String,
    patterns: js.Array[String],
    pieFeelerColor: String,
    pieInnerRadius: Double,
    selectionEffect: explode | highlightAndExplode | highlight,
    seriesEffect: color | pattern | gradient,
    shapes: js.Array[String],
    stackLabelStyle: js.Object,
    stockFallingColor: String,
    stockRangeColor: String,
    stockRisingColor: String,
    stockVolumeColor: String,
    threeDEffect: on | off,
    tooltipLabelStyle: js.Object,
    tooltipValueStyle: js.Object,
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = null
  ): AnonAnimationDownColor = {
    val __obj = js.Dynamic.literal(animationDownColor = animationDownColor.asInstanceOf[js.Any], animationDuration = animationDuration.asInstanceOf[js.Any], animationIndicators = animationIndicators.asInstanceOf[js.Any], animationUpColor = animationUpColor.asInstanceOf[js.Any], barGapRatio = barGapRatio.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], boxPlot = boxPlot.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataItemGaps = dataItemGaps.asInstanceOf[js.Any], dataLabelPosition = dataLabelPosition.asInstanceOf[js.Any], dataLabelStyle = dataLabelStyle.asInstanceOf[js.Any], funnelBackgroundColor = funnelBackgroundColor.asInstanceOf[js.Any], groupSeparators = groupSeparators.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], markerColor = markerColor.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], marqueeBorderColor = marqueeBorderColor.asInstanceOf[js.Any], marqueeColor = marqueeColor.asInstanceOf[js.Any], maxBarWidth = maxBarWidth.asInstanceOf[js.Any], otherColor = otherColor.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], pieFeelerColor = pieFeelerColor.asInstanceOf[js.Any], pieInnerRadius = pieInnerRadius.asInstanceOf[js.Any], selectionEffect = selectionEffect.asInstanceOf[js.Any], seriesEffect = seriesEffect.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], stackLabelStyle = stackLabelStyle.asInstanceOf[js.Any], stockFallingColor = stockFallingColor.asInstanceOf[js.Any], stockRangeColor = stockRangeColor.asInstanceOf[js.Any], stockRisingColor = stockRisingColor.asInstanceOf[js.Any], stockVolumeColor = stockVolumeColor.asInstanceOf[js.Any], threeDEffect = threeDEffect.asInstanceOf[js.Any], tooltipLabelStyle = tooltipLabelStyle.asInstanceOf[js.Any], tooltipValueStyle = tooltipValueStyle.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationDownColor]
  }
}

