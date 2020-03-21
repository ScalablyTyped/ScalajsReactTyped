package typingsJapgolly.gijgo.Types

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TimePicker
trait TimePickerSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var footer: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var select: js.UndefOr[js.Function2[/* e */ js.Any, /* type */ String, _]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TimePickerSettings {
  @scala.inline
  def apply(
    change: /* e */ js.Any => CallbackTo[js.Any] = null,
    close: /* e */ js.Any => CallbackTo[js.Any] = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    header: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    open: /* e */ js.Any => CallbackTo[js.Any] = null,
    select: (/* e */ js.Any, /* type */ String) => CallbackTo[js.Any] = null,
    size: String = null,
    uiLibrary: String = null,
    value: String = null,
    width: Int | Double = null
  ): TimePickerSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ js.Any) => change(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ js.Any) => close(t0).runNow()))
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ js.Any) => open(t0).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* type */ java.lang.String) => select(t0, t1).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerSettings]
  }
}

