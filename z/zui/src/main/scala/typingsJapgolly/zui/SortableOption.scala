package typingsJapgolly.zui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableOption extends js.Object {
  var dragCssClass: js.UndefOr[String] = js.undefined
  var finish: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], Unit]] = js.undefined
  var mouseButton: js.UndefOr[String] = js.undefined
  var order: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], Unit]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var sortingClass: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[SortEvent], Unit]] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
}

object SortableOption {
  @scala.inline
  def apply(
    dragCssClass: String = null,
    finish: /* e */ js.UndefOr[SortEvent] => Callback = null,
    mouseButton: String = null,
    order: /* e */ js.UndefOr[SortEvent] => Callback = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    sortingClass: String = null,
    start: /* e */ js.UndefOr[SortEvent] => Callback = null,
    trigger: String = null
  ): SortableOption = {
    val __obj = js.Dynamic.literal()
    if (dragCssClass != null) __obj.updateDynamic("dragCssClass")(dragCssClass.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.zui.SortEvent]) => finish(t0).runNow()))
    if (mouseButton != null) __obj.updateDynamic("mouseButton")(mouseButton.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.zui.SortEvent]) => order(t0).runNow()))
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (sortingClass != null) __obj.updateDynamic("sortingClass")(sortingClass.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.zui.SortEvent]) => start(t0).runNow()))
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableOption]
  }
}

