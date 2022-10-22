package typingsJapgolly.reactCalendarHeatmap.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCalendarHeatmap.mod.Props
import typingsJapgolly.reactCalendarHeatmap.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCalendarHeatmap {
  
  inline def apply(values: js.Array[Any]): Builder = {
    val __props = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-calendar-heatmap", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def classForValue(value: /* value */ Any => Any): this.type = set("classForValue", js.Any.fromFunction1(value))
    
    inline def endDate(value: String | Double | js.Date): this.type = set("endDate", value.asInstanceOf[js.Any])
    
    inline def gutterSize(value: Double): this.type = set("gutterSize", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def monthLabels(value: js.Array[String]): this.type = set("monthLabels", value.asInstanceOf[js.Any])
    
    inline def monthLabelsVarargs(value: String*): this.type = set("monthLabels", js.Array(value*))
    
    inline def numDays(value: Double): this.type = set("numDays", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* value */ Any => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def onMouseLeave(value: (/* e */ Any, /* value */ Any) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* e */ Any, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def onMouseOver(value: (/* e */ Any, /* value */ Any) => Callback): this.type = set("onMouseOver", js.Any.fromFunction2((t0: /* e */ Any, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def showMonthLabels(value: Boolean): this.type = set("showMonthLabels", value.asInstanceOf[js.Any])
    
    inline def showOutOfRangeDays(value: Boolean): this.type = set("showOutOfRangeDays", value.asInstanceOf[js.Any])
    
    inline def showWeekdayLabels(value: Boolean): this.type = set("showWeekdayLabels", value.asInstanceOf[js.Any])
    
    inline def startDate(value: String | Double | js.Date): this.type = set("startDate", value.asInstanceOf[js.Any])
    
    inline def titleForValue(value: /* value */ Any => Any): this.type = set("titleForValue", js.Any.fromFunction1(value))
    
    inline def tooltipDataAttrs(value: js.Object): this.type = set("tooltipDataAttrs", value.asInstanceOf[js.Any])
    
    inline def transformDayElement(value: (/* rect */ Any, /* value */ Any, /* index */ Double) => Any): this.type = set("transformDayElement", js.Any.fromFunction3(value))
    
    inline def weekdayLabels(value: js.Array[String]): this.type = set("weekdayLabels", value.asInstanceOf[js.Any])
    
    inline def weekdayLabelsVarargs(value: String*): this.type = set("weekdayLabels", js.Array(value*))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
