package typingsJapgolly.rmcCalendar.datePickerPropsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  /** 默认日期，default: today */
  var defaultDate: js.UndefOr[js.Date] = js.undefined
  /** 选择值 */
  var endDate: js.UndefOr[js.Date] = js.undefined
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
  /** 日期点击回调 */
  var onCellClick: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* clientHight */ Double, Unit]] = js.undefined
  /** 选择区间包含不可用日期 */
  var onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[js.Date], Unit]] = js.undefined
  /** (web only) 样式前缀 */
  var prefixCls: js.UndefOr[String] = js.undefined
  /** 行大小 */
  var rowSize: js.UndefOr[normal | xl] = js.undefined
  /** 选择值 */
  var startDate: js.UndefOr[js.Date] = js.undefined
  /** 选择类型，default: range，one: 单日，range: 日期区间 */
  var `type`: js.UndefOr[one | range] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    defaultDate: js.Date = null,
    endDate: js.Date = null,
    getDateExtra: /* date */ js.Date => CallbackTo[ExtraData] = null,
    infiniteOpt: js.UndefOr[Boolean] = js.undefined,
    initalMonths: Int | Double = null,
    locale: Locale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onCellClick: /* date */ js.Date => Callback = null,
    onLayout: /* clientHight */ Double => Callback = null,
    onSelectHasDisableDate: /* date */ js.Array[js.Date] => Callback = null,
    prefixCls: String = null,
    rowSize: normal | xl = null,
    startDate: js.Date = null,
    `type`: one | range = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1((t0: /* date */ js.Date) => getDateExtra(t0).runNow()))
    if (!js.isUndefined(infiniteOpt)) __obj.updateDynamic("infiniteOpt")(infiniteOpt.asInstanceOf[js.Any])
    if (initalMonths != null) __obj.updateDynamic("initalMonths")(initalMonths.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction1((t0: /* date */ js.Date) => onCellClick(t0).runNow()))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* clientHight */ scala.Double) => onLayout(t0).runNow()))
    if (onSelectHasDisableDate != null) __obj.updateDynamic("onSelectHasDisableDate")(js.Any.fromFunction1((t0: /* date */ js.Array[js.Date]) => onSelectHasDisableDate(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

