package typingsJapgolly.nivoCalendar.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.SVGRectElement
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.auto
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.BoxAlign
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/calendar.@nivo/calendar.CalendarData & @nivo/calendar.@nivo/calendar.CalendarCommonProps & std.Partial<{onClick (datum : @nivo/calendar.@nivo/calendar.CalendarDayData, event : react.react.MouseEvent<std.SVGRectElement, react.react.NativeMouseEvent>): void}> */
trait CalendarSvgProps extends js.Object {
  var align: js.UndefOr[BoxAlign] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var data: js.Array[CalendarDatum]
  var dayBorderColor: js.UndefOr[String] = js.undefined
  var dayBorderWidth: js.UndefOr[Double] = js.undefined
  var daySpacing: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[CalendarDirection] = js.undefined
  var emptyColor: js.UndefOr[String] = js.undefined
  var from: DateOrString
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var legends: js.UndefOr[js.Array[CalendarLegend]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var maxValue: js.UndefOr[auto | Double] = js.undefined
  var minValue: js.UndefOr[auto | Double] = js.undefined
  var monthBorderColor: js.UndefOr[String] = js.undefined
  var monthBorderWidth: js.UndefOr[Double] = js.undefined
  var monthLegend: js.UndefOr[
    js.Function3[/* year */ Double, /* month */ Double, /* date */ js.Date, String | Double]
  ] = js.undefined
  var monthLegendOffset: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* datum */ CalendarDayData, /* event */ ReactMouseEventFrom[SVGRectElement], Unit]
  ] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var to: DateOrString
  var tooltip: js.UndefOr[StatelessComponent[CalendarDayData]] = js.undefined
  var tooltipFormat: js.UndefOr[js.Function1[/* value */ Double, String | Double]] = js.undefined
  var yearLegend: js.UndefOr[js.Function1[/* year */ Double, String | Double]] = js.undefined
  var yearLegendOffset: js.UndefOr[Double] = js.undefined
  var yearSpacing: js.UndefOr[Double] = js.undefined
}

object CalendarSvgProps {
  @scala.inline
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
    yearSpacing: Int | Double = null
  ): CalendarSvgProps = {
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
    __obj.asInstanceOf[CalendarSvgProps]
  }
}

