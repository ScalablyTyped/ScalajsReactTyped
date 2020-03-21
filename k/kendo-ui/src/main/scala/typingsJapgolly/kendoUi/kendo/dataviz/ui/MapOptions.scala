package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.dataviz.map.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var beforeReset: js.UndefOr[js.Function1[/* e */ MapBeforeResetEvent, Unit]] = js.undefined
  var center: js.UndefOr[js.Any | Location] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ MapClickEvent, Unit]] = js.undefined
  var controls: js.UndefOr[MapControls] = js.undefined
  var layerDefaults: js.UndefOr[MapLayerDefaults] = js.undefined
  var layers: js.UndefOr[js.Array[MapLayer]] = js.undefined
  var markerActivate: js.UndefOr[js.Function1[/* e */ MapMarkerActivateEvent, Unit]] = js.undefined
  var markerClick: js.UndefOr[js.Function1[/* e */ MapMarkerClickEvent, Unit]] = js.undefined
  var markerCreated: js.UndefOr[js.Function1[/* e */ MapMarkerCreatedEvent, Unit]] = js.undefined
  var markerDefaults: js.UndefOr[MapMarkerDefaults] = js.undefined
  var markers: js.UndefOr[js.Array[MapMarker]] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pan: js.UndefOr[js.Function1[/* e */ MapPanEvent, Unit]] = js.undefined
  var panEnd: js.UndefOr[js.Function1[/* e */ MapPanEndEvent, Unit]] = js.undefined
  var pannable: js.UndefOr[Boolean] = js.undefined
  var reset: js.UndefOr[js.Function1[/* e */ MapResetEvent, Unit]] = js.undefined
  var shapeClick: js.UndefOr[js.Function1[/* e */ MapShapeClickEvent, Unit]] = js.undefined
  var shapeCreated: js.UndefOr[js.Function1[/* e */ MapShapeCreatedEvent, Unit]] = js.undefined
  var shapeFeatureCreated: js.UndefOr[js.Function1[/* e */ MapShapeFeatureCreatedEvent, Unit]] = js.undefined
  var shapeMouseEnter: js.UndefOr[js.Function1[/* e */ MapShapeMouseEnterEvent, Unit]] = js.undefined
  var shapeMouseLeave: js.UndefOr[js.Function1[/* e */ MapShapeMouseLeaveEvent, Unit]] = js.undefined
  var wraparound: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ MapZoomEndEvent, Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ MapZoomStartEvent, Unit]] = js.undefined
  var zoomable: js.UndefOr[Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    beforeReset: /* e */ MapBeforeResetEvent => Callback = null,
    center: js.Any | Location = null,
    click: /* e */ MapClickEvent => Callback = null,
    controls: MapControls = null,
    layerDefaults: MapLayerDefaults = null,
    layers: js.Array[MapLayer] = null,
    markerActivate: /* e */ MapMarkerActivateEvent => Callback = null,
    markerClick: /* e */ MapMarkerClickEvent => Callback = null,
    markerCreated: /* e */ MapMarkerCreatedEvent => Callback = null,
    markerDefaults: MapMarkerDefaults = null,
    markers: js.Array[MapMarker] = null,
    maxZoom: Int | Double = null,
    minSize: Int | Double = null,
    minZoom: Int | Double = null,
    name: String = null,
    pan: /* e */ MapPanEvent => Callback = null,
    panEnd: /* e */ MapPanEndEvent => Callback = null,
    pannable: js.UndefOr[Boolean] = js.undefined,
    reset: /* e */ MapResetEvent => Callback = null,
    shapeClick: /* e */ MapShapeClickEvent => Callback = null,
    shapeCreated: /* e */ MapShapeCreatedEvent => Callback = null,
    shapeFeatureCreated: /* e */ MapShapeFeatureCreatedEvent => Callback = null,
    shapeMouseEnter: /* e */ MapShapeMouseEnterEvent => Callback = null,
    shapeMouseLeave: /* e */ MapShapeMouseLeaveEvent => Callback = null,
    wraparound: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomEnd: /* e */ MapZoomEndEvent => Callback = null,
    zoomStart: /* e */ MapZoomStartEvent => Callback = null,
    zoomable: js.UndefOr[Boolean] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapBeforeResetEvent) => beforeReset(t0).runNow()))
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapClickEvent) => click(t0).runNow()))
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (layerDefaults != null) __obj.updateDynamic("layerDefaults")(layerDefaults.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (markerActivate != null) __obj.updateDynamic("markerActivate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapMarkerActivateEvent) => markerActivate(t0).runNow()))
    if (markerClick != null) __obj.updateDynamic("markerClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapMarkerClickEvent) => markerClick(t0).runNow()))
    if (markerCreated != null) __obj.updateDynamic("markerCreated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapMarkerCreatedEvent) => markerCreated(t0).runNow()))
    if (markerDefaults != null) __obj.updateDynamic("markerDefaults")(markerDefaults.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapPanEvent) => pan(t0).runNow()))
    if (panEnd != null) __obj.updateDynamic("panEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapPanEndEvent) => panEnd(t0).runNow()))
    if (!js.isUndefined(pannable)) __obj.updateDynamic("pannable")(pannable.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapResetEvent) => reset(t0).runNow()))
    if (shapeClick != null) __obj.updateDynamic("shapeClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapShapeClickEvent) => shapeClick(t0).runNow()))
    if (shapeCreated != null) __obj.updateDynamic("shapeCreated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapShapeCreatedEvent) => shapeCreated(t0).runNow()))
    if (shapeFeatureCreated != null) __obj.updateDynamic("shapeFeatureCreated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapShapeFeatureCreatedEvent) => shapeFeatureCreated(t0).runNow()))
    if (shapeMouseEnter != null) __obj.updateDynamic("shapeMouseEnter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapShapeMouseEnterEvent) => shapeMouseEnter(t0).runNow()))
    if (shapeMouseLeave != null) __obj.updateDynamic("shapeMouseLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapShapeMouseLeaveEvent) => shapeMouseLeave(t0).runNow()))
    if (!js.isUndefined(wraparound)) __obj.updateDynamic("wraparound")(wraparound.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapZoomEndEvent) => zoomEnd(t0).runNow()))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.MapZoomStartEvent) => zoomStart(t0).runNow()))
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

