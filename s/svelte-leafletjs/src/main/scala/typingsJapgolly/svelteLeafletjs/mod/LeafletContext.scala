package typingsJapgolly.svelteLeafletjs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.leaflet.mod.CircleMarker_
import typingsJapgolly.leaflet.mod.Circle_
import typingsJapgolly.leaflet.mod.GeoJSON__
import typingsJapgolly.leaflet.mod.Map_
import typingsJapgolly.leaflet.mod.Marker_
import typingsJapgolly.leaflet.mod.Polygon_
import typingsJapgolly.leaflet.mod.Polyline_
import typingsJapgolly.leaflet.mod.Rectangle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LeafletContext {
  
  trait Circle extends StObject {
    
    def getLayer(): Circle_[Any]
  }
  object Circle {
    
    inline def apply(getLayer: CallbackTo[Circle_[Any]]): typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Circle = {
      val __obj = js.Dynamic.literal(getLayer = getLayer.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Circle]
    }
    
    extension [Self <: typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Circle](x: Self) {
      
      inline def setGetLayer(value: CallbackTo[Circle_[Any]]): Self = StObject.set(x, "getLayer", value.toJsFn)
    }
  }
  
  trait CircleMarker extends StObject {
    
    def getLayer(): CircleMarker_[Any]
  }
  object CircleMarker {
    
    inline def apply(getLayer: CallbackTo[CircleMarker_[Any]]): typingsJapgolly.svelteLeafletjs.mod.LeafletContext.CircleMarker = {
      val __obj = js.Dynamic.literal(getLayer = getLayer.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.svelteLeafletjs.mod.LeafletContext.CircleMarker]
    }
    
    extension [Self <: typingsJapgolly.svelteLeafletjs.mod.LeafletContext.CircleMarker](x: Self) {
      
      inline def setGetLayer(value: CallbackTo[CircleMarker_[Any]]): Self = StObject.set(x, "getLayer", value.toJsFn)
    }
  }
  
  trait GeoJSON extends StObject {
    
    def getLayer(): GeoJSON__[Any]
  }
  object GeoJSON {
    
    inline def apply(getLayer: CallbackTo[GeoJSON__[Any]]): typingsJapgolly.svelteLeafletjs.mod.LeafletContext.GeoJSON = {
      val __obj = js.Dynamic.literal(getLayer = getLayer.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.svelteLeafletjs.mod.LeafletContext.GeoJSON]
    }
    
    extension [Self <: typingsJapgolly.svelteLeafletjs.mod.LeafletContext.GeoJSON](x: Self) {
      
      inline def setGetLayer(value: CallbackTo[GeoJSON__[Any]]): Self = StObject.set(x, "getLayer", value.toJsFn)
    }
  }
  
  trait Map extends StObject {
    
    def getMap(): Map_
  }
  object Map {
    
    inline def apply(getMap: CallbackTo[Map_]): Map = {
      val __obj = js.Dynamic.literal(getMap = getMap.toJsFn)
      __obj.asInstanceOf[Map]
    }
    
    extension [Self <: Map](x: Self) {
      
      inline def setGetMap(value: CallbackTo[Map_]): Self = StObject.set(x, "getMap", value.toJsFn)
    }
  }
  
  trait Marker extends StObject {
    
    def getLayer(): Marker_[Any]
    
    def getMarker(): Marker_[Any]
  }
  object Marker {
    
    inline def apply(getLayer: CallbackTo[Marker_[Any]], getMarker: CallbackTo[Marker_[Any]]): typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Marker = {
      val __obj = js.Dynamic.literal(getLayer = getLayer.toJsFn, getMarker = getMarker.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Marker]
    }
    
    extension [Self <: typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Marker](x: Self) {
      
      inline def setGetLayer(value: CallbackTo[Marker_[Any]]): Self = StObject.set(x, "getLayer", value.toJsFn)
      
      inline def setGetMarker(value: CallbackTo[Marker_[Any]]): Self = StObject.set(x, "getMarker", value.toJsFn)
    }
  }
  
  trait Polygon extends StObject {
    
    def getPolygon(): Polygon_[Any]
  }
  object Polygon {
    
    inline def apply(getPolygon: CallbackTo[Polygon_[Any]]): typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Polygon = {
      val __obj = js.Dynamic.literal(getPolygon = getPolygon.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Polygon]
    }
    
    extension [Self <: typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Polygon](x: Self) {
      
      inline def setGetPolygon(value: CallbackTo[Polygon_[Any]]): Self = StObject.set(x, "getPolygon", value.toJsFn)
    }
  }
  
  trait Polyline extends StObject {
    
    def getPolyline(): Polyline_[LineString | MultiLineString, Any]
  }
  object Polyline {
    
    inline def apply(getPolyline: CallbackTo[Polyline_[LineString | MultiLineString, Any]]): typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Polyline = {
      val __obj = js.Dynamic.literal(getPolyline = getPolyline.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Polyline]
    }
    
    extension [Self <: typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Polyline](x: Self) {
      
      inline def setGetPolyline(value: CallbackTo[Polyline_[LineString | MultiLineString, Any]]): Self = StObject.set(x, "getPolyline", value.toJsFn)
    }
  }
  
  trait Rectangle extends StObject {
    
    def getLayer(): Rectangle_[Any]
  }
  object Rectangle {
    
    inline def apply(getLayer: CallbackTo[Rectangle_[Any]]): typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Rectangle = {
      val __obj = js.Dynamic.literal(getLayer = getLayer.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Rectangle]
    }
    
    extension [Self <: typingsJapgolly.svelteLeafletjs.mod.LeafletContext.Rectangle](x: Self) {
      
      inline def setGetLayer(value: CallbackTo[Rectangle_[Any]]): Self = StObject.set(x, "getLayer", value.toJsFn)
    }
  }
}
