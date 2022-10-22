package typingsJapgolly.reactNativeMaps.components

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNativeMaps.anon.TypeofMapView
import typingsJapgolly.reactNativeMaps.libMapViewMod.MapViewProps
import typingsJapgolly.reactNativeMaps.libMapViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapView {
  
  object Animated {
    
    @JSImport("react-native-maps/lib/MapView", "default.Animated")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Animated.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(
      p: AnimatedProps[
          ComponentPropsWithRef[
            TypeofMapView & (Instantiable1[/* props */ MapViewProps, typingsJapgolly.reactNativeMaps.libMapViewMod.MapView])
          ]
        ]
    ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-maps/lib/MapView", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MapView.type): SharedBuilder_MapViewProps676906321[default] = new SharedBuilder_MapViewProps676906321[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapViewProps): SharedBuilder_MapViewProps676906321[default] = new SharedBuilder_MapViewProps676906321[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
