package typingsJapgolly.reactNativeTabView

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.anon.Loading
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.EventEmitterProps
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Layout
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Listener
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.NavigationState
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Route
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.SceneRendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSceneViewMod {
  
  @JSImport("react-native-tab-view/lib/typescript/SceneView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Route */](hasChildrenNavigationStateLazyLayoutIndexLazyPreloadDistanceAddEnterListenerStyle: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenNavigationStateLazyLayoutIndexLazyPreloadDistanceAddEnterListenerStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[T /* <: Route */]
    extends StObject
       with SceneRendererProps
       with EventEmitterProps {
    
    def children(props: Loading): Node
    
    var index: Double
    
    var `lazy`: Boolean
    
    var lazyPreloadDistance: Double
    
    var navigationState: NavigationState[T]
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object Props {
    
    inline def apply[T /* <: Route */](
      addEnterListener: Listener => js.Function0[Unit],
      children: Loading => Node,
      index: Double,
      jumpTo: String => Callback,
      layout: Layout,
      `lazy`: Boolean,
      lazyPreloadDistance: Double,
      navigationState: NavigationState[T],
      position: AnimatedInterpolation[Double | String]
    ): Props[T] = {
      val __obj = js.Dynamic.literal(addEnterListener = js.Any.fromFunction1(addEnterListener), children = js.Any.fromFunction1(children), index = index.asInstanceOf[js.Any], jumpTo = js.Any.fromFunction1((t0: String) => jumpTo(t0).runNow()), layout = layout.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setChildren(value: Loading => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyPreloadDistance(value: Double): Self = StObject.set(x, "lazyPreloadDistance", value.asInstanceOf[js.Any])
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
