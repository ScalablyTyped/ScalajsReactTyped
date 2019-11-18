package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Spinner //////////////////////////////////////////////////
trait SpinnerOptions extends SpinnerEvents {
  var culture: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var incremental: js.UndefOr[js.Any] = js.undefined
   // boolean or ()
  var max: js.UndefOr[js.Any] = js.undefined
   // number or string
  var min: js.UndefOr[js.Any] = js.undefined
   // number or string
  var numberFormat: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[js.Any] = js.undefined
}

object SpinnerOptions {
  @scala.inline
  def apply(
    change: (/* event */ JQueryEventObject, js.Object) => Callback = null,
    create: (/* event */ JQueryEventObject, js.Object) => Callback = null,
    culture: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icons: js.Any = null,
    incremental: js.Any = null,
    max: js.Any = null,
    min: js.Any = null,
    numberFormat: String = null,
    page: Int | Double = null,
    spin: (/* event */ JQueryEventObject, SpinnerUIParam) => Callback = null,
    start: (/* event */ JQueryEventObject, js.Object) => Callback = null,
    step: js.Any = null,
    stop: (/* event */ JQueryEventObject, js.Object) => Callback = null
  ): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: js.Object) => change(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: js.Object) => create(t0, t1).runNow()))
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (incremental != null) __obj.updateDynamic("incremental")(incremental.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (spin != null) __obj.updateDynamic("spin")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.SpinnerUIParam) => spin(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: js.Object) => start(t0, t1).runNow()))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: js.Object) => stop(t0, t1).runNow()))
    __obj.asInstanceOf[SpinnerOptions]
  }
}

