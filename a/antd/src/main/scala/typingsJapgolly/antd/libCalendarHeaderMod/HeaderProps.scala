package typingsJapgolly.antd.libCalendarHeaderMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var headerRender: js.UndefOr[HeaderRender] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var onTypeChange: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var validRange: js.UndefOr[js.Tuple2[Moment, Moment]] = js.undefined
  var value: Moment
  var yearSelectOffset: js.UndefOr[Double] = js.undefined
  var yearSelectTotal: js.UndefOr[Double] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    value: Moment,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* headerRender */ RenderHeader => CallbackTo[Node] = null,
    locale: js.Any = null,
    onTypeChange: /* type */ String => Callback = null,
    onValueChange: /* value */ Moment => Callback = null,
    prefixCls: String = null,
    `type`: String = null,
    validRange: js.Tuple2[Moment, Moment] = null,
    yearSelectOffset: Int | Double = null,
    yearSelectTotal: Int | Double = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1((t0: /* headerRender */ typingsJapgolly.antd.libCalendarHeaderMod.RenderHeader) => headerRender(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onTypeChange != null) __obj.updateDynamic("onTypeChange")(js.Any.fromFunction1((t0: /* type */ java.lang.String) => onTypeChange(t0).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.moment.momentMod.Moment) => onValueChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    if (yearSelectOffset != null) __obj.updateDynamic("yearSelectOffset")(yearSelectOffset.asInstanceOf[js.Any])
    if (yearSelectTotal != null) __obj.updateDynamic("yearSelectTotal")(yearSelectTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}

