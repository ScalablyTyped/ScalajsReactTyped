package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod.DropdownLayoutUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarCalendarDotuniDotdriverMod {
  
  trait CalendarUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickDay(date: js.Date): js.Promise[Any]
    
    def clickOnMonthDropdown(): js.Promise[Any]
    
    def clickOnNextMonthButton(): js.Promise[Any]
    
    def clickOnNthDay(n: Double): js.Promise[Any]
    
    def clickOnNthDayOfTheMonth(n: Double): js.Promise[Any]
    
    def clickOnNthYear(n: Double): js.Promise[Any]
    
    def clickOnPrevMonthButton(): js.Promise[Any]
    
    def clickOnSelectedDay(): js.Promise[Any]
    
    def clickOnYearDropdown(): js.Promise[Any]
    
    def close(): js.Promise[Any]
    
    def getCurrentMonthWithYear(): js.Promise[String]
    
    def getFocusedDay(): js.Promise[String | Null]
    
    def getFocusedDayElement(): UniDriver[Any]
    
    def getMonthAndYear(): js.Promise[js.Array[String]]
    
    def getMonthCaption(): js.Promise[String]
    
    def getMonthDropdownDriver(): DropdownLayoutUniDriver
    
    def getMonthDropdownLabel(): js.Promise[String]
    
    def getNthWeekDayName(n: Double): UniDriver[Any]
    
    def getNumOfSelectedDays(): js.Promise[Double]
    
    def getNumOfVisibleMonths(): js.Promise[Double]
    
    def getSelectedDay(): js.Promise[String]
    
    def getSelectedDays(): js.Promise[Double]
    
    def getSelectedYear(): js.Promise[String]
    
    def getSize(): js.Promise[String]
    
    def getYearDropdownDriver(): DropdownLayoutUniDriver
    
    def isDayActive(date: js.Date): js.Promise[Boolean]
    
    def isFocusedDayVisuallyUnfocused(): js.Promise[Boolean]
    
    def isHeaderExists(): js.Promise[Boolean]
    
    def isMonthCaptionExists(): js.Promise[Boolean]
    
    def isMonthDropdownExists(): js.Promise[Boolean]
    
    def isTwoMonthsLayout(): js.Promise[Boolean]
    
    def isYearCaptionExists(): js.Promise[Boolean]
    
    def isYearDropdownExists(): js.Promise[Boolean]
    
    def keyboardNextYear(): js.Promise[Unit]
    
    def keyboardPrevYear(): js.Promise[Unit]
    
    def pressLeftArrow(): js.Promise[Any]
    
    def pressRightArrow(): js.Promise[Any]
    
    def triggerKeyDown(): js.Promise[Any]
  }
  object CalendarUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickDay: js.Date => js.Promise[Any],
      clickOnMonthDropdown: CallbackTo[js.Promise[Any]],
      clickOnNextMonthButton: CallbackTo[js.Promise[Any]],
      clickOnNthDay: Double => js.Promise[Any],
      clickOnNthDayOfTheMonth: Double => js.Promise[Any],
      clickOnNthYear: Double => js.Promise[Any],
      clickOnPrevMonthButton: CallbackTo[js.Promise[Any]],
      clickOnSelectedDay: CallbackTo[js.Promise[Any]],
      clickOnYearDropdown: CallbackTo[js.Promise[Any]],
      close: CallbackTo[js.Promise[Any]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getCurrentMonthWithYear: CallbackTo[js.Promise[String]],
      getFocusedDay: CallbackTo[js.Promise[String | Null]],
      getFocusedDayElement: CallbackTo[UniDriver[Any]],
      getMonthAndYear: CallbackTo[js.Promise[js.Array[String]]],
      getMonthCaption: CallbackTo[js.Promise[String]],
      getMonthDropdownDriver: CallbackTo[DropdownLayoutUniDriver],
      getMonthDropdownLabel: CallbackTo[js.Promise[String]],
      getNthWeekDayName: Double => UniDriver[Any],
      getNumOfSelectedDays: CallbackTo[js.Promise[Double]],
      getNumOfVisibleMonths: CallbackTo[js.Promise[Double]],
      getSelectedDay: CallbackTo[js.Promise[String]],
      getSelectedDays: CallbackTo[js.Promise[Double]],
      getSelectedYear: CallbackTo[js.Promise[String]],
      getSize: CallbackTo[js.Promise[String]],
      getYearDropdownDriver: CallbackTo[DropdownLayoutUniDriver],
      isDayActive: js.Date => js.Promise[Boolean],
      isFocusedDayVisuallyUnfocused: CallbackTo[js.Promise[Boolean]],
      isHeaderExists: CallbackTo[js.Promise[Boolean]],
      isMonthCaptionExists: CallbackTo[js.Promise[Boolean]],
      isMonthDropdownExists: CallbackTo[js.Promise[Boolean]],
      isTwoMonthsLayout: CallbackTo[js.Promise[Boolean]],
      isYearCaptionExists: CallbackTo[js.Promise[Boolean]],
      isYearDropdownExists: CallbackTo[js.Promise[Boolean]],
      keyboardNextYear: CallbackTo[js.Promise[Unit]],
      keyboardPrevYear: CallbackTo[js.Promise[Unit]],
      pressLeftArrow: CallbackTo[js.Promise[Any]],
      pressRightArrow: CallbackTo[js.Promise[Any]],
      triggerKeyDown: CallbackTo[js.Promise[Any]]
    ): CalendarUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickDay = js.Any.fromFunction1(clickDay), clickOnMonthDropdown = clickOnMonthDropdown.toJsFn, clickOnNextMonthButton = clickOnNextMonthButton.toJsFn, clickOnNthDay = js.Any.fromFunction1(clickOnNthDay), clickOnNthDayOfTheMonth = js.Any.fromFunction1(clickOnNthDayOfTheMonth), clickOnNthYear = js.Any.fromFunction1(clickOnNthYear), clickOnPrevMonthButton = clickOnPrevMonthButton.toJsFn, clickOnSelectedDay = clickOnSelectedDay.toJsFn, clickOnYearDropdown = clickOnYearDropdown.toJsFn, close = close.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getCurrentMonthWithYear = getCurrentMonthWithYear.toJsFn, getFocusedDay = getFocusedDay.toJsFn, getFocusedDayElement = getFocusedDayElement.toJsFn, getMonthAndYear = getMonthAndYear.toJsFn, getMonthCaption = getMonthCaption.toJsFn, getMonthDropdownDriver = getMonthDropdownDriver.toJsFn, getMonthDropdownLabel = getMonthDropdownLabel.toJsFn, getNthWeekDayName = js.Any.fromFunction1(getNthWeekDayName), getNumOfSelectedDays = getNumOfSelectedDays.toJsFn, getNumOfVisibleMonths = getNumOfVisibleMonths.toJsFn, getSelectedDay = getSelectedDay.toJsFn, getSelectedDays = getSelectedDays.toJsFn, getSelectedYear = getSelectedYear.toJsFn, getSize = getSize.toJsFn, getYearDropdownDriver = getYearDropdownDriver.toJsFn, isDayActive = js.Any.fromFunction1(isDayActive), isFocusedDayVisuallyUnfocused = isFocusedDayVisuallyUnfocused.toJsFn, isHeaderExists = isHeaderExists.toJsFn, isMonthCaptionExists = isMonthCaptionExists.toJsFn, isMonthDropdownExists = isMonthDropdownExists.toJsFn, isTwoMonthsLayout = isTwoMonthsLayout.toJsFn, isYearCaptionExists = isYearCaptionExists.toJsFn, isYearDropdownExists = isYearDropdownExists.toJsFn, keyboardNextYear = keyboardNextYear.toJsFn, keyboardPrevYear = keyboardPrevYear.toJsFn, pressLeftArrow = pressLeftArrow.toJsFn, pressRightArrow = pressRightArrow.toJsFn, triggerKeyDown = triggerKeyDown.toJsFn)
      __obj.asInstanceOf[CalendarUniDriver]
    }
    
    extension [Self <: CalendarUniDriver](x: Self) {
      
      inline def setClickDay(value: js.Date => js.Promise[Any]): Self = StObject.set(x, "clickDay", js.Any.fromFunction1(value))
      
      inline def setClickOnMonthDropdown(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "clickOnMonthDropdown", value.toJsFn)
      
      inline def setClickOnNextMonthButton(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "clickOnNextMonthButton", value.toJsFn)
      
      inline def setClickOnNthDay(value: Double => js.Promise[Any]): Self = StObject.set(x, "clickOnNthDay", js.Any.fromFunction1(value))
      
      inline def setClickOnNthDayOfTheMonth(value: Double => js.Promise[Any]): Self = StObject.set(x, "clickOnNthDayOfTheMonth", js.Any.fromFunction1(value))
      
      inline def setClickOnNthYear(value: Double => js.Promise[Any]): Self = StObject.set(x, "clickOnNthYear", js.Any.fromFunction1(value))
      
      inline def setClickOnPrevMonthButton(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "clickOnPrevMonthButton", value.toJsFn)
      
      inline def setClickOnSelectedDay(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "clickOnSelectedDay", value.toJsFn)
      
      inline def setClickOnYearDropdown(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "clickOnYearDropdown", value.toJsFn)
      
      inline def setClose(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setGetCurrentMonthWithYear(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCurrentMonthWithYear", value.toJsFn)
      
      inline def setGetFocusedDay(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getFocusedDay", value.toJsFn)
      
      inline def setGetFocusedDayElement(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getFocusedDayElement", value.toJsFn)
      
      inline def setGetMonthAndYear(value: CallbackTo[js.Promise[js.Array[String]]]): Self = StObject.set(x, "getMonthAndYear", value.toJsFn)
      
      inline def setGetMonthCaption(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMonthCaption", value.toJsFn)
      
      inline def setGetMonthDropdownDriver(value: CallbackTo[DropdownLayoutUniDriver]): Self = StObject.set(x, "getMonthDropdownDriver", value.toJsFn)
      
      inline def setGetMonthDropdownLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMonthDropdownLabel", value.toJsFn)
      
      inline def setGetNthWeekDayName(value: Double => UniDriver[Any]): Self = StObject.set(x, "getNthWeekDayName", js.Any.fromFunction1(value))
      
      inline def setGetNumOfSelectedDays(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getNumOfSelectedDays", value.toJsFn)
      
      inline def setGetNumOfVisibleMonths(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getNumOfVisibleMonths", value.toJsFn)
      
      inline def setGetSelectedDay(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSelectedDay", value.toJsFn)
      
      inline def setGetSelectedDays(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getSelectedDays", value.toJsFn)
      
      inline def setGetSelectedYear(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSelectedYear", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetYearDropdownDriver(value: CallbackTo[DropdownLayoutUniDriver]): Self = StObject.set(x, "getYearDropdownDriver", value.toJsFn)
      
      inline def setIsDayActive(value: js.Date => js.Promise[Boolean]): Self = StObject.set(x, "isDayActive", js.Any.fromFunction1(value))
      
      inline def setIsFocusedDayVisuallyUnfocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocusedDayVisuallyUnfocused", value.toJsFn)
      
      inline def setIsHeaderExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isHeaderExists", value.toJsFn)
      
      inline def setIsMonthCaptionExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isMonthCaptionExists", value.toJsFn)
      
      inline def setIsMonthDropdownExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isMonthDropdownExists", value.toJsFn)
      
      inline def setIsTwoMonthsLayout(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTwoMonthsLayout", value.toJsFn)
      
      inline def setIsYearCaptionExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isYearCaptionExists", value.toJsFn)
      
      inline def setIsYearDropdownExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isYearDropdownExists", value.toJsFn)
      
      inline def setKeyboardNextYear(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "keyboardNextYear", value.toJsFn)
      
      inline def setKeyboardPrevYear(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "keyboardPrevYear", value.toJsFn)
      
      inline def setPressLeftArrow(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "pressLeftArrow", value.toJsFn)
      
      inline def setPressRightArrow(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "pressRightArrow", value.toJsFn)
      
      inline def setTriggerKeyDown(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "triggerKeyDown", value.toJsFn)
    }
  }
}
