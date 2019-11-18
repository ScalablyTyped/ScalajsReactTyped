package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Slider //////////////////////////////////////////////////
trait SliderOptions extends SliderEvents {
  var animate: js.UndefOr[js.Any] = js.undefined
  var classes: js.UndefOr[SliderClasses] = js.undefined
   // boolean, string or number
  var disabled: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[js.Any] = js.undefined
   // boolean or string
  var step: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    animate: js.Any = null,
    change: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    classes: SliderClasses = null,
    create: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    orientation: String = null,
    range: js.Any = null,
    slide: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    step: Int | Double = null,
    stop: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    value: Int | Double = null,
    values: js.Array[Double] = null
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => change(t0, t1).runNow()))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => create(t0, t1).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => slide(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => start(t0, t1).runNow()))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => stop(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
}

