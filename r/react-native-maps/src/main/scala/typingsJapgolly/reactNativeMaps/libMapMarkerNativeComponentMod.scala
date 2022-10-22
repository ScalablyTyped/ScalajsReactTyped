package typingsJapgolly.reactNativeMaps

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.HostComponent
import typingsJapgolly.reactNativeMaps.libMapMarkerMod.NativeProps
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapMarkerNativeComponentMod {
  
  @JSImport("react-native-maps/lib/MapMarkerNativeComponent", "Commands")
  @js.native
  val Commands: NativeCommands = js.native
  
  type MapMarkerNativeComponentType = HostComponent[NativeProps]
  
  trait NativeCommands extends StObject {
    
    def animateMarkerToCoordinate(viewRef: NonNullable[MapMarkerNativeComponentType | Null], coordinate: LatLng, duration: Double): Unit
    
    def hideCallout(viewRef: NonNullable[MapMarkerNativeComponentType | Null]): Unit
    
    def redraw(viewRef: NonNullable[MapMarkerNativeComponentType | Null]): Unit
    
    def redrawCallout(viewRef: NonNullable[MapMarkerNativeComponentType | Null]): Unit
    
    def showCallout(viewRef: NonNullable[MapMarkerNativeComponentType | Null]): Unit
  }
  object NativeCommands {
    
    inline def apply(
      animateMarkerToCoordinate: (NonNullable[MapMarkerNativeComponentType | Null], LatLng, Double) => Callback,
      hideCallout: NonNullable[MapMarkerNativeComponentType | Null] => Callback,
      redraw: NonNullable[MapMarkerNativeComponentType | Null] => Callback,
      redrawCallout: NonNullable[MapMarkerNativeComponentType | Null] => Callback,
      showCallout: NonNullable[MapMarkerNativeComponentType | Null] => Callback
    ): NativeCommands = {
      val __obj = js.Dynamic.literal(animateMarkerToCoordinate = js.Any.fromFunction3((t0: NonNullable[MapMarkerNativeComponentType | Null], t1: LatLng, t2: Double) => (animateMarkerToCoordinate(t0, t1, t2)).runNow()), hideCallout = js.Any.fromFunction1((t0: NonNullable[MapMarkerNativeComponentType | Null]) => hideCallout(t0).runNow()), redraw = js.Any.fromFunction1((t0: NonNullable[MapMarkerNativeComponentType | Null]) => redraw(t0).runNow()), redrawCallout = js.Any.fromFunction1((t0: NonNullable[MapMarkerNativeComponentType | Null]) => redrawCallout(t0).runNow()), showCallout = js.Any.fromFunction1((t0: NonNullable[MapMarkerNativeComponentType | Null]) => showCallout(t0).runNow()))
      __obj.asInstanceOf[NativeCommands]
    }
    
    extension [Self <: NativeCommands](x: Self) {
      
      inline def setAnimateMarkerToCoordinate(value: (NonNullable[MapMarkerNativeComponentType | Null], LatLng, Double) => Callback): Self = StObject.set(x, "animateMarkerToCoordinate", js.Any.fromFunction3((t0: NonNullable[MapMarkerNativeComponentType | Null], t1: LatLng, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setHideCallout(value: NonNullable[MapMarkerNativeComponentType | Null] => Callback): Self = StObject.set(x, "hideCallout", js.Any.fromFunction1((t0: NonNullable[MapMarkerNativeComponentType | Null]) => value(t0).runNow()))
      
      inline def setRedraw(value: NonNullable[MapMarkerNativeComponentType | Null] => Callback): Self = StObject.set(x, "redraw", js.Any.fromFunction1((t0: NonNullable[MapMarkerNativeComponentType | Null]) => value(t0).runNow()))
      
      inline def setRedrawCallout(value: NonNullable[MapMarkerNativeComponentType | Null] => Callback): Self = StObject.set(x, "redrawCallout", js.Any.fromFunction1((t0: NonNullable[MapMarkerNativeComponentType | Null]) => value(t0).runNow()))
      
      inline def setShowCallout(value: NonNullable[MapMarkerNativeComponentType | Null] => Callback): Self = StObject.set(x, "showCallout", js.Any.fromFunction1((t0: NonNullable[MapMarkerNativeComponentType | Null]) => value(t0).runNow()))
    }
  }
}
