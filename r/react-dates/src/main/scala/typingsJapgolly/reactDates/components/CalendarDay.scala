package typingsJapgolly.reactDates.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.reactDates.mod.CalendarDayCls
import typingsJapgolly.reactDates.mod.CalendarDayPhrases
import typingsJapgolly.reactDates.mod.CalendarDayShape
import typingsJapgolly.reactDates.mod.ModifiersShape
import typingsJapgolly.reactDates.reactDatesInts.`-1`
import typingsJapgolly.reactDates.reactDatesInts.`0`
import typingsJapgolly.std.HTMLTableDataCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarDay {
  
  @JSImport("react-dates", "CalendarDay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[CalendarDayCls] {
    
    inline def ariaLabelFormat(value: String): this.type = set("ariaLabelFormat", value.asInstanceOf[js.Any])
    
    inline def day(value: Moment): this.type = set("day", value.asInstanceOf[js.Any])
    
    inline def dayNull: this.type = set("day", null)
    
    inline def daySize(value: Double): this.type = set("daySize", value.asInstanceOf[js.Any])
    
    inline def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
    inline def isOutsideDay(value: Boolean): this.type = set("isOutsideDay", value.asInstanceOf[js.Any])
    
    inline def modifiers(value: ModifiersShape): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def onDayClick(
      value: (/* day */ Moment, /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => Callback
    ): this.type = set("onDayClick", js.Any.fromFunction2((t0: /* day */ Moment, t1: /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def onDayMouseEnter(
      value: (/* day */ Moment, /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => Callback
    ): this.type = set("onDayMouseEnter", js.Any.fromFunction2((t0: /* day */ Moment, t1: /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def onDayMouseLeave(
      value: (/* day */ Moment, /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => Callback
    ): this.type = set("onDayMouseLeave", js.Any.fromFunction2((t0: /* day */ Moment, t1: /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def phrases(value: CalendarDayPhrases): this.type = set("phrases", value.asInstanceOf[js.Any])
    
    inline def renderDayContents(value: (/* day */ Moment, /* modifiers */ ModifiersShape) => Node): this.type = set("renderDayContents", js.Any.fromFunction2(value))
    
    inline def renderDayContentsNull: this.type = set("renderDayContents", null)
    
    inline def tabIndex(value: `0` | `-1`): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CalendarDay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarDayShape): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
