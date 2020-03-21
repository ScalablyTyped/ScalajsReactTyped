package typingsJapgolly.zui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableOption extends js.Object {
  var clickBehavior: js.UndefOr[String] = js.undefined
  var finish: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.undefined
  var ignoreVal: js.UndefOr[Double] = js.undefined
  var mouseButton: js.UndefOr[String] = js.undefined
  var rangeStyle: js.UndefOr[String | js.Object] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Boolean]] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var unselect: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.undefined
}

object SelectableOption {
  @scala.inline
  def apply(
    clickBehavior: String = null,
    finish: /* e */ js.UndefOr[SelectableEvent] => Callback = null,
    ignoreVal: Int | Double = null,
    mouseButton: String = null,
    rangeStyle: String | js.Object = null,
    select: /* e */ js.UndefOr[SelectableEvent] => Callback = null,
    selector: String = null,
    start: /* e */ js.UndefOr[SelectableEvent] => CallbackTo[Boolean] = null,
    trigger: String = null,
    unselect: /* e */ js.UndefOr[SelectableEvent] => Callback = null
  ): SelectableOption = {
    val __obj = js.Dynamic.literal()
    if (clickBehavior != null) __obj.updateDynamic("clickBehavior")(clickBehavior.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.zui.SelectableEvent]) => finish(t0).runNow()))
    if (ignoreVal != null) __obj.updateDynamic("ignoreVal")(ignoreVal.asInstanceOf[js.Any])
    if (mouseButton != null) __obj.updateDynamic("mouseButton")(mouseButton.asInstanceOf[js.Any])
    if (rangeStyle != null) __obj.updateDynamic("rangeStyle")(rangeStyle.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.zui.SelectableEvent]) => select(t0).runNow()))
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.zui.SelectableEvent]) => start(t0).runNow()))
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (unselect != null) __obj.updateDynamic("unselect")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.zui.SelectableEvent]) => unselect(t0).runNow()))
    __obj.asInstanceOf[SelectableOption]
  }
}

