package typingsJapgolly.nivoCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarDatum
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarLegendProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarTooltipProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.ColorScale
import typingsJapgolly.nivoCalendar.distTypesTypesMod.DateOrString
import typingsJapgolly.nivoCalendar.distTypesTypesMod.TimeRangeDayData
import typingsJapgolly.nivoCalendar.distTypesTypesMod.TimeRangeSvgProps
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`0`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`1`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`2`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`3`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`4`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`5`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`6`
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.after
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.auto
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.before
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.horizontal
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.vertical
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.BoxAlign
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeRange {
  
  inline def apply(data: js.Array[CalendarDatum], height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TimeRangeSvgProps]))
  }
  
  @JSImport("@nivo/calendar", "TimeRange")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def align(value: BoxAlign): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def colorScale(value: ColorScale): this.type = set("colorScale", value.asInstanceOf[js.Any])
    
    inline def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def dayBorderColor(value: String): this.type = set("dayBorderColor", value.asInstanceOf[js.Any])
    
    inline def dayBorderWidth(value: Double): this.type = set("dayBorderWidth", value.asInstanceOf[js.Any])
    
    inline def dayRadius(value: Double): this.type = set("dayRadius", value.asInstanceOf[js.Any])
    
    inline def daySpacing(value: Double): this.type = set("daySpacing", value.asInstanceOf[js.Any])
    
    inline def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def emptyColor(value: String): this.type = set("emptyColor", value.asInstanceOf[js.Any])
    
    inline def from(value: DateOrString): this.type = set("from", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def legendFormat(value: ValueFormat[Double, Unit]): this.type = set("legendFormat", value.asInstanceOf[js.Any])
    
    inline def legends(value: js.Array[CalendarLegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: CalendarLegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxValue(value: auto | Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def minValue(value: auto | Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    
    inline def monthLegend(value: (/* year */ Double, /* month */ Double, /* date */ js.Date) => String | Double): this.type = set("monthLegend", js.Any.fromFunction3(value))
    
    inline def monthLegendOffset(value: Double): this.type = set("monthLegendOffset", value.asInstanceOf[js.Any])
    
    inline def monthLegendPosition(value: before | after): this.type = set("monthLegendPosition", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* datum */ TimeRangeDayData, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ TimeRangeDayData, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* datum */ TimeRangeDayData, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ TimeRangeDayData, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* datum */ TimeRangeDayData, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ TimeRangeDayData, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (/* datum */ TimeRangeDayData, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* datum */ TimeRangeDayData, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def square(value: Boolean): this.type = set("square", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def to(value: DateOrString): this.type = set("to", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: FC[CalendarTooltipProps]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def weekdayLegendOffset(value: Double): this.type = set("weekdayLegendOffset", value.asInstanceOf[js.Any])
    
    inline def weekdayTicks(value: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]): this.type = set("weekdayTicks", value.asInstanceOf[js.Any])
    
    inline def weekdayTicksVarargs(value: (`0` | `1` | `2` | `3` | `4` | `5` | `6`)*): this.type = set("weekdayTicks", js.Array(value*))
  }
  
  def withProps(p: TimeRangeSvgProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
