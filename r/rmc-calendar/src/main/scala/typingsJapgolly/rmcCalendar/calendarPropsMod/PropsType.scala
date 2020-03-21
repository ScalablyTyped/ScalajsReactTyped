package typingsJapgolly.rmcCalendar.calendarPropsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.horizontal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.vertical
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  /** 显示开始日期，default: today */
  var defaultDate: js.UndefOr[js.Date] = js.undefined
  /** 默认时间选择值 */
  var defaultTimeValue: js.UndefOr[js.Date] = js.undefined
  /** 默认选择值，开始时间、结束时间 */
  var defaultValue: js.UndefOr[SelectDateType] = js.undefined
  /** 入场方向，default: vertical，vertical: 垂直，horizontal: 水平 */
  var enterDirection: js.UndefOr[horizontal | vertical] = js.undefined
  /** 日期扩展数据 */
  var getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.undefined
  /** 无限滚动优化（大范围选择），default: false */
  var infiniteOpt: js.UndefOr[Boolean] = js.undefined
  /** 初始化月个数，default: 6 */
  var initalMonths: js.UndefOr[Double] = js.undefined
  /** 本地化 */
  var locale: js.UndefOr[Locale] = js.undefined
  /** 最大日期 */
  var maxDate: js.UndefOr[js.Date] = js.undefined
  /** 最小日期 */
  var minDate: js.UndefOr[js.Date] = js.undefined
  /** 关闭时回调 */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 清除时回调 */
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 确认时回调 */
  var onConfirm: js.UndefOr[
    js.Function2[/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date], Unit]
  ] = js.undefined
  /** 选择日期回调，如果有返回值，选择范围将使用返回值 */
  var onSelect: js.UndefOr[
    js.Function2[
      /* date */ js.Date, 
      /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]], 
      SelectDateType | Unit
    ]
  ] = js.undefined
  /** 选择区间包含不可用日期 */
  var onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[js.Date], Unit]] = js.undefined
  /** 是否选择时间，default: false */
  var pickTime: js.UndefOr[Boolean] = js.undefined
  /** (web only) 样式前缀，default: rmc-calendar */
  var prefixCls: js.UndefOr[String] = js.undefined
  /** 替换标题栏 */
  var renderHeader: js.UndefOr[js.Function1[/* prop */ typingsJapgolly.rmcCalendar.headerMod.PropsType, Node]] = js.undefined
  /** 替换快捷选择栏，需要设置showShortcut: true */
  var renderShortcut: js.UndefOr[
    js.Function1[
      /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit], 
      Node
    ]
  ] = js.undefined
  /** 行大小，default: normal */
  var rowSize: js.UndefOr[normal | xl] = js.undefined
  /** 快捷日期选择， default: false */
  var showShortcut: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var timePickerPickerPrefixCls: js.UndefOr[String] = js.undefined
  var timePickerPrefixCls: js.UndefOr[String] = js.undefined
  /** header title, default: {locale.title} */
  var title: js.UndefOr[String] = js.undefined
  /** 选择类型，default: range，one: 单日，range: 日期区间 */
  var `type`: js.UndefOr[one | range] = js.undefined
  /** 是否显示，default: false */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
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
    renderHeader: /* prop */ typingsJapgolly.rmcCalendar.headerMod.PropsType => CallbackTo[Node] = null,
    renderShortcut: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => CallbackTo[Node] = null,
    rowSize: normal | xl = null,
    showShortcut: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    timePickerPickerPrefixCls: String = null,
    timePickerPrefixCls: String = null,
    title: String = null,
    `type`: one | range = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PropsType = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[PropsType]
  }
}

