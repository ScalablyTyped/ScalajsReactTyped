package typingsJapgolly.tablesorter.uirangeoptionsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jqueryui.JQueryUI.SliderClasses
import typingsJapgolly.jqueryui.JQueryUI.SliderEvent
import typingsJapgolly.jqueryui.JQueryUI.SliderUIParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent tablesorter.tablesorter/Omit.Omit<tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>, 'value'> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/NumericOptions.NumericOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/PreviewableOptions.PreviewableOptions */
trait UIRangeOptions extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var change: js.UndefOr[SliderEvent] = js.undefined
  var classes: js.UndefOr[SliderClasses] = js.undefined
  var create: js.UndefOr[SliderEvent] = js.undefined
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum value of the control.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value of the control.
    */
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[js.Any] = js.undefined
  var slide: js.UndefOr[SliderEvent] = js.undefined
  var start: js.UndefOr[SliderEvent] = js.undefined
  var stop: js.UndefOr[SliderEvent] = js.undefined
  /**
    * A value indicating whether the value should be visible in the table header.
    */
  var valueToHeader: js.UndefOr[Boolean] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object UIRangeOptions {
  @scala.inline
  def apply(
    animate: js.Any = null,
    change: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    classes: SliderClasses = null,
    create: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    delayed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    orientation: String = null,
    range: js.Any = null,
    slide: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    valueToHeader: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null
  ): UIRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => change(t0, t1).runNow()))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => create(t0, t1).runNow()))
    if (!js.isUndefined(delayed)) __obj.updateDynamic("delayed")(delayed.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => slide(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => stop(t0, t1).runNow()))
    if (!js.isUndefined(valueToHeader)) __obj.updateDynamic("valueToHeader")(valueToHeader.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIRangeOptions]
  }
}

