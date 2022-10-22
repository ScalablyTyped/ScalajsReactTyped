package typingsJapgolly.reactDayPicker.distIndexDotesmMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactDayPicker.reactDayPickerStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The props for the {@link DayPicker} component when using `mode="range"`. */
trait DayPickerRangeProps
  extends StObject
     with DayPickerBase
     with DayPickerProps {
  
  /** The maximum amount of days that can be selected. */
  var max: js.UndefOr[Double] = js.undefined
  
  /** The minimum amount of days that can be selected. */
  var min: js.UndefOr[Double] = js.undefined
  
  var mode: range
  
  /** Event fired when a range (or a part of the range) is selected. */
  var onSelect: js.UndefOr[SelectRangeEventHandler] = js.undefined
  
  /** The selected range of days. */
  @JSName("selected")
  var selected_DayPickerRangeProps: js.UndefOr[DateRange] = js.undefined
}
object DayPickerRangeProps {
  
  inline def apply(): DayPickerRangeProps = {
    val __obj = js.Dynamic.literal(mode = "range")
    __obj.asInstanceOf[DayPickerRangeProps]
  }
  
  extension [Self <: DayPickerRangeProps](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMode(value: range): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(
      value: (/* range */ js.UndefOr[DateRange], /* selectedDay */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactMouseEventFrom[Element]) => Callback
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4((t0: /* range */ js.UndefOr[DateRange], t1: /* selectedDay */ js.Date, t2: /* activeModifiers */ ActiveModifiers, t3: /* e */ ReactMouseEventFrom[Element]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setSelected(value: DateRange): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
