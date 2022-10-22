package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.baseuiStrings.high
import typingsJapgolly.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateLabel extends StObject {
  
  var adapter: DateIOAdapter[js.Date]
  
  var dateLabel: Any
  
  var density: high
  
  var excludeDates: Any
  
  var filterDate: Any
  
  var highlightDates: Any
  
  var includeDates: Any
  
  var locale: Any
  
  var maxDate: Any
  
  var minDate: Any
  
  var month: Any
  
  def onDayBlur(): Unit
  
  def onDayClick(): Unit
  
  def onDayFocus(): Unit
  
  def onDayMouseLeave(): Unit
  
  def onDayMouseOver(): Unit
  
  var peekNextMonth: Boolean
  
  var value: Any
}
object DateLabel {
  
  inline def apply(
    adapter: DateIOAdapter[js.Date],
    dateLabel: Any,
    excludeDates: Any,
    filterDate: Any,
    highlightDates: Any,
    includeDates: Any,
    locale: Any,
    maxDate: Any,
    minDate: Any,
    month: Any,
    onDayBlur: Callback,
    onDayClick: Callback,
    onDayFocus: Callback,
    onDayMouseLeave: Callback,
    onDayMouseOver: Callback,
    peekNextMonth: Boolean,
    value: Any
  ): DateLabel = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], dateLabel = dateLabel.asInstanceOf[js.Any], density = "high", excludeDates = excludeDates.asInstanceOf[js.Any], filterDate = filterDate.asInstanceOf[js.Any], highlightDates = highlightDates.asInstanceOf[js.Any], includeDates = includeDates.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], onDayBlur = onDayBlur.toJsFn, onDayClick = onDayClick.toJsFn, onDayFocus = onDayFocus.toJsFn, onDayMouseLeave = onDayMouseLeave.toJsFn, onDayMouseOver = onDayMouseOver.toJsFn, peekNextMonth = peekNextMonth.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateLabel]
  }
  
  extension [Self <: DateLabel](x: Self) {
    
    inline def setAdapter(value: DateIOAdapter[js.Date]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setDateLabel(value: Any): Self = StObject.set(x, "dateLabel", value.asInstanceOf[js.Any])
    
    inline def setDensity(value: high): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setExcludeDates(value: Any): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
    
    inline def setFilterDate(value: Any): Self = StObject.set(x, "filterDate", value.asInstanceOf[js.Any])
    
    inline def setHighlightDates(value: Any): Self = StObject.set(x, "highlightDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDates(value: Any): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaxDate(value: Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMinDate(value: Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Any): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setOnDayBlur(value: Callback): Self = StObject.set(x, "onDayBlur", value.toJsFn)
    
    inline def setOnDayClick(value: Callback): Self = StObject.set(x, "onDayClick", value.toJsFn)
    
    inline def setOnDayFocus(value: Callback): Self = StObject.set(x, "onDayFocus", value.toJsFn)
    
    inline def setOnDayMouseLeave(value: Callback): Self = StObject.set(x, "onDayMouseLeave", value.toJsFn)
    
    inline def setOnDayMouseOver(value: Callback): Self = StObject.set(x, "onDayMouseOver", value.toJsFn)
    
    inline def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
