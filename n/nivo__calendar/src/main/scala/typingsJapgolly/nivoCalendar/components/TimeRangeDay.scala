package typingsJapgolly.nivoCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCalendar.distTypesTypesMod.TimeRangeDayData
import typingsJapgolly.nivoCalendar.distTypesTypesMod.TimeRangeDayProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.TimeRangeTooltipProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeRangeDay {
  
  inline def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    data: TimeRangeDayData,
    formatValue: Double => String,
    height: Double,
    isInteractive: Boolean,
    rx: Double,
    ry: Double,
    tooltip: FC[TimeRangeTooltipProps],
    width: Double,
    x: Double,
    y: Double
  ): Builder = {
    val __props = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), height = height.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* hasDataXRyRxYWidthHeightColorBorderWidthBorderColorIsInteractiveTooltipOnMouseEnterOnMouseMoveOnMouseLeaveOnClickFormatValue */ TimeRangeDayProps]))
  }
  
  @JSImport("@nivo/calendar/dist/types/TimeRangeDay", "TimeRangeDay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(value: (/* datum */ TimeRangeDayData, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ TimeRangeDayData, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* datum */ TimeRangeDayData, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ TimeRangeDayData, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* datum */ TimeRangeDayData, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ TimeRangeDayData, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (/* datum */ TimeRangeDayData, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* datum */ TimeRangeDayData, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
  }
  
  def withProps(
    p: /* hasDataXRyRxYWidthHeightColorBorderWidthBorderColorIsInteractiveTooltipOnMouseEnterOnMouseMoveOnMouseLeaveOnClickFormatValue */ TimeRangeDayProps
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
