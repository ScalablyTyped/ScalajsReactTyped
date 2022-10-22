package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiViewCalendarOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ MultiViewCalendarEvent, Unit]] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
  
  var dates: js.UndefOr[Any] = js.undefined
  
  var depth: js.UndefOr[String] = js.undefined
  
  var disableDates: js.UndefOr[Any | js.Function] = js.undefined
  
  var footer: js.UndefOr[String | js.Function] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[js.Date] = js.undefined
  
  var messages: js.UndefOr[MultiViewCalendarMessages] = js.undefined
  
  var min: js.UndefOr[js.Date] = js.undefined
  
  var month: js.UndefOr[MultiViewCalendarMonth] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigate: js.UndefOr[js.Function1[/* e */ MultiViewCalendarEvent, Unit]] = js.undefined
  
  var range: js.UndefOr[MultiViewCalendarRange] = js.undefined
  
  var selectDates: js.UndefOr[Any] = js.undefined
  
  var selectable: js.UndefOr[String] = js.undefined
  
  var showViewHeader: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.Date] = js.undefined
  
  var views: js.UndefOr[Double] = js.undefined
  
  var weekNumber: js.UndefOr[Boolean] = js.undefined
}
object MultiViewCalendarOptions {
  
  inline def apply(): MultiViewCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiViewCalendarOptions]
  }
  
  extension [Self <: MultiViewCalendarOptions](x: Self) {
    
    inline def setChange(value: /* e */ MultiViewCalendarEvent => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* e */ MultiViewCalendarEvent) => value(t0).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setDates(value: Any): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesUndefined: Self = StObject.set(x, "dates", js.undefined)
    
    inline def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setDisableDates(value: Any | js.Function): Self = StObject.set(x, "disableDates", value.asInstanceOf[js.Any])
    
    inline def setDisableDatesUndefined: Self = StObject.set(x, "disableDates", js.undefined)
    
    inline def setFooter(value: String | js.Function): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessages(value: MultiViewCalendarMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMonth(value: MultiViewCalendarMonth): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigate(value: /* e */ MultiViewCalendarEvent => Callback): Self = StObject.set(x, "navigate", js.Any.fromFunction1((t0: /* e */ MultiViewCalendarEvent) => value(t0).runNow()))
    
    inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    inline def setRange(value: MultiViewCalendarRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSelectDates(value: Any): Self = StObject.set(x, "selectDates", value.asInstanceOf[js.Any])
    
    inline def setSelectDatesUndefined: Self = StObject.set(x, "selectDates", js.undefined)
    
    inline def setSelectable(value: String): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setShowViewHeader(value: Boolean): Self = StObject.set(x, "showViewHeader", value.asInstanceOf[js.Any])
    
    inline def setShowViewHeaderUndefined: Self = StObject.set(x, "showViewHeader", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setWeekNumber(value: Boolean): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    inline def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
  }
}
