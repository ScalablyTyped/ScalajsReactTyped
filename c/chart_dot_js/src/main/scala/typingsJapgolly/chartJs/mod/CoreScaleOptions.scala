package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.chartJs.chartJsStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreScaleOptions extends StObject {
  
  /**
    * Callback that runs after ticks are created. Useful for filtering ticks.
    */
  def afterBuildTicks(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after tick rotation is determined.
    */
  def afterCalculateLabelRotation(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after data limits are determined.
    */
  def afterDataLimits(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after the scale fits to the canvas.
    */
  def afterFit(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after dimensions are set.
    */
  def afterSetDimensions(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after ticks are converted into strings.
    */
  def afterTickToLabelConversion(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs at the end of the update process.
    */
  def afterUpdate(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Align pixel values to device pixels
    */
  var alignToPixels: Boolean
  
  /**
    * Callback that runs before ticks are created.
    */
  def beforeBuildTicks(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before tick rotation is determined.
    */
  def beforeCalculateLabelRotation(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before data limits are determined.
    */
  def beforeDataLimits(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before the scale fits to the canvas.
    */
  def beforeFit(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before dimensions are set.
    */
  def beforeSetDimensions(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before ticks are converted into strings.
    */
  def beforeTickToLabelConversion(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback called before the update process starts.
    */
  def beforeUpdate(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Controls the axis global visibility (visible when true, hidden when false). When display: 'auto', the axis is visible only if at least one associated dataset is visible.
    * @default true
    */
  var display: Boolean | auto
  
  /**
    * Reverse the scale.
    * @default false
    */
  var reverse: Boolean
  
  /**
    * The weight used to sort the axis. Higher weights are further away from the chart area.
    * @default true
    */
  var weight: Double
}
object CoreScaleOptions {
  
  inline def apply(
    afterBuildTicks: Scale[CoreScaleOptions] => Callback,
    afterCalculateLabelRotation: Scale[CoreScaleOptions] => Callback,
    afterDataLimits: Scale[CoreScaleOptions] => Callback,
    afterFit: Scale[CoreScaleOptions] => Callback,
    afterSetDimensions: Scale[CoreScaleOptions] => Callback,
    afterTickToLabelConversion: Scale[CoreScaleOptions] => Callback,
    afterUpdate: Scale[CoreScaleOptions] => Callback,
    alignToPixels: Boolean,
    beforeBuildTicks: Scale[CoreScaleOptions] => Callback,
    beforeCalculateLabelRotation: Scale[CoreScaleOptions] => Callback,
    beforeDataLimits: Scale[CoreScaleOptions] => Callback,
    beforeFit: Scale[CoreScaleOptions] => Callback,
    beforeSetDimensions: Scale[CoreScaleOptions] => Callback,
    beforeTickToLabelConversion: Scale[CoreScaleOptions] => Callback,
    beforeUpdate: Scale[CoreScaleOptions] => Callback,
    display: Boolean | auto,
    reverse: Boolean,
    weight: Double
  ): CoreScaleOptions = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterBuildTicks(t0).runNow()), afterCalculateLabelRotation = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterCalculateLabelRotation(t0).runNow()), afterDataLimits = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterDataLimits(t0).runNow()), afterFit = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterFit(t0).runNow()), afterSetDimensions = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterSetDimensions(t0).runNow()), afterTickToLabelConversion = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterTickToLabelConversion(t0).runNow()), afterUpdate = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => afterUpdate(t0).runNow()), alignToPixels = alignToPixels.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeBuildTicks(t0).runNow()), beforeCalculateLabelRotation = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeCalculateLabelRotation(t0).runNow()), beforeDataLimits = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeDataLimits(t0).runNow()), beforeFit = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeFit(t0).runNow()), beforeSetDimensions = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeSetDimensions(t0).runNow()), beforeTickToLabelConversion = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeTickToLabelConversion(t0).runNow()), beforeUpdate = js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => beforeUpdate(t0).runNow()), display = display.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreScaleOptions]
  }
  
  extension [Self <: CoreScaleOptions](x: Self) {
    
    inline def setAfterBuildTicks(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterCalculateLabelRotation(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterCalculateLabelRotation", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterDataLimits(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterFit(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterFit", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterSetDimensions(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterSetDimensions", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterTickToLabelConversion(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAfterUpdate(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setAlignToPixels(value: Boolean): Self = StObject.set(x, "alignToPixels", value.asInstanceOf[js.Any])
    
    inline def setBeforeBuildTicks(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeCalculateLabelRotation(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeCalculateLabelRotation", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeDataLimits(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeFit(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeSetDimensions(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeSetDimensions", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeTickToLabelConversion(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setBeforeUpdate(value: Scale[CoreScaleOptions] => Callback): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1((t0: Scale[CoreScaleOptions]) => value(t0).runNow()))
    
    inline def setDisplay(value: Boolean | auto): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
