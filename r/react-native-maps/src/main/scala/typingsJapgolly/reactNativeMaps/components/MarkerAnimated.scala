package typingsJapgolly.reactNativeMaps.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNativeMaps.anon.TypeofMapMarker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkerAnimated {
  
  @JSImport("react-native-maps/lib", "MarkerAnimated")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MarkerAnimated.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AnimatedProps[ComponentPropsWithRef[TypeofMapMarker]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
