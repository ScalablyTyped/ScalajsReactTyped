package typingsJapgolly.reactNativeTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.mod.PanGestureHandler
import typingsJapgolly.reactNativeTabView.AnonDamping
import typingsJapgolly.reactNativeTabView.AnonDuration
import typingsJapgolly.reactNativeTabView.AnonHeight
import typingsJapgolly.reactNativeTabView.AnonNavigationState
import typingsJapgolly.reactNativeTabView.AnonRoute
import typingsJapgolly.reactNativeTabView.pagerMod.Props
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.bottom
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.none
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.top
import typingsJapgolly.reactNativeTabView.tabViewMod.default
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import typingsJapgolly.reactNativeTabView.typesMod.SceneRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabView {
  def apply[T /* <: Route */](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    springConfig: AnonDamping,
    swipeEnabled: Boolean,
    tabBarPosition: top | bottom,
    timingConfig: AnonDuration,
    `lazy`: Boolean,
    onIndexChange: Double => Callback,
    renderLazyPlaceholder: AnonRoute[T] => CallbackTo[Node],
    renderPager: Props[T] => CallbackTo[Node],
    renderScene: SceneRendererProps with AnonRoute[T] => CallbackTo[Node],
    renderTabBar: SceneRendererProps with AnonNavigationState[T] => CallbackTo[Node],
    initialLayout: AnonHeight = null,
    onSwipeEnd: js.UndefOr[Callback] = js.undefined,
    onSwipeStart: js.UndefOr[Callback] = js.undefined,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    sceneContainerStyle: StyleProp[ViewStyle] = null,
    springVelocityScale: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    swipeVelocityImpact: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactNativeTabView.tabViewMod.Props[T], 
    default[T], 
    Unit, 
    typingsJapgolly.reactNativeTabView.tabViewMod.Props[T]
  ] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
  
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1((t0: scala.Double) => onIndexChange(t0).runNow()))
    __obj.updateDynamic("renderLazyPlaceholder")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.AnonRoute[T]) => renderLazyPlaceholder(t0).runNow()))
    __obj.updateDynamic("renderPager")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.pagerMod.Props[T]) => renderPager(t0).runNow()))
    __obj.updateDynamic("renderScene")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.SceneRendererProps with typingsJapgolly.reactNativeTabView.AnonRoute[T]) => renderScene(t0).runNow()))
    __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.SceneRendererProps with typingsJapgolly.reactNativeTabView.AnonNavigationState[T]) => renderTabBar(t0).runNow()))
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout.asInstanceOf[js.Any])
    onSwipeEnd.foreach(p => __obj.updateDynamic("onSwipeEnd")(p.toJsFn))
    onSwipeStart.foreach(p => __obj.updateDynamic("onSwipeStart")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (springVelocityScale != null) __obj.updateDynamic("springVelocityScale")(springVelocityScale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeVelocityImpact != null) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeTabView.tabViewMod.Props[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeTabView.tabViewMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeTabView.tabViewMod.Props[T]])(children: _*)
  }
  @JSImport("react-native-tab-view/lib/typescript/src/TabView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

