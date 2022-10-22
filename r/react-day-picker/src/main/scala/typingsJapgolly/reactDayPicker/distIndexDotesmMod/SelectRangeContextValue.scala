package typingsJapgolly.reactDayPicker.distIndexDotesmMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of a {@link SelectRangeContext}. */
trait SelectRangeContextValue extends StObject {
  
  /** The modifiers for the corresponding selection. */
  var modifiers: SelectRangeModifiers
  
  /** Event handler to attach to the day button to enable the range select. */
  var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
  
  /** The range of days that has been selected. */
  var selected: js.UndefOr[DateRange] = js.undefined
}
object SelectRangeContextValue {
  
  inline def apply(modifiers: SelectRangeModifiers): SelectRangeContextValue = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRangeContextValue]
  }
  
  extension [Self <: SelectRangeContextValue](x: Self) {
    
    inline def setModifiers(value: SelectRangeModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setOnDayClick(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactMouseEventFrom[Element]) => Callback
    ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* activeModifiers */ ActiveModifiers, t2: /* e */ ReactMouseEventFrom[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    inline def setSelected(value: DateRange): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
