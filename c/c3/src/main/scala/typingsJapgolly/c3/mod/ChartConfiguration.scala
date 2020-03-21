package typingsJapgolly.c3.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.c3.AnonArcs
import typingsJapgolly.c3.AnonAuto
import typingsJapgolly.c3.AnonBrighten
import typingsJapgolly.c3.AnonClassname
import typingsJapgolly.c3.AnonColors
import typingsJapgolly.c3.AnonDuration
import typingsJapgolly.c3.AnonExpand
import typingsJapgolly.c3.AnonHeight
import typingsJapgolly.c3.AnonInterpolation
import typingsJapgolly.c3.AnonLabel
import typingsJapgolly.c3.AnonPadding
import typingsJapgolly.c3.AnonPattern
import typingsJapgolly.c3.AnonSpace
import typingsJapgolly.c3.AnonZerobased
import typingsJapgolly.d3Selection.mod.Selection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartConfiguration extends js.Object {
  var area: js.UndefOr[AnonZerobased] = js.undefined
  var axis: js.UndefOr[AxesOptions] = js.undefined
  var bar: js.UndefOr[AnonSpace] = js.undefined
  /**
    * The CSS selector or the element which the chart will be set to. D3 selection object can be specified. If other chart is set already, it will be replaced with the new one (only one chart
    * can be set in one element).
    * If this option is not specified, the chart will be generated but not be set. Instead, we can access the element by chart.element and set it by ourselves.
    * Note: When chart is not binded, c3 starts observing if chart.element is binded by MutationObserver. In this case, polyfill is required in IE9 and IE10 becuase they do not support
    * MutationObserver. On the other hand, if chart always will be binded, polyfill will not be required because MutationObserver will never be called.
    */
  var bindto: js.UndefOr[String | HTMLElement | (Selection_[_, _, _, _]) | Null] = js.undefined
  var color: js.UndefOr[AnonPattern] = js.undefined
  var data: Data
  var donut: js.UndefOr[AnonLabel] = js.undefined
  var gauge: js.UndefOr[AnonArcs] = js.undefined
  var grid: js.UndefOr[GridOptions] = js.undefined
  var interaction: js.UndefOr[AnonBrighten] = js.undefined
  var legend: js.UndefOr[LegendOptions] = js.undefined
  var line: js.UndefOr[LineOptions] = js.undefined
  /**
    * Set a callback to execute when the chart is initialized.
    */
  var oninit: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.undefined
  /**
    * Set a callback to execute when mouse leaves the chart.
    */
  var onmouseout: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.undefined
  /**
    * Set a callback to execute when mouse enters the chart.
    */
  var onmouseover: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.undefined
  /**
    * Set a callback which is executed when the chart is rendered. Basically, this callback will be called in each time when the chart is redrawed.
    */
  var onrendered: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.undefined
  /**
    * Set a callback to execute when user resizes the screen.
    */
  var onresize: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.undefined
  /**
    * Set a callback to execute when screen resize finished.
    */
  var onresized: js.UndefOr[js.ThisFunction0[/* this */ ChartInternal, Unit]] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var pie: js.UndefOr[AnonExpand] = js.undefined
  var point: js.UndefOr[PointOptions] = js.undefined
  /**
    * Show rectangles inside the chart.
    * This option accepts array including object that has axis, start, end and class. The keys start, end and class are optional.
    * axis must be x, y or y2. start and end should be the value where regions start and end. If not specified, the edge values will be used. If timeseries x axis, date string, Date object and
    * unixtime integer can be used. If class is set, the region element will have it as class.
    */
  var regions: js.UndefOr[js.Array[RegionOptions]] = js.undefined
  var resize: js.UndefOr[AnonAuto] = js.undefined
  var size: js.UndefOr[AnonHeight] = js.undefined
  var spline: js.UndefOr[AnonInterpolation] = js.undefined
  var stanford: js.UndefOr[AnonColors] = js.undefined
  var subchart: js.UndefOr[SubchartOptions] = js.undefined
  var svg: js.UndefOr[AnonClassname] = js.undefined
  var title: js.UndefOr[AnonPadding] = js.undefined
  var tooltip: js.UndefOr[TooltipOptions] = js.undefined
  var transition: js.UndefOr[AnonDuration] = js.undefined
  var zoom: js.UndefOr[ZoomOptions] = js.undefined
}

object ChartConfiguration {
  @scala.inline
  def apply(
    data: Data,
    area: AnonZerobased = null,
    axis: AxesOptions = null,
    bar: AnonSpace = null,
    bindto: String | HTMLElement | (Selection_[_, _, _, _]) = null,
    color: AnonPattern = null,
    donut: AnonLabel = null,
    gauge: AnonArcs = null,
    grid: GridOptions = null,
    interaction: AnonBrighten = null,
    legend: LegendOptions = null,
    line: LineOptions = null,
    oninit: js.ThisFunction0[/* this */ ChartInternal, Unit] = null,
    onmouseout: js.ThisFunction0[/* this */ ChartInternal, Unit] = null,
    onmouseover: js.ThisFunction0[/* this */ ChartInternal, Unit] = null,
    onrendered: js.ThisFunction0[/* this */ ChartInternal, Unit] = null,
    onresize: js.ThisFunction0[/* this */ ChartInternal, Unit] = null,
    onresized: js.ThisFunction0[/* this */ ChartInternal, Unit] = null,
    padding: Padding = null,
    pie: AnonExpand = null,
    point: PointOptions = null,
    regions: js.Array[RegionOptions] = null,
    resize: AnonAuto = null,
    size: AnonHeight = null,
    spline: AnonInterpolation = null,
    stanford: AnonColors = null,
    subchart: SubchartOptions = null,
    svg: AnonClassname = null,
    title: AnonPadding = null,
    tooltip: TooltipOptions = null,
    transition: AnonDuration = null,
    zoom: ZoomOptions = null
  ): ChartConfiguration = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (bindto != null) __obj.updateDynamic("bindto")(bindto.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (donut != null) __obj.updateDynamic("donut")(donut.asInstanceOf[js.Any])
    if (gauge != null) __obj.updateDynamic("gauge")(gauge.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (interaction != null) __obj.updateDynamic("interaction")(interaction.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (oninit != null) __obj.updateDynamic("oninit")(oninit.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onrendered != null) __obj.updateDynamic("onrendered")(onrendered.asInstanceOf[js.Any])
    if (onresize != null) __obj.updateDynamic("onresize")(onresize.asInstanceOf[js.Any])
    if (onresized != null) __obj.updateDynamic("onresized")(onresized.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pie != null) __obj.updateDynamic("pie")(pie.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spline != null) __obj.updateDynamic("spline")(spline.asInstanceOf[js.Any])
    if (stanford != null) __obj.updateDynamic("stanford")(stanford.asInstanceOf[js.Any])
    if (subchart != null) __obj.updateDynamic("subchart")(subchart.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartConfiguration]
  }
}

