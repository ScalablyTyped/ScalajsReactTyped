package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.materialUi.materialUiStrings.`x-reverse`
import typingsJapgolly.materialUi.materialUiStrings.`y-reverse`
import typingsJapgolly.materialUi.materialUiStrings.x
import typingsJapgolly.materialUi.materialUiStrings.y
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderProps extends StObject {
  
  var axis: js.UndefOr[x | `x-reverse` | y | `y-reverse`] = js.undefined
  
  var defaultValue: js.UndefOr[Double] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[js.Object & Element], /* value */ Double, Unit]
  ] = js.undefined
  
  var onDragStart: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onDragStop: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var sliderStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object SliderProps {
  
  inline def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  
  extension [Self <: SliderProps](x: Self) {
    
    inline def setAxis(value: typingsJapgolly.materialUi.materialUiStrings.x | `x-reverse` | y | `y-reverse`): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnBlur(value: ReactFocusEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* value */ Double) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* value */ Double) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDragStart(value: ReactMouseEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragStop(value: ReactMouseEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onDragStop", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
    
    inline def setOnFocus(value: ReactFocusEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSliderStyle(value: CSSProperties): Self = StObject.set(x, "sliderStyle", value.asInstanceOf[js.Any])
    
    inline def setSliderStyleUndefined: Self = StObject.set(x, "sliderStyle", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
