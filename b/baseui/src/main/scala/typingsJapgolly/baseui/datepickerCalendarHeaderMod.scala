package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.baseui.anon.Adapter
import typingsJapgolly.baseui.anon.Id
import typingsJapgolly.baseui.anon.IsMonthDropdownOpen
import typingsJapgolly.baseui.anon.Locale
import typingsJapgolly.baseui.baseuiStrings.next
import typingsJapgolly.baseui.baseuiStrings.previous
import typingsJapgolly.baseui.datepickerTypesMod.HeaderProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerCalendarHeaderMod {
  
  @JSImport("baseui/datepicker/calendar-header", JSImport.Default)
  @js.native
  open class default[T] protected () extends CalendarHeader[T] {
    def this(props: HeaderProps[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("baseui/datepicker/calendar-header", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker/calendar-header", "default.defaultProps")
    @js.native
    def defaultProps: Adapter = js.native
    inline def defaultProps_=(x: Adapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CalendarHeader[T] extends Component[HeaderProps[T], IsMonthDropdownOpen, Any] {
    
    def canArrowsOpenDropdown(event: KeyboardEvent): Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCalendarHeader(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCalendarHeader(prevProps: HeaderProps[T]): Unit = js.native
    
    var dateHelpers: typingsJapgolly.baseui.datepickerUtilsDateHelpersMod.default[T] = js.native
    
    def decreaseMonth(): Unit = js.native
    
    def getDateProp(): T = js.native
    
    def getMonthItems(): Unit = js.native
    
    def getYearItems(): Unit = js.native
    
    def handleBlur(event: ReactEventFrom[Element]): Unit = js.native
    
    def handleFocus(event: ReactEventFrom[Element]): Unit = js.native
    
    def increaseMonth(): Unit = js.native
    
    def isHiddenPaginationButton(direction: next | previous): Boolean = js.native
    
    def isMultiMonthHorizontal(): Boolean = js.native
    
    var monthItems: js.Array[Id] = js.native
    
    def renderMonthYearDropdown(): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def renderNextMonthButton(hasLocaleTheme: Locale): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def renderPreviousMonthButton(hasLocaleTheme: Locale): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    var yearItems: js.Array[Id] = js.native
  }
}
