package typingsJapgolly.mapboxGl

import org.scalajs.dom.HTMLElement
import typingsJapgolly.mapboxGl.anon.BearingSnap
import typingsJapgolly.mapboxGl.anon.Compact
import typingsJapgolly.mapboxGl.anon.FailIfMajorPerformanceCaveat
import typingsJapgolly.mapboxGl.anon.FitBoundsOptions
import typingsJapgolly.mapboxGl.anon.MaxWidth
import typingsJapgolly.mapboxGl.anon.ShowCompass
import typingsJapgolly.mapboxGl.mod.FullscreenControlOptions
import typingsJapgolly.mapboxGl.mod.GeoJSONSourceOptions
import typingsJapgolly.mapboxGl.mod.ImageSourceOptions
import typingsJapgolly.mapboxGl.mod.LngLatBoundsLike
import typingsJapgolly.mapboxGl.mod.LngLatLike
import typingsJapgolly.mapboxGl.mod.MapboxOptions
import typingsJapgolly.mapboxGl.mod.MarkerOptions
import typingsJapgolly.mapboxGl.mod.PluginStatus
import typingsJapgolly.mapboxGl.mod.PointLike
import typingsJapgolly.mapboxGl.mod.PopupOptions
import typingsJapgolly.mapboxGl.mod.VideoSourceOptions
import typingsJapgolly.mapboxGl.mod.quat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mapboxgl {
    
    @JSGlobal("mapboxgl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("mapboxgl.AttributionControl")
    @js.native
    open class AttributionControl ()
      extends typingsJapgolly.mapboxGl.mod.AttributionControl {
      def this(options: Compact) = this()
    }
    
    @JSGlobal("mapboxgl.BoxZoomHandler")
    @js.native
    open class BoxZoomHandler protected ()
      extends typingsJapgolly.mapboxGl.mod.BoxZoomHandler {
      def this(map: typingsJapgolly.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.CanvasSource")
    @js.native
    open class CanvasSource ()
      extends typingsJapgolly.mapboxGl.mod.CanvasSource
    
    @JSGlobal("mapboxgl.Control")
    @js.native
    open class Control ()
      extends typingsJapgolly.mapboxGl.mod.Control
    
    @JSGlobal("mapboxgl.DoubleClickZoomHandler")
    @js.native
    open class DoubleClickZoomHandler protected ()
      extends typingsJapgolly.mapboxGl.mod.DoubleClickZoomHandler {
      def this(map: typingsJapgolly.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.DragPanHandler")
    @js.native
    open class DragPanHandler protected ()
      extends typingsJapgolly.mapboxGl.mod.DragPanHandler {
      def this(map: typingsJapgolly.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.DragRotateHandler")
    @js.native
    open class DragRotateHandler protected ()
      extends typingsJapgolly.mapboxGl.mod.DragRotateHandler {
      def this(map: typingsJapgolly.mapboxGl.mod.Map) = this()
      def this(map: typingsJapgolly.mapboxGl.mod.Map, options: BearingSnap) = this()
    }
    
    @JSGlobal("mapboxgl.ErrorEvent")
    @js.native
    open class ErrorEvent ()
      extends typingsJapgolly.mapboxGl.mod.ErrorEvent
    
    @JSGlobal("mapboxgl.Evented")
    @js.native
    open class Evented ()
      extends typingsJapgolly.mapboxGl.mod.Evented
    
    @JSGlobal("mapboxgl.FreeCameraOptions")
    @js.native
    open class FreeCameraOptions ()
      extends typingsJapgolly.mapboxGl.mod.FreeCameraOptions {
      def this(position: typingsJapgolly.mapboxGl.mod.MercatorCoordinate) = this()
      def this(position: Unit, orientation: quat) = this()
      def this(position: typingsJapgolly.mapboxGl.mod.MercatorCoordinate, orientation: quat) = this()
    }
    
    @JSGlobal("mapboxgl.FullscreenControl")
    @js.native
    open class FullscreenControl ()
      extends typingsJapgolly.mapboxGl.mod.FullscreenControl {
      def this(options: FullscreenControlOptions) = this()
    }
    
    @JSGlobal("mapboxgl.GeoJSONSource")
    @js.native
    open class GeoJSONSource ()
      extends typingsJapgolly.mapboxGl.mod.GeoJSONSource {
      def this(options: GeoJSONSourceOptions) = this()
    }
    
    @JSGlobal("mapboxgl.GeolocateControl")
    @js.native
    open class GeolocateControl ()
      extends typingsJapgolly.mapboxGl.mod.GeolocateControl {
      def this(options: FitBoundsOptions) = this()
    }
    
    @JSGlobal("mapboxgl.ImageSource")
    @js.native
    open class ImageSource ()
      extends typingsJapgolly.mapboxGl.mod.ImageSource {
      def this(options: ImageSourceOptions) = this()
    }
    
    @JSGlobal("mapboxgl.KeyboardHandler")
    @js.native
    open class KeyboardHandler protected ()
      extends typingsJapgolly.mapboxGl.mod.KeyboardHandler {
      def this(map: typingsJapgolly.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.LngLat")
    @js.native
    open class LngLat protected ()
      extends typingsJapgolly.mapboxGl.mod.LngLat {
      def this(lng: Double, lat: Double) = this()
    }
    /* static members */
    object LngLat {
      
      @JSGlobal("mapboxgl.LngLat")
      @js.native
      val ^ : js.Any = js.native
      
      inline def convert(input: LngLatLike): typingsJapgolly.mapboxGl.mod.LngLat = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mapboxGl.mod.LngLat]
    }
    
    @JSGlobal("mapboxgl.LngLatBounds")
    @js.native
    open class LngLatBounds ()
      extends typingsJapgolly.mapboxGl.mod.LngLatBounds {
      def this(boundsLike: js.Tuple2[LngLatLike, LngLatLike]) = this()
      def this(boundsLike: js.Tuple4[Double, Double, Double, Double]) = this()
      def this(sw: LngLatLike, ne: LngLatLike) = this()
    }
    /* static members */
    object LngLatBounds {
      
      @JSGlobal("mapboxgl.LngLatBounds")
      @js.native
      val ^ : js.Any = js.native
      
      /** Convert an array to a LngLatBounds object, or return an existing LngLatBounds object unchanged. */
      inline def convert(input: LngLatBoundsLike): typingsJapgolly.mapboxGl.mod.LngLatBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mapboxGl.mod.LngLatBounds]
    }
    
    @JSGlobal("mapboxgl.Map")
    @js.native
    open class Map ()
      extends typingsJapgolly.mapboxGl.mod.Map {
      def this(options: MapboxOptions) = this()
    }
    
    @JSGlobal("mapboxgl.MapMouseEvent")
    @js.native
    open class MapMouseEvent ()
      extends typingsJapgolly.mapboxGl.mod.MapMouseEvent
    
    @JSGlobal("mapboxgl.MapTouchEvent")
    @js.native
    open class MapTouchEvent ()
      extends typingsJapgolly.mapboxGl.mod.MapTouchEvent
    
    @JSGlobal("mapboxgl.MapWheelEvent")
    @js.native
    open class MapWheelEvent ()
      extends typingsJapgolly.mapboxGl.mod.MapWheelEvent
    
    @JSGlobal("mapboxgl.MapboxEvent")
    @js.native
    open class MapboxEvent[TOrig] ()
      extends typingsJapgolly.mapboxGl.mod.MapboxEvent[TOrig]
    
    @JSGlobal("mapboxgl.Marker")
    @js.native
    open class Marker ()
      extends typingsJapgolly.mapboxGl.mod.Marker {
      def this(element: HTMLElement) = this()
      def this(options: MarkerOptions) = this()
      def this(element: HTMLElement, options: MarkerOptions) = this()
      def this(element: Unit, options: MarkerOptions) = this()
    }
    
    @JSGlobal("mapboxgl.MercatorCoordinate")
    @js.native
    open class MercatorCoordinate protected ()
      extends typingsJapgolly.mapboxGl.mod.MercatorCoordinate {
      def this(x: Double, y: Double) = this()
      def this(x: Double, y: Double, z: Double) = this()
    }
    /* static members */
    object MercatorCoordinate {
      
      @JSGlobal("mapboxgl.MercatorCoordinate")
      @js.native
      val ^ : js.Any = js.native
      
      /** Project a LngLat to a MercatorCoordinate. */
      inline def fromLngLat(lngLatLike: LngLatLike): typingsJapgolly.mapboxGl.mod.MercatorCoordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLngLat")(lngLatLike.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mapboxGl.mod.MercatorCoordinate]
      inline def fromLngLat(lngLatLike: LngLatLike, altitude: Double): typingsJapgolly.mapboxGl.mod.MercatorCoordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLngLat")(lngLatLike.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mapboxGl.mod.MercatorCoordinate]
    }
    
    @JSGlobal("mapboxgl.NavigationControl")
    @js.native
    open class NavigationControl ()
      extends typingsJapgolly.mapboxGl.mod.NavigationControl {
      def this(options: ShowCompass) = this()
    }
    
    @JSGlobal("mapboxgl.Point")
    @js.native
    open class Point protected ()
      extends typingsJapgolly.mapboxGl.mod.Point {
      def this(x: Double, y: Double) = this()
    }
    /* static members */
    object Point {
      
      @JSGlobal("mapboxgl.Point")
      @js.native
      val ^ : js.Any = js.native
      
      inline def convert(a: PointLike): typingsJapgolly.mapboxGl.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mapboxGl.mod.Point]
    }
    
    @JSGlobal("mapboxgl.Popup")
    @js.native
    open class Popup ()
      extends typingsJapgolly.mapboxGl.mod.Popup {
      def this(options: PopupOptions) = this()
    }
    
    @JSGlobal("mapboxgl.PositionOptions")
    @js.native
    open class PositionOptions ()
      extends typingsJapgolly.mapboxGl.mod.PositionOptions
    
    @JSGlobal("mapboxgl.ScaleControl")
    @js.native
    open class ScaleControl ()
      extends typingsJapgolly.mapboxGl.mod.ScaleControl {
      def this(options: MaxWidth) = this()
    }
    
    @JSGlobal("mapboxgl.ScrollZoomHandler")
    @js.native
    open class ScrollZoomHandler protected ()
      extends typingsJapgolly.mapboxGl.mod.ScrollZoomHandler {
      def this(map: typingsJapgolly.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.TouchPitchHandler")
    @js.native
    open class TouchPitchHandler protected ()
      extends typingsJapgolly.mapboxGl.mod.TouchPitchHandler {
      def this(map: typingsJapgolly.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.TouchZoomRotateHandler")
    @js.native
    open class TouchZoomRotateHandler protected ()
      extends typingsJapgolly.mapboxGl.mod.TouchZoomRotateHandler {
      def this(map: typingsJapgolly.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.VideoSource")
    @js.native
    open class VideoSource ()
      extends typingsJapgolly.mapboxGl.mod.VideoSource {
      def this(options: VideoSourceOptions) = this()
    }
    
    @JSGlobal("mapboxgl.accessToken")
    @js.native
    def accessToken: String = js.native
    inline def accessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(x.asInstanceOf[js.Any])
    
    @JSGlobal("mapboxgl.baseApiUrl")
    @js.native
    def baseApiUrl: String = js.native
    inline def baseApiUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseApiUrl")(x.asInstanceOf[js.Any])
    
    inline def clearPrewarmedResources(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPrewarmedResources")().asInstanceOf[Unit]
    
    inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
    inline def clearStorage(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getRTLTextPluginStatus(): PluginStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTLTextPluginStatus")().asInstanceOf[PluginStatus]
    
    /**
      * Maximum number of images (raster tiles, sprites, icons) to load in parallel, which affects performance in raster-heavy maps.
      * 16 by default.
      */
    @JSGlobal("mapboxgl.maxParallelImageRequests")
    @js.native
    def maxParallelImageRequests: Double = js.native
    inline def maxParallelImageRequests_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxParallelImageRequests")(x.asInstanceOf[js.Any])
    
    inline def prewarm(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prewarm")().asInstanceOf[Unit]
    
    inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit], deferred: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferred.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def supported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[Boolean]
    inline def supported(options: FailIfMajorPerformanceCaveat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("mapboxgl.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    /**
      * Number of web workers instantiated on a page with GL JS maps.
      * By default, it is set to half the number of CPU cores (capped at 6).
      */
    @JSGlobal("mapboxgl.workerCount")
    @js.native
    def workerCount: Double = js.native
    inline def workerCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])
  }
}
