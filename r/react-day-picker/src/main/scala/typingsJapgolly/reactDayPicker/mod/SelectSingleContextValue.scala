package typingsJapgolly.reactDayPicker.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of a {@link SelectSingleContext}. */
trait SelectSingleContextValue extends StObject {
  
  /** Event handler to attach to the day button to enable the single select. */
  var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
  
  /** The day that has been selected. */
  var selected: js.UndefOr[js.Date] = js.undefined
}
object SelectSingleContextValue {
  
  inline def apply(): SelectSingleContextValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectSingleContextValue]
  }
  
  extension [Self <: SelectSingleContextValue](x: Self) {
    
    inline def setOnDayClick(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactMouseEventFrom[Element]) => Callback
    ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactMouseEventFrom[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    inline def setSelected(value: js.Date): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
