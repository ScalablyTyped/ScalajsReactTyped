package typingsJapgolly.reactNativeTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNativeGestureHandler.mod.PanGestureHandler
import typingsJapgolly.reactNativeTabView.AnonDamping
import typingsJapgolly.reactNativeTabView.AnonDuration
import typingsJapgolly.reactNativeTabView.AnonOverscroll
import typingsJapgolly.reactNativeTabView.EventEmitterPropsposition
import typingsJapgolly.reactNativeTabView.pagerMod.Props
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.none
import typingsJapgolly.reactNativeTabView.scrollPagerMod.default
import typingsJapgolly.reactNativeTabView.typesMod.Layout
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollPager {
  def apply[T /* <: Route */](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    layout: Layout,
    navigationState: NavigationState[T],
    springConfig: AnonDamping,
    swipeEnabled: Boolean,
    timingConfig: AnonDuration,
    onIndexChange: Double => Callback,
    onSwipeEnd: js.UndefOr[Callback] = js.undefined,
    onSwipeStart: js.UndefOr[Callback] = js.undefined,
    overscroll: js.UndefOr[Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    springVelocityScale: Int | Double = null,
    swipeVelocityImpact: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: EventEmitterPropsposition => CallbackTo[Node]
  ): UnmountedWithRoot[Props[T] with AnonOverscroll, default[T], Unit, Props[T] with AnonOverscroll] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.EventEmitterPropsposition) => children(t0).runNow()))
    __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1((t0: scala.Double) => onIndexChange(t0).runNow()))
    onSwipeEnd.foreach(p => __obj.updateDynamic("onSwipeEnd")(p.toJsFn))
    onSwipeStart.foreach(p => __obj.updateDynamic("onSwipeStart")(p.toJsFn))
    if (!js.isUndefined(overscroll)) __obj.updateDynamic("overscroll")(overscroll.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (springVelocityScale != null) __obj.updateDynamic("springVelocityScale")(springVelocityScale.asInstanceOf[js.Any])
    if (swipeVelocityImpact != null) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeTabView.pagerMod.Props[T] with typingsJapgolly.reactNativeTabView.AnonOverscroll, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactNativeTabView.scrollPagerMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeTabView.pagerMod.Props[T] with typingsJapgolly.reactNativeTabView.AnonOverscroll])
  }
  @JSImport("react-native-tab-view/lib/typescript/src/ScrollPager", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

