package typingsJapgolly.leafletPolylinedecorator

import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.leaflet.mod.FeatureGroup_
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.Map_
import typingsJapgolly.leaflet.mod.PathOptions
import typingsJapgolly.leaflet.mod.Point_
import typingsJapgolly.leaflet.mod.Polygon_
import typingsJapgolly.leaflet.mod.Polyline_
import typingsJapgolly.leafletPolylinedecorator.leafletMod.Symbol.ArrowHead_
import typingsJapgolly.leafletPolylinedecorator.leafletMod.Symbol.Dash_
import typingsJapgolly.leafletPolylinedecorator.leafletMod.Symbol.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "PolylineDecorator")
  @js.native
  open class PolylineDecorator_ protected () extends FeatureGroup_[Any] {
    def this(paths: js.Array[
            js.Array[LatLngExpression] | LatLngExpression | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any])
          ]) = this()
    def this(paths: Polygon_[Any]) = this()
    def this(paths: Polyline_[LineString | MultiLineString, Any]) = this()
    def this(
      paths: js.Array[
            js.Array[LatLngExpression] | LatLngExpression | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any])
          ],
      options: PolylineDecoratorOptions
    ) = this()
    def this(paths: Polygon_[Any], options: PolylineDecoratorOptions) = this()
    def this(paths: Polyline_[LineString | MultiLineString, Any], options: PolylineDecoratorOptions) = this()
    
    def initialize(
      paths: js.Array[
          js.Array[LatLngExpression] | LatLngExpression | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any])
        ]
    ): Unit = js.native
    def initialize(
      paths: js.Array[
          js.Array[LatLngExpression] | LatLngExpression | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any])
        ],
      options: PolylineDecoratorOptions
    ): Unit = js.native
    def initialize(paths: Polygon_[Any]): Unit = js.native
    def initialize(paths: Polygon_[Any], options: PolylineDecoratorOptions): Unit = js.native
    def initialize(paths: Polyline_[LineString | MultiLineString, Any]): Unit = js.native
    def initialize(paths: Polyline_[LineString | MultiLineString, Any], options: PolylineDecoratorOptions): Unit = js.native
    
    def redraw(): Unit = js.native
    
    def setPaths(
      paths: js.Array[
          js.Array[LatLngExpression] | LatLngExpression | Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any])
        ]
    ): Unit = js.native
    def setPaths(paths: Polygon_[Any]): Unit = js.native
    def setPaths(paths: Polyline_[LineString | MultiLineString, Any]): Unit = js.native
    
    def setPatterns(patterns: js.Array[Pattern]): Unit = js.native
  }
  
  object Symbol {
    
    @JSImport("leaflet", "Symbol")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leaflet", "Symbol.ArrowHead")
    @js.native
    open class ArrowHead_ () extends StObject {
      def this(options: ArrowHeadOptions) = this()
      
      def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polygon_[Any] | (Polyline_[LineString | MultiLineString, Any]) = js.native
      
      def initialize(): Unit = js.native
      def initialize(options: ArrowHeadOptions): Unit = js.native
    }
    
    @JSImport("leaflet", "Symbol.Dash")
    @js.native
    open class Dash_ () extends StObject {
      def this(options: DashOptions) = this()
      
      def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polyline_[LineString | MultiLineString, Any] = js.native
      
      def initialize(): Unit = js.native
      def initialize(options: DashOptions): Unit = js.native
    }
    
    @JSImport("leaflet", "Symbol.Marker")
    @js.native
    open class Marker_ () extends StObject {
      def this(options: MarkerOptions) = this()
      
      def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Marker_ = js.native
      
      def initialize(): Unit = js.native
      def initialize(options: MarkerOptions): Unit = js.native
    }
    
    inline def arrowHead(): ArrowHead_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrowHead")().asInstanceOf[ArrowHead_]
    inline def arrowHead(options: ArrowHeadOptions): ArrowHead_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrowHead")(options.asInstanceOf[js.Any]).asInstanceOf[ArrowHead_]
    
    inline def dash(): Dash_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dash")().asInstanceOf[Dash_]
    inline def dash(options: DashOptions): Dash_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dash")(options.asInstanceOf[js.Any]).asInstanceOf[Dash_]
    
    inline def marker(): Marker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("marker")().asInstanceOf[Marker_]
    inline def marker(options: MarkerOptions): Marker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("marker")(options.asInstanceOf[js.Any]).asInstanceOf[Marker_]
    
    trait ArrowHeadOptions extends StObject {
      
      var headAngle: js.UndefOr[Double] = js.undefined
      
      var pathOptions: js.UndefOr[PathOptions] = js.undefined
      
      var pixelSize: js.UndefOr[Double] = js.undefined
      
      var polygon: js.UndefOr[Boolean] = js.undefined
    }
    object ArrowHeadOptions {
      
      inline def apply(): ArrowHeadOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ArrowHeadOptions]
      }
      
      extension [Self <: ArrowHeadOptions](x: Self) {
        
        inline def setHeadAngle(value: Double): Self = StObject.set(x, "headAngle", value.asInstanceOf[js.Any])
        
        inline def setHeadAngleUndefined: Self = StObject.set(x, "headAngle", js.undefined)
        
        inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
        
        inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
        
        inline def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
        
        inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
        
        inline def setPolygon(value: Boolean): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      }
    }
    
    trait DashOptions extends StObject {
      
      var pathOptions: js.UndefOr[PathOptions] = js.undefined
      
      var pixelSize: js.UndefOr[Double] = js.undefined
    }
    object DashOptions {
      
      inline def apply(): DashOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DashOptions]
      }
      
      extension [Self <: DashOptions](x: Self) {
        
        inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
        
        inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
        
        inline def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
        
        inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
      }
    }
    
    trait MarkerOptions extends StObject {
      
      var markerOptions: js.UndefOr[typingsJapgolly.leaflet.mod.MarkerOptions] = js.undefined
      
      var rotate: js.UndefOr[Boolean] = js.undefined
    }
    object MarkerOptions {
      
      inline def apply(): MarkerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MarkerOptions]
      }
      
      extension [Self <: MarkerOptions](x: Self) {
        
        inline def setMarkerOptions(value: typingsJapgolly.leaflet.mod.MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
        
        inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
        
        inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      }
    }
  }
  
  inline def isCoord(c: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoord")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCoordArray(c: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoordArray")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def polylineDecorator(
    paths: (Polyline_[LineString | MultiLineString, Any]) | (js.Array[Polyline_[LineString | MultiLineString, Any]]),
    options: js.UndefOr[PolylineDecoratorOptions]
  ): PolylineDecorator_ = (^.asInstanceOf[js.Dynamic].applyDynamic("polylineDecorator")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PolylineDecorator_]
  
  trait Pattern extends StObject {
    
    var endOffset: js.UndefOr[Double | String] = js.undefined
    
    var offset: js.UndefOr[Double | String] = js.undefined
    
    var repeat: Double | String
    
    var symbol: Dash_ | ArrowHead_ | Marker_
  }
  object Pattern {
    
    inline def apply(repeat: Double | String, symbol: Dash_ | ArrowHead_ | Marker_): Pattern = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setEndOffset(value: Double | String): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setRepeat(value: Double | String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: Dash_ | ArrowHead_ | Marker_): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolylineDecoratorOptions extends StObject {
    
    var patterns: js.Array[Pattern]
  }
  object PolylineDecoratorOptions {
    
    inline def apply(patterns: js.Array[Pattern]): PolylineDecoratorOptions = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolylineDecoratorOptions]
    }
    
    extension [Self <: PolylineDecoratorOptions](x: Self) {
      
      inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
}
