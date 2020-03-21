package typingsJapgolly.rmcCalendar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcCalendar.calendarPropsMod.SelectDateType
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.headerMod.PropsType
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.horizontal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.vertical
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> & std.Readonly<rmc-calendar.rmc-calendar/lib/CalendarProps.default> */
trait ReadonlychildrenReactNode extends js.Object {
  val children: js.UndefOr[Node] = js.undefined
  val defaultDate: js.UndefOr[js.Date] = js.undefined
  val defaultTimeValue: js.UndefOr[js.Date] = js.undefined
  val defaultValue: js.UndefOr[SelectDateType] = js.undefined
  val enterDirection: js.UndefOr[horizontal | vertical] = js.undefined
  val getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.undefined
  val infiniteOpt: js.UndefOr[Boolean] = js.undefined
  val initalMonths: js.UndefOr[Double] = js.undefined
  val locale: js.UndefOr[Locale] = js.undefined
  val maxDate: js.UndefOr[js.Date] = js.undefined
  val minDate: js.UndefOr[js.Date] = js.undefined
  val onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onConfirm: js.UndefOr[
    js.Function2[/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date], Unit]
  ] = js.undefined
  val onSelect: js.UndefOr[
    js.Function2[
      /* date */ js.Date, 
      /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]], 
      SelectDateType | Unit
    ]
  ] = js.undefined
  val onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[js.Date], Unit]] = js.undefined
  val pickTime: js.UndefOr[Boolean] = js.undefined
  val prefixCls: js.UndefOr[String] = js.undefined
  val renderHeader: js.UndefOr[js.Function1[/* prop */ PropsType, Node]] = js.undefined
  val renderShortcut: js.UndefOr[
    js.Function1[
      /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit], 
      Node
    ]
  ] = js.undefined
  val rowSize: js.UndefOr[normal | xl] = js.undefined
  val showShortcut: js.UndefOr[Boolean] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val timePickerPickerPrefixCls: js.UndefOr[String] = js.undefined
  val timePickerPrefixCls: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[one | range] = js.undefined
  val visible: js.UndefOr[Boolean] = js.undefined
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(
    children: VdomNode = null,
    defaultDate: js.Date = null,
    defaultTimeValue: js.Date = null,
    defaultValue: SelectDateType = null,
    enterDirection: horizontal | vertical = null,
    getDateExtra: /* date */ js.Date => CallbackTo[ExtraData] = null,
    infiniteOpt: js.UndefOr[Boolean] = js.undefined,
    initalMonths: Int | Double = null,
    locale: Locale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onCancel: js.UndefOr[Callback] = js.undefined,
    onClear: js.UndefOr[Callback] = js.undefined,
    onConfirm: (/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date]) => Callback = null,
    onSelect: (/* date */ js.Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => CallbackTo[SelectDateType | Unit] = null,
    onSelectHasDisableDate: /* date */ js.Array[js.Date] => Callback = null,
    pickTime: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    renderHeader: /* prop */ PropsType => CallbackTo[Node] = null,
    renderShortcut: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => CallbackTo[Node] = null,
    rowSize: normal | xl = null,
    showShortcut: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    timePickerPickerPrefixCls: String = null,
    timePickerPrefixCls: String = null,
    title: String = null,
    `type`: one | range = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultTimeValue != null) __obj.updateDynamic("defaultTimeValue")(defaultTimeValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (enterDirection != null) __obj.updateDynamic("enterDirection")(enterDirection.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1((t0: /* date */ js.Date) => getDateExtra(t0).runNow()))
    if (!js.isUndefined(infiniteOpt)) __obj.updateDynamic("infiniteOpt")(infiniteOpt.asInstanceOf[js.Any])
    if (initalMonths != null) __obj.updateDynamic("initalMonths")(initalMonths.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    onCancel.foreach(p => __obj.updateDynamic("onCancel")(p.toJsFn))
    onClear.foreach(p => __obj.updateDynamic("onClear")(p.toJsFn))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction2((t0: /* startDateTime */ js.UndefOr[js.Date], t1: /* endDateTime */ js.UndefOr[js.Date]) => onConfirm(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => onSelect(t0, t1).runNow()))
    if (onSelectHasDisableDate != null) __obj.updateDynamic("onSelectHasDisableDate")(js.Any.fromFunction1((t0: /* date */ js.Array[js.Date]) => onSelectHasDisableDate(t0).runNow()))
    if (!js.isUndefined(pickTime)) __obj.updateDynamic("pickTime")(pickTime.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction1((t0: /* prop */ typingsJapgolly.rmcCalendar.headerMod.PropsType) => renderHeader(t0).runNow()))
    if (renderShortcut != null) __obj.updateDynamic("renderShortcut")(js.Any.fromFunction1((t0: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], scala.Unit]) => renderShortcut(t0).runNow()))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showShortcut)) __obj.updateDynamic("showShortcut")(showShortcut.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (timePickerPickerPrefixCls != null) __obj.updateDynamic("timePickerPickerPrefixCls")(timePickerPickerPrefixCls.asInstanceOf[js.Any])
    if (timePickerPrefixCls != null) __obj.updateDynamic("timePickerPrefixCls")(timePickerPrefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
}

