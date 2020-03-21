package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginServiceRegistrationOptions extends js.Object {
  var afterDatasetDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var afterDatasetUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterDatasetsDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var afterDatasetsUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var afterEvent: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* event */ Event_, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var afterInit: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterLayout: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterRender: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** @deprecated since version 2.5.0. Use `afterLayout` instead. */
  var afterScaleUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  // Called after drawing the `tooltip`. Note that this hook will not,
  // be called if the tooltip drawing has been previously cancelled.
  var afterTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var afterUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeDatasetDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var beforeDatasetUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  // Before the datasets are drawn but after scales are drawn
  var beforeDatasetsDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var beforeDatasetsUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  // Easing is for animation
  var beforeDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  // Called when an event occurs on the chart
  var beforeEvent: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* event */ Event_, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var beforeInit: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeLayout: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  // This is called at the start of a render. It is only called once, even if the animation will run for a number of frames. Use beforeDraw or afterDraw
  // to do something on each animation frame
  var beforeRender: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  // Called before drawing the `tooltip`. If any plugin returns `false`,
  // the tooltip drawing is cancelled until another `render` is triggered.
  var beforeTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var beforeUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  var destroy: js.UndefOr[js.Function1[/* chartInstance */ Chart, Unit]] = js.undefined
  var resize: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* newChartSize */ ChartSize, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object PluginServiceRegistrationOptions {
  @scala.inline
  def apply(
    afterDatasetDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterDatasetUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterDatasetsDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterDatasetsUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterEvent: (/* chartInstance */ Chart, /* event */ Event_, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterInit: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterLayout: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterRender: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterScaleUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterTooltipDraw: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeDatasetDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeDatasetUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeDatasetsDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeDatasetsUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeEvent: (/* chartInstance */ Chart, /* event */ Event_, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeInit: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeLayout: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeRender: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeTooltipDraw: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    beforeUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Callback = null,
    destroy: /* chartInstance */ Chart => Callback = null,
    resize: (/* chartInstance */ Chart, /* newChartSize */ ChartSize, /* options */ js.UndefOr[js.Any]) => Callback = null
  ): PluginServiceRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (afterDatasetDraw != null) __obj.updateDynamic("afterDatasetDraw")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* easing */ typingsJapgolly.chartJs.mod.Easing, t2: /* options */ js.UndefOr[js.Any]) => afterDatasetDraw(t0, t1, t2).runNow()))
    if (afterDatasetUpdate != null) __obj.updateDynamic("afterDatasetUpdate")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => afterDatasetUpdate(t0, t1).runNow()))
    if (afterDatasetsDraw != null) __obj.updateDynamic("afterDatasetsDraw")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* easing */ typingsJapgolly.chartJs.mod.Easing, t2: /* options */ js.UndefOr[js.Any]) => afterDatasetsDraw(t0, t1, t2).runNow()))
    if (afterDatasetsUpdate != null) __obj.updateDynamic("afterDatasetsUpdate")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => afterDatasetsUpdate(t0, t1).runNow()))
    if (afterDraw != null) __obj.updateDynamic("afterDraw")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* easing */ typingsJapgolly.chartJs.mod.Easing, t2: /* options */ js.UndefOr[js.Any]) => afterDraw(t0, t1, t2).runNow()))
    if (afterEvent != null) __obj.updateDynamic("afterEvent")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* event */ typingsJapgolly.std.Event_, t2: /* options */ js.UndefOr[js.Any]) => afterEvent(t0, t1, t2).runNow()))
    if (afterInit != null) __obj.updateDynamic("afterInit")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => afterInit(t0, t1).runNow()))
    if (afterLayout != null) __obj.updateDynamic("afterLayout")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => afterLayout(t0, t1).runNow()))
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => afterRender(t0, t1).runNow()))
    if (afterScaleUpdate != null) __obj.updateDynamic("afterScaleUpdate")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => afterScaleUpdate(t0, t1).runNow()))
    if (afterTooltipDraw != null) __obj.updateDynamic("afterTooltipDraw")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* tooltipData */ js.UndefOr[js.Any], t2: /* options */ js.UndefOr[js.Any]) => afterTooltipDraw(t0, t1, t2).runNow()))
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => afterUpdate(t0, t1).runNow()))
    if (beforeDatasetDraw != null) __obj.updateDynamic("beforeDatasetDraw")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* easing */ typingsJapgolly.chartJs.mod.Easing, t2: /* options */ js.UndefOr[js.Any]) => beforeDatasetDraw(t0, t1, t2).runNow()))
    if (beforeDatasetUpdate != null) __obj.updateDynamic("beforeDatasetUpdate")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => beforeDatasetUpdate(t0, t1).runNow()))
    if (beforeDatasetsDraw != null) __obj.updateDynamic("beforeDatasetsDraw")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* easing */ typingsJapgolly.chartJs.mod.Easing, t2: /* options */ js.UndefOr[js.Any]) => beforeDatasetsDraw(t0, t1, t2).runNow()))
    if (beforeDatasetsUpdate != null) __obj.updateDynamic("beforeDatasetsUpdate")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => beforeDatasetsUpdate(t0, t1).runNow()))
    if (beforeDraw != null) __obj.updateDynamic("beforeDraw")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* easing */ typingsJapgolly.chartJs.mod.Easing, t2: /* options */ js.UndefOr[js.Any]) => beforeDraw(t0, t1, t2).runNow()))
    if (beforeEvent != null) __obj.updateDynamic("beforeEvent")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* event */ typingsJapgolly.std.Event_, t2: /* options */ js.UndefOr[js.Any]) => beforeEvent(t0, t1, t2).runNow()))
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => beforeInit(t0, t1).runNow()))
    if (beforeLayout != null) __obj.updateDynamic("beforeLayout")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => beforeLayout(t0, t1).runNow()))
    if (beforeRender != null) __obj.updateDynamic("beforeRender")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => beforeRender(t0, t1).runNow()))
    if (beforeTooltipDraw != null) __obj.updateDynamic("beforeTooltipDraw")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* tooltipData */ js.UndefOr[js.Any], t2: /* options */ js.UndefOr[js.Any]) => beforeTooltipDraw(t0, t1, t2).runNow()))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction2((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* options */ js.UndefOr[js.Any]) => beforeUpdate(t0, t1).runNow()))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart) => destroy(t0).runNow()))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction3((t0: /* chartInstance */ typingsJapgolly.chartJs.mod.Chart, t1: /* newChartSize */ typingsJapgolly.chartJs.mod.ChartSize, t2: /* options */ js.UndefOr[js.Any]) => resize(t0, t1, t2).runNow()))
    __obj.asInstanceOf[PluginServiceRegistrationOptions]
  }
}

