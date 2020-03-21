package typingsJapgolly.ejWebAll.ej.datavisualization.Map

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the map.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Specifies the background color for map
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.undefined
  /** Specifies the index of the map to determine the shape layer to be displayed
    * @Default {0}
    */
  var baseMapIndex: js.UndefOr[Double] = js.undefined
  /** Triggered while rendering the each bubbles in maps.
    */
  var bubbleRendering: js.UndefOr[js.Function1[/* e */ BubbleRenderingEventArgs, Unit]] = js.undefined
  /** Specify the center position where map should be displayed
    * @Default {[0,0]}
    */
  var centerPosition: js.UndefOr[js.Any] = js.undefined
  /** Fires before rendering the data labels. This event is triggered for each data label in the layers. You can use this event to add custom text in data labels.
    */
  var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, Unit]] = js.undefined
  /** Fires, on double clicking the map.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
  /** Controls the selection through dragging
    * @Default {false}
    */
  var draggingOnSelection: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables the map animation
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables the animation for layer change in map
    * @Default {false}
    */
  var enableLayerChangeAnimation: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables the map panning
    * @Default {true}
    */
  var enablePan: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables right to left(RTL) support for maps.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Determines whether map need to resize when container is resized
    * @Default {true}
    */
  var enableResize: js.UndefOr[Boolean] = js.undefined
  /** Determines whether map need to resize when container is resized
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Layer for holding the map shapes
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.undefined
  /** Triggered while rendering the each legend in maps.
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, Unit]] = js.undefined
  /** Name of the culture based on which map should be localized. Labels are localized with respect to the culture name.String type properties like template text are not localized
    * automatically. Provide localized text as value to string type properties.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Triggers while entering the hovered marker shape.
    */
  var markerEnter: js.UndefOr[js.Function1[/* e */ MarkerEnterEventArgs, Unit]] = js.undefined
  /** Triggers while leaving the hovered marker shape.
    */
  var markerLeave: js.UndefOr[js.Function1[/* e */ MarkerLeaveEventArgs, Unit]] = js.undefined
  /** Triggered on selecting the map markers.
    */
  var markerSelected: js.UndefOr[js.Function1[/* e */ MarkerSelectedEventArgs, Unit]] = js.undefined
  /** Triggers while leaving the hovered map shape
    */
  var mouseleave: js.UndefOr[js.Function1[/* e */ MouseleaveEventArgs, Unit]] = js.undefined
  /** Triggers while hovering the map shape.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.undefined
  /** Enables or Disables the navigation control for map to perform zooming and panning on map shapes.
    */
  var navigationControl: js.UndefOr[NavigationControl] = js.undefined
  /** Fires before loading the map.
    */
  var onLoad: js.UndefOr[js.Function1[/* e */ OnLoadEventArgs, Unit]] = js.undefined
  /** Triggers once map render completed.
    */
  var onRenderComplete: js.UndefOr[js.Function1[/* e */ OnRenderCompleteEventArgs, Unit]] = js.undefined
  /** Triggers when map panning ends.
    */
  var panned: js.UndefOr[js.Function1[/* e */ PannedEventArgs, Unit]] = js.undefined
  /** Triggers after refreshing the map items.
    */
  var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, Unit]] = js.undefined
  /** Fires, on right clicking the map.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
  /** Triggered while rendering the each shapes in maps.
    */
  var shapeRendering: js.UndefOr[js.Function1[/* e */ ShapeRenderingEventArgs, Unit]] = js.undefined
  /** Triggered on selecting the map shapes.
    */
  var shapeSelected: js.UndefOr[js.Function1[/* e */ ShapeSelectedEventArgs, Unit]] = js.undefined
  /** Enables or Disables the Zooming for map.
    */
  var zoomSettings: js.UndefOr[ZoomSettings] = js.undefined
  /** Triggered when map is zoomed-in.
    */
  var zoomedIn: js.UndefOr[js.Function1[/* e */ ZoomedInEventArgs, Unit]] = js.undefined
  /** Triggers when map is zoomed out.
    */
  var zoomedOut: js.UndefOr[js.Function1[/* e */ ZoomedOutEventArgs, Unit]] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Click: /* e */ ClickEventArgs => Callback = null,
    background: String = null,
    baseMapIndex: Int | Double = null,
    bubbleRendering: /* e */ BubbleRenderingEventArgs => Callback = null,
    centerPosition: js.Any = null,
    displayTextRendering: /* e */ DisplayTextRenderingEventArgs => Callback = null,
    doubleClick: /* e */ DoubleClickEventArgs => Callback = null,
    draggingOnSelection: js.UndefOr[Boolean] = js.undefined,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enableLayerChangeAnimation: js.UndefOr[Boolean] = js.undefined,
    enablePan: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableResize: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legendItemClick: /* e */ LegendItemClickEventArgs => Callback = null,
    legendItemRendering: /* e */ LegendItemRenderingEventArgs => Callback = null,
    locale: String = null,
    markerEnter: /* e */ MarkerEnterEventArgs => Callback = null,
    markerLeave: /* e */ MarkerLeaveEventArgs => Callback = null,
    markerSelected: /* e */ MarkerSelectedEventArgs => Callback = null,
    mouseleave: /* e */ MouseleaveEventArgs => Callback = null,
    mouseover: /* e */ MouseoverEventArgs => Callback = null,
    navigationControl: NavigationControl = null,
    onLoad: /* e */ OnLoadEventArgs => Callback = null,
    onRenderComplete: /* e */ OnRenderCompleteEventArgs => Callback = null,
    panned: /* e */ PannedEventArgs => Callback = null,
    refreshed: /* e */ RefreshedEventArgs => Callback = null,
    rightClick: /* e */ RightClickEventArgs => Callback = null,
    shapeRendering: /* e */ ShapeRenderingEventArgs => Callback = null,
    shapeSelected: /* e */ ShapeSelectedEventArgs => Callback = null,
    zoomSettings: ZoomSettings = null,
    zoomedIn: /* e */ ZoomedInEventArgs => Callback = null,
    zoomedOut: /* e */ ZoomedOutEventArgs => Callback = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.ClickEventArgs) => Click(t0).runNow()))
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (baseMapIndex != null) __obj.updateDynamic("baseMapIndex")(baseMapIndex.asInstanceOf[js.Any])
    if (bubbleRendering != null) __obj.updateDynamic("bubbleRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.BubbleRenderingEventArgs) => bubbleRendering(t0).runNow()))
    if (centerPosition != null) __obj.updateDynamic("centerPosition")(centerPosition.asInstanceOf[js.Any])
    if (displayTextRendering != null) __obj.updateDynamic("displayTextRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.DisplayTextRenderingEventArgs) => displayTextRendering(t0).runNow()))
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.DoubleClickEventArgs) => doubleClick(t0).runNow()))
    if (!js.isUndefined(draggingOnSelection)) __obj.updateDynamic("draggingOnSelection")(draggingOnSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLayerChangeAnimation)) __obj.updateDynamic("enableLayerChangeAnimation")(enableLayerChangeAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePan)) __obj.updateDynamic("enablePan")(enablePan.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.LegendItemClickEventArgs) => legendItemClick(t0).runNow()))
    if (legendItemRendering != null) __obj.updateDynamic("legendItemRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.LegendItemRenderingEventArgs) => legendItemRendering(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (markerEnter != null) __obj.updateDynamic("markerEnter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.MarkerEnterEventArgs) => markerEnter(t0).runNow()))
    if (markerLeave != null) __obj.updateDynamic("markerLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.MarkerLeaveEventArgs) => markerLeave(t0).runNow()))
    if (markerSelected != null) __obj.updateDynamic("markerSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.MarkerSelectedEventArgs) => markerSelected(t0).runNow()))
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.MouseleaveEventArgs) => mouseleave(t0).runNow()))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.MouseoverEventArgs) => mouseover(t0).runNow()))
    if (navigationControl != null) __obj.updateDynamic("navigationControl")(navigationControl.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.OnLoadEventArgs) => onLoad(t0).runNow()))
    if (onRenderComplete != null) __obj.updateDynamic("onRenderComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.OnRenderCompleteEventArgs) => onRenderComplete(t0).runNow()))
    if (panned != null) __obj.updateDynamic("panned")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.PannedEventArgs) => panned(t0).runNow()))
    if (refreshed != null) __obj.updateDynamic("refreshed")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.RefreshedEventArgs) => refreshed(t0).runNow()))
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.RightClickEventArgs) => rightClick(t0).runNow()))
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.ShapeRenderingEventArgs) => shapeRendering(t0).runNow()))
    if (shapeSelected != null) __obj.updateDynamic("shapeSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.ShapeSelectedEventArgs) => shapeSelected(t0).runNow()))
    if (zoomSettings != null) __obj.updateDynamic("zoomSettings")(zoomSettings.asInstanceOf[js.Any])
    if (zoomedIn != null) __obj.updateDynamic("zoomedIn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.ZoomedInEventArgs) => zoomedIn(t0).runNow()))
    if (zoomedOut != null) __obj.updateDynamic("zoomedOut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Map.ZoomedOutEventArgs) => zoomedOut(t0).runNow()))
    __obj.asInstanceOf[Model]
  }
}

