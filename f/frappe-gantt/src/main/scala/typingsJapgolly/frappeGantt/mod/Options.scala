package typingsJapgolly.frappeGantt.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrow_curve: js.UndefOr[Double] = js.undefined
  var bar_corner_radius: js.UndefOr[Double] = js.undefined
  var bar_height: js.UndefOr[Double] = js.undefined
  var column_width: js.UndefOr[Double] = js.undefined
  var custom_popup_html: js.UndefOr[String | (js.Function1[/* task */ js.Any, String])] = js.undefined
  var date_format: js.UndefOr[String] = js.undefined
  var header_height: js.UndefOr[Double] = js.undefined
  var on_click: js.UndefOr[js.Function1[/* task */ js.Any, Unit]] = js.undefined
  var on_date_change: js.UndefOr[js.Function3[/* task */ js.Any, /* start */ String, /* end */ String, Unit]] = js.undefined
  var on_progress_change: js.UndefOr[js.Function2[/* task */ js.Any, /* progress */ Double, Unit]] = js.undefined
  var on_view_change: js.UndefOr[js.Function1[/* mode */ viewMode, Unit]] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var view_mode: js.UndefOr[viewMode] = js.undefined
  var view_modes: js.UndefOr[js.Array[viewMode]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrow_curve: Int | Double = null,
    bar_corner_radius: Int | Double = null,
    bar_height: Int | Double = null,
    column_width: Int | Double = null,
    custom_popup_html: String | (js.Function1[/* task */ js.Any, String]) = null,
    date_format: String = null,
    header_height: Int | Double = null,
    on_click: /* task */ js.Any => Callback = null,
    on_date_change: (/* task */ js.Any, /* start */ String, /* end */ String) => Callback = null,
    on_progress_change: (/* task */ js.Any, /* progress */ Double) => Callback = null,
    on_view_change: /* mode */ viewMode => Callback = null,
    padding: Int | Double = null,
    step: Int | Double = null,
    view_mode: viewMode = null,
    view_modes: js.Array[viewMode] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrow_curve != null) __obj.updateDynamic("arrow_curve")(arrow_curve.asInstanceOf[js.Any])
    if (bar_corner_radius != null) __obj.updateDynamic("bar_corner_radius")(bar_corner_radius.asInstanceOf[js.Any])
    if (bar_height != null) __obj.updateDynamic("bar_height")(bar_height.asInstanceOf[js.Any])
    if (column_width != null) __obj.updateDynamic("column_width")(column_width.asInstanceOf[js.Any])
    if (custom_popup_html != null) __obj.updateDynamic("custom_popup_html")(custom_popup_html.asInstanceOf[js.Any])
    if (date_format != null) __obj.updateDynamic("date_format")(date_format.asInstanceOf[js.Any])
    if (header_height != null) __obj.updateDynamic("header_height")(header_height.asInstanceOf[js.Any])
    if (on_click != null) __obj.updateDynamic("on_click")(js.Any.fromFunction1((t0: /* task */ js.Any) => on_click(t0).runNow()))
    if (on_date_change != null) __obj.updateDynamic("on_date_change")(js.Any.fromFunction3((t0: /* task */ js.Any, t1: /* start */ java.lang.String, t2: /* end */ java.lang.String) => on_date_change(t0, t1, t2).runNow()))
    if (on_progress_change != null) __obj.updateDynamic("on_progress_change")(js.Any.fromFunction2((t0: /* task */ js.Any, t1: /* progress */ scala.Double) => on_progress_change(t0, t1).runNow()))
    if (on_view_change != null) __obj.updateDynamic("on_view_change")(js.Any.fromFunction1((t0: /* mode */ typingsJapgolly.frappeGantt.mod.viewMode) => on_view_change(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (view_mode != null) __obj.updateDynamic("view_mode")(view_mode.asInstanceOf[js.Any])
    if (view_modes != null) __obj.updateDynamic("view_modes")(view_modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

