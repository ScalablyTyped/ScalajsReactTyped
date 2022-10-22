package typingsJapgolly.chartJs.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chartJs.chartJsStrings.auto
import typingsJapgolly.chartJs.chartJsStrings.radialLinear
import typingsJapgolly.chartJs.mod.CoreScaleOptions
import typingsJapgolly.chartJs.mod.GridLineOptions
import typingsJapgolly.chartJs.mod.RadialTickOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'radialLinear'} & chart.js.chart.js.RadialLinearScaleOptions */
trait typeradialLinearRadialLin extends StObject {
  
  /**
    * Callback that runs after ticks are created. Useful for filtering ticks.
    */
  def afterBuildTicks(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after tick rotation is determined.
    */
  def afterCalculateLabelRotation(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after data limits are determined.
    */
  def afterDataLimits(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after the scale fits to the canvas.
    */
  def afterFit(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after dimensions are set.
    */
  def afterSetDimensions(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after ticks are converted into strings.
    */
  def afterTickToLabelConversion(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs at the end of the update process.
    */
  def afterUpdate(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Align pixel values to device pixels
    */
  var alignToPixels: Boolean
  
  var angleLines: BorderDash
  
  var animate: Boolean
  
  /**
    * Callback that runs before ticks are created.
    */
  def beforeBuildTicks(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before tick rotation is determined.
    */
  def beforeCalculateLabelRotation(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before data limits are determined.
    */
  def beforeDataLimits(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before the scale fits to the canvas.
    */
  def beforeFit(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before dimensions are set.
    */
  def beforeSetDimensions(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before ticks are converted into strings.
    */
  def beforeTickToLabelConversion(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback called before the update process starts.
    */
  def beforeUpdate(axis: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * if true, scale will include 0 if it is not already included.
    * @default false
    */
  var beginAtZero: Boolean
  
  /**
    * Controls the axis global visibility (visible when true, hidden when false). When display: 'auto', the axis is visible only if at least one associated dataset is visible.
    * @default true
    */
  var display: Boolean | auto
  
  var grid: GridLineOptions
  
  /**
    * User defined maximum number for the scale, overrides maximum value from data.
    */
  var max: Double
  
  /**
    * User defined minimum number for the scale, overrides minimum value from data.
    */
  var min: Double
  
  var pointLabels: BackdropPadding
  
  /**
    * Reverse the scale.
    * @default false
    */
  var reverse: Boolean
  
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
  
  var `type`: radialLinear
  
  /**
    * The weight used to sort the axis. Higher weights are further away from the chart area.
    * @default true
    */
  var weight: Double
}
object typeradialLinearRadialLin {
  
  inline def apply(
    afterBuildTicks: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterCalculateLabelRotation: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterDataLimits: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterFit: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterSetDimensions: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterTickToLabelConversion: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterUpdate: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    alignToPixels: Boolean,
    angleLines: BorderDash,
    animate: Boolean,
    beforeBuildTicks: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeCalculateLabelRotation: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeDataLimits: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeFit: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeSetDimensions: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeTickToLabelConversion: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeUpdate: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beginAtZero: Boolean,
    display: Boolean | auto,
    grid: GridLineOptions,
    max: Double,
    min: Double,
    pointLabels: BackdropPadding,
    reverse: Boolean,
    startAngle: Double,
    suggestedMax: Double,
    suggestedMin: Double,
    ticks: RadialTickOptions,
    weight: Double
  ): typeradialLinearRadialLin = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterBuildTicks(t0).runNow()), afterCalculateLabelRotation = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterCalculateLabelRotation(t0).runNow()), afterDataLimits = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterDataLimits(t0).runNow()), afterFit = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterFit(t0).runNow()), afterSetDimensions = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterSetDimensions(t0).runNow()), afterTickToLabelConversion = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterTickToLabelConversion(t0).runNow()), afterUpdate = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterUpdate(t0).runNow()), alignToPixels = alignToPixels.asInstanceOf[js.Any], angleLines = angleLines.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeBuildTicks(t0).runNow()), beforeCalculateLabelRotation = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeCalculateLabelRotation(t0).runNow()), beforeDataLimits = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeDataLimits(t0).runNow()), beforeFit = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeFit(t0).runNow()), beforeSetDimensions = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeSetDimensions(t0).runNow()), beforeTickToLabelConversion = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeTickToLabelConversion(t0).runNow()), beforeUpdate = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeUpdate(t0).runNow()), beginAtZero = beginAtZero.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], pointLabels = pointLabels.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], suggestedMax = suggestedMax.asInstanceOf[js.Any], suggestedMin = suggestedMin.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("radialLinear")
    __obj.asInstanceOf[typeradialLinearRadialLin]
  }
  
  extension [Self <: typeradialLinearRadialLin](x: Self) {
    
    inline def setAfterBuildTicks(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterCalculateLabelRotation(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterCalculateLabelRotation", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterDataLimits(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterFit(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterFit", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterSetDimensions(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterSetDimensions", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterTickToLabelConversion(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterUpdate(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAlignToPixels(value: Boolean): Self = StObject.set(x, "alignToPixels", value.asInstanceOf[js.Any])
    
    inline def setAngleLines(value: BorderDash): Self = StObject.set(x, "angleLines", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setBeforeBuildTicks(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeCalculateLabelRotation(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeCalculateLabelRotation", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeDataLimits(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeFit(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeSetDimensions(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeSetDimensions", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeTickToLabelConversion(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeUpdate(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeginAtZero(value: Boolean): Self = StObject.set(x, "beginAtZero", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean | auto): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: GridLineOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setPointLabels(value: BackdropPadding): Self = StObject.set(x, "pointLabels", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: RadialTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setType(value: radialLinear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
