package typingsJapgolly.maplibreGl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.Blob
import typingsJapgolly.mapboxMapboxGlSupported.mod.IsSupported
import typingsJapgolly.mapboxMapboxGlSupported.mod.IsSupportedOptions
import typingsJapgolly.maplibreGl.anon.MAXPARALLELIMAGEREQUESTS
import typingsJapgolly.maplibreGl.anon.TypeofLngLat
import typingsJapgolly.maplibreGl.anon.TypeofLngLatBounds
import typingsJapgolly.maplibreGl.anon.TypeofMercatorCoordinate
import typingsJapgolly.maplibreGl.anon.TypeofPoint
import typingsJapgolly.maplibreGl.anon.TypeofStyle
import typingsJapgolly.maplibreGl.anon.VectorSourceSpecification
import typingsJapgolly.maplibreGl.mod.AttributionOptions
import typingsJapgolly.maplibreGl.mod.Cancelable
import typingsJapgolly.maplibreGl.mod.CanvasSourceSpecification
import typingsJapgolly.maplibreGl.mod.Dispatcher
import typingsJapgolly.maplibreGl.mod.FullscreenOptions
import typingsJapgolly.maplibreGl.mod.GeoJSONSourceOptions
import typingsJapgolly.maplibreGl.mod.GeolocateOptions
import typingsJapgolly.maplibreGl.mod.ImageSourceSpecification
import typingsJapgolly.maplibreGl.mod.LogoOptions
import typingsJapgolly.maplibreGl.mod.MapOptions
import typingsJapgolly.maplibreGl.mod.MarkerOptions
import typingsJapgolly.maplibreGl.mod.NavigationOptions
import typingsJapgolly.maplibreGl.mod.PopupOptions
import typingsJapgolly.maplibreGl.mod.RasterDEMSourceSpecification
import typingsJapgolly.maplibreGl.mod.RasterSourceSpecification
import typingsJapgolly.maplibreGl.mod.RequestParameters
import typingsJapgolly.maplibreGl.mod.ResponseCallback
import typingsJapgolly.maplibreGl.mod.ScaleOptions
import typingsJapgolly.maplibreGl.mod.StyleOptions
import typingsJapgolly.maplibreGl.mod.TerrainSpecification
import typingsJapgolly.maplibreGl.mod.VideoSourceSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object maplibregl {
    
    @JSGlobal("maplibregl")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.AJAXError")
    @js.native
    open class AJAXError protected ()
      extends typingsJapgolly.maplibreGl.mod.AJAXError {
      def this(status: Double, statusText: String, url: String, body: Blob) = this()
    }
    @JSGlobal("maplibregl.AJAXError")
    @js.native
    def AJAXError: Instantiable4[
        /* status */ Double, 
        /* statusText */ String, 
        /* url */ String, 
        /* body */ Blob, 
        typingsJapgolly.maplibreGl.mod.AJAXError
      ] = js.native
    inline def AJAXError_=(
      x: Instantiable4[
          /* status */ Double, 
          /* statusText */ String, 
          /* url */ String, 
          /* body */ Blob, 
          typingsJapgolly.maplibreGl.mod.AJAXError
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AJAXError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.AttributionControl")
    @js.native
    open class AttributionControl ()
      extends typingsJapgolly.maplibreGl.mod.AttributionControl {
      def this(options: AttributionOptions) = this()
    }
    @JSGlobal("maplibregl.AttributionControl")
    @js.native
    def AttributionControl: Instantiable1[
        /* options */ js.UndefOr[AttributionOptions], 
        typingsJapgolly.maplibreGl.mod.AttributionControl
      ] = js.native
    inline def AttributionControl_=(
      x: Instantiable1[
          /* options */ js.UndefOr[AttributionOptions], 
          typingsJapgolly.maplibreGl.mod.AttributionControl
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributionControl")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.CanvasSource")
    @js.native
    open class CanvasSource protected ()
      extends typingsJapgolly.maplibreGl.mod.CanvasSource {
      /**
      	 * @private
      	 */
      def this(
        id: String,
        options: CanvasSourceSpecification,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
    }
    @JSGlobal("maplibregl.CanvasSource")
    @js.native
    def CanvasSource: Instantiable4[
        /* id */ String, 
        /* options */ CanvasSourceSpecification, 
        /* dispatcher */ Dispatcher, 
        /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
        typingsJapgolly.maplibreGl.mod.CanvasSource
      ] = js.native
    inline def CanvasSource_=(
      x: Instantiable4[
          /* id */ String, 
          /* options */ CanvasSourceSpecification, 
          /* dispatcher */ Dispatcher, 
          /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
          typingsJapgolly.maplibreGl.mod.CanvasSource
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CanvasSource")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.Evented")
    @js.native
    open class Evented ()
      extends typingsJapgolly.maplibreGl.mod.Evented
    @JSGlobal("maplibregl.Evented")
    @js.native
    def Evented: Instantiable0[typingsJapgolly.maplibreGl.mod.Evented] = js.native
    inline def Evented_=(x: Instantiable0[typingsJapgolly.maplibreGl.mod.Evented]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Evented")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.FullscreenControl")
    @js.native
    open class FullscreenControl protected ()
      extends typingsJapgolly.maplibreGl.mod.FullscreenControl {
      def this(options: FullscreenOptions) = this()
    }
    @JSGlobal("maplibregl.FullscreenControl")
    @js.native
    def FullscreenControl: Instantiable1[/* options */ FullscreenOptions, typingsJapgolly.maplibreGl.mod.FullscreenControl] = js.native
    inline def FullscreenControl_=(
      x: Instantiable1[/* options */ FullscreenOptions, typingsJapgolly.maplibreGl.mod.FullscreenControl]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FullscreenControl")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.GeoJSONSource")
    @js.native
    open class GeoJSONSource protected ()
      extends typingsJapgolly.maplibreGl.mod.GeoJSONSource {
      /**
      	 * @private
      	 */
      def this(
        id: String,
        options: GeoJSONSourceOptions,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
    }
    @JSGlobal("maplibregl.GeoJSONSource")
    @js.native
    def GeoJSONSource: Instantiable4[
        /* id */ String, 
        /* options */ GeoJSONSourceOptions, 
        /* dispatcher */ Dispatcher, 
        /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
        typingsJapgolly.maplibreGl.mod.GeoJSONSource
      ] = js.native
    inline def GeoJSONSource_=(
      x: Instantiable4[
          /* id */ String, 
          /* options */ GeoJSONSourceOptions, 
          /* dispatcher */ Dispatcher, 
          /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
          typingsJapgolly.maplibreGl.mod.GeoJSONSource
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GeoJSONSource")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.GeolocateControl")
    @js.native
    open class GeolocateControl protected ()
      extends typingsJapgolly.maplibreGl.mod.GeolocateControl {
      def this(options: GeolocateOptions) = this()
    }
    @JSGlobal("maplibregl.GeolocateControl")
    @js.native
    def GeolocateControl: Instantiable1[/* options */ GeolocateOptions, typingsJapgolly.maplibreGl.mod.GeolocateControl] = js.native
    inline def GeolocateControl_=(x: Instantiable1[/* options */ GeolocateOptions, typingsJapgolly.maplibreGl.mod.GeolocateControl]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GeolocateControl")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.ImageSource")
    @js.native
    open class ImageSource protected ()
      extends typingsJapgolly.maplibreGl.mod.ImageSource {
      def this(
        id: String,
        options: CanvasSourceSpecification,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
      /**
      	 * @private
      	 */
      def this(
        id: String,
        options: ImageSourceSpecification,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
      def this(
        id: String,
        options: VideoSourceSpecification,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
    }
    @JSGlobal("maplibregl.ImageSource")
    @js.native
    def ImageSource: Instantiable4[
        /* id */ String, 
        /* options */ ImageSourceSpecification | VideoSourceSpecification | CanvasSourceSpecification, 
        /* dispatcher */ Dispatcher, 
        /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
        typingsJapgolly.maplibreGl.mod.ImageSource
      ] = js.native
    inline def ImageSource_=(
      x: Instantiable4[
          /* id */ String, 
          /* options */ ImageSourceSpecification | VideoSourceSpecification | CanvasSourceSpecification, 
          /* dispatcher */ Dispatcher, 
          /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
          typingsJapgolly.maplibreGl.mod.ImageSource
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImageSource")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.LngLat")
    @js.native
    open class LngLat protected ()
      extends typingsJapgolly.maplibreGl.mod.LngLat {
      def this(lng: Double, lat: Double) = this()
    }
    @JSGlobal("maplibregl.LngLat")
    @js.native
    def LngLat: TypeofLngLat = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.LngLatBounds")
    @js.native
    open class LngLatBounds ()
      extends typingsJapgolly.maplibreGl.mod.LngLatBounds {
      def this(sw: Any) = this()
      def this(sw: Any, ne: Any) = this()
      def this(sw: Unit, ne: Any) = this()
    }
    @JSGlobal("maplibregl.LngLatBounds")
    @js.native
    def LngLatBounds: TypeofLngLatBounds = js.native
    inline def LngLatBounds_=(x: TypeofLngLatBounds): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LngLatBounds")(x.asInstanceOf[js.Any])
    
    inline def LngLat_=(x: TypeofLngLat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LngLat")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.LogoControl")
    @js.native
    open class LogoControl ()
      extends typingsJapgolly.maplibreGl.mod.LogoControl {
      def this(options: LogoOptions) = this()
    }
    @JSGlobal("maplibregl.LogoControl")
    @js.native
    def LogoControl: Instantiable1[/* options */ js.UndefOr[LogoOptions], typingsJapgolly.maplibreGl.mod.LogoControl] = js.native
    inline def LogoControl_=(
      x: Instantiable1[/* options */ js.UndefOr[LogoOptions], typingsJapgolly.maplibreGl.mod.LogoControl]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogoControl")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.Map")
    @js.native
    open class Map protected ()
      extends typingsJapgolly.maplibreGl.mod.Map {
      def this(options: MapOptions) = this()
    }
    @JSGlobal("maplibregl.Map")
    @js.native
    def Map: Instantiable1[/* options */ MapOptions, typingsJapgolly.maplibreGl.mod.Map] = js.native
    inline def Map_=(x: Instantiable1[/* options */ MapOptions, typingsJapgolly.maplibreGl.mod.Map]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.Marker")
    @js.native
    open class Marker ()
      extends typingsJapgolly.maplibreGl.mod.Marker {
      def this(options: MarkerOptions) = this()
      def this(options: Unit, legacyOptions: MarkerOptions) = this()
      def this(options: MarkerOptions, legacyOptions: MarkerOptions) = this()
    }
    @JSGlobal("maplibregl.Marker")
    @js.native
    def Marker: Instantiable2[
        /* options */ js.UndefOr[MarkerOptions], 
        /* legacyOptions */ js.UndefOr[MarkerOptions], 
        typingsJapgolly.maplibreGl.mod.Marker
      ] = js.native
    inline def Marker_=(
      x: Instantiable2[
          /* options */ js.UndefOr[MarkerOptions], 
          /* legacyOptions */ js.UndefOr[MarkerOptions], 
          typingsJapgolly.maplibreGl.mod.Marker
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Marker")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.MercatorCoordinate")
    @js.native
    open class MercatorCoordinate protected ()
      extends typingsJapgolly.maplibreGl.mod.MercatorCoordinate {
      def this(x: Double, y: Double) = this()
      def this(x: Double, y: Double, z: Double) = this()
    }
    @JSGlobal("maplibregl.MercatorCoordinate")
    @js.native
    def MercatorCoordinate: TypeofMercatorCoordinate = js.native
    inline def MercatorCoordinate_=(x: TypeofMercatorCoordinate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MercatorCoordinate")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.NavigationControl")
    @js.native
    open class NavigationControl protected ()
      extends typingsJapgolly.maplibreGl.mod.NavigationControl {
      def this(options: NavigationOptions) = this()
    }
    @JSGlobal("maplibregl.NavigationControl")
    @js.native
    def NavigationControl: Instantiable1[/* options */ NavigationOptions, typingsJapgolly.maplibreGl.mod.NavigationControl] = js.native
    inline def NavigationControl_=(
      x: Instantiable1[/* options */ NavigationOptions, typingsJapgolly.maplibreGl.mod.NavigationControl]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NavigationControl")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.Point")
    @js.native
    open class Point protected ()
      extends typingsJapgolly.mapboxPointGeometry.mod.^ {
      def this(x: Double, y: Double) = this()
    }
    @JSGlobal("maplibregl.Point")
    @js.native
    def Point: TypeofPoint & (Instantiable2[/* x */ Double, /* y */ Double, typingsJapgolly.mapboxPointGeometry.mod.^]) = js.native
    inline def Point_=(
      x: TypeofPoint & (Instantiable2[/* x */ Double, /* y */ Double, typingsJapgolly.mapboxPointGeometry.mod.^])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Point")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.Popup")
    @js.native
    open class Popup ()
      extends typingsJapgolly.maplibreGl.mod.Popup {
      def this(options: PopupOptions) = this()
    }
    @JSGlobal("maplibregl.Popup")
    @js.native
    def Popup: Instantiable1[/* options */ js.UndefOr[PopupOptions], typingsJapgolly.maplibreGl.mod.Popup] = js.native
    inline def Popup_=(x: Instantiable1[/* options */ js.UndefOr[PopupOptions], typingsJapgolly.maplibreGl.mod.Popup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Popup")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.RasterDEMTileSource")
    @js.native
    open class RasterDEMTileSource protected ()
      extends typingsJapgolly.maplibreGl.mod.RasterDEMTileSource {
      def this(
        id: String,
        options: RasterDEMSourceSpecification,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
    }
    @JSGlobal("maplibregl.RasterDEMTileSource")
    @js.native
    def RasterDEMTileSource: Instantiable4[
        /* id */ String, 
        /* options */ RasterDEMSourceSpecification, 
        /* dispatcher */ Dispatcher, 
        /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
        typingsJapgolly.maplibreGl.mod.RasterDEMTileSource
      ] = js.native
    inline def RasterDEMTileSource_=(
      x: Instantiable4[
          /* id */ String, 
          /* options */ RasterDEMSourceSpecification, 
          /* dispatcher */ Dispatcher, 
          /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
          typingsJapgolly.maplibreGl.mod.RasterDEMTileSource
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RasterDEMTileSource")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.RasterTileSource")
    @js.native
    open class RasterTileSource protected ()
      extends typingsJapgolly.maplibreGl.mod.RasterTileSource {
      def this(
        id: String,
        options: RasterDEMSourceSpecification,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
      def this(
        id: String,
        options: RasterSourceSpecification,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
    }
    @JSGlobal("maplibregl.RasterTileSource")
    @js.native
    def RasterTileSource: Instantiable4[
        /* id */ String, 
        /* options */ RasterSourceSpecification | RasterDEMSourceSpecification, 
        /* dispatcher */ Dispatcher, 
        /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
        typingsJapgolly.maplibreGl.mod.RasterTileSource
      ] = js.native
    inline def RasterTileSource_=(
      x: Instantiable4[
          /* id */ String, 
          /* options */ RasterSourceSpecification | RasterDEMSourceSpecification, 
          /* dispatcher */ Dispatcher, 
          /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
          typingsJapgolly.maplibreGl.mod.RasterTileSource
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RasterTileSource")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.ScaleControl")
    @js.native
    open class ScaleControl protected ()
      extends typingsJapgolly.maplibreGl.mod.ScaleControl {
      def this(options: ScaleOptions) = this()
    }
    @JSGlobal("maplibregl.ScaleControl")
    @js.native
    def ScaleControl: Instantiable1[/* options */ ScaleOptions, typingsJapgolly.maplibreGl.mod.ScaleControl] = js.native
    inline def ScaleControl_=(x: Instantiable1[/* options */ ScaleOptions, typingsJapgolly.maplibreGl.mod.ScaleControl]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScaleControl")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.Style")
    @js.native
    open class Style protected ()
      extends typingsJapgolly.maplibreGl.mod.Style {
      def this(map: typingsJapgolly.maplibreGl.mod.Map) = this()
      def this(map: typingsJapgolly.maplibreGl.mod.Map, options: StyleOptions) = this()
    }
    @JSGlobal("maplibregl.Style")
    @js.native
    def Style: TypeofStyle = js.native
    inline def Style_=(x: TypeofStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Style")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.TerrainControl")
    @js.native
    open class TerrainControl protected ()
      extends typingsJapgolly.maplibreGl.mod.TerrainControl {
      def this(options: TerrainSpecification) = this()
    }
    @JSGlobal("maplibregl.TerrainControl")
    @js.native
    def TerrainControl: Instantiable1[/* options */ TerrainSpecification, typingsJapgolly.maplibreGl.mod.TerrainControl] = js.native
    inline def TerrainControl_=(
      x: Instantiable1[/* options */ TerrainSpecification, typingsJapgolly.maplibreGl.mod.TerrainControl]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TerrainControl")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.VectorTileSource")
    @js.native
    open class VectorTileSource protected ()
      extends typingsJapgolly.maplibreGl.mod.VectorTileSource {
      def this(
        id: String,
        options: VectorSourceSpecification,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
    }
    @JSGlobal("maplibregl.VectorTileSource")
    @js.native
    def VectorTileSource: Instantiable4[
        /* id */ String, 
        /* options */ VectorSourceSpecification, 
        /* dispatcher */ Dispatcher, 
        /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
        typingsJapgolly.maplibreGl.mod.VectorTileSource
      ] = js.native
    inline def VectorTileSource_=(
      x: Instantiable4[
          /* id */ String, 
          /* options */ VectorSourceSpecification, 
          /* dispatcher */ Dispatcher, 
          /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
          typingsJapgolly.maplibreGl.mod.VectorTileSource
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VectorTileSource")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("maplibregl.VideoSource")
    @js.native
    open class VideoSource protected ()
      extends typingsJapgolly.maplibreGl.mod.VideoSource {
      /**
      	 * @private
      	 */
      def this(
        id: String,
        options: VideoSourceSpecification,
        dispatcher: Dispatcher,
        eventedParent: typingsJapgolly.maplibreGl.mod.Evented
      ) = this()
    }
    @JSGlobal("maplibregl.VideoSource")
    @js.native
    def VideoSource: Instantiable4[
        /* id */ String, 
        /* options */ VideoSourceSpecification, 
        /* dispatcher */ Dispatcher, 
        /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
        typingsJapgolly.maplibreGl.mod.VideoSource
      ] = js.native
    inline def VideoSource_=(
      x: Instantiable4[
          /* id */ String, 
          /* options */ VideoSourceSpecification, 
          /* dispatcher */ Dispatcher, 
          /* eventedParent */ typingsJapgolly.maplibreGl.mod.Evented, 
          typingsJapgolly.maplibreGl.mod.VideoSource
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VideoSource")(x.asInstanceOf[js.Any])
    
    /**
    	 * Sets a custom load tile function that will be called when using a source that starts with a custom url schema.
    	 * The example below will be triggered for custom:// urls defined in the sources list in the style definitions.
    	 * The function passed will receive the request parameters and should call the callback with the resulting request,
    	 * for example a pbf vector tile, non-compressed, represented as ArrayBuffer.
    	 *
    	 * @function addProtocol
    	 * @param {string} customProtocol - the protocol to hook, for example 'custom'
    	 * @param {Function} loadFn - the function to use when trying to fetch a tile specified by the customProtocol
    	 * @example
    	 * // this will fetch a file using the fetch API (this is obviously a non iteresting example...)
    	 * maplibre.addProtocol('custom', (params, callback) => {
    			fetch(`https://${params.url.split("://")[1]}`)
    				.then(t => {
    					if (t.status == 200) {
    						t.arrayBuffer().then(arr => {
    							callback(null, arr, null, null);
    						});
    					} else {
    						callback(new Error(`Tile fetch error: ${t.statusText}`));
    					}
    				})
    				.catch(e => {
    					callback(new Error(e));
    				});
    			return { cancel: () => { } };
    		});
    	 * // the following is an example of a way to return an error when trying to load a tile
    	 * maplibre.addProtocol('custom2', (params, callback) => {
    	 *      callback(new Error('someErrorMessage'));
    	 *      return { cancel: () => { } };
    	 * });
    	 */
    inline def addProtocol(
      customProtocol: String,
      loadFn: js.Function2[
          /* requestParameters */ RequestParameters, 
          /* callback */ ResponseCallback[Any], 
          Cancelable
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addProtocol")(customProtocol.asInstanceOf[js.Any], loadFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
    	 * Clears up resources that have previously been created by `maplibregl.prewarm()`.
    	 * Note that this is typically not necessary. You should only call this function
    	 * if you expect the user of your app to not return to a Map view at any point
    	 * in your application.
    	 *
    	 * @function clearPrewarmedResources
    	 * @example
    	 * maplibregl.clearPrewarmedResources()
    	 */
    inline def clearPrewarmedResources(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPrewarmedResources")().asInstanceOf[Unit]
    /**
    	 * Clears up resources that have previously been created by `maplibregl.prewarm()`.
    	 * Note that this is typically not necessary. You should only call this function
    	 * if you expect the user of your app to not return to a Map view at any point
    	 * in your application.
    	 *
    	 * @function clearPrewarmedResources
    	 * @example
    	 * maplibregl.clearPrewarmedResources()
    	 */
    @JSGlobal("maplibregl.clearPrewarmedResources")
    @js.native
    def clearPrewarmedResources_Fmaplibregl: js.Function0[Unit] = js.native
    
    inline def clearPrewarmedResources_Fmaplibregl_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearPrewarmedResources")(x.asInstanceOf[js.Any])
    
    /**
    	 * Clears browser storage used by this library. Using this method flushes the MapLibre tile
    	 * cache that is managed by this library. Tiles may still be cached by the browser
    	 * in some cases.
    	 *
    	 * This API is supported on browsers where the [`Cache` API](https://developer.mozilla.org/en-US/docs/Web/API/Cache)
    	 * is supported and enabled. This includes all major browsers when pages are served over
    	 * `https://`, except Internet Explorer and Edge Mobile.
    	 *
    	 * When called in unsupported browsers or environments (private or incognito mode), the
    	 * callback will be called with an error argument.
    	 *
    	 * @function clearStorage
    	 * @param {Function} callback Called with an error argument if there is an error.
    	 * @example
    	 * maplibregl.clearStorage();
    	 */
    inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
    inline def clearStorage(callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("maplibregl.config")
    @js.native
    def config: MAXPARALLELIMAGEREQUESTS = js.native
    inline def config_=(x: MAXPARALLELIMAGEREQUESTS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
    
    inline def getRTLTextPluginStatus(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTLTextPluginStatus")().asInstanceOf[String]
    
    /**
    	 * Gets and sets the maximum number of images (raster tiles, sprites, icons) to load in parallel,
    	 * which affects performance in raster-heavy maps. 16 by default.
    	 *
    	 * @var {string} maxParallelImageRequests
    	 * @returns {number} Number of parallel requests currently configured.
    	 * @example
    	 * maplibregl.maxParallelImageRequests = 10;
    	 */
    @JSGlobal("maplibregl.maxParallelImageRequests")
    @js.native
    def maxParallelImageRequests: Double = js.native
    inline def maxParallelImageRequests_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxParallelImageRequests")(x.asInstanceOf[js.Any])
    
    /**
    	 * Initializes resources like WebWorkers that can be shared across maps to lower load
    	 * times in some situations. `maplibregl.workerUrl` and `maplibregl.workerCount`, if being
    	 * used, must be set before `prewarm()` is called to have an effect.
    	 *
    	 * By default, the lifecycle of these resources is managed automatically, and they are
    	 * lazily initialized when a Map is first created. By invoking `prewarm()`, these
    	 * resources will be created ahead of time, and will not be cleared when the last Map
    	 * is removed from the page. This allows them to be re-used by new Map instances that
    	 * are created later. They can be manually cleared by calling
    	 * `maplibregl.clearPrewarmedResources()`. This is only necessary if your web page remains
    	 * active but stops using maps altogether.
    	 *
    	 * This is primarily useful when using GL-JS maps in a single page app, wherein a user
    	 * would navigate between various views that can cause Map instances to constantly be
    	 * created and destroyed.
    	 *
    	 * @function prewarm
    	 * @example
    	 * maplibregl.prewarm()
    	 */
    inline def prewarm(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prewarm")().asInstanceOf[Unit]
    /**
    	 * Initializes resources like WebWorkers that can be shared across maps to lower load
    	 * times in some situations. `maplibregl.workerUrl` and `maplibregl.workerCount`, if being
    	 * used, must be set before `prewarm()` is called to have an effect.
    	 *
    	 * By default, the lifecycle of these resources is managed automatically, and they are
    	 * lazily initialized when a Map is first created. By invoking `prewarm()`, these
    	 * resources will be created ahead of time, and will not be cleared when the last Map
    	 * is removed from the page. This allows them to be re-used by new Map instances that
    	 * are created later. They can be manually cleared by calling
    	 * `maplibregl.clearPrewarmedResources()`. This is only necessary if your web page remains
    	 * active but stops using maps altogether.
    	 *
    	 * This is primarily useful when using GL-JS maps in a single page app, wherein a user
    	 * would navigate between various views that can cause Map instances to constantly be
    	 * created and destroyed.
    	 *
    	 * @function prewarm
    	 * @example
    	 * maplibregl.prewarm()
    	 */
    @JSGlobal("maplibregl.prewarm")
    @js.native
    def prewarm_Fmaplibregl: js.Function0[Unit] = js.native
    
    inline def prewarm_Fmaplibregl_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prewarm")(x.asInstanceOf[js.Any])
    
    /**
    	 * Removes a previusly added protocol
    	 *
    	 * @function removeProtocol
    	 * @param {string} customProtocol - the custom protocol to remove registration for
    	 * @example
    	 * maplibregl.removeProtocol('custom');
    	 */
    inline def removeProtocol(customProtocol: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeProtocol")(customProtocol.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setRTLTextPlugin(url: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setRTLTextPlugin(url: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit], deferred: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferred.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def supported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[Boolean]
    inline def supported(options: IsSupportedOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @JSGlobal("maplibregl.supported")
    @js.native
    def supported_Fmaplibregl: IsSupported = js.native
    
    inline def supported_Fmaplibregl_=(x: IsSupported): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
    
    /**
    	 * Returns the package version of the library
    	 * @returns {string} Package version of the library
    	 */
    @JSGlobal("maplibregl.version")
    @js.native
    val version: String = js.native
    
    /**
    	 * Gets and sets the number of web workers instantiated on a page with GL JS maps.
    	 * By default, it is set to half the number of CPU cores (capped at 6).
    	 * Make sure to set this property before creating any map instances for it to have effect.
    	 *
    	 * @var {string} workerCount
    	 * @returns {number} Number of workers currently configured.
    	 * @example
    	 * maplibregl.workerCount = 2;
    	 */
    @JSGlobal("maplibregl.workerCount")
    @js.native
    def workerCount: Double = js.native
    inline def workerCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])
    
    @JSGlobal("maplibregl.workerUrl")
    @js.native
    def workerUrl: String = js.native
    inline def workerUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerUrl")(x.asInstanceOf[js.Any])
  }
}
