package typingsJapgolly.reactNativePaper.components

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BottomNavigationRouteScreen {
  
  @JSImport("react-native-paper/lib/typescript/components/BottomNavigation/BottomNavigationRouteScreen", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BottomNavigationRouteScreen.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: AnimatedProps[
      ComponentPropsWithRef[
        Instantiable0[
          typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationRouteScreenMod.BottomNavigationRouteScreen
        ]
      ]
    ]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
