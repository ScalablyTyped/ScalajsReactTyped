package typingsJapgolly.reactNativeMaps.components

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNativeMaps.anon.TypeofMapView
import typingsJapgolly.reactNativeMaps.libMapViewMod.MapViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnimatedMapView {
  
  @JSImport("react-native-maps/lib/MapView", "AnimatedMapView")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: AnimatedMapView.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: AnimatedProps[
      ComponentPropsWithRef[
        TypeofMapView & (Instantiable1[/* props */ MapViewProps, typingsJapgolly.reactNativeMaps.libMapViewMod.MapView])
      ]
    ]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
