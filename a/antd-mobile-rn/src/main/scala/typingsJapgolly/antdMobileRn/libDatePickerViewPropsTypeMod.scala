package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobileRn.libDatePickerPropsTypeMod.DatePickerPropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerViewPropsTypeMod {
  
  trait DatePickerProps
    extends StObject
       with DatePickerPropsType {
    
    var onScrollChange: js.UndefOr[js.Function3[/* newValue */ Any, /* vals */ Any, /* index */ Double, Unit]] = js.undefined
    
    /** rn only */
    var styles: js.UndefOr[Any] = js.undefined
    
    /** rn only */
    var triggerTypes: js.UndefOr[String] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setOnScrollChange(value: (/* newValue */ Any, /* vals */ Any, /* index */ Double) => Callback): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction3((t0: /* newValue */ Any, t1: /* vals */ Any, t2: /* index */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTriggerTypes(value: String): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    }
  }
}
