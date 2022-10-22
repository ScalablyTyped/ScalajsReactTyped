package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNativeMaps.anon.TypeofMapMarker
import typingsJapgolly.reactNativeMaps.libMapMarkerMod.MapMarkerProps
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapMarker {
  
  inline def apply(coordinate: LatLng): SharedBuilder_MapMarkerProps_165459233[typingsJapgolly.reactNativeMaps.libMod.MapMarker] = {
    val __props = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    new SharedBuilder_MapMarkerProps_165459233[typingsJapgolly.reactNativeMaps.libMod.MapMarker](js.Array(this.component, __props.asInstanceOf[MapMarkerProps]))
  }
  
  object Animated {
    
    @JSImport("react-native-maps/lib", "MapMarker.Animated")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Animated.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: AnimatedProps[ComponentPropsWithRef[TypeofMapMarker]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-maps/lib", "MapMarker")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapMarkerProps): SharedBuilder_MapMarkerProps_165459233[typingsJapgolly.reactNativeMaps.libMod.MapMarker] = new SharedBuilder_MapMarkerProps_165459233[typingsJapgolly.reactNativeMaps.libMod.MapMarker](js.Array(this.component, p.asInstanceOf[js.Any]))
}
