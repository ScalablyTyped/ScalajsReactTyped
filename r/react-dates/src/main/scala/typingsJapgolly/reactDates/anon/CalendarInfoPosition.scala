package typingsJapgolly.reactDates.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.reactDates.mod.CalendarInfoPositionShape
import typingsJapgolly.reactDates.mod.DayPickerPhrases
import typingsJapgolly.reactDates.mod.NavPositionShape
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarInfoPosition extends StObject {
  
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.undefined
  
  // navigation props
  var dayPickerNavigationInlineStyles: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var disableNext: js.UndefOr[Boolean] = js.undefined
  
  var disablePrev: js.UndefOr[Boolean] = js.undefined
  
  var getFirstFocusableDay: js.UndefOr[(js.Function1[/* month */ Moment, Moment]) | Null] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined
  
  var initialVisibleMonth: js.UndefOr[js.Function0[Moment]] = js.undefined
  
  // accessibility props
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  var navNext: js.UndefOr[Node] = js.undefined
  
  var navPosition: js.UndefOr[NavPositionShape] = js.undefined
  
  var navPrev: js.UndefOr[Node] = js.undefined
  
  var noBorder: js.UndefOr[Boolean] = js.undefined
  
  var noNavButtons: js.UndefOr[Boolean] = js.undefined
  
  var noNavNextButton: js.UndefOr[Boolean] = js.undefined
  
  var noNavPrevButton: js.UndefOr[Boolean] = js.undefined
  
  // calendar presentation props
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  
  var onBlur: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onMonthChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.undefined
  
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.undefined
  
  var onOutsideClick: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.undefined
  
  var onShiftTab: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTab: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onYearChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.undefined
  
  var phrases: js.UndefOr[DayPickerPhrases] = js.undefined
  
  var renderCalendarInfo: js.UndefOr[js.Function0[Node] | Null] = js.undefined
  
  var renderKeyboardShortcutsButton: js.UndefOr[js.Function1[/* props */ OnClick, Node]] = js.undefined
  
  var renderKeyboardShortcutsPanel: js.UndefOr[js.Function1[/* props */ CloseButtonAriaLabel, Node]] = js.undefined
  
  var renderNavNextButton: js.UndefOr[(js.Function1[/* props */ AriaLabel, Node]) | Null] = js.undefined
  
  var renderNavPrevButton: js.UndefOr[(js.Function1[/* props */ AriaLabel, Node]) | Null] = js.undefined
  
  // month props
  var renderWeekHeaderElement: js.UndefOr[(js.Function1[/* day */ String, Node]) | Null] = js.undefined
  
  var showKeyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  
  var verticalHeight: js.UndefOr[Double | Null] = js.undefined
  
  // internationalization
  var weekDayFormat: js.UndefOr[String] = js.undefined
  
  var withPortal: js.UndefOr[Boolean] = js.undefined
}
object CalendarInfoPosition {
  
  inline def apply(): CalendarInfoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarInfoPosition]
  }
  
  extension [Self <: CalendarInfoPosition](x: Self) {
    
    inline def setCalendarInfoPosition(value: CalendarInfoPositionShape): Self = StObject.set(x, "calendarInfoPosition", value.asInstanceOf[js.Any])
    
    inline def setCalendarInfoPositionUndefined: Self = StObject.set(x, "calendarInfoPosition", js.undefined)
    
    inline def setDayPickerNavigationInlineStyles(value: Record[String, Any]): Self = StObject.set(x, "dayPickerNavigationInlineStyles", value.asInstanceOf[js.Any])
    
    inline def setDayPickerNavigationInlineStylesNull: Self = StObject.set(x, "dayPickerNavigationInlineStyles", null)
    
    inline def setDayPickerNavigationInlineStylesUndefined: Self = StObject.set(x, "dayPickerNavigationInlineStyles", js.undefined)
    
    inline def setDisableNext(value: Boolean): Self = StObject.set(x, "disableNext", value.asInstanceOf[js.Any])
    
    inline def setDisableNextUndefined: Self = StObject.set(x, "disableNext", js.undefined)
    
    inline def setDisablePrev(value: Boolean): Self = StObject.set(x, "disablePrev", value.asInstanceOf[js.Any])
    
    inline def setDisablePrevUndefined: Self = StObject.set(x, "disablePrev", js.undefined)
    
    inline def setGetFirstFocusableDay(value: /* month */ Moment => Moment): Self = StObject.set(x, "getFirstFocusableDay", js.Any.fromFunction1(value))
    
    inline def setGetFirstFocusableDayNull: Self = StObject.set(x, "getFirstFocusableDay", null)
    
    inline def setGetFirstFocusableDayUndefined: Self = StObject.set(x, "getFirstFocusableDay", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHideKeyboardShortcutsPanel(value: Boolean): Self = StObject.set(x, "hideKeyboardShortcutsPanel", value.asInstanceOf[js.Any])
    
    inline def setHideKeyboardShortcutsPanelUndefined: Self = StObject.set(x, "hideKeyboardShortcutsPanel", js.undefined)
    
    inline def setInitialVisibleMonth(value: CallbackTo[Moment]): Self = StObject.set(x, "initialVisibleMonth", value.toJsFn)
    
    inline def setInitialVisibleMonthUndefined: Self = StObject.set(x, "initialVisibleMonth", js.undefined)
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    inline def setNavNext(value: VdomNode): Self = StObject.set(x, "navNext", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNavNextNull: Self = StObject.set(x, "navNext", null)
    
    inline def setNavNextUndefined: Self = StObject.set(x, "navNext", js.undefined)
    
    inline def setNavNextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "navNext", js.Array(value*))
    
    inline def setNavNextVdomElement(value: VdomElement): Self = StObject.set(x, "navNext", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNavPosition(value: NavPositionShape): Self = StObject.set(x, "navPosition", value.asInstanceOf[js.Any])
    
    inline def setNavPositionUndefined: Self = StObject.set(x, "navPosition", js.undefined)
    
    inline def setNavPrev(value: VdomNode): Self = StObject.set(x, "navPrev", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNavPrevNull: Self = StObject.set(x, "navPrev", null)
    
    inline def setNavPrevUndefined: Self = StObject.set(x, "navPrev", js.undefined)
    
    inline def setNavPrevVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "navPrev", js.Array(value*))
    
    inline def setNavPrevVdomElement(value: VdomElement): Self = StObject.set(x, "navPrev", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
    
    inline def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
    
    inline def setNoNavButtons(value: Boolean): Self = StObject.set(x, "noNavButtons", value.asInstanceOf[js.Any])
    
    inline def setNoNavButtonsUndefined: Self = StObject.set(x, "noNavButtons", js.undefined)
    
    inline def setNoNavNextButton(value: Boolean): Self = StObject.set(x, "noNavNextButton", value.asInstanceOf[js.Any])
    
    inline def setNoNavNextButtonUndefined: Self = StObject.set(x, "noNavNextButton", js.undefined)
    
    inline def setNoNavPrevButton(value: Boolean): Self = StObject.set(x, "noNavPrevButton", value.asInstanceOf[js.Any])
    
    inline def setNoNavPrevButtonUndefined: Self = StObject.set(x, "noNavPrevButton", js.undefined)
    
    inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
    
    inline def setOnBlur(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnMonthChange(value: /* newMonth */ Moment => Callback): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1((t0: /* newMonth */ Moment) => value(t0).runNow()))
    
    inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    inline def setOnNextMonthClick(value: /* newCurrentMonth */ Moment => Callback): Self = StObject.set(x, "onNextMonthClick", js.Any.fromFunction1((t0: /* newCurrentMonth */ Moment) => value(t0).runNow()))
    
    inline def setOnNextMonthClickUndefined: Self = StObject.set(x, "onNextMonthClick", js.undefined)
    
    inline def setOnOutsideClick(value: /* e */ MouseEvent => Callback): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction1((t0: /* e */ MouseEvent) => value(t0).runNow()))
    
    inline def setOnOutsideClickUndefined: Self = StObject.set(x, "onOutsideClick", js.undefined)
    
    inline def setOnPrevMonthClick(value: /* newCurrentMonth */ Moment => Callback): Self = StObject.set(x, "onPrevMonthClick", js.Any.fromFunction1((t0: /* newCurrentMonth */ Moment) => value(t0).runNow()))
    
    inline def setOnPrevMonthClickUndefined: Self = StObject.set(x, "onPrevMonthClick", js.undefined)
    
    inline def setOnShiftTab(value: Callback): Self = StObject.set(x, "onShiftTab", value.toJsFn)
    
    inline def setOnShiftTabUndefined: Self = StObject.set(x, "onShiftTab", js.undefined)
    
    inline def setOnTab(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTab", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
    
    inline def setOnYearChange(value: /* newMonth */ Moment => Callback): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1((t0: /* newMonth */ Moment) => value(t0).runNow()))
    
    inline def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
    
    inline def setPhrases(value: DayPickerPhrases): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    inline def setRenderCalendarInfo(value: CallbackTo[Node]): Self = StObject.set(x, "renderCalendarInfo", value.toJsFn)
    
    inline def setRenderCalendarInfoNull: Self = StObject.set(x, "renderCalendarInfo", null)
    
    inline def setRenderCalendarInfoUndefined: Self = StObject.set(x, "renderCalendarInfo", js.undefined)
    
    inline def setRenderKeyboardShortcutsButton(value: /* props */ OnClick => Node): Self = StObject.set(x, "renderKeyboardShortcutsButton", js.Any.fromFunction1(value))
    
    inline def setRenderKeyboardShortcutsButtonUndefined: Self = StObject.set(x, "renderKeyboardShortcutsButton", js.undefined)
    
    inline def setRenderKeyboardShortcutsPanel(value: /* props */ CloseButtonAriaLabel => Node): Self = StObject.set(x, "renderKeyboardShortcutsPanel", js.Any.fromFunction1(value))
    
    inline def setRenderKeyboardShortcutsPanelUndefined: Self = StObject.set(x, "renderKeyboardShortcutsPanel", js.undefined)
    
    inline def setRenderNavNextButton(value: /* props */ AriaLabel => Node): Self = StObject.set(x, "renderNavNextButton", js.Any.fromFunction1(value))
    
    inline def setRenderNavNextButtonNull: Self = StObject.set(x, "renderNavNextButton", null)
    
    inline def setRenderNavNextButtonUndefined: Self = StObject.set(x, "renderNavNextButton", js.undefined)
    
    inline def setRenderNavPrevButton(value: /* props */ AriaLabel => Node): Self = StObject.set(x, "renderNavPrevButton", js.Any.fromFunction1(value))
    
    inline def setRenderNavPrevButtonNull: Self = StObject.set(x, "renderNavPrevButton", null)
    
    inline def setRenderNavPrevButtonUndefined: Self = StObject.set(x, "renderNavPrevButton", js.undefined)
    
    inline def setRenderWeekHeaderElement(value: /* day */ String => Node): Self = StObject.set(x, "renderWeekHeaderElement", js.Any.fromFunction1(value))
    
    inline def setRenderWeekHeaderElementNull: Self = StObject.set(x, "renderWeekHeaderElement", null)
    
    inline def setRenderWeekHeaderElementUndefined: Self = StObject.set(x, "renderWeekHeaderElement", js.undefined)
    
    inline def setShowKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "showKeyboardShortcuts", value.asInstanceOf[js.Any])
    
    inline def setShowKeyboardShortcutsUndefined: Self = StObject.set(x, "showKeyboardShortcuts", js.undefined)
    
    inline def setVerticalHeight(value: Double): Self = StObject.set(x, "verticalHeight", value.asInstanceOf[js.Any])
    
    inline def setVerticalHeightNull: Self = StObject.set(x, "verticalHeight", null)
    
    inline def setVerticalHeightUndefined: Self = StObject.set(x, "verticalHeight", js.undefined)
    
    inline def setWeekDayFormat(value: String): Self = StObject.set(x, "weekDayFormat", value.asInstanceOf[js.Any])
    
    inline def setWeekDayFormatUndefined: Self = StObject.set(x, "weekDayFormat", js.undefined)
    
    inline def setWithPortal(value: Boolean): Self = StObject.set(x, "withPortal", value.asInstanceOf[js.Any])
    
    inline def setWithPortalUndefined: Self = StObject.set(x, "withPortal", js.undefined)
  }
}
