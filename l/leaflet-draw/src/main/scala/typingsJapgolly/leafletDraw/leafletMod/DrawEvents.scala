package typingsJapgolly.leafletDraw.leafletMod

import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.leaflet.mod.CircleMarker_
import typingsJapgolly.leaflet.mod.Circle_
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.LayerGroup_
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.Marker_
import typingsJapgolly.leaflet.mod.Polygon_
import typingsJapgolly.leaflet.mod.Polyline_
import typingsJapgolly.leaflet.mod.Rectangle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawEvents {
  
  trait Created
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker.
      */
    var layerType: String
    
    /**
      * Layer that was just created.
      */
    @JSName("layer")
    var layer_Created: Circle_[Any] | CircleMarker_[Any] | Marker_[Any] | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any]) | Rectangle_[Any]
  }
  object Created {
    
    inline def apply(
      layer: Circle_[Any] | CircleMarker_[Any] | Marker_[Any] | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any]) | Rectangle_[Any],
      layerType: String,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): Created = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    extension [Self <: Created](x: Self) {
      
      inline def setLayer(
        value: Circle_[Any] | CircleMarker_[Any] | Marker_[Any] | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any]) | Rectangle_[Any]
      ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteStart
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of edit this is. One of: remove
      */
    var handler: String
  }
  object DeleteStart {
    
    inline def apply(
      handler: String,
      layer: Any,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DeleteStart = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteStart]
    }
    
    extension [Self <: DeleteStart](x: Self) {
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteStop
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of edit this is. One of: remove
      */
    var handler: String
  }
  object DeleteStop {
    
    inline def apply(
      handler: String,
      layer: Any,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DeleteStop = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteStop]
    }
    
    extension [Self <: DeleteStop](x: Self) {
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Triggered when layers have been removed (and saved) from the FeatureGroup.
    */
  trait Deleted
    extends StObject
       with LeafletEvent {
    
    /**
      * List of all layers just removed from the map.
      */
    var layers: LayerGroup_[Any]
  }
  object Deleted {
    
    inline def apply(
      layer: Any,
      layers: LayerGroup_[Any],
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): Deleted = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deleted]
    }
    
    extension [Self <: Deleted](x: Self) {
      
      inline def setLayers(value: LayerGroup_[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawStart
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
      */
    var layerType: String
  }
  object DrawStart {
    
    inline def apply(
      layer: Any,
      layerType: String,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DrawStart = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawStart]
    }
    
    extension [Self <: DrawStart](x: Self) {
      
      inline def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawStop
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
      */
    var layerType: String
  }
  object DrawStop {
    
    inline def apply(
      layer: Any,
      layerType: String,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DrawStop = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawStop]
    }
    
    extension [Self <: DrawStop](x: Self) {
      
      inline def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawVertex
    extends StObject
       with LeafletEvent {
    
    /**
      * List of all layers just being added from the map.
      */
    var layers: LayerGroup_[Any]
  }
  object DrawVertex {
    
    inline def apply(
      layer: Any,
      layers: LayerGroup_[Any],
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): DrawVertex = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawVertex]
    }
    
    extension [Self <: DrawVertex](x: Self) {
      
      inline def setLayers(value: LayerGroup_[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditMove
    extends StObject
       with LeafletEvent {
    
    /**
      * Layer that was just moved.
      */
    @JSName("layer")
    var layer_EditMove: Layer
  }
  object EditMove {
    
    inline def apply(layer: Layer, popup: Any, propagatedFrom: Any, sourceTarget: Any, target: Any, `type`: String): EditMove = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditMove]
    }
    
    extension [Self <: EditMove](x: Self) {
      
      inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditResize
    extends StObject
       with LeafletEvent {
    
    /**
      * Layer that was just resized.
      */
    @JSName("layer")
    var layer_EditResize: Layer
  }
  object EditResize {
    
    inline def apply(layer: Layer, popup: Any, propagatedFrom: Any, sourceTarget: Any, target: Any, `type`: String): EditResize = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditResize]
    }
    
    extension [Self <: EditResize](x: Self) {
      
      inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditStart
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of edit this is. One of: edit
      */
    var handler: String
  }
  object EditStart {
    
    inline def apply(
      handler: String,
      layer: Any,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): EditStart = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditStart]
    }
    
    extension [Self <: EditStart](x: Self) {
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditStop
    extends StObject
       with LeafletEvent {
    
    /**
      * The type of edit this is. One of: edit
      */
    var handler: String
  }
  object EditStop {
    
    inline def apply(
      handler: String,
      layer: Any,
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): EditStop = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditStop]
    }
    
    extension [Self <: EditStop](x: Self) {
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditVertex
    extends StObject
       with LeafletEvent {
    
    /**
      * List of all layers just being edited from the map.
      */
    var layers: LayerGroup_[Any]
    
    var poly: (Polyline_[LineString | MultiLineString, Any]) | Polygon_[Any]
  }
  object EditVertex {
    
    inline def apply(
      layer: Any,
      layers: LayerGroup_[Any],
      poly: (Polyline_[LineString | MultiLineString, Any]) | Polygon_[Any],
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): EditVertex = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditVertex]
    }
    
    extension [Self <: EditVertex](x: Self) {
      
      inline def setLayers(value: LayerGroup_[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setPoly(value: (Polyline_[LineString | MultiLineString, Any]) | Polygon_[Any]): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
    }
  }
  
  trait Edited
    extends StObject
       with LeafletEvent {
    
    /**
      * List of all layers just edited on the map.
      */
    var layers: LayerGroup_[Any]
  }
  object Edited {
    
    inline def apply(
      layer: Any,
      layers: LayerGroup_[Any],
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): Edited = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edited]
    }
    
    extension [Self <: Edited](x: Self) {
      
      inline def setLayers(value: LayerGroup_[Any]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkerContext = LeafletEvent
  
  type ToolbarClosed = LeafletEvent
  
  type ToolbarOpened = LeafletEvent
}
