package typingsJapgolly.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.SliderOptions> */
trait PartialSliderOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var indicators: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
}
object PartialSliderOptions {
  
  inline def apply(): PartialSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderOptions]
  }
  
  extension [Self <: PartialSliderOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
    
    inline def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
