package typingsJapgolly.nivoCalendar.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarDatum
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarLegendProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarTooltipProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.ColorScale
import typingsJapgolly.nivoCalendar.distTypesTypesMod.DateOrString
import typingsJapgolly.nivoCalendar.distTypesTypesMod.Datum
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

/* Inlined std.Omit<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarCanvasProps, 'width' | 'height'> */
trait OmitCalendarCanvasPropswi extends StObject {
  
  var align: js.UndefOr[BoxAlign] = js.undefined
  
  var colorScale: js.UndefOr[ColorScale] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var data: js.Array[CalendarDatum]
  
  var dayBorderColor: js.UndefOr[String] = js.undefined
  
  var dayBorderWidth: js.UndefOr[Double] = js.undefined
  
  var daySpacing: js.UndefOr[Double] = js.undefined
  
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  
  var emptyColor: js.UndefOr[String] = js.undefined
  
  var from: DateOrString
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var legendFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var legends: js.UndefOr[js.Array[CalendarLegendProps]] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var maxValue: js.UndefOr[auto | Double] = js.undefined
  
  var minValue: js.UndefOr[auto | Double] = js.undefined
  
  var monthBorderColor: js.UndefOr[String] = js.undefined
  
  var monthBorderWidth: js.UndefOr[Double] = js.undefined
  
  var monthLegend: js.UndefOr[
    js.Function3[/* year */ Double, /* month */ Double, /* date */ js.Date, String | Double]
  ] = js.undefined
  
  var monthLegendOffset: js.UndefOr[Double] = js.undefined
  
  var monthLegendPosition: js.UndefOr[before | after] = js.undefined
  
  var monthSpacing: js.UndefOr[Double] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ OmitDatumdatavalue | Datum, 
      /* event */ ReactMouseEventFrom[HTMLCanvasElement], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ OmitDatumdatavalue | Datum, 
      /* event */ ReactMouseEventFrom[HTMLCanvasElement], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ OmitDatumdatavalue | Datum, 
      /* event */ ReactMouseEventFrom[HTMLCanvasElement], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* datum */ OmitDatumdatavalue | Datum, 
      /* event */ ReactMouseEventFrom[HTMLCanvasElement], 
      Unit
    ]
  ] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var renderWrapper: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var to: DateOrString
  
  var tooltip: js.UndefOr[FC[CalendarTooltipProps]] = js.undefined
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var yearLegend: js.UndefOr[js.Function1[/* year */ Double, String | Double]] = js.undefined
  
  var yearLegendOffset: js.UndefOr[Double] = js.undefined
  
  var yearLegendPosition: js.UndefOr[before | after] = js.undefined
  
  var yearSpacing: js.UndefOr[Double] = js.undefined
}
object OmitCalendarCanvasPropswi {
  
  inline def apply(data: js.Array[CalendarDatum], from: DateOrString, to: DateOrString): OmitCalendarCanvasPropswi = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitCalendarCanvasPropswi]
  }
  
  extension [Self <: OmitCalendarCanvasPropswi](x: Self) {
    
    inline def setAlign(value: BoxAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColorScale(value: ColorScale): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setData(value: js.Array[CalendarDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: CalendarDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDayBorderColor(value: String): Self = StObject.set(x, "dayBorderColor", value.asInstanceOf[js.Any])
    
    inline def setDayBorderColorUndefined: Self = StObject.set(x, "dayBorderColor", js.undefined)
    
    inline def setDayBorderWidth(value: Double): Self = StObject.set(x, "dayBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setDayBorderWidthUndefined: Self = StObject.set(x, "dayBorderWidth", js.undefined)
    
    inline def setDaySpacing(value: Double): Self = StObject.set(x, "daySpacing", value.asInstanceOf[js.Any])
    
    inline def setDaySpacingUndefined: Self = StObject.set(x, "daySpacing", js.undefined)
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
    
    inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
    
    inline def setFrom(value: DateOrString): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setLegendFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "legendFormat", value.asInstanceOf[js.Any])
    
    inline def setLegendFormatUndefined: Self = StObject.set(x, "legendFormat", js.undefined)
    
    inline def setLegends(value: js.Array[CalendarLegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: CalendarLegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setMonthBorderColor(value: String): Self = StObject.set(x, "monthBorderColor", value.asInstanceOf[js.Any])
    
    inline def setMonthBorderColorUndefined: Self = StObject.set(x, "monthBorderColor", js.undefined)
    
    inline def setMonthBorderWidth(value: Double): Self = StObject.set(x, "monthBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setMonthBorderWidthUndefined: Self = StObject.set(x, "monthBorderWidth", js.undefined)
    
    inline def setMonthLegend(value: (/* year */ Double, /* month */ Double, /* date */ js.Date) => String | Double): Self = StObject.set(x, "monthLegend", js.Any.fromFunction3(value))
    
    inline def setMonthLegendOffset(value: Double): Self = StObject.set(x, "monthLegendOffset", value.asInstanceOf[js.Any])
    
    inline def setMonthLegendOffsetUndefined: Self = StObject.set(x, "monthLegendOffset", js.undefined)
    
    inline def setMonthLegendPosition(value: before | after): Self = StObject.set(x, "monthLegendPosition", value.asInstanceOf[js.Any])
    
    inline def setMonthLegendPositionUndefined: Self = StObject.set(x, "monthLegendPosition", js.undefined)
    
    inline def setMonthLegendUndefined: Self = StObject.set(x, "monthLegend", js.undefined)
    
    inline def setMonthSpacing(value: Double): Self = StObject.set(x, "monthSpacing", value.asInstanceOf[js.Any])
    
    inline def setMonthSpacingUndefined: Self = StObject.set(x, "monthSpacing", js.undefined)
    
    inline def setOnClick(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* datum */ OmitDatumdatavalue | Datum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: /* datum */ OmitDatumdatavalue | Datum, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTo(value: DateOrString): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[CalendarTooltipProps]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setYearLegend(value: /* year */ Double => String | Double): Self = StObject.set(x, "yearLegend", js.Any.fromFunction1(value))
    
    inline def setYearLegendOffset(value: Double): Self = StObject.set(x, "yearLegendOffset", value.asInstanceOf[js.Any])
    
    inline def setYearLegendOffsetUndefined: Self = StObject.set(x, "yearLegendOffset", js.undefined)
    
    inline def setYearLegendPosition(value: before | after): Self = StObject.set(x, "yearLegendPosition", value.asInstanceOf[js.Any])
    
    inline def setYearLegendPositionUndefined: Self = StObject.set(x, "yearLegendPosition", js.undefined)
    
    inline def setYearLegendUndefined: Self = StObject.set(x, "yearLegend", js.undefined)
    
    inline def setYearSpacing(value: Double): Self = StObject.set(x, "yearSpacing", value.asInstanceOf[js.Any])
    
    inline def setYearSpacingUndefined: Self = StObject.set(x, "yearSpacing", js.undefined)
  }
}
