package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the Slider is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum value for the slider.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum value for the slider.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Called when the value of the slider is changed. The current value is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  /**
    * The current value of the Slider (0-100).
    */
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the Slider can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object SliderProps {
  
  inline def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  
  extension [Self <: SliderProps](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOnChange(value: /* value */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
