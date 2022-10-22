package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chartJs.chartJsStrings.auto
import typingsJapgolly.chartJs.chartJsStrings.bottom
import typingsJapgolly.chartJs.chartJsStrings.center
import typingsJapgolly.chartJs.chartJsStrings.data
import typingsJapgolly.chartJs.chartJsStrings.left
import typingsJapgolly.chartJs.chartJsStrings.right
import typingsJapgolly.chartJs.chartJsStrings.single
import typingsJapgolly.chartJs.chartJsStrings.ticks
import typingsJapgolly.chartJs.chartJsStrings.top
import typingsJapgolly.chartJs.chartJsStrings.x
import typingsJapgolly.chartJs.chartJsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartesianScaleOptions
  extends StObject
     with CoreScaleOptions {
  
  /**
    *   Which type of axis this is. Possible values are: 'x', 'y'. If not set, this is inferred from the first character of the ID which should be 'x' or 'y'.
    */
  var axis: x | y
  
  /**
    * Scale boundary strategy (bypassed by min/max time options)
    * - `data`: make sure data are fully visible, ticks outside are removed
    * - `ticks`: make sure ticks are fully visible, data outside are truncated
    * @since 2.7.0
    * @default 'ticks'
    */
  var bounds: ticks | data
  
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
  
  var ticks: CartesianTickOptions
  
  /** Options for the scale title. */
  var title: typingsJapgolly.chartJs.anon.Align
}
object CartesianScaleOptions {
  
  inline def apply(
    afterBuildTicks: Scale[CoreScaleOptions] => Callback,
    afterCalculateLabelRotation: Scale[CoreScaleOptions] => Callback,
    afterDataLimits: Scale[CoreScaleOptions] => Callback,
    afterFit: Scale[CoreScaleOptions] => Callback,
    afterSetDimensions: Scale[CoreScaleOptions] => Callback,
    afterTickToLabelConversion: Scale[CoreScaleOptions] => Callback,
    afterUpdate: Scale[CoreScaleOptions] => Callback,
    alignToPixels: Boolean,
    axis: x | y,
    beforeBuildTicks: Scale[CoreScaleOptions] => Callback,
    beforeCalculateLabelRotation: Scale[CoreScaleOptions] => Callback,
    beforeDataLimits: Scale[CoreScaleOptions] => Callback,
    beforeFit: Scale[CoreScaleOptions] => Callback,
    beforeSetDimensions: Scale[CoreScaleOptions] => Callback,
    beforeTickToLabelConversion: Scale[CoreScaleOptions] => Callback,
    beforeUpdate: Scale[CoreScaleOptions] => Callback,
    bounds: ticks | data,
    display: Boolean | auto,
    grid: GridLineOptions,
    max: Double,
    min: Double,
    offset: Boolean,
    position: left | top | right | bottom | center | StringDictionary[Double],
    reverse: Boolean,
    ticks: CartesianTickOptions,
    title: typingsJapgolly.chartJs.anon.Align,
    weight: Double
  ): CartesianScaleOptions = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterBuildTicks(t0).runNow()), afterCalculateLabelRotation = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterCalculateLabelRotation(t0).runNow()), afterDataLimits = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterDataLimits(t0).runNow()), afterFit = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterFit(t0).runNow()), afterSetDimensions = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterSetDimensions(t0).runNow()), afterTickToLabelConversion = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterTickToLabelConversion(t0).runNow()), afterUpdate = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterUpdate(t0).runNow()), alignToPixels = alignToPixels.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeBuildTicks(t0).runNow()), beforeCalculateLabelRotation = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeCalculateLabelRotation(t0).runNow()), beforeDataLimits = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeDataLimits(t0).runNow()), beforeFit = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeFit(t0).runNow()), beforeSetDimensions = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeSetDimensions(t0).runNow()), beforeTickToLabelConversion = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeTickToLabelConversion(t0).runNow()), beforeUpdate = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeUpdate(t0).runNow()), bounds = bounds.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianScaleOptions]
  }
  
  extension [Self <: CartesianScaleOptions](x: Self) {
    
    inline def setAxis(value: typingsJapgolly.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: ticks | data): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: GridLineOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: left | top | right | bottom | center | StringDictionary[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStackWeight(value: Double): Self = StObject.set(x, "stackWeight", value.asInstanceOf[js.Any])
    
    inline def setStackWeightUndefined: Self = StObject.set(x, "stackWeight", js.undefined)
    
    inline def setStacked(value: Boolean | single): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    inline def setTicks(value: CartesianTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: typingsJapgolly.chartJs.anon.Align): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
