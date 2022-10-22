package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chartJs.anon.Date
import typingsJapgolly.chartJs.anon.DisplayFormats
import typingsJapgolly.chartJs.anon.Source
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

/* Inlined std.Omit<chart.js.chart.js.CartesianScaleOptions, 'min' | 'max'> & {  min :string | number,   max :string | number,   suggestedMin :string | number,   suggestedMax :string | number,   bounds :'ticks' | 'data',   offsetAfterAutoskip :boolean,   adapters :{  date :unknown},   time :{  parser :string | (v : unknown): number,   round :false | chart.js.chart.js/types/adapters.TimeUnit,   isoWeekday :boolean | number,   displayFormats :{[key: string] : string},   tooltipFormat :string,   unit :false | chart.js.chart.js/types/adapters.TimeUnit,   stepSize :number,   minUnit :chart.js.chart.js/types/adapters.TimeUnit},   ticks :{  source :'labels' | 'auto' | 'data'}} */
trait TimeScaleOptions extends StObject {
  
  /**
    * options for creating a new adapter instance
    */
  var adapters: Date
  
  def afterBuildTicks(axis: Scale[CoreScaleOptions]): Unit
  @JSName("afterBuildTicks")
  var afterBuildTicks_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def afterCalculateLabelRotation(axis: Scale[CoreScaleOptions]): Unit
  @JSName("afterCalculateLabelRotation")
  var afterCalculateLabelRotation_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def afterDataLimits(axis: Scale[CoreScaleOptions]): Unit
  @JSName("afterDataLimits")
  var afterDataLimits_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def afterFit(axis: Scale[CoreScaleOptions]): Unit
  @JSName("afterFit")
  var afterFit_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def afterSetDimensions(axis: Scale[CoreScaleOptions]): Unit
  @JSName("afterSetDimensions")
  var afterSetDimensions_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def afterTickToLabelConversion(axis: Scale[CoreScaleOptions]): Unit
  @JSName("afterTickToLabelConversion")
  var afterTickToLabelConversion_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def afterUpdate(axis: Scale[CoreScaleOptions]): Unit
  @JSName("afterUpdate")
  var afterUpdate_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  var alignToPixels: Boolean
  
  var axis: x | y
  
  def beforeBuildTicks(axis: Scale[CoreScaleOptions]): Unit
  @JSName("beforeBuildTicks")
  var beforeBuildTicks_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def beforeCalculateLabelRotation(axis: Scale[CoreScaleOptions]): Unit
  @JSName("beforeCalculateLabelRotation")
  var beforeCalculateLabelRotation_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def beforeDataLimits(axis: Scale[CoreScaleOptions]): Unit
  @JSName("beforeDataLimits")
  var beforeDataLimits_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def beforeFit(axis: Scale[CoreScaleOptions]): Unit
  @JSName("beforeFit")
  var beforeFit_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def beforeSetDimensions(axis: Scale[CoreScaleOptions]): Unit
  @JSName("beforeSetDimensions")
  var beforeSetDimensions_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def beforeTickToLabelConversion(axis: Scale[CoreScaleOptions]): Unit
  @JSName("beforeTickToLabelConversion")
  var beforeTickToLabelConversion_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  def beforeUpdate(axis: Scale[CoreScaleOptions]): Unit
  @JSName("beforeUpdate")
  var beforeUpdate_Original: js.Function1[/* axis */ Scale[CoreScaleOptions], Unit]
  
  /**
    * Scale boundary strategy (bypassed by min/max time options)
    * - `data`: make sure data are fully visible, ticks outside are removed
    * - `ticks`: make sure ticks are fully visible, data outside are truncated
    * @since 2.7.0
    * @default 'data'
    */
  var bounds: ticks | data
  
  var display: Boolean | auto
  
  var grid: GridLineOptions
  
  var max: String | Double
  
  var min: String | Double
  
  var offset: Boolean
  
  /**
    * If true, bar chart offsets are computed with skipped tick sizes
    * @since 3.8.0
    * @default false
    */
  var offsetAfterAutoskip: Boolean
  
  var position: left | top | right | bottom | center | StringDictionary[Double]
  
  var reverse: Boolean
  
  var stack: js.UndefOr[String] = js.undefined
  
  var stackWeight: js.UndefOr[Double] = js.undefined
  
  var stacked: js.UndefOr[Boolean | single] = js.undefined
  
  var suggestedMax: String | Double
  
  var suggestedMin: String | Double
  
  var ticks: CartesianTickOptions & Source
  
  var time: DisplayFormats
  
  var title: typingsJapgolly.chartJs.anon.Align
  
  var weight: Double
}
object TimeScaleOptions {
  
  inline def apply(
    adapters: Date,
    afterBuildTicks: /* axis */ Scale[CoreScaleOptions] => Callback,
    afterCalculateLabelRotation: /* axis */ Scale[CoreScaleOptions] => Callback,
    afterDataLimits: /* axis */ Scale[CoreScaleOptions] => Callback,
    afterFit: /* axis */ Scale[CoreScaleOptions] => Callback,
    afterSetDimensions: /* axis */ Scale[CoreScaleOptions] => Callback,
    afterTickToLabelConversion: /* axis */ Scale[CoreScaleOptions] => Callback,
    afterUpdate: /* axis */ Scale[CoreScaleOptions] => Callback,
    alignToPixels: Boolean,
    axis: x | y,
    beforeBuildTicks: /* axis */ Scale[CoreScaleOptions] => Callback,
    beforeCalculateLabelRotation: /* axis */ Scale[CoreScaleOptions] => Callback,
    beforeDataLimits: /* axis */ Scale[CoreScaleOptions] => Callback,
    beforeFit: /* axis */ Scale[CoreScaleOptions] => Callback,
    beforeSetDimensions: /* axis */ Scale[CoreScaleOptions] => Callback,
    beforeTickToLabelConversion: /* axis */ Scale[CoreScaleOptions] => Callback,
    beforeUpdate: /* axis */ Scale[CoreScaleOptions] => Callback,
    bounds: ticks | data,
    display: Boolean | auto,
    grid: GridLineOptions,
    max: String | Double,
    min: String | Double,
    offset: Boolean,
    offsetAfterAutoskip: Boolean,
    position: left | top | right | bottom | center | StringDictionary[Double],
    reverse: Boolean,
    suggestedMax: String | Double,
    suggestedMin: String | Double,
    ticks: CartesianTickOptions & Source,
    time: DisplayFormats,
    title: typingsJapgolly.chartJs.anon.Align,
    weight: Double
  ): TimeScaleOptions = {
    val __obj = js.Dynamic.literal(adapters = adapters.asInstanceOf[js.Any], afterBuildTicks = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => afterBuildTicks(t0).runNow()), afterCalculateLabelRotation = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => afterCalculateLabelRotation(t0).runNow()), afterDataLimits = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => afterDataLimits(t0).runNow()), afterFit = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => afterFit(t0).runNow()), afterSetDimensions = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => afterSetDimensions(t0).runNow()), afterTickToLabelConversion = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => afterTickToLabelConversion(t0).runNow()), afterUpdate = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => afterUpdate(t0).runNow()), alignToPixels = alignToPixels.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => beforeBuildTicks(t0).runNow()), beforeCalculateLabelRotation = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => beforeCalculateLabelRotation(t0).runNow()), beforeDataLimits = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => beforeDataLimits(t0).runNow()), beforeFit = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => beforeFit(t0).runNow()), beforeSetDimensions = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => beforeSetDimensions(t0).runNow()), beforeTickToLabelConversion = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => beforeTickToLabelConversion(t0).runNow()), beforeUpdate = js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => beforeUpdate(t0).runNow()), bounds = bounds.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], offsetAfterAutoskip = offsetAfterAutoskip.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], suggestedMax = suggestedMax.asInstanceOf[js.Any], suggestedMin = suggestedMin.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScaleOptions]
  }
  
  extension [Self <: TimeScaleOptions](x: Self) {
    
    inline def setAdapters(value: Date): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
    
    inline def setAfterBuildTicks(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterCalculateLabelRotation(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterCalculateLabelRotation", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterDataLimits(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterFit(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterFit", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterSetDimensions(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterSetDimensions", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterTickToLabelConversion(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterUpdate(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAlignToPixels(value: Boolean): Self = StObject.set(x, "alignToPixels", value.asInstanceOf[js.Any])
    
    inline def setAxis(value: typingsJapgolly.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setBeforeBuildTicks(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeCalculateLabelRotation(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeCalculateLabelRotation", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeDataLimits(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeFit(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeSetDimensions(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeSetDimensions", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeTickToLabelConversion(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeUpdate(value: /* axis */ Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1((t0: /* axis */ Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBounds(value: ticks | data): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean | auto): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: GridLineOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetAfterAutoskip(value: Boolean): Self = StObject.set(x, "offsetAfterAutoskip", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: left | top | right | bottom | center | StringDictionary[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStackWeight(value: Double): Self = StObject.set(x, "stackWeight", value.asInstanceOf[js.Any])
    
    inline def setStackWeightUndefined: Self = StObject.set(x, "stackWeight", js.undefined)
    
    inline def setStacked(value: Boolean | single): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    inline def setSuggestedMax(value: String | Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMin(value: String | Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: CartesianTickOptions & Source): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTime(value: DisplayFormats): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: typingsJapgolly.chartJs.anon.Align): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
