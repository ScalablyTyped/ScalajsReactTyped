package typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the sparkline.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Options for customizing the color,dashArray and width of the axisLine.
    */
  var axisLineSettings: js.UndefOr[AxisLineSettings] = js.undefined
  /** Background color of the plot area.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.undefined
  /** Options for customizing the color, opacity and width of the sparkline border.
    */
  var border: js.UndefOr[Border] = js.undefined
  /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Fires, on double clicking the sparkline.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
  /** Controls whether Sparkline has to be rendered as Canvas or SVG.Canvas rendering supports all functionalities in SVG rendering.
    * @Default {false}
    */
  var enableCanvasRendering: js.UndefOr[Boolean] = js.undefined
  /** Specify to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.undefined
  /** Color for series end point.
    * @Default {null}
    */
  var endPointColor: js.UndefOr[String] = js.undefined
  /** Fill color for the sparkline series.
    * @Default {#33ccff}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Color for series high point.
    * @Default {null}
    */
  var highPointColor: js.UndefOr[String] = js.undefined
  /** Controls whether sparkline has to be responsive or not.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Fires before loading the sparkline.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Fires after loaded the sparkline.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.undefined
  /** Name of the culture based on which sparkline should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Color for series low point.
    * @Default {null}
    */
  var lowPointColor: js.UndefOr[String] = js.undefined
  /** Options for displaying and customizing marker for a data point.
    */
  var markerSettings: js.UndefOr[MarkerSettings] = js.undefined
  /** Color for series negative point.
    * @Default {null}
    */
  var negativePointColor: js.UndefOr[String] = js.undefined
  /** Opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Gap or padding for sparkline.
    * @Default {8}
    */
  var padding: js.UndefOr[Double] = js.undefined
  /** Name of a field in data source, where the fill color for all the data points is generated.
    */
  var palette: js.UndefOr[String] = js.undefined
  /** Fires on clicking a point in sparkline. You can use this event to handle clicks made on points.
    */
  var pointRegionMouseClick: js.UndefOr[js.Function1[/* e */ PointRegionMouseClickEventArgs, Unit]] = js.undefined
  /** Fires when mouse is moved over a point.
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, Unit]] = js.undefined
  /** Options for customizing the color, opacity of the sparkline start and end range.
    */
  var rangeBandSettings: js.UndefOr[RangeBandSettings] = js.undefined
  /** Fires, on right clicking the sparkline.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
  /** Fires before rendering a series. This event is fired for each series in Sparkline.
    */
  var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, Unit]] = js.undefined
  /** Options to customize the Sparkline size.
    */
  var size: js.UndefOr[Size] = js.undefined
  /** Fires on moving mouse outside the sparkline.
    */
  var sparklineMouseLeave: js.UndefOr[js.Function1[/* e */ SparklineMouseLeaveEventArgs, Unit]] = js.undefined
  /** Fires on moving mouse over the sparkline.
    */
  var sparklineMouseMove: js.UndefOr[js.Function1[/* e */ SparklineMouseMoveEventArgs, Unit]] = js.undefined
  /** Color for series start point.
    * @Default {null}
    */
  var startPointColor: js.UndefOr[String] = js.undefined
  /** Border color of the series.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.undefined
  /** Specifies the theme for Sparkline.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[Theme | String] = js.undefined
  /** Options to customize the tooltip.
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /** Fires before rendering trackball tooltip. You can use this event to customize the text displayed in trackball tooltip.
    */
  var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.undefined
  /** Specifies the type of the series to render in sparkline.
    * @Default {line. See Type}
    */
  var `type`: js.UndefOr[Type | String] = js.undefined
  /** Border width of the series.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
  /** Name of the property in the datasource that contains x value for the series.
    * @Default {null}
    */
  var xName: js.UndefOr[String] = js.undefined
  /** Name of the property in the datasource that contains y value for the series.
    * @Default {null}
    */
  var yName: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Click: /* e */ ClickEventArgs => Callback = null,
    axisLineSettings: AxisLineSettings = null,
    background: String = null,
    border: Border = null,
    dataSource: js.Any = null,
    doubleClick: /* e */ DoubleClickEventArgs => Callback = null,
    enableCanvasRendering: js.UndefOr[Boolean] = js.undefined,
    enableGroupSeparator: js.UndefOr[Boolean] = js.undefined,
    endPointColor: String = null,
    fill: String = null,
    highPointColor: String = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    load: /* e */ LoadEventArgs => Callback = null,
    loaded: /* e */ LoadedEventArgs => Callback = null,
    locale: String = null,
    lowPointColor: String = null,
    markerSettings: MarkerSettings = null,
    negativePointColor: String = null,
    opacity: Int | Double = null,
    padding: Int | Double = null,
    palette: String = null,
    pointRegionMouseClick: /* e */ PointRegionMouseClickEventArgs => Callback = null,
    pointRegionMouseMove: /* e */ PointRegionMouseMoveEventArgs => Callback = null,
    rangeBandSettings: RangeBandSettings = null,
    rightClick: /* e */ RightClickEventArgs => Callback = null,
    seriesRendering: /* e */ SeriesRenderingEventArgs => Callback = null,
    size: Size = null,
    sparklineMouseLeave: /* e */ SparklineMouseLeaveEventArgs => Callback = null,
    sparklineMouseMove: /* e */ SparklineMouseMoveEventArgs => Callback = null,
    startPointColor: String = null,
    stroke: String = null,
    theme: Theme | String = null,
    tooltip: Tooltip = null,
    tooltipInitialize: /* e */ TooltipInitializeEventArgs => Callback = null,
    `type`: Type | String = null,
    width: Int | Double = null,
    xName: String = null,
    yName: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.ClickEventArgs) => Click(t0).runNow()))
    if (axisLineSettings != null) __obj.updateDynamic("axisLineSettings")(axisLineSettings.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.DoubleClickEventArgs) => doubleClick(t0).runNow()))
    if (!js.isUndefined(enableCanvasRendering)) __obj.updateDynamic("enableCanvasRendering")(enableCanvasRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroupSeparator)) __obj.updateDynamic("enableGroupSeparator")(enableGroupSeparator.asInstanceOf[js.Any])
    if (endPointColor != null) __obj.updateDynamic("endPointColor")(endPointColor.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (highPointColor != null) __obj.updateDynamic("highPointColor")(highPointColor.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.LoadEventArgs) => load(t0).runNow()))
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.LoadedEventArgs) => loaded(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (lowPointColor != null) __obj.updateDynamic("lowPointColor")(lowPointColor.asInstanceOf[js.Any])
    if (markerSettings != null) __obj.updateDynamic("markerSettings")(markerSettings.asInstanceOf[js.Any])
    if (negativePointColor != null) __obj.updateDynamic("negativePointColor")(negativePointColor.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (pointRegionMouseClick != null) __obj.updateDynamic("pointRegionMouseClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.PointRegionMouseClickEventArgs) => pointRegionMouseClick(t0).runNow()))
    if (pointRegionMouseMove != null) __obj.updateDynamic("pointRegionMouseMove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.PointRegionMouseMoveEventArgs) => pointRegionMouseMove(t0).runNow()))
    if (rangeBandSettings != null) __obj.updateDynamic("rangeBandSettings")(rangeBandSettings.asInstanceOf[js.Any])
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.RightClickEventArgs) => rightClick(t0).runNow()))
    if (seriesRendering != null) __obj.updateDynamic("seriesRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.SeriesRenderingEventArgs) => seriesRendering(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sparklineMouseLeave != null) __obj.updateDynamic("sparklineMouseLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.SparklineMouseLeaveEventArgs) => sparklineMouseLeave(t0).runNow()))
    if (sparklineMouseMove != null) __obj.updateDynamic("sparklineMouseMove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.SparklineMouseMoveEventArgs) => sparklineMouseMove(t0).runNow()))
    if (startPointColor != null) __obj.updateDynamic("startPointColor")(startPointColor.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipInitialize != null) __obj.updateDynamic("tooltipInitialize")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Sparkline.TooltipInitializeEventArgs) => tooltipInitialize(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xName != null) __obj.updateDynamic("xName")(xName.asInstanceOf[js.Any])
    if (yName != null) __obj.updateDynamic("yName")(yName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

