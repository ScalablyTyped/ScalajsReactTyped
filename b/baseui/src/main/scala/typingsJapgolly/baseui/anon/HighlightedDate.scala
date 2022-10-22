package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightedDate extends StObject {
  
  var adapter: DateIOAdapter[js.Date]
  
  var highlightedDate: Any
  
  def onChange(): Unit
  
  def onDayBlur(): Unit
  
  def onDayClick(): Unit
  
  def onDayFocus(): Unit
  
  def onDayMouseLeave(): Unit
  
  def onDayMouseOver(): Unit
  
  var peekNextMonth: Boolean
}
object HighlightedDate {
  
  inline def apply(
    adapter: DateIOAdapter[js.Date],
    highlightedDate: Any,
    onChange: Callback,
    onDayBlur: Callback,
    onDayClick: Callback,
    onDayFocus: Callback,
    onDayMouseLeave: Callback,
    onDayMouseOver: Callback,
    peekNextMonth: Boolean
  ): HighlightedDate = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], highlightedDate = highlightedDate.asInstanceOf[js.Any], onChange = onChange.toJsFn, onDayBlur = onDayBlur.toJsFn, onDayClick = onDayClick.toJsFn, onDayFocus = onDayFocus.toJsFn, onDayMouseLeave = onDayMouseLeave.toJsFn, onDayMouseOver = onDayMouseOver.toJsFn, peekNextMonth = peekNextMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightedDate]
  }
  
  extension [Self <: HighlightedDate](x: Self) {
    
    inline def setAdapter(value: DateIOAdapter[js.Date]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setHighlightedDate(value: Any): Self = StObject.set(x, "highlightedDate", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnDayBlur(value: Callback): Self = StObject.set(x, "onDayBlur", value.toJsFn)
    
    inline def setOnDayClick(value: Callback): Self = StObject.set(x, "onDayClick", value.toJsFn)
    
    inline def setOnDayFocus(value: Callback): Self = StObject.set(x, "onDayFocus", value.toJsFn)
    
    inline def setOnDayMouseLeave(value: Callback): Self = StObject.set(x, "onDayMouseLeave", value.toJsFn)
    
    inline def setOnDayMouseOver(value: Callback): Self = StObject.set(x, "onDayMouseOver", value.toJsFn)
    
    inline def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
  }
}
