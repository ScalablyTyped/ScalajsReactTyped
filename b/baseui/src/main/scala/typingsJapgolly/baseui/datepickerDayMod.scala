package typingsJapgolly.baseui

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.baseui.anon.Density
import typingsJapgolly.baseui.anon.EndDate
import typingsJapgolly.baseui.anon.Highlighted
import typingsJapgolly.baseui.anon.IsHovered
import typingsJapgolly.baseui.datepickerTypesMod.DayProps
import typingsJapgolly.baseui.datepickerTypesMod.DayState
import typingsJapgolly.baseui.localeTypesMod.Locale
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerDayMod {
  
  @JSImport("baseui/datepicker/day", JSImport.Default)
  @js.native
  open class default[T] protected () extends Day[T] {
    def this(props: DayProps[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("baseui/datepicker/day", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker/day", "default.defaultProps")
    @js.native
    def defaultProps: Highlighted = js.native
    inline def defaultProps_=(x: Highlighted): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Day[T] extends Component[DayProps[T], DayState, Any] {
    
    def clampToDayStart(a: T): T = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDay(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDay(prevProps: DayProps[T]): Unit = js.native
    
    var dateHelpers: typingsJapgolly.baseui.datepickerUtilsDateHelpersMod.default[T] = js.native
    
    var dayElm: HTMLElement = js.native
    
    def getAriaLabel(sharedProps: EndDate, localeContext: Locale): String = js.native
    
    def getDateProp(): T = js.native
    
    def getMonthProp(): Double = js.native
    
    def getOrderedDates(): js.Array[T] = js.native
    
    def getSharedProps(): Density[T] = js.native
    
    def isOutsideMonth(): Boolean = js.native
    
    def isOutsideOfMonthButWithinRange(): Boolean = js.native
    
    def isPseudoHighlighted(): Boolean = js.native
    
    def isPseudoSelected(): Boolean = js.native
    
    def isSelected(): Boolean = js.native
    
    def onBlur(event: Event): Unit = js.native
    
    def onClick(event: Event): Unit = js.native
    
    def onFocus(event: Event): Unit = js.native
    
    def onKeyDown(event: KeyboardEvent): Unit = js.native
    
    def onMouseLeave(event: Event): Unit = js.native
    
    def onMouseOver(event: Event): Unit = js.native
    
    /**
      * Determines how the day value(s) should be updated when a new day is selected.
      * Note: time values are incorporated into new day/date values downstream in `Calendar`.
      * Note: Situations where Start Dates are after End Dates are handled downstream in `Datepicker`.
      * */
    def onSelect(a: T): Unit = js.native
    
    @JSName("state")
    var state_Day: IsHovered = js.native
  }
}
