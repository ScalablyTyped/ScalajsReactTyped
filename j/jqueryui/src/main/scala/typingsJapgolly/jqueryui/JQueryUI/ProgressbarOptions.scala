package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Progressbar //////////////////////////////////////////////////
trait ProgressbarOptions extends ProgressbarEvents {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double | Boolean] = js.undefined
}

object ProgressbarOptions {
  @scala.inline
  def apply(
    change: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Callback = null,
    complete: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Callback = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    value: Double | Boolean = null
  ): ProgressbarOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ProgressbarUIParams) => change(t0, t1).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ProgressbarUIParams) => complete(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ProgressbarUIParams) => create(t0, t1).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressbarOptions]
  }
}

