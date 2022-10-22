package typingsJapgolly.reactNativeMaps

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.HostComponent
import typingsJapgolly.reactNativeMaps.anon.PartialCamera
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.EdgePadding
import typingsJapgolly.reactNativeMaps.libMapViewMod.NativeProps
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Region
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapViewNativeComponentMod {
  
  @JSImport("react-native-maps/lib/MapViewNativeComponent", "Commands")
  @js.native
  val Commands: NativeCommands = js.native
  
  type MapViewNativeComponentType = HostComponent[NativeProps]
  
  trait NativeCommands extends StObject {
    
    def animateCamera(viewRef: NonNullable[MapViewNativeComponentType | Null], camera: PartialCamera, duration: Double): Unit
    
    def animateToRegion(viewRef: NonNullable[MapViewNativeComponentType | Null], region: Region, duration: Double): Unit
    
    def fitToCoordinates(
      viewRef: NonNullable[MapViewNativeComponentType | Null],
      coordinates: js.Array[LatLng],
      edgePadding: EdgePadding,
      animated: Boolean
    ): Unit
    
    def fitToElements(
      viewRef: NonNullable[MapViewNativeComponentType | Null],
      edgePadding: EdgePadding,
      animated: Boolean
    ): Unit
    
    def fitToSuppliedMarkers(
      viewRef: NonNullable[MapViewNativeComponentType | Null],
      markers: js.Array[String],
      edgePadding: EdgePadding,
      animated: Boolean
    ): Unit
    
    def setCamera(viewRef: NonNullable[MapViewNativeComponentType | Null], camera: PartialCamera): Unit
    
    def setIndoorActiveLevelIndex(viewRef: NonNullable[MapViewNativeComponentType | Null], activeLevelIndex: Double): Unit
    
    def setMapBoundaries(viewRef: NonNullable[MapViewNativeComponentType | Null], northEast: LatLng, southWest: LatLng): Unit
  }
  object NativeCommands {
    
    inline def apply(
      animateCamera: (NonNullable[MapViewNativeComponentType | Null], PartialCamera, Double) => Callback,
      animateToRegion: (NonNullable[MapViewNativeComponentType | Null], Region, Double) => Callback,
      fitToCoordinates: (NonNullable[MapViewNativeComponentType | Null], js.Array[LatLng], EdgePadding, Boolean) => Callback,
      fitToElements: (NonNullable[MapViewNativeComponentType | Null], EdgePadding, Boolean) => Callback,
      fitToSuppliedMarkers: (NonNullable[MapViewNativeComponentType | Null], js.Array[String], EdgePadding, Boolean) => Callback,
      setCamera: (NonNullable[MapViewNativeComponentType | Null], PartialCamera) => Callback,
      setIndoorActiveLevelIndex: (NonNullable[MapViewNativeComponentType | Null], Double) => Callback,
      setMapBoundaries: (NonNullable[MapViewNativeComponentType | Null], LatLng, LatLng) => Callback
    ): NativeCommands = {
      val __obj = js.Dynamic.literal(animateCamera = js.Any.fromFunction3((t0: NonNullable[MapViewNativeComponentType | Null], t1: PartialCamera, t2: Double) => (animateCamera(t0, t1, t2)).runNow()), animateToRegion = js.Any.fromFunction3((t0: NonNullable[MapViewNativeComponentType | Null], t1: Region, t2: Double) => (animateToRegion(t0, t1, t2)).runNow()), fitToCoordinates = js.Any.fromFunction4((t0: NonNullable[MapViewNativeComponentType | Null], t1: js.Array[LatLng], t2: EdgePadding, t3: Boolean) => (fitToCoordinates(t0, t1, t2, t3)).runNow()), fitToElements = js.Any.fromFunction3((t0: NonNullable[MapViewNativeComponentType | Null], t1: EdgePadding, t2: Boolean) => (fitToElements(t0, t1, t2)).runNow()), fitToSuppliedMarkers = js.Any.fromFunction4((t0: NonNullable[MapViewNativeComponentType | Null], t1: js.Array[String], t2: EdgePadding, t3: Boolean) => (fitToSuppliedMarkers(t0, t1, t2, t3)).runNow()), setCamera = js.Any.fromFunction2((t0: NonNullable[MapViewNativeComponentType | Null], t1: PartialCamera) => (setCamera(t0, t1)).runNow()), setIndoorActiveLevelIndex = js.Any.fromFunction2((t0: NonNullable[MapViewNativeComponentType | Null], t1: Double) => (setIndoorActiveLevelIndex(t0, t1)).runNow()), setMapBoundaries = js.Any.fromFunction3((t0: NonNullable[MapViewNativeComponentType | Null], t1: LatLng, t2: LatLng) => (setMapBoundaries(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[NativeCommands]
    }
    
    extension [Self <: NativeCommands](x: Self) {
      
      inline def setAnimateCamera(value: (NonNullable[MapViewNativeComponentType | Null], PartialCamera, Double) => Callback): Self = StObject.set(x, "animateCamera", js.Any.fromFunction3((t0: NonNullable[MapViewNativeComponentType | Null], t1: PartialCamera, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setAnimateToRegion(value: (NonNullable[MapViewNativeComponentType | Null], Region, Double) => Callback): Self = StObject.set(x, "animateToRegion", js.Any.fromFunction3((t0: NonNullable[MapViewNativeComponentType | Null], t1: Region, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setFitToCoordinates(
        value: (NonNullable[MapViewNativeComponentType | Null], js.Array[LatLng], EdgePadding, Boolean) => Callback
      ): Self = StObject.set(x, "fitToCoordinates", js.Any.fromFunction4((t0: NonNullable[MapViewNativeComponentType | Null], t1: js.Array[LatLng], t2: EdgePadding, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setFitToElements(value: (NonNullable[MapViewNativeComponentType | Null], EdgePadding, Boolean) => Callback): Self = StObject.set(x, "fitToElements", js.Any.fromFunction3((t0: NonNullable[MapViewNativeComponentType | Null], t1: EdgePadding, t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setFitToSuppliedMarkers(
        value: (NonNullable[MapViewNativeComponentType | Null], js.Array[String], EdgePadding, Boolean) => Callback
      ): Self = StObject.set(x, "fitToSuppliedMarkers", js.Any.fromFunction4((t0: NonNullable[MapViewNativeComponentType | Null], t1: js.Array[String], t2: EdgePadding, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setSetCamera(value: (NonNullable[MapViewNativeComponentType | Null], PartialCamera) => Callback): Self = StObject.set(x, "setCamera", js.Any.fromFunction2((t0: NonNullable[MapViewNativeComponentType | Null], t1: PartialCamera) => (value(t0, t1)).runNow()))
      
      inline def setSetIndoorActiveLevelIndex(value: (NonNullable[MapViewNativeComponentType | Null], Double) => Callback): Self = StObject.set(x, "setIndoorActiveLevelIndex", js.Any.fromFunction2((t0: NonNullable[MapViewNativeComponentType | Null], t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setSetMapBoundaries(value: (NonNullable[MapViewNativeComponentType | Null], LatLng, LatLng) => Callback): Self = StObject.set(x, "setMapBoundaries", js.Any.fromFunction3((t0: NonNullable[MapViewNativeComponentType | Null], t1: LatLng, t2: LatLng) => (value(t0, t1, t2)).runNow()))
    }
  }
}
