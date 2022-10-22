package typingsJapgolly.reactNativeMaps

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponent
import typingsJapgolly.reactNativeMaps.anon.TypeofMapMarker
import typingsJapgolly.reactNativeMaps.anon.TypeofMapOverlay
import typingsJapgolly.reactNativeMaps.anon.TypeofMapView
import typingsJapgolly.reactNativeMaps.libAnimatedRegionMod.Props
import typingsJapgolly.reactNativeMaps.libGeojsonMod.GeojsonProps
import typingsJapgolly.reactNativeMaps.libMapCalloutMod.MapCalloutProps
import typingsJapgolly.reactNativeMaps.libMapCalloutSubviewMod.MapCalloutSubviewProps
import typingsJapgolly.reactNativeMaps.libMapCircleMod.MapCircleProps
import typingsJapgolly.reactNativeMaps.libMapHeatmapMod.MapHeatmapProps
import typingsJapgolly.reactNativeMaps.libMapLocalTileMod.MapLocalTileProps
import typingsJapgolly.reactNativeMaps.libMapMarkerMod.MapMarkerProps
import typingsJapgolly.reactNativeMaps.libMapOverlayMod.MapOverlayProps
import typingsJapgolly.reactNativeMaps.libMapPolygonMod.MapPolygonProps
import typingsJapgolly.reactNativeMaps.libMapPolylineMod.MapPolylineProps
import typingsJapgolly.reactNativeMaps.libMapUrlTileMod.MapUrlTileProps
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.MapTypes
import typingsJapgolly.reactNativeMaps.libMapViewMod.MapView
import typingsJapgolly.reactNativeMaps.libMapViewMod.MapViewProps
import typingsJapgolly.reactNativeMaps.libMapWMSTileMod.MapWMSTileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("react-native-maps/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-maps/lib", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.reactNativeMaps.libMapViewMod.default {
    def this(props: MapViewProps) = this()
  }
  object default {
    
    @JSImport("react-native-maps/lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-native-maps/lib", "default.Animated")
    @js.native
    def Animated: AnimatedComponent[TypeofMapView & (Instantiable1[/* props */ MapViewProps, MapView])] = js.native
    inline def Animated_=(x: AnimatedComponent[TypeofMapView & (Instantiable1[/* props */ MapViewProps, MapView])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animated")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-maps/lib", "Animated")
  @js.native
  val Animated: AnimatedComponent[TypeofMapView & (Instantiable1[/* props */ MapViewProps, MapView])] = js.native
  
  @JSImport("react-native-maps/lib", "AnimatedRegion")
  @js.native
  open class AnimatedRegion ()
    extends typingsJapgolly.reactNativeMaps.libAnimatedRegionMod.default {
    def this(valueIn: Props) = this()
  }
  
  /* was `typeof MapCallout` */
  @JSImport("react-native-maps/lib", "Callout")
  @js.native
  open class Callout ()
    extends typingsJapgolly.reactNativeMaps.libMapCalloutMod.default
  
  /* was `typeof MapCalloutSubview` */
  @JSImport("react-native-maps/lib", "CalloutSubview")
  @js.native
  open class CalloutSubview ()
    extends typingsJapgolly.reactNativeMaps.libMapCalloutSubviewMod.default
  
  /* was `typeof MapCircle` */
  @JSImport("react-native-maps/lib", "Circle")
  @js.native
  open class Circle protected ()
    extends typingsJapgolly.reactNativeMaps.libMapCircleMod.default {
    def this(props: MapCircleProps) = this()
  }
  
  inline def Geojson(props: GeojsonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Geojson")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* was `typeof MapHeatmap` */
  @JSImport("react-native-maps/lib", "Heatmap")
  @js.native
  open class Heatmap protected ()
    extends typingsJapgolly.reactNativeMaps.libMapHeatmapMod.default {
    def this(props: MapHeatmapProps) = this()
  }
  
  /* was `typeof MapLocalTile` */
  @JSImport("react-native-maps/lib", "LocalTile")
  @js.native
  open class LocalTile ()
    extends typingsJapgolly.reactNativeMaps.libMapLocalTileMod.default
  
  @JSImport("react-native-maps/lib", "MAP_TYPES")
  @js.native
  val MAP_TYPES: MapTypes = js.native
  
  @JSImport("react-native-maps/lib", "MapCallout")
  @js.native
  open class MapCallout protected ()
    extends typingsJapgolly.reactNativeMaps.libMapCalloutMod.MapCallout {
    def this(props: MapCalloutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapCalloutProps, context: Any) = this()
  }
  
  @JSImport("react-native-maps/lib", "MapCalloutSubview")
  @js.native
  open class MapCalloutSubview protected ()
    extends typingsJapgolly.reactNativeMaps.libMapCalloutSubviewMod.MapCalloutSubview {
    def this(props: MapCalloutSubviewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapCalloutSubviewProps, context: Any) = this()
  }
  
  @JSImport("react-native-maps/lib", "MapCircle")
  @js.native
  open class MapCircle protected ()
    extends typingsJapgolly.reactNativeMaps.libMapCircleMod.MapCircle {
    def this(props: MapCircleProps) = this()
  }
  
  @JSImport("react-native-maps/lib", "MapHeatmap")
  @js.native
  open class MapHeatmap protected ()
    extends typingsJapgolly.reactNativeMaps.libMapHeatmapMod.MapHeatmap {
    def this(props: MapHeatmapProps) = this()
  }
  
  @JSImport("react-native-maps/lib", "MapLocalTile")
  @js.native
  open class MapLocalTile protected ()
    extends typingsJapgolly.reactNativeMaps.libMapLocalTileMod.MapLocalTile {
    def this(props: MapLocalTileProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapLocalTileProps, context: Any) = this()
  }
  
  @JSImport("react-native-maps/lib", "MapMarker")
  @js.native
  open class MapMarker protected ()
    extends typingsJapgolly.reactNativeMaps.libMapMarkerMod.MapMarker {
    def this(props: MapMarkerProps) = this()
  }
  /* static members */
  object MapMarker {
    
    @JSImport("react-native-maps/lib", "MapMarker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-maps/lib", "MapMarker.Animated")
    @js.native
    def Animated: AnimatedComponent[TypeofMapMarker] = js.native
    inline def Animated_=(x: AnimatedComponent[TypeofMapMarker]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animated")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-maps/lib", "MapOverlay")
  @js.native
  open class MapOverlay protected ()
    extends typingsJapgolly.reactNativeMaps.libMapOverlayMod.MapOverlay {
    def this(props: MapOverlayProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapOverlayProps, context: Any) = this()
  }
  /* static members */
  object MapOverlay {
    
    @JSImport("react-native-maps/lib", "MapOverlay")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-maps/lib", "MapOverlay.Animated")
    @js.native
    def Animated: AnimatedComponent[TypeofMapOverlay] = js.native
    inline def Animated_=(x: AnimatedComponent[TypeofMapOverlay]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animated")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-maps/lib", "MapPolygon")
  @js.native
  open class MapPolygon protected ()
    extends typingsJapgolly.reactNativeMaps.libMapPolygonMod.MapPolygon {
    def this(props: MapPolygonProps) = this()
  }
  
  @JSImport("react-native-maps/lib", "MapPolyline")
  @js.native
  open class MapPolyline protected ()
    extends typingsJapgolly.reactNativeMaps.libMapPolylineMod.MapPolyline {
    def this(props: MapPolylineProps) = this()
  }
  
  @JSImport("react-native-maps/lib", "MapUrlTile")
  @js.native
  open class MapUrlTile protected ()
    extends typingsJapgolly.reactNativeMaps.libMapUrlTileMod.MapUrlTile {
    def this(props: MapUrlTileProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapUrlTileProps, context: Any) = this()
  }
  
  @JSImport("react-native-maps/lib", "MapWMSTile")
  @js.native
  open class MapWMSTile protected ()
    extends typingsJapgolly.reactNativeMaps.libMapWMSTileMod.MapWMSTile {
    def this(props: MapWMSTileProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapWMSTileProps, context: Any) = this()
  }
  
  /* was `typeof MapMarker` */
  @JSImport("react-native-maps/lib", "Marker")
  @js.native
  open class Marker protected ()
    extends typingsJapgolly.reactNativeMaps.libMapMarkerMod.default {
    def this(props: MapMarkerProps) = this()
  }
  /* static members */
  object Marker {
    
    @JSImport("react-native-maps/lib", "Marker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-maps/lib", "Marker.Animated")
    @js.native
    def Animated: AnimatedComponent[TypeofMapMarker] = js.native
    inline def Animated_=(x: AnimatedComponent[TypeofMapMarker]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animated")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-maps/lib", "MarkerAnimated")
  @js.native
  val MarkerAnimated: AnimatedComponent[TypeofMapMarker] = js.native
  
  /* was `typeof MapOverlay` */
  @JSImport("react-native-maps/lib", "Overlay")
  @js.native
  open class Overlay ()
    extends typingsJapgolly.reactNativeMaps.libMapOverlayMod.default
  /* static members */
  object Overlay {
    
    @JSImport("react-native-maps/lib", "Overlay")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-maps/lib", "Overlay.Animated")
    @js.native
    def Animated: AnimatedComponent[TypeofMapOverlay] = js.native
    inline def Animated_=(x: AnimatedComponent[TypeofMapOverlay]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animated")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-maps/lib", "OverlayAnimated")
  @js.native
  val OverlayAnimated: AnimatedComponent[TypeofMapOverlay] = js.native
  
  @JSImport("react-native-maps/lib", "PROVIDER_DEFAULT")
  @js.native
  val PROVIDER_DEFAULT: /* undefined */ Any = js.native
  
  @JSImport("react-native-maps/lib", "PROVIDER_GOOGLE")
  @js.native
  val PROVIDER_GOOGLE: /* "google" */ String = js.native
  
  /* was `typeof MapPolygon` */
  @JSImport("react-native-maps/lib", "Polygon")
  @js.native
  open class Polygon protected ()
    extends typingsJapgolly.reactNativeMaps.libMapPolygonMod.default {
    def this(props: MapPolygonProps) = this()
  }
  
  /* was `typeof MapPolyline` */
  @JSImport("react-native-maps/lib", "Polyline")
  @js.native
  open class Polyline protected ()
    extends typingsJapgolly.reactNativeMaps.libMapPolylineMod.default {
    def this(props: MapPolylineProps) = this()
  }
  
  /* was `typeof MapUrlTile` */
  @JSImport("react-native-maps/lib", "UrlTile")
  @js.native
  open class UrlTile ()
    extends typingsJapgolly.reactNativeMaps.libMapUrlTileMod.default
  
  /* was `typeof MapWMSTile` */
  @JSImport("react-native-maps/lib", "WMSTile")
  @js.native
  open class WMSTile ()
    extends typingsJapgolly.reactNativeMaps.libMapWMSTileMod.default
  
  inline def enableLatestRenderer(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLatestRenderer")().asInstanceOf[Any]
}
