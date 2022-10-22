package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.chartJs.anon.BackdropColor
import typingsJapgolly.chartJs.anon.BorderDash
import typingsJapgolly.chartJs.chartJsStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialLinearScaleOptions
  extends StObject
     with CoreScaleOptions {
  
  var angleLines: BorderDash
  
  var animate: Boolean
  
  /**
    * if true, scale will include 0 if it is not already included.
    * @default false
    */
  var beginAtZero: Boolean
  
  var grid: GridLineOptions
  
  /**
    * User defined maximum number for the scale, overrides maximum value from data.
    */
  var max: Double
  
  /**
    * User defined minimum number for the scale, overrides minimum value from data.
    */
  var min: Double
  
  var pointLabels: BackdropColor
  
  var startAngle: Double
  
  /**
    * Adjustment used when calculating the maximum data value.
    */
  var suggestedMax: Double
  
  /**
    * Adjustment used when calculating the minimum data value.
    */
  var suggestedMin: Double
  
  var ticks: RadialTickOptions
}
object RadialLinearScaleOptions {
  
  inline def apply(
    afterBuildTicks: Scale[CoreScaleOptions] => Callback,
    afterCalculateLabelRotation: Scale[CoreScaleOptions] => Callback,
    afterDataLimits: Scale[CoreScaleOptions] => Callback,
    afterFit: Scale[CoreScaleOptions] => Callback,
    afterSetDimensions: Scale[CoreScaleOptions] => Callback,
    afterTickToLabelConversion: Scale[CoreScaleOptions] => Callback,
    afterUpdate: Scale[CoreScaleOptions] => Callback,
    alignToPixels: Boolean,
    angleLines: BorderDash,
    animate: Boolean,
    beforeBuildTicks: Scale[CoreScaleOptions] => Callback,
    beforeCalculateLabelRotation: Scale[CoreScaleOptions] => Callback,
    beforeDataLimits: Scale[CoreScaleOptions] => Callback,
    beforeFit: Scale[CoreScaleOptions] => Callback,
    beforeSetDimensions: Scale[CoreScaleOptions] => Callback,
    beforeTickToLabelConversion: Scale[CoreScaleOptions] => Callback,
    beforeUpdate: Scale[CoreScaleOptions] => Callback,
    beginAtZero: Boolean,
    display: Boolean | auto,
    grid: GridLineOptions,
    max: Double,
    min: Double,
    pointLabels: BackdropColor,
    reverse: Boolean,
    startAngle: Double,
    suggestedMax: Double,
    suggestedMin: Double,
    ticks: RadialTickOptions,
    weight: Double
  ): RadialLinearScaleOptions = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterBuildTicks(t0).runNow()), afterCalculateLabelRotation = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterCalculateLabelRotation(t0).runNow()), afterDataLimits = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterDataLimits(t0).runNow()), afterFit = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterFit(t0).runNow()), afterSetDimensions = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterSetDimensions(t0).runNow()), afterTickToLabelConversion = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterTickToLabelConversion(t0).runNow()), afterUpdate = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterUpdate(t0).runNow()), alignToPixels = alignToPixels.asInstanceOf[js.Any], angleLines = angleLines.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeBuildTicks(t0).runNow()), beforeCalculateLabelRotation = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeCalculateLabelRotation(t0).runNow()), beforeDataLimits = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeDataLimits(t0).runNow()), beforeFit = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeFit(t0).runNow()), beforeSetDimensions = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeSetDimensions(t0).runNow()), beforeTickToLabelConversion = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeTickToLabelConversion(t0).runNow()), beforeUpdate = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeUpdate(t0).runNow()), beginAtZero = beginAtZero.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], pointLabels = pointLabels.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], suggestedMax = suggestedMax.asInstanceOf[js.Any], suggestedMin = suggestedMin.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialLinearScaleOptions]
  }
  
  extension [Self <: RadialLinearScaleOptions](x: Self) {
    
    inline def setAngleLines(value: BorderDash): Self = StObject.set(x, "angleLines", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setBeginAtZero(value: Boolean): Self = StObject.set(x, "beginAtZero", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: GridLineOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setPointLabels(value: BackdropColor): Self = StObject.set(x, "pointLabels", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: RadialTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
