package typingsJapgolly.reactNativeCalendars.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefFn
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.left
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderComponentProps extends StObject {
  
  def addMonth(count: Double): Unit
  
  /** Disable left arrow. Default = false */
  var disableArrowLeft: js.UndefOr[Boolean] = js.undefined
  
  /** Disable right arrow. Default = false */
  var disableArrowRight: js.UndefOr[Boolean] = js.undefined
  
  /** Apply custom disable color to selected day indexes */
  var disabledDaysIndexes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var displayLoadingIndicator: js.UndefOr[Boolean] = js.undefined
  
  var firstDay: js.UndefOr[Double] = js.undefined
  
  /** Hide month navigation arrows. Default = false */
  var hideArrows: js.UndefOr[Boolean] = js.undefined
  
  /**  Hide day names. Default = false */
  var hideDayNames: js.UndefOr[Boolean] = js.undefined
  
  var month: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate */ Any
  
  /** Month format in the title. Formatting values: http://arshaw.com/xdate/#Formatting */
  var monthFormat: js.UndefOr[String] = js.undefined
  
  /** Handler which gets executed when press arrow icon left. It receive a callback can go back month */
  var onPressArrowLeft: js.UndefOr[js.Function1[/* addMonth */ js.Function0[Unit], Unit]] = js.undefined
  
  /** Handler which gets executed when press arrow icon right. It receive a callback can go next month */
  var onPressArrowRight: js.UndefOr[js.Function1[/* addMonth */ js.Function0[Unit], Unit]] = js.undefined
  
  var ref: RefFn[Any]
  
  /** Replace default arrows with custom ones (direction can be 'left' or 'right') */
  var renderArrow: js.UndefOr[js.Function1[/* direction */ left | right, Node]] = js.undefined
  
  /** Replace default month and year title with custom one. the function receive a date as parameter. */
  var renderHeader: js.UndefOr[js.Function1[/* date */ js.Date, Node]] = js.undefined
  
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ViewStyle | js.Array[ViewStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[CalendarTheme] = js.undefined
  
  /** Provide aria-level for calendar heading for proper accessibility when used with web (react-native-web) */
  var webAriaLevel: js.UndefOr[Double] = js.undefined
}
object HeaderComponentProps {
  
  inline def apply(
    addMonth: Double => Callback,
    month: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate */ Any,
    ref: Any | Null => Callback
  ): HeaderComponentProps = {
    val __obj = js.Dynamic.literal(addMonth = js.Any.fromFunction1((t0: Double) => addMonth(t0).runNow()), month = month.asInstanceOf[js.Any], ref = js.Any.fromFunction1((t0: Any | Null) => ref(t0).runNow()))
    __obj.asInstanceOf[HeaderComponentProps]
  }
  
  extension [Self <: HeaderComponentProps](x: Self) {
    
    inline def setAddMonth(value: Double => Callback): Self = StObject.set(x, "addMonth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setDisableArrowLeft(value: Boolean): Self = StObject.set(x, "disableArrowLeft", value.asInstanceOf[js.Any])
    
    inline def setDisableArrowLeftUndefined: Self = StObject.set(x, "disableArrowLeft", js.undefined)
    
    inline def setDisableArrowRight(value: Boolean): Self = StObject.set(x, "disableArrowRight", value.asInstanceOf[js.Any])
    
    inline def setDisableArrowRightUndefined: Self = StObject.set(x, "disableArrowRight", js.undefined)
    
    inline def setDisabledDaysIndexes(value: js.Array[Double]): Self = StObject.set(x, "disabledDaysIndexes", value.asInstanceOf[js.Any])
    
    inline def setDisabledDaysIndexesUndefined: Self = StObject.set(x, "disabledDaysIndexes", js.undefined)
    
    inline def setDisabledDaysIndexesVarargs(value: Double*): Self = StObject.set(x, "disabledDaysIndexes", js.Array(value*))
    
    inline def setDisplayLoadingIndicator(value: Boolean): Self = StObject.set(x, "displayLoadingIndicator", value.asInstanceOf[js.Any])
    
    inline def setDisplayLoadingIndicatorUndefined: Self = StObject.set(x, "displayLoadingIndicator", js.undefined)
    
    inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    inline def setHideArrows(value: Boolean): Self = StObject.set(x, "hideArrows", value.asInstanceOf[js.Any])
    
    inline def setHideArrowsUndefined: Self = StObject.set(x, "hideArrows", js.undefined)
    
    inline def setHideDayNames(value: Boolean): Self = StObject.set(x, "hideDayNames", value.asInstanceOf[js.Any])
    
    inline def setHideDayNamesUndefined: Self = StObject.set(x, "hideDayNames", js.undefined)
    
    inline def setMonth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate */ Any
    ): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
    
    inline def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
    
    inline def setOnPressArrowLeft(value: /* addMonth */ js.Function0[Unit] => Callback): Self = StObject.set(x, "onPressArrowLeft", js.Any.fromFunction1((t0: /* addMonth */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnPressArrowLeftUndefined: Self = StObject.set(x, "onPressArrowLeft", js.undefined)
    
    inline def setOnPressArrowRight(value: /* addMonth */ js.Function0[Unit] => Callback): Self = StObject.set(x, "onPressArrowRight", js.Any.fromFunction1((t0: /* addMonth */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnPressArrowRightUndefined: Self = StObject.set(x, "onPressArrowRight", js.undefined)
    
    inline def setRef(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setRenderArrow(value: /* direction */ left | right => Node): Self = StObject.set(x, "renderArrow", js.Any.fromFunction1(value))
    
    inline def setRenderArrowUndefined: Self = StObject.set(x, "renderArrow", js.undefined)
    
    inline def setRenderHeader(value: /* date */ js.Date => Node): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
    
    inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    
    inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
    
    inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
    
    inline def setStyle(value: ViewStyle | js.Array[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: CalendarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setWebAriaLevel(value: Double): Self = StObject.set(x, "webAriaLevel", value.asInstanceOf[js.Any])
    
    inline def setWebAriaLevelUndefined: Self = StObject.set(x, "webAriaLevel", js.undefined)
  }
}
