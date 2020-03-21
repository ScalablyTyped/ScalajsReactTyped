package typingsJapgolly.reactPlotlyJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.plotlyJs.mod.ButtonClickEvent
import typingsJapgolly.plotlyJs.mod.Data
import typingsJapgolly.plotlyJs.mod.Frame
import typingsJapgolly.plotlyJs.mod.PlotRestyleEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactPlotlyJs.PartialConfig
import typingsJapgolly.reactPlotlyJs.PartialLayout
import typingsJapgolly.reactPlotlyJs.ReadonlyClickAnnotationEv
import typingsJapgolly.reactPlotlyJs.ReadonlyError
import typingsJapgolly.reactPlotlyJs.ReadonlyFigure
import typingsJapgolly.reactPlotlyJs.ReadonlyFrameAnimationEve
import typingsJapgolly.reactPlotlyJs.ReadonlyHTMLElement
import typingsJapgolly.reactPlotlyJs.ReadonlyLegendClickEvent
import typingsJapgolly.reactPlotlyJs.ReadonlyPlotMouseEvent
import typingsJapgolly.reactPlotlyJs.ReadonlyPlotRelayoutEvent
import typingsJapgolly.reactPlotlyJs.ReadonlyPlotSelectionEven
import typingsJapgolly.reactPlotlyJs.ReadonlySliderChangeEvent
import typingsJapgolly.reactPlotlyJs.ReadonlySliderEndEvent
import typingsJapgolly.reactPlotlyJs.ReadonlySliderStartEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotParams extends js.Object {
  /**
    * applied to the <div> into which the plot is rendered
    */
  var className: js.UndefOr[String] = js.undefined
  var config: js.UndefOr[PartialConfig] = js.undefined
  var data: js.Array[Data]
  /**
    * Assign the graph div to window.gd for debugging
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * id assigned to the <div> into which the plot is rendered.
    */
  var divId: js.UndefOr[String] = js.undefined
  var frames: js.UndefOr[js.Array[Frame]] = js.undefined
  var layout: PartialLayout
  var onAfterExport: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAfterPlot: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAnimated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAnimatingFrame: js.UndefOr[js.Function1[/* event */ ReadonlyFrameAnimationEve, Unit]] = js.undefined
  var onAnimationInterrupted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAutoSize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBeforeExport: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onButtonClicked: js.UndefOr[js.Function1[/* event */ ButtonClickEvent, Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.undefined
  var onClickAnnotation: js.UndefOr[js.Function1[/* event */ ReadonlyClickAnnotationEv, Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback executed when a plotly.js API method rejects
    * @param err Error
    */
  var onError: js.UndefOr[js.Function1[/* err */ ReadonlyError, Unit]] = js.undefined
  var onFramework: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.undefined
  /**
    * Callback executed after plot is initialized.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onInitialized: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.undefined
  var onLegendClick: js.UndefOr[js.Function1[/* event */ ReadonlyLegendClickEvent, Boolean]] = js.undefined
  var onLegendDoubleClick: js.UndefOr[js.Function1[/* event */ ReadonlyLegendClickEvent, Boolean]] = js.undefined
  /**
    * Callback executed when component unmounts, before Plotly.purge strips the graphDiv of all private attributes.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onPurge: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.undefined
  var onRedraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRelayout: js.UndefOr[js.Function1[/* event */ ReadonlyPlotRelayoutEvent, Unit]] = js.undefined
  var onRestyle: js.UndefOr[js.Function1[/* event */ PlotRestyleEvent, Unit]] = js.undefined
  var onSelected: js.UndefOr[js.Function1[/* event */ ReadonlyPlotSelectionEven, Unit]] = js.undefined
  var onSelecting: js.UndefOr[js.Function1[/* event */ ReadonlyPlotSelectionEven, Unit]] = js.undefined
  var onSliderChange: js.UndefOr[js.Function1[/* event */ ReadonlySliderChangeEvent, Unit]] = js.undefined
  var onSliderEnd: js.UndefOr[js.Function1[/* event */ ReadonlySliderEndEvent, Unit]] = js.undefined
  var onSliderStart: js.UndefOr[js.Function1[/* event */ ReadonlySliderStartEvent, Unit]] = js.undefined
  var onTransitionInterrupted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitioning: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUnhover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.undefined
  /**
    * Callback executed when when a plot is updated due to new data or layout, or when user interacts with a plot.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onUpdate: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.undefined
  /**
    * When provided, causes the plot to update only when the revision is incremented.
    */
  var revision: js.UndefOr[Double] = js.undefined
  /**
    * used to style the <div> into which the plot is rendered
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * When true, adds a call to Plotly.Plot.resize() as a window.resize event handler
    */
  var useResizeHandler: js.UndefOr[Boolean] = js.undefined
}

object PlotParams {
  @scala.inline
  def apply(
    data: js.Array[Data],
    layout: PartialLayout,
    className: String = null,
    config: PartialConfig = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    divId: String = null,
    frames: js.Array[Frame] = null,
    onAfterExport: js.UndefOr[Callback] = js.undefined,
    onAfterPlot: js.UndefOr[Callback] = js.undefined,
    onAnimated: js.UndefOr[Callback] = js.undefined,
    onAnimatingFrame: /* event */ ReadonlyFrameAnimationEve => Callback = null,
    onAnimationInterrupted: js.UndefOr[Callback] = js.undefined,
    onAutoSize: js.UndefOr[Callback] = js.undefined,
    onBeforeExport: js.UndefOr[Callback] = js.undefined,
    onButtonClicked: /* event */ ButtonClickEvent => Callback = null,
    onClick: /* event */ ReadonlyPlotMouseEvent => Callback = null,
    onClickAnnotation: /* event */ ReadonlyClickAnnotationEv => Callback = null,
    onDeselect: js.UndefOr[Callback] = js.undefined,
    onDoubleClick: js.UndefOr[Callback] = js.undefined,
    onError: /* err */ ReadonlyError => Callback = null,
    onFramework: js.UndefOr[Callback] = js.undefined,
    onHover: /* event */ ReadonlyPlotMouseEvent => Callback = null,
    onInitialized: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Callback = null,
    onLegendClick: /* event */ ReadonlyLegendClickEvent => CallbackTo[Boolean] = null,
    onLegendDoubleClick: /* event */ ReadonlyLegendClickEvent => CallbackTo[Boolean] = null,
    onPurge: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Callback = null,
    onRedraw: js.UndefOr[Callback] = js.undefined,
    onRelayout: /* event */ ReadonlyPlotRelayoutEvent => Callback = null,
    onRestyle: /* event */ PlotRestyleEvent => Callback = null,
    onSelected: /* event */ ReadonlyPlotSelectionEven => Callback = null,
    onSelecting: /* event */ ReadonlyPlotSelectionEven => Callback = null,
    onSliderChange: /* event */ ReadonlySliderChangeEvent => Callback = null,
    onSliderEnd: /* event */ ReadonlySliderEndEvent => Callback = null,
    onSliderStart: /* event */ ReadonlySliderStartEvent => Callback = null,
    onTransitionInterrupted: js.UndefOr[Callback] = js.undefined,
    onTransitioning: js.UndefOr[Callback] = js.undefined,
    onUnhover: /* event */ ReadonlyPlotMouseEvent => Callback = null,
    onUpdate: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Callback = null,
    revision: Int | Double = null,
    style: CSSProperties = null,
    useResizeHandler: js.UndefOr[Boolean] = js.undefined
  ): PlotParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (divId != null) __obj.updateDynamic("divId")(divId.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    onAfterExport.foreach(p => __obj.updateDynamic("onAfterExport")(p.toJsFn))
    onAfterPlot.foreach(p => __obj.updateDynamic("onAfterPlot")(p.toJsFn))
    onAnimated.foreach(p => __obj.updateDynamic("onAnimated")(p.toJsFn))
    if (onAnimatingFrame != null) __obj.updateDynamic("onAnimatingFrame")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyFrameAnimationEve) => onAnimatingFrame(t0).runNow()))
    onAnimationInterrupted.foreach(p => __obj.updateDynamic("onAnimationInterrupted")(p.toJsFn))
    onAutoSize.foreach(p => __obj.updateDynamic("onAutoSize")(p.toJsFn))
    onBeforeExport.foreach(p => __obj.updateDynamic("onBeforeExport")(p.toJsFn))
    if (onButtonClicked != null) __obj.updateDynamic("onButtonClicked")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.plotlyJs.mod.ButtonClickEvent) => onButtonClicked(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyPlotMouseEvent) => onClick(t0).runNow()))
    if (onClickAnnotation != null) __obj.updateDynamic("onClickAnnotation")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyClickAnnotationEv) => onClickAnnotation(t0).runNow()))
    onDeselect.foreach(p => __obj.updateDynamic("onDeselect")(p.toJsFn))
    onDoubleClick.foreach(p => __obj.updateDynamic("onDoubleClick")(p.toJsFn))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.reactPlotlyJs.ReadonlyError) => onError(t0).runNow()))
    onFramework.foreach(p => __obj.updateDynamic("onFramework")(p.toJsFn))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyPlotMouseEvent) => onHover(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction2((t0: /* figure */ typingsJapgolly.reactPlotlyJs.ReadonlyFigure, t1: /* graphDiv */ typingsJapgolly.reactPlotlyJs.ReadonlyHTMLElement) => onInitialized(t0, t1).runNow()))
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyLegendClickEvent) => onLegendClick(t0).runNow()))
    if (onLegendDoubleClick != null) __obj.updateDynamic("onLegendDoubleClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyLegendClickEvent) => onLegendDoubleClick(t0).runNow()))
    if (onPurge != null) __obj.updateDynamic("onPurge")(js.Any.fromFunction2((t0: /* figure */ typingsJapgolly.reactPlotlyJs.ReadonlyFigure, t1: /* graphDiv */ typingsJapgolly.reactPlotlyJs.ReadonlyHTMLElement) => onPurge(t0, t1).runNow()))
    onRedraw.foreach(p => __obj.updateDynamic("onRedraw")(p.toJsFn))
    if (onRelayout != null) __obj.updateDynamic("onRelayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyPlotRelayoutEvent) => onRelayout(t0).runNow()))
    if (onRestyle != null) __obj.updateDynamic("onRestyle")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.plotlyJs.mod.PlotRestyleEvent) => onRestyle(t0).runNow()))
    if (onSelected != null) __obj.updateDynamic("onSelected")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyPlotSelectionEven) => onSelected(t0).runNow()))
    if (onSelecting != null) __obj.updateDynamic("onSelecting")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyPlotSelectionEven) => onSelecting(t0).runNow()))
    if (onSliderChange != null) __obj.updateDynamic("onSliderChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlySliderChangeEvent) => onSliderChange(t0).runNow()))
    if (onSliderEnd != null) __obj.updateDynamic("onSliderEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlySliderEndEvent) => onSliderEnd(t0).runNow()))
    if (onSliderStart != null) __obj.updateDynamic("onSliderStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlySliderStartEvent) => onSliderStart(t0).runNow()))
    onTransitionInterrupted.foreach(p => __obj.updateDynamic("onTransitionInterrupted")(p.toJsFn))
    onTransitioning.foreach(p => __obj.updateDynamic("onTransitioning")(p.toJsFn))
    if (onUnhover != null) __obj.updateDynamic("onUnhover")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactPlotlyJs.ReadonlyPlotMouseEvent) => onUnhover(t0).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2((t0: /* figure */ typingsJapgolly.reactPlotlyJs.ReadonlyFigure, t1: /* graphDiv */ typingsJapgolly.reactPlotlyJs.ReadonlyHTMLElement) => onUpdate(t0, t1).runNow()))
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useResizeHandler)) __obj.updateDynamic("useResizeHandler")(useResizeHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotParams]
  }
}

