package typingsJapgolly.reactDayPicker.distIndexDotesmMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactDayPicker.reactDayPickerStrings.multiple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The props for the {@link DayPicker} component when using `mode="multiple"`. */
trait DayPickerMultipleProps
  extends StObject
     with DayPickerBase
     with DayPickerProps {
  
  /** The maximum amount of days that can be selected. */
  var max: js.UndefOr[Double] = js.undefined
  
  /** The minimum amount of days that can be selected. */
  var min: js.UndefOr[Double] = js.undefined
  
  var mode: multiple
  
  /** Event fired when a days added or removed to the selection. */
  var onSelect: js.UndefOr[SelectMultipleEventHandler] = js.undefined
  
  /** The selected days. */
  @JSName("selected")
  var selected_DayPickerMultipleProps: js.UndefOr[js.Array[js.Date]] = js.undefined
}
object DayPickerMultipleProps {
  
  inline def apply(): DayPickerMultipleProps = {
    val __obj = js.Dynamic.literal(mode = "multiple")
    __obj.asInstanceOf[DayPickerMultipleProps]
  }
  
  extension [Self <: DayPickerMultipleProps](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMode(value: multiple): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(
      value: (/* days */ js.UndefOr[js.Array[js.Date]], /* selectedDay */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactMouseEventFrom[Element]) => Callback
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4((t0: /* days */ js.UndefOr[js.Array[js.Date]], t1: /* selectedDay */ js.Date, t2: /* activeModifiers */ ActiveModifiers, t3: /* e */ ReactMouseEventFrom[Element]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setSelected(value: js.Array[js.Date]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: js.Date*): Self = StObject.set(x, "selected", js.Array(value*))
  }
}
