package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotdriverMod.DropdownLayoutDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarCalendarDotdriverMod {
  
  trait CalendarDriver
    extends StObject
       with BaseDriver {
    
    def clickDay(date: js.Date): Any
    
    def clickOnMonthDropdown(): Any
    
    def clickOnNextMonthButton(): Any
    
    def clickOnNthDay(n: Double): Any
    
    def clickOnNthDayOfTheMonth(n: Double): Any
    
    def clickOnNthYear(n: Double): Any
    
    def clickOnPrevMonthButton(): Any
    
    def clickOnSelectedDay(): Any
    
    def clickOnYearDropdown(): Any
    
    def close(): Any
    
    def getCurrentMonthWithYear(): String | Null
    
    def getFocusedDay(): String | Null
    
    def getFocusedDayElement(): HTMLElement
    
    def getMonthAndYear(): js.Array[String | Null]
    
    def getMonthCaption(): String | Null
    
    def getMonthDropdownDriver(): DropdownLayoutDriver
    
    def getMonthDropdownLabel(): String | Null
    
    def getNthWeekDayName(n: Double): HTMLElement
    
    def getNumOfSelectedDays(): Double
    
    def getNumOfVisibleMonths(): Double
    
    def getSelectedDay(): String | Null
    
    def getSelectedDays(): Double
    
    def getSelectedYear(): String | Null
    
    /** Returns size property value currently set on component
      * @returns {string}
      */
    def getSize(): String
    
    def getYearDropdownDriver(): DropdownLayoutDriver
    
    def isDayActive(date: js.Date): Boolean
    
    def isFocusedDayVisuallyUnfocused(): Boolean
    
    def isHeaderExists(): Boolean
    
    def isMonthCaptionExists(): Boolean
    
    def isMonthDropdownExists(): Boolean
    
    def isTwoMonthsLayout(): Boolean
    
    def isYearCaptionExists(): Boolean
    
    def isYearDropdownExists(): Boolean
    
    def keyboardNextYear(): Unit
    
    def keyboardPrevYear(): Unit
    
    def pressLeftArrow(): Any
    
    def pressRightArrow(): Any
    
    def triggerKeyDown(): Any
  }
  object CalendarDriver {
    
    inline def apply(
      clickDay: js.Date => Any,
      clickOnMonthDropdown: CallbackTo[Any],
      clickOnNextMonthButton: CallbackTo[Any],
      clickOnNthDay: Double => Any,
      clickOnNthDayOfTheMonth: Double => Any,
      clickOnNthYear: Double => Any,
      clickOnPrevMonthButton: CallbackTo[Any],
      clickOnSelectedDay: CallbackTo[Any],
      clickOnYearDropdown: CallbackTo[Any],
      close: CallbackTo[Any],
      exists: CallbackTo[Boolean],
      getCurrentMonthWithYear: CallbackTo[String | Null],
      getFocusedDay: CallbackTo[String | Null],
      getFocusedDayElement: CallbackTo[HTMLElement],
      getMonthAndYear: CallbackTo[js.Array[String | Null]],
      getMonthCaption: CallbackTo[String | Null],
      getMonthDropdownDriver: CallbackTo[DropdownLayoutDriver],
      getMonthDropdownLabel: CallbackTo[String | Null],
      getNthWeekDayName: Double => HTMLElement,
      getNumOfSelectedDays: CallbackTo[Double],
      getNumOfVisibleMonths: CallbackTo[Double],
      getSelectedDay: CallbackTo[String | Null],
      getSelectedDays: CallbackTo[Double],
      getSelectedYear: CallbackTo[String | Null],
      getSize: CallbackTo[String],
      getYearDropdownDriver: CallbackTo[DropdownLayoutDriver],
      isDayActive: js.Date => Boolean,
      isFocusedDayVisuallyUnfocused: CallbackTo[Boolean],
      isHeaderExists: CallbackTo[Boolean],
      isMonthCaptionExists: CallbackTo[Boolean],
      isMonthDropdownExists: CallbackTo[Boolean],
      isTwoMonthsLayout: CallbackTo[Boolean],
      isYearCaptionExists: CallbackTo[Boolean],
      isYearDropdownExists: CallbackTo[Boolean],
      keyboardNextYear: Callback,
      keyboardPrevYear: Callback,
      pressLeftArrow: CallbackTo[Any],
      pressRightArrow: CallbackTo[Any],
      triggerKeyDown: CallbackTo[Any]
    ): CalendarDriver = {
      val __obj = js.Dynamic.literal(clickDay = js.Any.fromFunction1(clickDay), clickOnMonthDropdown = clickOnMonthDropdown.toJsFn, clickOnNextMonthButton = clickOnNextMonthButton.toJsFn, clickOnNthDay = js.Any.fromFunction1(clickOnNthDay), clickOnNthDayOfTheMonth = js.Any.fromFunction1(clickOnNthDayOfTheMonth), clickOnNthYear = js.Any.fromFunction1(clickOnNthYear), clickOnPrevMonthButton = clickOnPrevMonthButton.toJsFn, clickOnSelectedDay = clickOnSelectedDay.toJsFn, clickOnYearDropdown = clickOnYearDropdown.toJsFn, close = close.toJsFn, exists = exists.toJsFn, getCurrentMonthWithYear = getCurrentMonthWithYear.toJsFn, getFocusedDay = getFocusedDay.toJsFn, getFocusedDayElement = getFocusedDayElement.toJsFn, getMonthAndYear = getMonthAndYear.toJsFn, getMonthCaption = getMonthCaption.toJsFn, getMonthDropdownDriver = getMonthDropdownDriver.toJsFn, getMonthDropdownLabel = getMonthDropdownLabel.toJsFn, getNthWeekDayName = js.Any.fromFunction1(getNthWeekDayName), getNumOfSelectedDays = getNumOfSelectedDays.toJsFn, getNumOfVisibleMonths = getNumOfVisibleMonths.toJsFn, getSelectedDay = getSelectedDay.toJsFn, getSelectedDays = getSelectedDays.toJsFn, getSelectedYear = getSelectedYear.toJsFn, getSize = getSize.toJsFn, getYearDropdownDriver = getYearDropdownDriver.toJsFn, isDayActive = js.Any.fromFunction1(isDayActive), isFocusedDayVisuallyUnfocused = isFocusedDayVisuallyUnfocused.toJsFn, isHeaderExists = isHeaderExists.toJsFn, isMonthCaptionExists = isMonthCaptionExists.toJsFn, isMonthDropdownExists = isMonthDropdownExists.toJsFn, isTwoMonthsLayout = isTwoMonthsLayout.toJsFn, isYearCaptionExists = isYearCaptionExists.toJsFn, isYearDropdownExists = isYearDropdownExists.toJsFn, keyboardNextYear = keyboardNextYear.toJsFn, keyboardPrevYear = keyboardPrevYear.toJsFn, pressLeftArrow = pressLeftArrow.toJsFn, pressRightArrow = pressRightArrow.toJsFn, triggerKeyDown = triggerKeyDown.toJsFn)
      __obj.asInstanceOf[CalendarDriver]
    }
    
    extension [Self <: CalendarDriver](x: Self) {
      
      inline def setClickDay(value: js.Date => Any): Self = StObject.set(x, "clickDay", js.Any.fromFunction1(value))
      
      inline def setClickOnMonthDropdown(value: CallbackTo[Any]): Self = StObject.set(x, "clickOnMonthDropdown", value.toJsFn)
      
      inline def setClickOnNextMonthButton(value: CallbackTo[Any]): Self = StObject.set(x, "clickOnNextMonthButton", value.toJsFn)
      
      inline def setClickOnNthDay(value: Double => Any): Self = StObject.set(x, "clickOnNthDay", js.Any.fromFunction1(value))
      
      inline def setClickOnNthDayOfTheMonth(value: Double => Any): Self = StObject.set(x, "clickOnNthDayOfTheMonth", js.Any.fromFunction1(value))
      
      inline def setClickOnNthYear(value: Double => Any): Self = StObject.set(x, "clickOnNthYear", js.Any.fromFunction1(value))
      
      inline def setClickOnPrevMonthButton(value: CallbackTo[Any]): Self = StObject.set(x, "clickOnPrevMonthButton", value.toJsFn)
      
      inline def setClickOnSelectedDay(value: CallbackTo[Any]): Self = StObject.set(x, "clickOnSelectedDay", value.toJsFn)
      
      inline def setClickOnYearDropdown(value: CallbackTo[Any]): Self = StObject.set(x, "clickOnYearDropdown", value.toJsFn)
      
      inline def setClose(value: CallbackTo[Any]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setGetCurrentMonthWithYear(value: CallbackTo[String | Null]): Self = StObject.set(x, "getCurrentMonthWithYear", value.toJsFn)
      
      inline def setGetFocusedDay(value: CallbackTo[String | Null]): Self = StObject.set(x, "getFocusedDay", value.toJsFn)
      
      inline def setGetFocusedDayElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getFocusedDayElement", value.toJsFn)
      
      inline def setGetMonthAndYear(value: CallbackTo[js.Array[String | Null]]): Self = StObject.set(x, "getMonthAndYear", value.toJsFn)
      
      inline def setGetMonthCaption(value: CallbackTo[String | Null]): Self = StObject.set(x, "getMonthCaption", value.toJsFn)
      
      inline def setGetMonthDropdownDriver(value: CallbackTo[DropdownLayoutDriver]): Self = StObject.set(x, "getMonthDropdownDriver", value.toJsFn)
      
      inline def setGetMonthDropdownLabel(value: CallbackTo[String | Null]): Self = StObject.set(x, "getMonthDropdownLabel", value.toJsFn)
      
      inline def setGetNthWeekDayName(value: Double => HTMLElement): Self = StObject.set(x, "getNthWeekDayName", js.Any.fromFunction1(value))
      
      inline def setGetNumOfSelectedDays(value: CallbackTo[Double]): Self = StObject.set(x, "getNumOfSelectedDays", value.toJsFn)
      
      inline def setGetNumOfVisibleMonths(value: CallbackTo[Double]): Self = StObject.set(x, "getNumOfVisibleMonths", value.toJsFn)
      
      inline def setGetSelectedDay(value: CallbackTo[String | Null]): Self = StObject.set(x, "getSelectedDay", value.toJsFn)
      
      inline def setGetSelectedDays(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectedDays", value.toJsFn)
      
      inline def setGetSelectedYear(value: CallbackTo[String | Null]): Self = StObject.set(x, "getSelectedYear", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[String]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetYearDropdownDriver(value: CallbackTo[DropdownLayoutDriver]): Self = StObject.set(x, "getYearDropdownDriver", value.toJsFn)
      
      inline def setIsDayActive(value: js.Date => Boolean): Self = StObject.set(x, "isDayActive", js.Any.fromFunction1(value))
      
      inline def setIsFocusedDayVisuallyUnfocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocusedDayVisuallyUnfocused", value.toJsFn)
      
      inline def setIsHeaderExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHeaderExists", value.toJsFn)
      
      inline def setIsMonthCaptionExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMonthCaptionExists", value.toJsFn)
      
      inline def setIsMonthDropdownExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMonthDropdownExists", value.toJsFn)
      
      inline def setIsTwoMonthsLayout(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTwoMonthsLayout", value.toJsFn)
      
      inline def setIsYearCaptionExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isYearCaptionExists", value.toJsFn)
      
      inline def setIsYearDropdownExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isYearDropdownExists", value.toJsFn)
      
      inline def setKeyboardNextYear(value: Callback): Self = StObject.set(x, "keyboardNextYear", value.toJsFn)
      
      inline def setKeyboardPrevYear(value: Callback): Self = StObject.set(x, "keyboardPrevYear", value.toJsFn)
      
      inline def setPressLeftArrow(value: CallbackTo[Any]): Self = StObject.set(x, "pressLeftArrow", value.toJsFn)
      
      inline def setPressRightArrow(value: CallbackTo[Any]): Self = StObject.set(x, "pressRightArrow", value.toJsFn)
      
      inline def setTriggerKeyDown(value: CallbackTo[Any]): Self = StObject.set(x, "triggerKeyDown", value.toJsFn)
    }
  }
}
