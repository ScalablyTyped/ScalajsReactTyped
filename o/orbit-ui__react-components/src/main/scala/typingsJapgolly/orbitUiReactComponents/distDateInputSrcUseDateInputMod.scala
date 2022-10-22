package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.anon.OnBlur
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateInputSrcUseDateInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/useDateInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/useDateInput", "DateInputMask")
  @js.native
  val DateInputMask: js.Array[String | js.RegExp] = js.native
  
  inline def useDateInput(hasValuePropDefaultValueMinMaxOnChangeOnDateChangeForwardedRef: UseDateInputProps): OnBlur = ^.asInstanceOf[js.Dynamic].applyDynamic("useDateInput")(hasValuePropDefaultValueMinMaxOnChangeOnDateChangeForwardedRef.asInstanceOf[js.Any]).asInstanceOf[OnBlur]
  
  trait UseDateInputProps extends StObject {
    
    var defaultValue: js.UndefOr[js.Date] = js.undefined
    
    var forwardedRef: ForwardedRef[Any]
    
    var max: js.UndefOr[js.Date] = js.undefined
    
    var min: js.UndefOr[js.Date] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[Element]] = js.undefined
    
    var onDateChange: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* date */ js.Date, Unit]] = js.undefined
    
    var value: js.UndefOr[js.Date | Null] = js.undefined
  }
  object UseDateInputProps {
    
    inline def apply(): UseDateInputProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[UseDateInputProps]
    }
    
    extension [Self <: UseDateInputProps](x: Self) {
      
      inline def setDefaultValue(value: js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDateChange(value: (/* event */ ReactEventFrom[Element], /* date */ js.Date) => Callback): Self = StObject.set(x, "onDateChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* date */ js.Date) => (value(t0, t1)).runNow()))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
