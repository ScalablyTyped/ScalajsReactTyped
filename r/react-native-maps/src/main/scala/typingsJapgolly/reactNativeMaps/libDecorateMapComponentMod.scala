package typingsJapgolly.reactNativeMaps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNative.mod.HostComponent
import typingsJapgolly.reactNativeMaps.anon.Android
import typingsJapgolly.reactNativeMaps.libMapCalloutMod.MapCallout
import typingsJapgolly.reactNativeMaps.libMapCalloutSubviewMod.MapCalloutSubview
import typingsJapgolly.reactNativeMaps.libMapCircleMod.MapCircle
import typingsJapgolly.reactNativeMaps.libMapCircleMod.MapCircleProps
import typingsJapgolly.reactNativeMaps.libMapHeatmapMod.MapHeatmap
import typingsJapgolly.reactNativeMaps.libMapHeatmapMod.MapHeatmapProps
import typingsJapgolly.reactNativeMaps.libMapLocalTileMod.MapLocalTile
import typingsJapgolly.reactNativeMaps.libMapPolygonMod.MapPolygon
import typingsJapgolly.reactNativeMaps.libMapPolygonMod.MapPolygonProps
import typingsJapgolly.reactNativeMaps.libMapPolylineMod.MapPolyline
import typingsJapgolly.reactNativeMaps.libMapPolylineMod.MapPolylineProps
import typingsJapgolly.reactNativeMaps.libMapUrlTileMod.MapUrlTile
import typingsJapgolly.reactNativeMaps.libMapWMSTileMod.MapWMSTile
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Provider
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.AIRGoogleMap
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.AIRMap
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecorateMapComponentMod {
  
  @JSImport("react-native-maps/lib/decorateMapComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Type /* <: Component */](Component: Type, componentName: ComponentName, providers: Providers): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], providers.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "NOT_SUPPORTED")
  @js.native
  val NOT_SUPPORTED: ImplementationStatus = js.native
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "ProviderContext")
  @js.native
  val ProviderContext: Context[Provider] = js.native
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "SUPPORTED")
  @js.native
  val SUPPORTED: ImplementationStatus = js.native
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "USES_DEFAULT_IMPLEMENTATION")
  @js.native
  val USES_DEFAULT_IMPLEMENTATION: ImplementationStatus = js.native
  
  inline def createNotSupportedComponent(message: String): js.Function0[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNotSupportedComponent")(message.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Null]]
  
  inline def getNativeMapName(provider: Provider): AIRMap | AIRGoogleMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeMapName")(provider.asInstanceOf[js.Any]).asInstanceOf[AIRMap | AIRGoogleMap]
  
  @JSImport("react-native-maps/lib/decorateMapComponent", "googleMapIsInstalled")
  @js.native
  val googleMapIsInstalled: /* true */ Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - org.scalablytyped.runtime.Instantiable0[
  typingsJapgolly.reactNativeMaps.libMapCalloutMod.MapCallout | typingsJapgolly.reactNativeMaps.libMapCalloutSubviewMod.MapCalloutSubview | typingsJapgolly.reactNativeMaps.libMapLocalTileMod.MapLocalTile | typingsJapgolly.reactNativeMaps.libMapUrlTileMod.MapUrlTile | typingsJapgolly.reactNativeMaps.libMapWMSTileMod.MapWMSTile]
    - org.scalablytyped.runtime.Instantiable1[
  (/ * props * / typingsJapgolly.reactNativeMaps.libMapCircleMod.MapCircleProps) | (/ * props * / typingsJapgolly.reactNativeMaps.libMapHeatmapMod.MapHeatmapProps) | (/ * props * / typingsJapgolly.reactNativeMaps.libMapPolygonMod.MapPolygonProps) | (/ * props * / typingsJapgolly.reactNativeMaps.libMapPolylineMod.MapPolylineProps), 
  typingsJapgolly.reactNativeMaps.libMapCircleMod.MapCircle | typingsJapgolly.reactNativeMaps.libMapHeatmapMod.MapHeatmap | typingsJapgolly.reactNativeMaps.libMapPolygonMod.MapPolygon | typingsJapgolly.reactNativeMaps.libMapPolylineMod.MapPolyline]
    - typingsJapgolly.reactNativeMaps.anon.TypeofMapMarker
    - typingsJapgolly.reactNativeMaps.anon.TypeofMapOverlay
  */
  type Component = _Component | (Instantiable0[MapCallout | MapCalloutSubview | MapLocalTile | MapUrlTile | MapWMSTile]) | (Instantiable1[
    (/* props */ MapCircleProps) | (/* props */ MapHeatmapProps) | (/* props */ MapPolygonProps) | (/* props */ MapPolylineProps), 
    MapCircle | MapHeatmap | MapPolygon | MapPolyline
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Callout
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.CalloutSubview
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Circle
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Heatmap
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.LocalTile
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Marker
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Overlay
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Polygon
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Polyline
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.UrlTile
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.WMSTile
  */
  trait ComponentName extends StObject
  object ComponentName {
    
    inline def Callout: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Callout = "Callout".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Callout]
    
    inline def CalloutSubview: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.CalloutSubview = "CalloutSubview".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.CalloutSubview]
    
    inline def Circle: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Circle = "Circle".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Circle]
    
    inline def Heatmap: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Heatmap = "Heatmap".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Heatmap]
    
    inline def LocalTile: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.LocalTile = "LocalTile".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.LocalTile]
    
    inline def Marker: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Marker = "Marker".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Marker]
    
    inline def Overlay: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Overlay = "Overlay".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Overlay]
    
    inline def Polygon: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Polygon = "Polygon".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Polygon]
    
    inline def Polyline: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Polyline = "Polyline".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.Polyline]
    
    inline def UrlTile: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.UrlTile = "UrlTile".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.UrlTile]
    
    inline def WMSTile: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.WMSTile = "WMSTile".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.WMSTile]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.SUPPORTED
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.USES_DEFAULT_IMPLEMENTATION
    - typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.NOT_SUPPORTED
  */
  trait ImplementationStatus extends StObject
  object ImplementationStatus {
    
    inline def NOT_SUPPORTED: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.NOT_SUPPORTED = "NOT_SUPPORTED".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.NOT_SUPPORTED]
    
    inline def SUPPORTED: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.SUPPORTED = "SUPPORTED".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.SUPPORTED]
    
    inline def USES_DEFAULT_IMPLEMENTATION: typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.USES_DEFAULT_IMPLEMENTATION = "USES_DEFAULT_IMPLEMENTATION".asInstanceOf[typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.USES_DEFAULT_IMPLEMENTATION]
  }
  
  type MapManagerCommand = Any
  
  type NativeComponent[H] = HostComponent[H] | (ReturnType[js.Function1[/* message */ String, js.Function0[Null]]])
  
  trait Providers extends StObject {
    
    var google: Android
  }
  object Providers {
    
    inline def apply(google: Android): Providers = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
      __obj.asInstanceOf[Providers]
    }
    
    extension [Self <: Providers](x: Self) {
      
      inline def setGoogle(value: Android): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
    }
  }
  
  type UIManagerCommand = Double
  
  trait _Component extends StObject
}
