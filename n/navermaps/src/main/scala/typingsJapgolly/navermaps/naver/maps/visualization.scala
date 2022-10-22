package typingsJapgolly.navermaps.naver.maps

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.navermaps.naver.maps.drawing.DrawingEvent
import typingsJapgolly.navermaps.naver.maps.drawing.DrawingMode
import typingsJapgolly.navermaps.naver.maps.drawing.DrawingOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualization {
  
  @js.native
  sealed trait SpectrumStyle extends StObject
  @JSGlobal("naver.maps.visualization.SpectrumStyle")
  @js.native
  object SpectrumStyle extends StObject {
    
    @js.native
    sealed trait COOL
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait GREYS
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait HOT
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait HSV
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait JET
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait OXYGEN
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait PORTLAND
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait RAINBOW
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait RdBu
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait YIGnBu
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait YIOrRd
      extends StObject
         with SpectrumStyle
  }
  
  @js.native
  trait DotMap
    extends StObject
       with KVO {
    
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode): Unit = js.native
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode, id: String): Unit = js.native
    
    def addListener(eventName: DrawingEvent, listener: js.Function1[/* overlay */ DrawingOverlay, Unit]): MapEventListener = js.native
    
    def destroy(): Unit = js.native
    
    def getDrawing(id: String): DrawingOverlay = js.native
    
    def getDrawings(): Any = js.native
    
    def getMap(): Map | Null = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def toGeoJson(): Any = js.native
  }
  
  trait DotMapOptions extends StObject {
    
    var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation]
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var map: Map
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeLineCap: js.UndefOr[strokeLineCapType] = js.undefined
    
    var strokeLineJoin: js.UndefOr[strokeLineJoinType] = js.undefined
    
    var strokeWeight: js.UndefOr[Double] = js.undefined
  }
  object DotMapOptions {
    
    inline def apply(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation], map: Map): DotMapOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotMapOptions]
    }
    
    extension [Self <: DotMapOptions](x: Self) {
      
      inline def setData(value: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (LatLng | PointArrayLiteral | WeightedLocation)*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeLineCap(value: strokeLineCapType): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
      
      inline def setStrokeLineJoin(value: strokeLineJoinType): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    }
  }
  
  @js.native
  trait HeatMap extends StObject {
    
    def getColorMap(): SpectrumStyle = js.native
    
    def getData(): js.Array[LatLng | PointArrayLiteral | WeightedLocation] = js.native
    
    def getMap(): Map | Null = js.native
    
    def getOptions(): HeatMapOptions = js.native
    def getOptions(key: String): HeatMapOptions = js.native
    
    def redraw(): Unit = js.native
    
    def setColorMap(colormap: SpectrumStyle, inReverse: Boolean): Unit = js.native
    
    def setData(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def setOptions(key: String, value: Any): Unit = js.native
    def setOptions(options: HeatMapOptions): Unit = js.native
  }
  
  trait HeatMapOptions extends StObject {
    
    var colorMap: js.UndefOr[SpectrumStyle] = js.undefined
    
    var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation]
    
    var map: Map
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object HeatMapOptions {
    
    inline def apply(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation], map: Map): HeatMapOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatMapOptions]
    }
    
    extension [Self <: HeatMapOptions](x: Self) {
      
      inline def setColorMap(value: SpectrumStyle): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      inline def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
      
      inline def setData(value: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (LatLng | PointArrayLiteral | WeightedLocation)*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  trait WeightedLocation extends StObject {
    
    def getLocation(): LatLng
    
    def getWeight(): Double
    
    def lat(): Double
    
    def lng(): Double
  }
  object WeightedLocation {
    
    inline def apply(
      getLocation: CallbackTo[LatLng],
      getWeight: CallbackTo[Double],
      lat: CallbackTo[Double],
      lng: CallbackTo[Double]
    ): WeightedLocation = {
      val __obj = js.Dynamic.literal(getLocation = getLocation.toJsFn, getWeight = getWeight.toJsFn, lat = lat.toJsFn, lng = lng.toJsFn)
      __obj.asInstanceOf[WeightedLocation]
    }
    
    extension [Self <: WeightedLocation](x: Self) {
      
      inline def setGetLocation(value: CallbackTo[LatLng]): Self = StObject.set(x, "getLocation", value.toJsFn)
      
      inline def setGetWeight(value: CallbackTo[Double]): Self = StObject.set(x, "getWeight", value.toJsFn)
      
      inline def setLat(value: CallbackTo[Double]): Self = StObject.set(x, "lat", value.toJsFn)
      
      inline def setLng(value: CallbackTo[Double]): Self = StObject.set(x, "lng", value.toJsFn)
    }
  }
}
