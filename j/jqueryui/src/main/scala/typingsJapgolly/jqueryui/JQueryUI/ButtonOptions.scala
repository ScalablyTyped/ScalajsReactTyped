package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Button //////////////////////////////////////////////////
trait ButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* event */ js.UndefOr[Event_], Unit]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String | Boolean] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    click: /* event */ js.UndefOr[Event_] => Callback = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icons: js.Any = null,
    label: String = null,
    text: String | Boolean = null
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_]) => click(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
}

