package typingsJapgolly.reactNativeTabView.tabViewMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.mod.PanGestureHandler
import typingsJapgolly.reactNativeTabView.AnonDamping
import typingsJapgolly.reactNativeTabView.AnonDuration
import typingsJapgolly.reactNativeTabView.AnonHeight
import typingsJapgolly.reactNativeTabView.AnonNavigationState
import typingsJapgolly.reactNativeTabView.AnonRoute
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.bottom
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.none
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.top
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import typingsJapgolly.reactNativeTabView.typesMod.SceneRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.PagerCommonProps & {  position ? :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> * / any, onIndexChange (index : number): void,   navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>, renderScene (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  route  :T}): react.react.ReactNode, renderLazyPlaceholder (props : {  route  :T}): react.react.ReactNode, renderTabBar (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>}): react.react.ReactNode,   tabBarPosition  :'top' | 'bottom',   initialLayout ? :{  width ? :number,   height ? :number},   lazy  :boolean,   lazyPreloadDistance  :number,   removeClippedSubviews ? :boolean,   sceneContainerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   style ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   gestureHandlerProps  :react.react.ComponentProps<new (): react-native-gesture-handler.react-native-gesture-handler.PanGestureHandler>, renderPager (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/Pager.Props<T>): react.react.ReactNode} */
trait Props[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]]
  var initialLayout: js.UndefOr[AnonHeight] = js.undefined
  var keyboardDismissMode: none | `on-drag` | auto
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var navigationState: NavigationState[T]
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var position: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any
  ] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var sceneContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var springConfig: AnonDamping
  var springVelocityScale: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var swipeEnabled: Boolean
  var swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  var tabBarPosition: top | bottom
  var timingConfig: AnonDuration
  def onIndexChange(index: Double): Unit
  def renderLazyPlaceholder(props: AnonRoute[T]): Node
  def renderPager(props: typingsJapgolly.reactNativeTabView.pagerMod.Props[T]): Node
  def renderScene(props: SceneRendererProps with AnonRoute[T]): Node
  def renderTabBar(props: SceneRendererProps with AnonNavigationState[T]): Node
}

object Props {
  @scala.inline
  def apply[T /* <: Route */](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    onIndexChange: Double => Callback,
    renderLazyPlaceholder: AnonRoute[T] => CallbackTo[Node],
    renderPager: typingsJapgolly.reactNativeTabView.pagerMod.Props[T] => CallbackTo[Node],
    renderScene: SceneRendererProps with AnonRoute[T] => CallbackTo[Node],
    renderTabBar: SceneRendererProps with AnonNavigationState[T] => CallbackTo[Node],
    springConfig: AnonDamping,
    swipeEnabled: Boolean,
    tabBarPosition: top | bottom,
    timingConfig: AnonDuration,
    initialLayout: AnonHeight = null,
    onSwipeEnd: js.UndefOr[Callback] = js.undefined,
    onSwipeStart: js.UndefOr[Callback] = js.undefined,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    sceneContainerStyle: StyleProp[ViewStyle] = null,
    springVelocityScale: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    swipeVelocityImpact: Int | Double = null
  ): Props[T] = {
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
    __obj.asInstanceOf[Props[T]]
  }
}

