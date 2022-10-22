package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chartJs.anon.Count
import typingsJapgolly.chartJs.chartJsStrings.auto
import typingsJapgolly.chartJs.chartJsStrings.bottom
import typingsJapgolly.chartJs.chartJsStrings.center
import typingsJapgolly.chartJs.chartJsStrings.data
import typingsJapgolly.chartJs.chartJsStrings.left
import typingsJapgolly.chartJs.chartJsStrings.right
import typingsJapgolly.chartJs.chartJsStrings.ticks
import typingsJapgolly.chartJs.chartJsStrings.top
import typingsJapgolly.chartJs.chartJsStrings.x
import typingsJapgolly.chartJs.chartJsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearScaleOptions
  extends StObject
     with CartesianScaleOptions {
  
  /**
    *  if true, scale will include 0 if it is not already included.
    * @default true
    */
  var beginAtZero: Boolean
  
  /**
    * Percentage (string ending with %) or amount (number) for added room in the scale range above and below data.
    */
  var grace: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Adjustment used when calculating the minimum data value.
    */
  var suggestedMax: js.UndefOr[Double] = js.undefined
  
  /**
    * Adjustment used when calculating the maximum data value.
    */
  var suggestedMin: js.UndefOr[Double] = js.undefined
  
  @JSName("ticks")
  var ticks_LinearScaleOptions: Count
}
object LinearScaleOptions {
  
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
    beginAtZero: Boolean,
    bounds: ticks | data,
    display: Boolean | auto,
    grid: GridLineOptions,
    max: Double,
    min: Double,
    offset: Boolean,
    position: left | top | right | bottom | center | StringDictionary[Double],
    reverse: Boolean,
    ticks: Count,
    title: typingsJapgolly.chartJs.anon.Align,
    weight: Double
  ): LinearScaleOptions = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterBuildTicks(t0).runNow()), afterCalculateLabelRotation = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterCalculateLabelRotation(t0).runNow()), afterDataLimits = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterDataLimits(t0).runNow()), afterFit = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterFit(t0).runNow()), afterSetDimensions = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterSetDimensions(t0).runNow()), afterTickToLabelConversion = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterTickToLabelConversion(t0).runNow()), afterUpdate = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterUpdate(t0).runNow()), alignToPixels = alignToPixels.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeBuildTicks(t0).runNow()), beforeCalculateLabelRotation = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeCalculateLabelRotation(t0).runNow()), beforeDataLimits = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeDataLimits(t0).runNow()), beforeFit = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeFit(t0).runNow()), beforeSetDimensions = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeSetDimensions(t0).runNow()), beforeTickToLabelConversion = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeTickToLabelConversion(t0).runNow()), beforeUpdate = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeUpdate(t0).runNow()), beginAtZero = beginAtZero.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearScaleOptions]
  }
  
  extension [Self <: LinearScaleOptions](x: Self) {
    
    inline def setBeginAtZero(value: Boolean): Self = StObject.set(x, "beginAtZero", value.asInstanceOf[js.Any])
    
    inline def setGrace(value: String | Double): Self = StObject.set(x, "grace", value.asInstanceOf[js.Any])
    
    inline def setGraceUndefined: Self = StObject.set(x, "grace", js.undefined)
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMaxUndefined: Self = StObject.set(x, "suggestedMax", js.undefined)
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMinUndefined: Self = StObject.set(x, "suggestedMin", js.undefined)
    
    inline def setTicks(value: Count): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
