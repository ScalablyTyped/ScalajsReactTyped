package typingsJapgolly.reactNativeMaterialKit.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MKSliderProperties
  extends StObject
     with BaseSlider {
  
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var onConfirm: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object MKSliderProperties {
  
  inline def apply(): MKSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSliderProperties]
  }
  
  extension [Self <: MKSliderProperties](x: Self) {
    
    inline def setOnChange(value: /* value */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnConfirm(value: Callback): Self = StObject.set(x, "onConfirm", value.toJsFn)
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
  }
}
