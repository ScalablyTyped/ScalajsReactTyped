package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.EdgeInsets
import typingsJapgolly.reactNavigationStack.anon.Height
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.GestureDirection
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Layout
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Scene
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolatedStyle
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolationProps
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderStyleInterpolator
import typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.float
import typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsHeaderHeaderContainerMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasModeScenesLayoutInsetsGetPreviousSceneGetFocusedRouteOnContentHeightChangeGestureDirectionStyleInterpolatorStyle: Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasModeScenesLayoutInsetsGetPreviousSceneGetFocusedRouteOnContentHeightChangeGestureDirectionStyleInterpolatorStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var gestureDirection: GestureDirection
    
    def getFocusedRoute(): Route[String]
    
    def getPreviousScene(props: typingsJapgolly.reactNavigationStack.anon.Route): js.UndefOr[Scene[Route[String]]]
    
    var insets: EdgeInsets
    
    var layout: Layout
    
    var mode: float | screen
    
    var onContentHeightChange: js.UndefOr[js.Function1[/* props */ Height, Unit]] = js.undefined
    
    var scenes: js.Array[js.UndefOr[Scene[Route[String]]]]
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styleInterpolator: StackHeaderStyleInterpolator
  }
  object Props {
    
    inline def apply(
      gestureDirection: GestureDirection,
      getFocusedRoute: CallbackTo[Route[String]],
      getPreviousScene: typingsJapgolly.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]],
      insets: EdgeInsets,
      layout: Layout,
      mode: float | screen,
      scenes: js.Array[js.UndefOr[Scene[Route[String]]]],
      styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
    ): Props = {
      val __obj = js.Dynamic.literal(gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = getFocusedRoute.toJsFn, getPreviousScene = js.Any.fromFunction1(getPreviousScene), insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
      
      inline def setGetFocusedRoute(value: CallbackTo[Route[String]]): Self = StObject.set(x, "getFocusedRoute", value.toJsFn)
      
      inline def setGetPreviousScene(value: typingsJapgolly.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]]): Self = StObject.set(x, "getPreviousScene", js.Any.fromFunction1(value))
      
      inline def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setMode(value: float | screen): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOnContentHeightChange(value: /* props */ Height => Callback): Self = StObject.set(x, "onContentHeightChange", js.Any.fromFunction1((t0: /* props */ Height) => value(t0).runNow()))
      
      inline def setOnContentHeightChangeUndefined: Self = StObject.set(x, "onContentHeightChange", js.undefined)
      
      inline def setScenes(value: js.Array[js.UndefOr[Scene[Route[String]]]]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
      
      inline def setScenesVarargs(value: js.UndefOr[Scene[Route[String]]]*): Self = StObject.set(x, "scenes", js.Array(value*))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "styleInterpolator", js.Any.fromFunction1(value))
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
