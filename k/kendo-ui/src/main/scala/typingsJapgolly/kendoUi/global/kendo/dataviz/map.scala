package typingsJapgolly.kendoUi.global.kendo.dataviz

import typingsJapgolly.kendoUi.kendo.dataviz.map.BingLayerOptions
import typingsJapgolly.kendoUi.kendo.dataviz.map.ExtentOptions
import typingsJapgolly.kendoUi.kendo.dataviz.map.LayerOptions
import typingsJapgolly.kendoUi.kendo.dataviz.map.LocationOptions
import typingsJapgolly.kendoUi.kendo.dataviz.map.MarkerLayerOptions
import typingsJapgolly.kendoUi.kendo.dataviz.map.MarkerOptions
import typingsJapgolly.kendoUi.kendo.dataviz.map.ShapeLayerOptions
import typingsJapgolly.kendoUi.kendo.dataviz.map.TileLayerOptions
import typingsJapgolly.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object map {
  
  @JSGlobal("kendo.dataviz.map.BingLayer")
  @js.native
  open class BingLayer protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.map.BingLayer {
    def this(map: Map) = this()
    def this(map: Map, options: BingLayerOptions) = this()
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def imagerySet(): Unit = js.native
    
    /* CompleteClass */
    var map: Map = js.native
    
    /* CompleteClass */
    var options: LayerOptions = js.native
    /* CompleteClass */
    @JSName("options")
    var options_BingLayer: BingLayerOptions = js.native
    /* CompleteClass */
    @JSName("options")
    var options_TileLayer: TileLayerOptions = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("kendo.dataviz.map.Extent")
  @js.native
  open class Extent protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.map.Extent {
    def this(nw: Any, se: Any) = this()
    def this(nw: Any, se: typingsJapgolly.kendoUi.kendo.dataviz.map.Location) = this()
    def this(nw: typingsJapgolly.kendoUi.kendo.dataviz.map.Location, se: Any) = this()
    def this(
      nw: typingsJapgolly.kendoUi.kendo.dataviz.map.Location,
      se: typingsJapgolly.kendoUi.kendo.dataviz.map.Location
    ) = this()
    
    /* CompleteClass */
    override def center(): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = js.native
    
    /* CompleteClass */
    override def contains(location: typingsJapgolly.kendoUi.kendo.dataviz.map.Location): Boolean = js.native
    
    /* CompleteClass */
    override def containsAny(locations: Any): Boolean = js.native
    
    /* CompleteClass */
    override def edges(): Any = js.native
    
    /* CompleteClass */
    override def include(location: typingsJapgolly.kendoUi.kendo.dataviz.map.Location): Unit = js.native
    
    /* CompleteClass */
    override def includeAll(locations: Any): Unit = js.native
    
    /* CompleteClass */
    var nw: typingsJapgolly.kendoUi.kendo.dataviz.map.Location = js.native
    
    /* CompleteClass */
    var options: ExtentOptions = js.native
    
    /* CompleteClass */
    override def overlaps(extent: typingsJapgolly.kendoUi.kendo.dataviz.map.Extent): Boolean = js.native
    
    /* CompleteClass */
    var se: typingsJapgolly.kendoUi.kendo.dataviz.map.Location = js.native
    
    /* CompleteClass */
    override def toArray(): Any = js.native
  }
  object Extent {
    
    @JSGlobal("kendo.dataviz.map.Extent")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(a: Any): typingsJapgolly.kendoUi.kendo.dataviz.map.Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Extent]
    inline def create(a: Any, b: Any): typingsJapgolly.kendoUi.kendo.dataviz.map.Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Extent]
    inline def create(a: Any, b: typingsJapgolly.kendoUi.kendo.dataviz.map.Location): typingsJapgolly.kendoUi.kendo.dataviz.map.Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Extent]
    /* static member */
    inline def create(a: typingsJapgolly.kendoUi.kendo.dataviz.map.Location): typingsJapgolly.kendoUi.kendo.dataviz.map.Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Extent]
    inline def create(a: typingsJapgolly.kendoUi.kendo.dataviz.map.Location, b: Any): typingsJapgolly.kendoUi.kendo.dataviz.map.Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Extent]
    inline def create(
      a: typingsJapgolly.kendoUi.kendo.dataviz.map.Location,
      b: typingsJapgolly.kendoUi.kendo.dataviz.map.Location
    ): typingsJapgolly.kendoUi.kendo.dataviz.map.Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Extent]
  }
  
  @JSGlobal("kendo.dataviz.map.Layer")
  @js.native
  open class Layer_ protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.map.Layer_ {
    def this(map: Map) = this()
    def this(map: Map, options: LayerOptions) = this()
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var map: Map = js.native
    
    /* CompleteClass */
    var options: LayerOptions = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("kendo.dataviz.map.Location")
  @js.native
  open class Location protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.map.Location {
    def this(lat: Double, lng: Double) = this()
    
    /* CompleteClass */
    override def destination(destination: typingsJapgolly.kendoUi.kendo.dataviz.map.Location, bearing: Double): Double = js.native
    
    /* CompleteClass */
    override def distanceTo(distance: Double, bearing: Double): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = js.native
    
    /* CompleteClass */
    override def equals(location: typingsJapgolly.kendoUi.kendo.dataviz.map.Location): Boolean = js.native
    
    /* CompleteClass */
    var lat: Double = js.native
    
    /* CompleteClass */
    var lng: Double = js.native
    
    /* CompleteClass */
    var options: LocationOptions = js.native
    
    /* CompleteClass */
    override def round(digits: Double): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = js.native
    
    /* CompleteClass */
    override def toArray(): Any = js.native
    
    /* CompleteClass */
    override def wrap(): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = js.native
  }
  object Location {
    
    @JSGlobal("kendo.dataviz.map.Location")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(lat: Any): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(lat.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Location]
    inline def create(lat: Any, lng: Double): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(lat.asInstanceOf[js.Any], lng.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Location]
    /* static member */
    inline def create(lat: Double): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(lat.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Location]
    inline def create(lat: Double, lng: Double): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(lat.asInstanceOf[js.Any], lng.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Location]
    /* static member */
    inline def create(lat: typingsJapgolly.kendoUi.kendo.dataviz.map.Location): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(lat.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Location]
    inline def create(lat: typingsJapgolly.kendoUi.kendo.dataviz.map.Location, lng: Double): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(lat.asInstanceOf[js.Any], lng.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Location]
    
    /* static member */
    inline def fromLatLng(lnglat: Any): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLng")(lnglat.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Location]
    
    /* static member */
    inline def fromLngLat(lnglat: Any): typingsJapgolly.kendoUi.kendo.dataviz.map.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLngLat")(lnglat.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.dataviz.map.Location]
  }
  
  @JSGlobal("kendo.dataviz.map.Marker")
  @js.native
  open class Marker ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.map.Marker {
    def this(options: MarkerOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.map.MarkerLayer")
  @js.native
  open class MarkerLayer protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.map.MarkerLayer {
    def this(map: Map) = this()
    def this(map: Map, options: MarkerLayerOptions) = this()
    
    /* CompleteClass */
    override def add(marker: typingsJapgolly.kendoUi.kendo.dataviz.map.Marker): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var items: Any = js.native
    
    /* CompleteClass */
    var map: Map = js.native
    
    /* CompleteClass */
    var options: LayerOptions = js.native
    /* CompleteClass */
    @JSName("options")
    var options_MarkerLayer: MarkerLayerOptions = js.native
    
    /* CompleteClass */
    override def remove(marker: typingsJapgolly.kendoUi.kendo.dataviz.map.Marker): Unit = js.native
    
    /* CompleteClass */
    override def setDataSource(dataSource: Any): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("kendo.dataviz.map.ShapeLayer")
  @js.native
  open class ShapeLayer protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.map.ShapeLayer {
    def this(map: Map) = this()
    def this(map: Map, options: ShapeLayerOptions) = this()
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var map: Map = js.native
    
    /* CompleteClass */
    var options: LayerOptions = js.native
    /* CompleteClass */
    @JSName("options")
    var options_ShapeLayer: ShapeLayerOptions = js.native
    
    /* CompleteClass */
    override def setDataSource(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("kendo.dataviz.map.TileLayer")
  @js.native
  open class TileLayer protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.map.TileLayer {
    def this(map: Map) = this()
    def this(map: Map, options: TileLayerOptions) = this()
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var map: Map = js.native
    
    /* CompleteClass */
    var options: LayerOptions = js.native
    /* CompleteClass */
    @JSName("options")
    var options_TileLayer: TileLayerOptions = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  object layer {
    
    @JSGlobal("kendo.dataviz.map.layer.Shape")
    @js.native
    open class Shape ()
      extends StObject
         with typingsJapgolly.kendoUi.kendo.dataviz.map.layer.Shape
  }
}
