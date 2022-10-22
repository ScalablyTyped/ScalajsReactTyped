package typingsJapgolly.chartJs.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chartJs.chartJsStrings.auto
import typingsJapgolly.chartJs.chartJsStrings.bottom
import typingsJapgolly.chartJs.chartJsStrings.center
import typingsJapgolly.chartJs.chartJsStrings.data
import typingsJapgolly.chartJs.chartJsStrings.left
import typingsJapgolly.chartJs.chartJsStrings.logarithmic
import typingsJapgolly.chartJs.chartJsStrings.right
import typingsJapgolly.chartJs.chartJsStrings.single
import typingsJapgolly.chartJs.chartJsStrings.ticks
import typingsJapgolly.chartJs.chartJsStrings.top
import typingsJapgolly.chartJs.chartJsStrings.x
import typingsJapgolly.chartJs.chartJsStrings.y
import typingsJapgolly.chartJs.mod.CoreScaleOptions
import typingsJapgolly.chartJs.mod.GridLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'logarithmic'} & chart.js.chart.js.LogarithmicScaleOptions */
trait typelogarithmicLogarithmi extends StObject {
  
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
  
  /**
    *   Which type of axis this is. Possible values are: 'x', 'y'. If not set, this is inferred from the first character of the ID which should be 'x' or 'y'.
    */
  var axis: x | y
  
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
    * Scale boundary strategy (bypassed by min/max time options)
    * - `data`: make sure data are fully visible, ticks outside are removed
    * - `ticks`: make sure ticks are fully visible, data outside are truncated
    * @since 2.7.0
    * @default 'ticks'
    */
  var bounds: ticks | data
  
  /**
    * Controls the axis global visibility (visible when true, hidden when false). When display: 'auto', the axis is visible only if at least one associated dataset is visible.
    * @default true
    */
  var display: Boolean | auto
  
  var grid: GridLineOptions
  
  /**
    * User defined maximum value for the scale, overrides maximum value from data.
    */
  var max: Double
  
  /**
    * User defined minimum value for the scale, overrides minimum value from data.
    */
  var min: Double
  
  /**
    *   If true, extra space is added to the both edges and the axis is scaled to fit into the chart area. This is set to true for a bar chart by default.
    * @default false
    */
  var offset: Boolean
  
  /**
    * Position of the axis.
    */
  var position: left | top | right | bottom | center | StringDictionary[Double]
  
  /**
    * Reverse the scale.
    * @default false
    */
  var reverse: Boolean
  
  /**
    * Stack group. Axes at the same `position` with same `stack` are stacked.
    */
  var stack: js.UndefOr[String] = js.undefined
  
  /**
    * Weight of the scale in stack group. Used to determine the amount of allocated space for the scale within the group.
    * @default 1
    */
  var stackWeight: js.UndefOr[Double] = js.undefined
  
  /**
    *   If true, data will be comprised between datasets of data
    * @default false
    */
  var stacked: js.UndefOr[Boolean | single] = js.undefined
  
  /**
    * Adjustment used when calculating the minimum data value.
    */
  var suggestedMax: js.UndefOr[Double] = js.undefined
  
  /**
    * Adjustment used when calculating the maximum data value.
    */
  var suggestedMin: js.UndefOr[Double] = js.undefined
  
  var ticks: Format
  
  /** Options for the scale title. */
  var title: Display
  
  var `type`: logarithmic
  
  /**
    * The weight used to sort the axis. Higher weights are further away from the chart area.
    * @default true
    */
  var weight: Double
}
object typelogarithmicLogarithmi {
  
  inline def apply(
    afterBuildTicks: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterCalculateLabelRotation: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterDataLimits: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterFit: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterSetDimensions: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterTickToLabelConversion: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    afterUpdate: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    alignToPixels: Boolean,
    axis: x | y,
    beforeBuildTicks: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeCalculateLabelRotation: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeDataLimits: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeFit: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeSetDimensions: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeTickToLabelConversion: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    beforeUpdate: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback,
    bounds: ticks | data,
    display: Boolean | auto,
    grid: GridLineOptions,
    max: Double,
    min: Double,
    offset: Boolean,
    position: left | top | right | bottom | center | StringDictionary[Double],
    reverse: Boolean,
    ticks: Format,
    title: Display,
    weight: Double
  ): typelogarithmicLogarithmi = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterBuildTicks(t0).runNow()), afterCalculateLabelRotation = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterCalculateLabelRotation(t0).runNow()), afterDataLimits = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterDataLimits(t0).runNow()), afterFit = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterFit(t0).runNow()), afterSetDimensions = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterSetDimensions(t0).runNow()), afterTickToLabelConversion = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterTickToLabelConversion(t0).runNow()), afterUpdate = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => afterUpdate(t0).runNow()), alignToPixels = alignToPixels.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeBuildTicks(t0).runNow()), beforeCalculateLabelRotation = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeCalculateLabelRotation(t0).runNow()), beforeDataLimits = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeDataLimits(t0).runNow()), beforeFit = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeFit(t0).runNow()), beforeSetDimensions = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeSetDimensions(t0).runNow()), beforeTickToLabelConversion = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeTickToLabelConversion(t0).runNow()), beforeUpdate = js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => beforeUpdate(t0).runNow()), bounds = bounds.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("logarithmic")
    __obj.asInstanceOf[typelogarithmicLogarithmi]
  }
  
  extension [Self <: typelogarithmicLogarithmi](x: Self) {
    
    inline def setAfterBuildTicks(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterCalculateLabelRotation(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterCalculateLabelRotation", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterDataLimits(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterFit(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterFit", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterSetDimensions(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterSetDimensions", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterTickToLabelConversion(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterUpdate(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAlignToPixels(value: Boolean): Self = StObject.set(x, "alignToPixels", value.asInstanceOf[js.Any])
    
    inline def setAxis(value: typingsJapgolly.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setBeforeBuildTicks(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeCalculateLabelRotation(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeCalculateLabelRotation", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeDataLimits(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeFit(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeSetDimensions(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeSetDimensions", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeTickToLabelConversion(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeUpdate(value: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1((t0: typingsJapgolly.chartJs.mod.Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBounds(value: ticks | data): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean | auto): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: GridLineOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: left | top | right | bottom | center | StringDictionary[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStackWeight(value: Double): Self = StObject.set(x, "stackWeight", value.asInstanceOf[js.Any])
    
    inline def setStackWeightUndefined: Self = StObject.set(x, "stackWeight", js.undefined)
    
    inline def setStacked(value: Boolean | single): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMaxUndefined: Self = StObject.set(x, "suggestedMax", js.undefined)
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMinUndefined: Self = StObject.set(x, "suggestedMin", js.undefined)
    
    inline def setTicks(value: Format): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Display): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: logarithmic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
