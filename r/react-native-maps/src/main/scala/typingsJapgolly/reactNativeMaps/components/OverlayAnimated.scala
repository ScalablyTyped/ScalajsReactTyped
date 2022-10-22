package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNativeMaps.anon.TypeofMapOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OverlayAnimated {
  
  @JSImport("react-native-maps/lib", "OverlayAnimated")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: OverlayAnimated.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AnimatedProps[ComponentPropsWithRef[TypeofMapOverlay]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
