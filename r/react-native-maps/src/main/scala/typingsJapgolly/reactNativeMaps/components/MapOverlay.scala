package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNative.mod.ImageRequireSource
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNativeMaps.anon.TypeofMapOverlay
import typingsJapgolly.reactNativeMaps.libMapOverlayMod.Coordinate
import typingsJapgolly.reactNativeMaps.libMapOverlayMod.MapOverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapOverlay {
  
  inline def apply(bounds: js.Tuple2[Coordinate, Coordinate], image: ImageURISource | ImageRequireSource): SharedBuilder_MapOverlayProps469294677[typingsJapgolly.reactNativeMaps.libMod.MapOverlay] = {
    val __props = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    new SharedBuilder_MapOverlayProps469294677[typingsJapgolly.reactNativeMaps.libMod.MapOverlay](js.Array(this.component, __props.asInstanceOf[MapOverlayProps]))
  }
  
  object Animated {
    
    @JSImport("react-native-maps/lib", "MapOverlay.Animated")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Animated.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: AnimatedProps[ComponentPropsWithRef[TypeofMapOverlay]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-maps/lib", "MapOverlay")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MapOverlayProps): SharedBuilder_MapOverlayProps469294677[typingsJapgolly.reactNativeMaps.libMod.MapOverlay] = new SharedBuilder_MapOverlayProps469294677[typingsJapgolly.reactNativeMaps.libMod.MapOverlay](js.Array(this.component, p.asInstanceOf[js.Any]))
}
