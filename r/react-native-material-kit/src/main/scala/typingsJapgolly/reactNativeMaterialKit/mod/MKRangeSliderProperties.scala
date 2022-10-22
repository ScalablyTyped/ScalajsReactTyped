package typingsJapgolly.reactNativeMaterialKit.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeMaterialKit.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MKRangeSliderProperties
  extends StObject
     with BaseSlider {
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* curValue */ Max, Unit]] = js.undefined
  
  var onConfirm: js.UndefOr[js.Function1[/* curValue */ Max, Unit]] = js.undefined
  
  var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object MKRangeSliderProperties {
  
  inline def apply(): MKRangeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKRangeSliderProperties]
  }
  
  extension [Self <: MKRangeSliderProperties](x: Self) {
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setOnChange(value: /* curValue */ Max => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* curValue */ Max) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnConfirm(value: /* curValue */ Max => Callback): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1((t0: /* curValue */ Max) => value(t0).runNow()))
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
