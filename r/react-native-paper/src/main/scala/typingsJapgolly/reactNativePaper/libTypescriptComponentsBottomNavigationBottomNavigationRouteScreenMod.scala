package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponent
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativePaper.reactNativePaperInts.`0`
import typingsJapgolly.reactNativePaper.reactNativePaperInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsBottomNavigationBottomNavigationRouteScreenMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/BottomNavigation/BottomNavigationRouteScreen", JSImport.Default)
  @js.native
  val default: AnimatedComponent[Instantiable0[BottomNavigationRouteScreen]] = js.native
  
  @js.native
  trait BottomNavigationRouteScreen
    extends Component[Props, js.Object, Any]
  
  trait Props
    extends StObject
       with ViewProps {
    
    var index: Double
    
    var visibility: js.UndefOr[`0` | `1` | (AnimatedInterpolation[Double | String])] = js.undefined
  }
  object Props {
    
    inline def apply(index: Double): Props = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: `0` | `1` | (AnimatedInterpolation[Double | String])): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
  
  type _To = AnimatedComponent[Instantiable0[BottomNavigationRouteScreen]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsBottomNavigationBottomNavigationRouteScreenMod.foo` */
  override def _to: AnimatedComponent[Instantiable0[BottomNavigationRouteScreen]] = default
}
