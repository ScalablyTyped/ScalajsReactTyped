package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.dataviz.map.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  var beforeReset: js.UndefOr[js.Function1[/* e */ MapBeforeResetEvent, Unit]] = js.undefined
  
  var center: js.UndefOr[Any | Location] = js.undefined
  
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
  
  var messages: js.UndefOr[MapMessages] = js.undefined
  
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
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  extension [Self <: MapOptions](x: Self) {
    
    inline def setBeforeReset(value: /* e */ MapBeforeResetEvent => Callback): Self = StObject.set(x, "beforeReset", js.Any.fromFunction1((t0: /* e */ MapBeforeResetEvent) => value(t0).runNow()))
    
    inline def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
    
    inline def setCenter(value: Any | Location): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setClick(value: /* e */ MapClickEvent => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: /* e */ MapClickEvent) => value(t0).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setControls(value: MapControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setLayerDefaults(value: MapLayerDefaults): Self = StObject.set(x, "layerDefaults", value.asInstanceOf[js.Any])
    
    inline def setLayerDefaultsUndefined: Self = StObject.set(x, "layerDefaults", js.undefined)
    
    inline def setLayers(value: js.Array[MapLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: MapLayer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setMarkerActivate(value: /* e */ MapMarkerActivateEvent => Callback): Self = StObject.set(x, "markerActivate", js.Any.fromFunction1((t0: /* e */ MapMarkerActivateEvent) => value(t0).runNow()))
    
    inline def setMarkerActivateUndefined: Self = StObject.set(x, "markerActivate", js.undefined)
    
    inline def setMarkerClick(value: /* e */ MapMarkerClickEvent => Callback): Self = StObject.set(x, "markerClick", js.Any.fromFunction1((t0: /* e */ MapMarkerClickEvent) => value(t0).runNow()))
    
    inline def setMarkerClickUndefined: Self = StObject.set(x, "markerClick", js.undefined)
    
    inline def setMarkerCreated(value: /* e */ MapMarkerCreatedEvent => Callback): Self = StObject.set(x, "markerCreated", js.Any.fromFunction1((t0: /* e */ MapMarkerCreatedEvent) => value(t0).runNow()))
    
    inline def setMarkerCreatedUndefined: Self = StObject.set(x, "markerCreated", js.undefined)
    
    inline def setMarkerDefaults(value: MapMarkerDefaults): Self = StObject.set(x, "markerDefaults", value.asInstanceOf[js.Any])
    
    inline def setMarkerDefaultsUndefined: Self = StObject.set(x, "markerDefaults", js.undefined)
    
    inline def setMarkers(value: js.Array[MapMarker]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMarkersVarargs(value: MapMarker*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMessages(value: MapMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPan(value: /* e */ MapPanEvent => Callback): Self = StObject.set(x, "pan", js.Any.fromFunction1((t0: /* e */ MapPanEvent) => value(t0).runNow()))
    
    inline def setPanEnd(value: /* e */ MapPanEndEvent => Callback): Self = StObject.set(x, "panEnd", js.Any.fromFunction1((t0: /* e */ MapPanEndEvent) => value(t0).runNow()))
    
    inline def setPanEndUndefined: Self = StObject.set(x, "panEnd", js.undefined)
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setPannable(value: Boolean): Self = StObject.set(x, "pannable", value.asInstanceOf[js.Any])
    
    inline def setPannableUndefined: Self = StObject.set(x, "pannable", js.undefined)
    
    inline def setReset(value: /* e */ MapResetEvent => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction1((t0: /* e */ MapResetEvent) => value(t0).runNow()))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setShapeClick(value: /* e */ MapShapeClickEvent => Callback): Self = StObject.set(x, "shapeClick", js.Any.fromFunction1((t0: /* e */ MapShapeClickEvent) => value(t0).runNow()))
    
    inline def setShapeClickUndefined: Self = StObject.set(x, "shapeClick", js.undefined)
    
    inline def setShapeCreated(value: /* e */ MapShapeCreatedEvent => Callback): Self = StObject.set(x, "shapeCreated", js.Any.fromFunction1((t0: /* e */ MapShapeCreatedEvent) => value(t0).runNow()))
    
    inline def setShapeCreatedUndefined: Self = StObject.set(x, "shapeCreated", js.undefined)
    
    inline def setShapeFeatureCreated(value: /* e */ MapShapeFeatureCreatedEvent => Callback): Self = StObject.set(x, "shapeFeatureCreated", js.Any.fromFunction1((t0: /* e */ MapShapeFeatureCreatedEvent) => value(t0).runNow()))
    
    inline def setShapeFeatureCreatedUndefined: Self = StObject.set(x, "shapeFeatureCreated", js.undefined)
    
    inline def setShapeMouseEnter(value: /* e */ MapShapeMouseEnterEvent => Callback): Self = StObject.set(x, "shapeMouseEnter", js.Any.fromFunction1((t0: /* e */ MapShapeMouseEnterEvent) => value(t0).runNow()))
    
    inline def setShapeMouseEnterUndefined: Self = StObject.set(x, "shapeMouseEnter", js.undefined)
    
    inline def setShapeMouseLeave(value: /* e */ MapShapeMouseLeaveEvent => Callback): Self = StObject.set(x, "shapeMouseLeave", js.Any.fromFunction1((t0: /* e */ MapShapeMouseLeaveEvent) => value(t0).runNow()))
    
    inline def setShapeMouseLeaveUndefined: Self = StObject.set(x, "shapeMouseLeave", js.undefined)
    
    inline def setWraparound(value: Boolean): Self = StObject.set(x, "wraparound", value.asInstanceOf[js.Any])
    
    inline def setWraparoundUndefined: Self = StObject.set(x, "wraparound", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomEnd(value: /* e */ MapZoomEndEvent => Callback): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction1((t0: /* e */ MapZoomEndEvent) => value(t0).runNow()))
    
    inline def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
    
    inline def setZoomStart(value: /* e */ MapZoomStartEvent => Callback): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1((t0: /* e */ MapZoomStartEvent) => value(t0).runNow()))
    
    inline def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    inline def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    
    inline def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
  }
}
