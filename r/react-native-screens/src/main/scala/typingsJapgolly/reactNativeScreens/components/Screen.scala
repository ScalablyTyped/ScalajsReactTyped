package typingsJapgolly.reactNativeScreens.components

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Screen {
  
  @JSImport("react-native-screens", "Screen")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Screen.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: AnimatedProps[
      ComponentPropsWithRef[Instantiable0[typingsJapgolly.reactNativeScreens.mod.NativeScreen]]
    ]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
