package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.officeUiFabricReact.anon.Dictkey
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarFormatDateCallbacks
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarIconStrings
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarStrings
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalendarCalendarMonthMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarMonth", "CalendarMonth")
  @js.native
  open class CalendarMonth protected () extends Component[ICalendarMonthProps, ICalendarMonthState, Any] {
    def this(props: ICalendarMonthProps) = this()
    
    /* private */ var _calendarYearRef: Any = js.native
    
    /* private */ var _focusOnUpdate: Any = js.native
    
    /* private */ var _isCurrentMonth: Any = js.native
    
    /* private */ var _navigatedMonthRef: Any = js.native
    
    /* private */ var _onCalendarYearRef: Any = js.native
    
    /* private */ var _onHeaderKeyDown: Any = js.native
    
    /* private */ var _onHeaderSelect: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onRenderYear: Any = js.native
    
    /* private */ var _onSelectMonth: Any = js.native
    
    /* private */ var _onSelectMonthKeyDown: Any = js.native
    
    /* private */ var _onSelectNextYear: Any = js.native
    
    /* private */ var _onSelectNextYearKeyDown: Any = js.native
    
    /* private */ var _onSelectPrevYear: Any = js.native
    
    /* private */ var _onSelectPrevYearKeyDown: Any = js.native
    
    /* private */ var _onSelectYear: Any = js.native
    
    /* private */ var _onYearPickerHeaderSelect: Any = js.native
    
    /* private */ var _selectMonthCallbacks: Any = js.native
    
    /* private */ var _yearRangeToNextDecadeLabel: Any = js.native
    
    /* private */ var _yearRangeToPrevDecadeLabel: Any = js.native
    
    /* private */ var _yearRangeToString: Any = js.native
    
    /* private */ var _yearToString: Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCalendarMonth(): Unit = js.native
    
    def focus(): Unit = js.native
    
    /**
      * @deprecated unused, prefer 'ref' and 'componentRef' of ICalendarMonthProps.
      */
    @JSName("refs")
    var refs_CalendarMonth: Dictkey = js.native
  }
  
  trait ICalendarMonth extends StObject {
    
    def focus(): Unit
  }
  object ICalendarMonth {
    
    inline def apply(focus: Callback): ICalendarMonth = {
      val __obj = js.Dynamic.literal(focus = focus.toJsFn)
      __obj.asInstanceOf[ICalendarMonth]
    }
    
    extension [Self <: ICalendarMonth](x: Self) {
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    }
  }
  
  trait ICalendarMonthProps
    extends StObject
       with ClassAttributes[CalendarMonth] {
    
    var componentRef: js.UndefOr[IRefObject[ICalendarMonth]] = js.undefined
    
    var dateTimeFormatter: ICalendarFormatDateCallbacks
    
    var highlightCurrentMonth: Boolean
    
    var highlightSelectedMonth: Boolean
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var navigatedDate: js.Date
    
    var navigationIcons: ICalendarIconStrings
    
    var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.undefined
    
    def onNavigateDate(date: js.Date, focusOnNavigatedDay: Boolean): Unit
    
    var selectedDate: js.Date
    
    var strings: ICalendarStrings
    
    var today: js.UndefOr[js.Date] = js.undefined
    
    var yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  }
  object ICalendarMonthProps {
    
    inline def apply(
      dateTimeFormatter: ICalendarFormatDateCallbacks,
      highlightCurrentMonth: Boolean,
      highlightSelectedMonth: Boolean,
      navigatedDate: js.Date,
      navigationIcons: ICalendarIconStrings,
      onNavigateDate: (js.Date, Boolean) => Callback,
      selectedDate: js.Date,
      strings: ICalendarStrings
    ): ICalendarMonthProps = {
      val __obj = js.Dynamic.literal(dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], highlightCurrentMonth = highlightCurrentMonth.asInstanceOf[js.Any], highlightSelectedMonth = highlightSelectedMonth.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2((t0: js.Date, t1: Boolean) => (onNavigateDate(t0, t1)).runNow()), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarMonthProps]
    }
    
    extension [Self <: ICalendarMonthProps](x: Self) {
      
      inline def setComponentRef(value: IRefObject[ICalendarMonth]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ICalendarMonth | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ ICalendarMonth | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = StObject.set(x, "dateTimeFormatter", value.asInstanceOf[js.Any])
      
      inline def setHighlightCurrentMonth(value: Boolean): Self = StObject.set(x, "highlightCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def setHighlightSelectedMonth(value: Boolean): Self = StObject.set(x, "highlightSelectedMonth", value.asInstanceOf[js.Any])
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNavigatedDate(value: js.Date): Self = StObject.set(x, "navigatedDate", value.asInstanceOf[js.Any])
      
      inline def setNavigationIcons(value: ICalendarIconStrings): Self = StObject.set(x, "navigationIcons", value.asInstanceOf[js.Any])
      
      inline def setOnHeaderSelect(value: /* focus */ Boolean => Callback): Self = StObject.set(x, "onHeaderSelect", js.Any.fromFunction1((t0: /* focus */ Boolean) => value(t0).runNow()))
      
      inline def setOnHeaderSelectUndefined: Self = StObject.set(x, "onHeaderSelect", js.undefined)
      
      inline def setOnNavigateDate(value: (js.Date, Boolean) => Callback): Self = StObject.set(x, "onNavigateDate", js.Any.fromFunction2((t0: js.Date, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setSelectedDate(value: js.Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      inline def setStrings(value: ICalendarStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      inline def setYearPickerHidden(value: Boolean): Self = StObject.set(x, "yearPickerHidden", value.asInstanceOf[js.Any])
      
      inline def setYearPickerHiddenUndefined: Self = StObject.set(x, "yearPickerHidden", js.undefined)
    }
  }
  
  trait ICalendarMonthState extends StObject {
    
    /** State used to show/hide month picker */
    var isYearPickerVisible: js.UndefOr[Boolean] = js.undefined
  }
  object ICalendarMonthState {
    
    inline def apply(): ICalendarMonthState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarMonthState]
    }
    
    extension [Self <: ICalendarMonthState](x: Self) {
      
      inline def setIsYearPickerVisible(value: Boolean): Self = StObject.set(x, "isYearPickerVisible", value.asInstanceOf[js.Any])
      
      inline def setIsYearPickerVisibleUndefined: Self = StObject.set(x, "isYearPickerVisible", js.undefined)
    }
  }
}
