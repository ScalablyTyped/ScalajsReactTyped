package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.linear
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.log
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.min
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaselineScaling extends js.Object {
  var axisLine: AnonLineColorLineWidth
  var baselineScaling: min | zero
  var dataMax: Double
  var dataMin: Double
  var majorTick: AnonBaselineColor
  var max: Double
  var maxSize: String
  var min: Double
  var minStep: Double
  var minorStep: Double
  var minorTick: AnonLineStyle
  var position: start | end | top | bottom | auto
  var referenceObjects: js.Array[AnonDisplayInLegend]
  var rendered: off | on
  var scale: log | linear
  var size: String
  var step: Double
  var tickLabel: AnonPosition
  var title: String
  var titleStyle: js.Object
  var viewportMax: Double
  var viewportMin: Double
}

object AnonBaselineScaling {
  @scala.inline
  def apply(
    axisLine: AnonLineColorLineWidth,
    baselineScaling: min | zero,
    dataMax: Double,
    dataMin: Double,
    majorTick: AnonBaselineColor,
    max: Double,
    maxSize: String,
    min: Double,
    minStep: Double,
    minorStep: Double,
    minorTick: AnonLineStyle,
    position: start | end | top | bottom | auto,
    referenceObjects: js.Array[AnonDisplayInLegend],
    rendered: off | on,
    scale: log | linear,
    size: String,
    step: Double,
    tickLabel: AnonPosition,
    title: String,
    titleStyle: js.Object,
    viewportMax: Double,
    viewportMin: Double
  ): AnonBaselineScaling = {
    val __obj = js.Dynamic.literal(axisLine = axisLine.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], majorTick = majorTick.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minStep = minStep.asInstanceOf[js.Any], minorStep = minorStep.asInstanceOf[js.Any], minorTick = minorTick.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tickLabel = tickLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any], viewportMax = viewportMax.asInstanceOf[js.Any], viewportMin = viewportMin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBaselineScaling]
  }
}

