package typingsJapgolly.reactNativeTabView

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSceneMapMod {
  
  @JSImport("react-native-tab-view/lib/typescript/SceneMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Any */](scenes: StringDictionary[ComponentType[T]]): js.Function1[/* hasRouteJumpToPosition */ SceneProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scenes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasRouteJumpToPosition */ SceneProps, Element]]
  
  /* Inlined {  route :any} & std.Omit<react-native-tab-view.react-native-tab-view/lib/typescript/types.SceneRendererProps, 'layout'> */
  trait SceneProps extends StObject {
    
    var jumpTo: js.Function1[/* key */ String, Unit]
    
    var position: AnimatedInterpolation[Double | String]
    
    var route: Any
  }
  object SceneProps {
    
    inline def apply(jumpTo: /* key */ String => Callback, position: AnimatedInterpolation[Double | String], route: Any): SceneProps = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1((t0: /* key */ String) => jumpTo(t0).runNow()), position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneProps]
    }
    
    extension [Self <: SceneProps](x: Self) {
      
      inline def setJumpTo(value: /* key */ String => Callback): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1((t0: /* key */ String) => value(t0).runNow()))
      
      inline def setPosition(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
