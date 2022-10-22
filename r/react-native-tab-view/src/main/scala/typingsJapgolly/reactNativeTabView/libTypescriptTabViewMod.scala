package typingsJapgolly.reactNativeTabView

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.Orientation
import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.OverScrollMode
import typingsJapgolly.reactNativeTabView.anon.PartialLayout
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.NavigationState
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Route
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.SceneRendererProps
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.bottom
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.locale
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.ltr
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.none
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.rtl
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTabViewMod {
  
  @JSImport("react-native-tab-view/lib/typescript/TabView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Route */](
    hasOnIndexChangeNavigationStateRenderSceneInitialLayoutKeyboardDismissModeLazyLazyPreloadDistanceOnSwipeStartOnSwipeEndRenderLazyPlaceholderRenderTabBarSceneContainerStylePagerStyleStyleSwipeEnabledTabBarPositionAnimationEnabled: Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOnIndexChangeNavigationStateRenderSceneInitialLayoutKeyboardDismissModeLazyLazyPreloadDistanceOnSwipeStartOnSwipeEndRenderLazyPlaceholderRenderTabBarSceneContainerStylePagerStyleStyleSwipeEnabledTabBarPositionAnimationEnabled.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/types.PagerProps & {onIndexChange (index : number): void,   navigationState :react-native-tab-view.react-native-tab-view/lib/typescript/types.NavigationState<T>, renderScene (props : react-native-tab-view.react-native-tab-view/lib/typescript/types.SceneRendererProps & {  route :T}): react.react.ReactNode,   renderLazyPlaceholder :(props : {  route :T}): react.react.ReactNode | undefined,   renderTabBar :(props : react-native-tab-view.react-native-tab-view/lib/typescript/types.SceneRendererProps & {  navigationState :react-native-tab-view.react-native-tab-view/lib/typescript/types.NavigationState<T>}): react.react.ReactNode | undefined,   tabBarPosition :'top' | 'bottom' | undefined,   initialLayout :std.Partial<react-native-tab-view.react-native-tab-view/lib/typescript/types.Layout> | undefined,   lazy :(props : {  route :T}): boolean | boolean | undefined,   lazyPreloadDistance :number | undefined,   sceneContainerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   pagerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   style :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined} */
  trait Props[T /* <: Route */] extends StObject {
    
    var animationEnabled: js.UndefOr[Boolean] = js.undefined
    
    var initialLayout: js.UndefOr[PartialLayout] = js.undefined
    
    var keyboardDismissMode: js.UndefOr[none | `on-drag` | auto] = js.undefined
    
    var layoutDirection: js.UndefOr[rtl | ltr | locale] = js.undefined
    
    var `lazy`: js.UndefOr[
        (js.Function1[/* props */ typingsJapgolly.reactNativeTabView.anon.Route[T], Boolean]) | Boolean
      ] = js.undefined
    
    var lazyPreloadDistance: js.UndefOr[Double] = js.undefined
    
    var navigationState: NavigationState[T]
    
    var offscreenPageLimit: js.UndefOr[Double] = js.undefined
    
    def onIndexChange(index: Double): Unit
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var overScrollMode: js.UndefOr[OverScrollMode] = js.undefined
    
    var overdrag: js.UndefOr[Boolean] = js.undefined
    
    var pageMargin: js.UndefOr[Double] = js.undefined
    
    var pagerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var renderLazyPlaceholder: js.UndefOr[js.Function1[/* props */ typingsJapgolly.reactNativeTabView.anon.Route[T], Node]] = js.undefined
    
    def renderScene(props: SceneRendererProps & typingsJapgolly.reactNativeTabView.anon.Route[T]): Node
    
    var renderTabBar: js.UndefOr[
        js.Function1[
          /* props */ SceneRendererProps & typingsJapgolly.reactNativeTabView.anon.NavigationState[T], 
          Node
        ]
      ] = js.undefined
    
    var sceneContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var showPageIndicator: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var swipeEnabled: js.UndefOr[Boolean] = js.undefined
    
    var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
  }
  object Props {
    
    inline def apply[T /* <: Route */](
      navigationState: NavigationState[T],
      onIndexChange: Double => Callback,
      renderScene: SceneRendererProps & typingsJapgolly.reactNativeTabView.anon.Route[T] => Node
    ): Props[T] = {
      val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1((t0: Double) => onIndexChange(t0).runNow()), renderScene = js.Any.fromFunction1(renderScene))
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
      
      inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
      
      inline def setInitialLayout(value: PartialLayout): Self = StObject.set(x, "initialLayout", value.asInstanceOf[js.Any])
      
      inline def setInitialLayoutUndefined: Self = StObject.set(x, "initialLayout", js.undefined)
      
      inline def setKeyboardDismissMode(value: none | `on-drag` | auto): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setLayoutDirection(value: rtl | ltr | locale): Self = StObject.set(x, "layoutDirection", value.asInstanceOf[js.Any])
      
      inline def setLayoutDirectionUndefined: Self = StObject.set(x, "layoutDirection", js.undefined)
      
      inline def setLazy(
        value: (js.Function1[/* props */ typingsJapgolly.reactNativeTabView.anon.Route[T], Boolean]) | Boolean
      ): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyFunction1(value: /* props */ typingsJapgolly.reactNativeTabView.anon.Route[T] => Boolean): Self = StObject.set(x, "lazy", js.Any.fromFunction1(value))
      
      inline def setLazyPreloadDistance(value: Double): Self = StObject.set(x, "lazyPreloadDistance", value.asInstanceOf[js.Any])
      
      inline def setLazyPreloadDistanceUndefined: Self = StObject.set(x, "lazyPreloadDistance", js.undefined)
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setOffscreenPageLimit(value: Double): Self = StObject.set(x, "offscreenPageLimit", value.asInstanceOf[js.Any])
      
      inline def setOffscreenPageLimitUndefined: Self = StObject.set(x, "offscreenPageLimit", js.undefined)
      
      inline def setOnIndexChange(value: Double => Callback): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOnSwipeEnd(value: Callback): Self = StObject.set(x, "onSwipeEnd", value.toJsFn)
      
      inline def setOnSwipeEndUndefined: Self = StObject.set(x, "onSwipeEnd", js.undefined)
      
      inline def setOnSwipeStart(value: Callback): Self = StObject.set(x, "onSwipeStart", value.toJsFn)
      
      inline def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverScrollMode(value: OverScrollMode): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
      
      inline def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
      
      inline def setOverdrag(value: Boolean): Self = StObject.set(x, "overdrag", value.asInstanceOf[js.Any])
      
      inline def setOverdragUndefined: Self = StObject.set(x, "overdrag", js.undefined)
      
      inline def setPageMargin(value: Double): Self = StObject.set(x, "pageMargin", value.asInstanceOf[js.Any])
      
      inline def setPageMarginUndefined: Self = StObject.set(x, "pageMargin", js.undefined)
      
      inline def setPagerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pagerStyle", value.asInstanceOf[js.Any])
      
      inline def setPagerStyleNull: Self = StObject.set(x, "pagerStyle", null)
      
      inline def setPagerStyleUndefined: Self = StObject.set(x, "pagerStyle", js.undefined)
      
      inline def setRenderLazyPlaceholder(value: /* props */ typingsJapgolly.reactNativeTabView.anon.Route[T] => Node): Self = StObject.set(x, "renderLazyPlaceholder", js.Any.fromFunction1(value))
      
      inline def setRenderLazyPlaceholderUndefined: Self = StObject.set(x, "renderLazyPlaceholder", js.undefined)
      
      inline def setRenderScene(value: SceneRendererProps & typingsJapgolly.reactNativeTabView.anon.Route[T] => Node): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
      
      inline def setRenderTabBar(
        value: /* props */ SceneRendererProps & typingsJapgolly.reactNativeTabView.anon.NavigationState[T] => Node
      ): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction1(value))
      
      inline def setRenderTabBarUndefined: Self = StObject.set(x, "renderTabBar", js.undefined)
      
      inline def setSceneContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "sceneContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setSceneContainerStyleNull: Self = StObject.set(x, "sceneContainerStyle", null)
      
      inline def setSceneContainerStyleUndefined: Self = StObject.set(x, "sceneContainerStyle", js.undefined)
      
      inline def setShowPageIndicator(value: Boolean): Self = StObject.set(x, "showPageIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowPageIndicatorUndefined: Self = StObject.set(x, "showPageIndicator", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwipeEnabled(value: Boolean): Self = StObject.set(x, "swipeEnabled", value.asInstanceOf[js.Any])
      
      inline def setSwipeEnabledUndefined: Self = StObject.set(x, "swipeEnabled", js.undefined)
      
      inline def setTabBarPosition(value: top | bottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      inline def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
    }
  }
}
