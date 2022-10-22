package typingsJapgolly.reactDayPicker.distIndexDotesmMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDayPicker.anon.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Map of functions to translate ARIA labels for the relative elements. */
trait Labels extends StObject {
  
  var labelDay: DayLabel
  
  def labelMonthDropdown(): String
  
  var labelNext: NavButtonLabel
  
  var labelPrevious: NavButtonLabel
  
  var labelWeekNumber: WeekNumberLabel
  
  var labelWeekday: WeekdayLabel
  
  def labelYearDropdown(): String
}
object Labels {
  
  inline def apply(
    labelDay: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* options */ js.UndefOr[Locale]) => String,
    labelMonthDropdown: CallbackTo[String],
    labelNext: (/* month */ js.UndefOr[js.Date], /* options */ js.UndefOr[Locale]) => String,
    labelPrevious: (/* month */ js.UndefOr[js.Date], /* options */ js.UndefOr[Locale]) => String,
    labelWeekNumber: (/* n */ Double, /* options */ js.UndefOr[Locale]) => String,
    labelWeekday: (/* day */ js.Date, /* options */ js.UndefOr[Locale]) => String,
    labelYearDropdown: CallbackTo[String]
  ): Labels = {
    val __obj = js.Dynamic.literal(labelDay = js.Any.fromFunction3(labelDay), labelMonthDropdown = labelMonthDropdown.toJsFn, labelNext = js.Any.fromFunction2(labelNext), labelPrevious = js.Any.fromFunction2(labelPrevious), labelWeekNumber = js.Any.fromFunction2(labelWeekNumber), labelWeekday = js.Any.fromFunction2(labelWeekday), labelYearDropdown = labelYearDropdown.toJsFn)
    __obj.asInstanceOf[Labels]
  }
  
  extension [Self <: Labels](x: Self) {
    
    inline def setLabelDay(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* options */ js.UndefOr[Locale]) => String
    ): Self = StObject.set(x, "labelDay", js.Any.fromFunction3(value))
    
    inline def setLabelMonthDropdown(value: CallbackTo[String]): Self = StObject.set(x, "labelMonthDropdown", value.toJsFn)
    
    inline def setLabelNext(value: (/* month */ js.UndefOr[js.Date], /* options */ js.UndefOr[Locale]) => String): Self = StObject.set(x, "labelNext", js.Any.fromFunction2(value))
    
    inline def setLabelPrevious(value: (/* month */ js.UndefOr[js.Date], /* options */ js.UndefOr[Locale]) => String): Self = StObject.set(x, "labelPrevious", js.Any.fromFunction2(value))
    
    inline def setLabelWeekNumber(value: (/* n */ Double, /* options */ js.UndefOr[Locale]) => String): Self = StObject.set(x, "labelWeekNumber", js.Any.fromFunction2(value))
    
    inline def setLabelWeekday(value: (/* day */ js.Date, /* options */ js.UndefOr[Locale]) => String): Self = StObject.set(x, "labelWeekday", js.Any.fromFunction2(value))
    
    inline def setLabelYearDropdown(value: CallbackTo[String]): Self = StObject.set(x, "labelYearDropdown", value.toJsFn)
  }
}
