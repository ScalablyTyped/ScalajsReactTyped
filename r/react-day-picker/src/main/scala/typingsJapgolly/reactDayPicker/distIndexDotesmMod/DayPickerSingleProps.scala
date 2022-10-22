package typingsJapgolly.reactDayPicker.distIndexDotesmMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactDayPicker.reactDayPickerStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The props for the {@link DayPicker} component when using `mode="single"`. */
trait DayPickerSingleProps
  extends StObject
     with DayPickerBase
     with DayPickerProps {
  
  var mode: single
  
  /** Event fired when a day is selected. */
  var onSelect: js.UndefOr[SelectSingleEventHandler] = js.undefined
  
  /** Make the selection required. */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /** The selected day. */
  @JSName("selected")
  var selected_DayPickerSingleProps: js.UndefOr[js.Date] = js.undefined
}
object DayPickerSingleProps {
  
  inline def apply(): DayPickerSingleProps = {
    val __obj = js.Dynamic.literal(mode = "single")
    __obj.asInstanceOf[DayPickerSingleProps]
  }
  
  extension [Self <: DayPickerSingleProps](x: Self) {
    
    inline def setMode(value: single): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(
      value: (/* day */ js.UndefOr[js.Date], /* selectedDay */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ ReactMouseEventFrom[Element]) => Callback
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4((t0: /* day */ js.UndefOr[js.Date], t1: /* selectedDay */ js.Date, t2: /* activeModifiers */ ActiveModifiers, t3: /* e */ ReactMouseEventFrom[Element]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSelected(value: js.Date): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
