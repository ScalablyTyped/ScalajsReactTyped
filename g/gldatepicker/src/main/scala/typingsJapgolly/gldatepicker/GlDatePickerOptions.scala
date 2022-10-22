package typingsJapgolly.gldatepicker

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlDatePickerOptions extends StObject {
  
  var allowMonthSelect: js.UndefOr[Boolean] = js.undefined
  
  var allowYearSelect: js.UndefOr[Boolean] = js.undefined
  
  var borderSize: js.UndefOr[Double] = js.undefined
  
  var calendarOffset: js.UndefOr[GlDatePickerOffset] = js.undefined
  
  var cssName: js.UndefOr[String] = js.undefined
  
  var dowNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var dowOffset: js.UndefOr[Double] = js.undefined
  
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var nextArrow: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function4[/* inputElement */ JQuery, /* cell */ JQuery, /* date */ js.Date, /* data */ Any, Unit]
  ] = js.undefined
  
  var onHide: js.UndefOr[js.Function1[/* calendar */ JQuery, Unit]] = js.undefined
  
  var onHover: js.UndefOr[
    js.Function4[/* inputElement */ JQuery, /* cell */ JQuery, /* date */ js.Date, /* data */ Any, Unit]
  ] = js.undefined
  
  var onShow: js.UndefOr[js.Function1[/* calendar */ JQuery, Unit]] = js.undefined
  
  var prevArrow: js.UndefOr[String] = js.undefined
  
  var selectableDOW: js.UndefOr[js.Array[Double]] = js.undefined
  
  var selectableDateRange: js.UndefOr[js.Array[GlDatePickerDateRange]] = js.undefined
  
  var selectableDates: js.UndefOr[js.Array[GlDatePickerDate]] = js.undefined
  
  var selectableMonths: js.UndefOr[js.Array[Double]] = js.undefined
  
  var selectableYears: js.UndefOr[js.Array[Double]] = js.undefined
  
  var selectedDate: js.UndefOr[js.Date] = js.undefined
  
  var showAlways: js.UndefOr[Boolean] = js.undefined
  
  var specialDates: js.UndefOr[js.Array[GlDatePickerSpecialDate]] = js.undefined
  
  var todayDate: js.UndefOr[js.Date] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object GlDatePickerOptions {
  
  inline def apply(): GlDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlDatePickerOptions]
  }
  
  extension [Self <: GlDatePickerOptions](x: Self) {
    
    inline def setAllowMonthSelect(value: Boolean): Self = StObject.set(x, "allowMonthSelect", value.asInstanceOf[js.Any])
    
    inline def setAllowMonthSelectUndefined: Self = StObject.set(x, "allowMonthSelect", js.undefined)
    
    inline def setAllowYearSelect(value: Boolean): Self = StObject.set(x, "allowYearSelect", value.asInstanceOf[js.Any])
    
    inline def setAllowYearSelectUndefined: Self = StObject.set(x, "allowYearSelect", js.undefined)
    
    inline def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
    
    inline def setBorderSizeUndefined: Self = StObject.set(x, "borderSize", js.undefined)
    
    inline def setCalendarOffset(value: GlDatePickerOffset): Self = StObject.set(x, "calendarOffset", value.asInstanceOf[js.Any])
    
    inline def setCalendarOffsetUndefined: Self = StObject.set(x, "calendarOffset", js.undefined)
    
    inline def setCssName(value: String): Self = StObject.set(x, "cssName", value.asInstanceOf[js.Any])
    
    inline def setCssNameUndefined: Self = StObject.set(x, "cssName", js.undefined)
    
    inline def setDowNames(value: js.Array[String]): Self = StObject.set(x, "dowNames", value.asInstanceOf[js.Any])
    
    inline def setDowNamesUndefined: Self = StObject.set(x, "dowNames", js.undefined)
    
    inline def setDowNamesVarargs(value: String*): Self = StObject.set(x, "dowNames", js.Array(value*))
    
    inline def setDowOffset(value: Double): Self = StObject.set(x, "dowOffset", value.asInstanceOf[js.Any])
    
    inline def setDowOffsetUndefined: Self = StObject.set(x, "dowOffset", js.undefined)
    
    inline def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
    
    inline def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
    
    inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
    
    inline def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
    
    inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value*))
    
    inline def setNextArrow(value: String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
    
    inline def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
    
    inline def setOnClick(
      value: (/* inputElement */ JQuery, /* cell */ JQuery, /* date */ js.Date, /* data */ Any) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction4((t0: /* inputElement */ JQuery, t1: /* cell */ JQuery, t2: /* date */ js.Date, t3: /* data */ Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHide(value: /* calendar */ JQuery => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: /* calendar */ JQuery) => value(t0).runNow()))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnHover(
      value: (/* inputElement */ JQuery, /* cell */ JQuery, /* date */ js.Date, /* data */ Any) => Callback
    ): Self = StObject.set(x, "onHover", js.Any.fromFunction4((t0: /* inputElement */ JQuery, t1: /* cell */ JQuery, t2: /* date */ js.Date, t3: /* data */ Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    inline def setOnShow(value: /* calendar */ JQuery => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: /* calendar */ JQuery) => value(t0).runNow()))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setPrevArrow(value: String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
    
    inline def setPrevArrowUndefined: Self = StObject.set(x, "prevArrow", js.undefined)
    
    inline def setSelectableDOW(value: js.Array[Double]): Self = StObject.set(x, "selectableDOW", value.asInstanceOf[js.Any])
    
    inline def setSelectableDOWUndefined: Self = StObject.set(x, "selectableDOW", js.undefined)
    
    inline def setSelectableDOWVarargs(value: Double*): Self = StObject.set(x, "selectableDOW", js.Array(value*))
    
    inline def setSelectableDateRange(value: js.Array[GlDatePickerDateRange]): Self = StObject.set(x, "selectableDateRange", value.asInstanceOf[js.Any])
    
    inline def setSelectableDateRangeUndefined: Self = StObject.set(x, "selectableDateRange", js.undefined)
    
    inline def setSelectableDateRangeVarargs(value: GlDatePickerDateRange*): Self = StObject.set(x, "selectableDateRange", js.Array(value*))
    
    inline def setSelectableDates(value: js.Array[GlDatePickerDate]): Self = StObject.set(x, "selectableDates", value.asInstanceOf[js.Any])
    
    inline def setSelectableDatesUndefined: Self = StObject.set(x, "selectableDates", js.undefined)
    
    inline def setSelectableDatesVarargs(value: GlDatePickerDate*): Self = StObject.set(x, "selectableDates", js.Array(value*))
    
    inline def setSelectableMonths(value: js.Array[Double]): Self = StObject.set(x, "selectableMonths", value.asInstanceOf[js.Any])
    
    inline def setSelectableMonthsUndefined: Self = StObject.set(x, "selectableMonths", js.undefined)
    
    inline def setSelectableMonthsVarargs(value: Double*): Self = StObject.set(x, "selectableMonths", js.Array(value*))
    
    inline def setSelectableYears(value: js.Array[Double]): Self = StObject.set(x, "selectableYears", value.asInstanceOf[js.Any])
    
    inline def setSelectableYearsUndefined: Self = StObject.set(x, "selectableYears", js.undefined)
    
    inline def setSelectableYearsVarargs(value: Double*): Self = StObject.set(x, "selectableYears", js.Array(value*))
    
    inline def setSelectedDate(value: js.Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
    
    inline def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
    
    inline def setShowAlways(value: Boolean): Self = StObject.set(x, "showAlways", value.asInstanceOf[js.Any])
    
    inline def setShowAlwaysUndefined: Self = StObject.set(x, "showAlways", js.undefined)
    
    inline def setSpecialDates(value: js.Array[GlDatePickerSpecialDate]): Self = StObject.set(x, "specialDates", value.asInstanceOf[js.Any])
    
    inline def setSpecialDatesUndefined: Self = StObject.set(x, "specialDates", js.undefined)
    
    inline def setSpecialDatesVarargs(value: GlDatePickerSpecialDate*): Self = StObject.set(x, "specialDates", js.Array(value*))
    
    inline def setTodayDate(value: js.Date): Self = StObject.set(x, "todayDate", value.asInstanceOf[js.Any])
    
    inline def setTodayDateUndefined: Self = StObject.set(x, "todayDate", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
