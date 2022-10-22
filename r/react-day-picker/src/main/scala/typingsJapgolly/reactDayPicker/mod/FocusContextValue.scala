package typingsJapgolly.reactDayPicker.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the {@link FocusContext}. */
trait FocusContextValue extends StObject {
  
  /** Blur the focused day. */
  def blur(): Unit
  
  /** Focus a day. */
  def focus(day: js.Date): Unit
  
  /** Focus the day after the focused day. */
  def focusDayAfter(): Unit
  
  /** Focus the day before the focused day. */
  def focusDayBefore(): Unit
  
  /* Focus the day at the end of the week of focused day. */
  def focusEndOfWeek(): Unit
  
  /* Focus the day in the month after the focused day. */
  def focusMonthAfter(): Unit
  
  /* Focus the day in the month before the focused day. */
  def focusMonthBefore(): Unit
  
  /* Focus the day at the start of the week of the focused day. */
  def focusStartOfWeek(): Unit
  
  /** Day that will be focused.  */
  var focusTarget: js.UndefOr[js.Date] = js.undefined
  
  /** Focus the day in the week after the focused day. */
  def focusWeekAfter(): Unit
  
  /** Focus the day in the week before the focused day. */
  def focusWeekBefore(): Unit
  
  /* Focus the day in the year after the focused day. */
  def focusYearAfter(): Unit
  
  /* Focus the day in the year before the focused day. */
  def focusYearBefore(): Unit
  
  /** The day currently focused. */
  var focusedDay: js.UndefOr[js.Date] = js.undefined
}
object FocusContextValue {
  
  inline def apply(
    blur: Callback,
    focus: js.Date => Callback,
    focusDayAfter: Callback,
    focusDayBefore: Callback,
    focusEndOfWeek: Callback,
    focusMonthAfter: Callback,
    focusMonthBefore: Callback,
    focusStartOfWeek: Callback,
    focusWeekAfter: Callback,
    focusWeekBefore: Callback,
    focusYearAfter: Callback,
    focusYearBefore: Callback
  ): FocusContextValue = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, focus = js.Any.fromFunction1((t0: js.Date) => focus(t0).runNow()), focusDayAfter = focusDayAfter.toJsFn, focusDayBefore = focusDayBefore.toJsFn, focusEndOfWeek = focusEndOfWeek.toJsFn, focusMonthAfter = focusMonthAfter.toJsFn, focusMonthBefore = focusMonthBefore.toJsFn, focusStartOfWeek = focusStartOfWeek.toJsFn, focusWeekAfter = focusWeekAfter.toJsFn, focusWeekBefore = focusWeekBefore.toJsFn, focusYearAfter = focusYearAfter.toJsFn, focusYearBefore = focusYearBefore.toJsFn)
    __obj.asInstanceOf[FocusContextValue]
  }
  
  extension [Self <: FocusContextValue](x: Self) {
    
    inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setFocus(value: js.Date => Callback): Self = StObject.set(x, "focus", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setFocusDayAfter(value: Callback): Self = StObject.set(x, "focusDayAfter", value.toJsFn)
    
    inline def setFocusDayBefore(value: Callback): Self = StObject.set(x, "focusDayBefore", value.toJsFn)
    
    inline def setFocusEndOfWeek(value: Callback): Self = StObject.set(x, "focusEndOfWeek", value.toJsFn)
    
    inline def setFocusMonthAfter(value: Callback): Self = StObject.set(x, "focusMonthAfter", value.toJsFn)
    
    inline def setFocusMonthBefore(value: Callback): Self = StObject.set(x, "focusMonthBefore", value.toJsFn)
    
    inline def setFocusStartOfWeek(value: Callback): Self = StObject.set(x, "focusStartOfWeek", value.toJsFn)
    
    inline def setFocusTarget(value: js.Date): Self = StObject.set(x, "focusTarget", value.asInstanceOf[js.Any])
    
    inline def setFocusTargetUndefined: Self = StObject.set(x, "focusTarget", js.undefined)
    
    inline def setFocusWeekAfter(value: Callback): Self = StObject.set(x, "focusWeekAfter", value.toJsFn)
    
    inline def setFocusWeekBefore(value: Callback): Self = StObject.set(x, "focusWeekBefore", value.toJsFn)
    
    inline def setFocusYearAfter(value: Callback): Self = StObject.set(x, "focusYearAfter", value.toJsFn)
    
    inline def setFocusYearBefore(value: Callback): Self = StObject.set(x, "focusYearBefore", value.toJsFn)
    
    inline def setFocusedDay(value: js.Date): Self = StObject.set(x, "focusedDay", value.asInstanceOf[js.Any])
    
    inline def setFocusedDayUndefined: Self = StObject.set(x, "focusedDay", js.undefined)
  }
}
