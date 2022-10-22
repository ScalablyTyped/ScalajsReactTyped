package typingsJapgolly.nivoCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCalendar.anon.OmitDatumdatavalue
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarDayProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarTooltipProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.Datum
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarDay {
  
  inline def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    data: OmitDatumdatavalue | Datum,
    formatValue: Double => String,
    isInteractive: Boolean,
    size: Double,
    tooltip: FC[CalendarTooltipProps],
    x: Double,
    y: Double
  ): Builder = {
    val __props = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), isInteractive = isInteractive.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* hasDataXYSizeColorBorderWidthBorderColorIsInteractiveTooltipOnMouseEnterOnMouseMoveOnMouseLeaveOnClickFormatValue */ CalendarDayProps]))
  }
  
  @JSImport("@nivo/calendar/dist/types/CalendarDay", "CalendarDay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
  }
  
  def withProps(
    p: /* hasDataXYSizeColorBorderWidthBorderColorIsInteractiveTooltipOnMouseEnterOnMouseMoveOnMouseLeaveOnClickFormatValue */ CalendarDayProps
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
