package typingsJapgolly.reactNativeMaps.components

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNativeMaps.anon.TypeofMapView
import typingsJapgolly.reactNativeMaps.libMapViewMod.MapViewProps
import typingsJapgolly.reactNativeMaps.libMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lib {
  
  object Animated {
    
    @JSImport("react-native-maps/lib", "default.Animated")
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
  
  @JSImport("react-native-maps/lib", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Lib.type): SharedBuilder_MapViewProps676906321[default] = new SharedBuilder_MapViewProps676906321[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapViewProps): SharedBuilder_MapViewProps676906321[default] = new SharedBuilder_MapViewProps676906321[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
