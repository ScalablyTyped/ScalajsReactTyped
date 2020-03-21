package typingsJapgolly.nivoCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGRectElement
import typingsJapgolly.nivoCalendar.mod.CalendarDatum
import typingsJapgolly.nivoCalendar.mod.CalendarDayData
import typingsJapgolly.nivoCalendar.mod.CalendarDirection
import typingsJapgolly.nivoCalendar.mod.CalendarLegend
import typingsJapgolly.nivoCalendar.mod.CalendarSvgProps
import typingsJapgolly.nivoCalendar.mod.DateOrString
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.auto
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.BoxAlign
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveCalendar {
  def apply(
    data: js.Array[CalendarDatum],
    from: DateOrString,
    to: DateOrString,
    align: BoxAlign = null,
    colors: js.Array[String] = null,
    dayBorderColor: String = null,
    dayBorderWidth: Int | Double = null,
    daySpacing: Int | Double = null,
    direction: CalendarDirection = null,
    emptyColor: String = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[CalendarLegend] = null,
    margin: Box = null,
    maxValue: auto | Double = null,
    minValue: auto | Double = null,
    monthBorderColor: String = null,
    monthBorderWidth: Int | Double = null,
    monthLegend: (/* year */ Double, /* month */ Double, /* date */ js.Date) => CallbackTo[String | Double] = null,
    monthLegendOffset: Int | Double = null,
    onClick: (/* datum */ CalendarDayData, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback = null,
    theme: Theme = null,
    tooltip: StatelessComponent[CalendarDayData] = null,
    tooltipFormat: /* value */ Double => CallbackTo[String | Double] = null,
    yearLegend: /* year */ Double => CallbackTo[String | Double] = null,
    yearLegendOffset: Int | Double = null,
    yearSpacing: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CalendarSvgProps, 
    typingsJapgolly.nivoCalendar.mod.ResponsiveCalendar, 
    Unit, 
    CalendarSvgProps
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (dayBorderColor != null) __obj.updateDynamic("dayBorderColor")(dayBorderColor.asInstanceOf[js.Any])
    if (dayBorderWidth != null) __obj.updateDynamic("dayBorderWidth")(dayBorderWidth.asInstanceOf[js.Any])
    if (daySpacing != null) __obj.updateDynamic("daySpacing")(daySpacing.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (emptyColor != null) __obj.updateDynamic("emptyColor")(emptyColor.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (monthBorderColor != null) __obj.updateDynamic("monthBorderColor")(monthBorderColor.asInstanceOf[js.Any])
    if (monthBorderWidth != null) __obj.updateDynamic("monthBorderWidth")(monthBorderWidth.asInstanceOf[js.Any])
    if (monthLegend != null) __obj.updateDynamic("monthLegend")(js.Any.fromFunction3((t0: /* year */ scala.Double, t1: /* month */ scala.Double, t2: /* date */ js.Date) => monthLegend(t0, t1, t2).runNow()))
    if (monthLegendOffset != null) __obj.updateDynamic("monthLegendOffset")(monthLegendOffset.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* datum */ typingsJapgolly.nivoCalendar.mod.CalendarDayData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGRectElement]) => onClick(t0, t1).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(js.Any.fromFunction1((t0: /* value */ scala.Double) => tooltipFormat(t0).runNow()))
    if (yearLegend != null) __obj.updateDynamic("yearLegend")(js.Any.fromFunction1((t0: /* year */ scala.Double) => yearLegend(t0).runNow()))
    if (yearLegendOffset != null) __obj.updateDynamic("yearLegendOffset")(yearLegendOffset.asInstanceOf[js.Any])
    if (yearSpacing != null) __obj.updateDynamic("yearSpacing")(yearSpacing.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoCalendar.mod.CalendarSvgProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoCalendar.mod.ResponsiveCalendar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoCalendar.mod.CalendarSvgProps])(children: _*)
  }
  @JSImport("@nivo/calendar", "ResponsiveCalendar")
  @js.native
  object componentImport extends js.Object
  
}

