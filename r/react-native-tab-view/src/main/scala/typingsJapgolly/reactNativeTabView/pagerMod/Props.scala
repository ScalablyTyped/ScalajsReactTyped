package typingsJapgolly.reactNativeTabView.pagerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNativeGestureHandler.mod.PanGestureHandler
import typingsJapgolly.reactNativeTabView.AnonDamping
import typingsJapgolly.reactNativeTabView.AnonDuration
import typingsJapgolly.reactNativeTabView.EventEmitterPropsposition
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.none
import typingsJapgolly.reactNativeTabView.typesMod.Layout
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.PagerCommonProps & {onIndexChange (index : number): void,   navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   layout  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Layout,   removeClippedSubviews ? :boolean, children (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  position  :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void}): react.react.ReactNode,   gestureHandlerProps  :react.react.ComponentProps<new (): react-native-gesture-handler.react-native-gesture-handler.PanGestureHandler>} */
trait Props[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]]
  var keyboardDismissMode: none | `on-drag` | auto
  var layout: Layout
  var navigationState: NavigationState[T]
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var springConfig: AnonDamping
  var springVelocityScale: js.UndefOr[Double] = js.undefined
  var swipeEnabled: Boolean
  var swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  var timingConfig: AnonDuration
  def children(props: EventEmitterPropsposition): Node
  def onIndexChange(index: Double): Unit
}

object Props {
  @scala.inline
  def apply[T /* <: Route */](
    children: EventEmitterPropsposition => CallbackTo[Node],
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Callback,
    springConfig: AnonDamping,
    swipeEnabled: Boolean,
    timingConfig: AnonDuration,
    onSwipeEnd: js.UndefOr[Callback] = js.undefined,
    onSwipeStart: js.UndefOr[Callback] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    springVelocityScale: Int | Double = null,
    swipeVelocityImpact: Int | Double = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.EventEmitterPropsposition) => children(t0).runNow()))
    __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1((t0: scala.Double) => onIndexChange(t0).runNow()))
    onSwipeEnd.foreach(p => __obj.updateDynamic("onSwipeEnd")(p.toJsFn))
    onSwipeStart.foreach(p => __obj.updateDynamic("onSwipeStart")(p.toJsFn))
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (springVelocityScale != null) __obj.updateDynamic("springVelocityScale")(springVelocityScale.asInstanceOf[js.Any])
    if (swipeVelocityImpact != null) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

