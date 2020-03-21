package typingsJapgolly.reactNativeTabView.tabBarItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.AnonFocused
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import typingsJapgolly.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[T /* <: Route */] extends js.Object {
  var activeColor: js.UndefOr[String] = js.undefined
  var inactiveColor: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var navigationState: NavigationState[T]
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var pressColor: js.UndefOr[String] = js.undefined
  var pressOpacity: js.UndefOr[Double] = js.undefined
  var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], Node]] = js.undefined
  var renderIcon: js.UndefOr[js.Function1[/* scene */ AnonFocused[T], Node]] = js.undefined
  var renderLabel: js.UndefOr[js.Function1[/* scene */ AnonFocused[T], Node]] = js.undefined
  var route: T
  var style: StyleProp[ViewStyle]
  def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String]
  def getAccessible(scene: Scene[T]): js.UndefOr[Boolean]
  def getLabelText(scene: Scene[T]): js.UndefOr[String]
  def getTestID(scene: Scene[T]): js.UndefOr[String]
  def onLongPress(): Unit
  def onPress(): Unit
}

object Props {
  @scala.inline
  def apply[T /* <: Route */](
    getAccessibilityLabel: Scene[T] => CallbackTo[js.UndefOr[String]],
    getAccessible: Scene[T] => CallbackTo[js.UndefOr[Boolean]],
    getLabelText: Scene[T] => CallbackTo[js.UndefOr[String]],
    getTestID: Scene[T] => CallbackTo[js.UndefOr[String]],
    navigationState: NavigationState[T],
    onLongPress: Callback,
    onPress: Callback,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    route: T,
    activeColor: String = null,
    inactiveColor: String = null,
    labelStyle: StyleProp[TextStyle] = null,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    pressColor: String = null,
    pressOpacity: Int | Double = null,
    renderBadge: /* scene */ Scene[T] => CallbackTo[Node] = null,
    renderIcon: /* scene */ AnonFocused[T] => CallbackTo[Node] = null,
    renderLabel: /* scene */ AnonFocused[T] => CallbackTo[Node] = null,
    style: StyleProp[ViewStyle] = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.updateDynamic("getAccessibilityLabel")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => getAccessibilityLabel(t0).runNow()))
    __obj.updateDynamic("getAccessible")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => getAccessible(t0).runNow()))
    __obj.updateDynamic("getLabelText")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => getLabelText(t0).runNow()))
    __obj.updateDynamic("getTestID")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => getTestID(t0).runNow()))
    __obj.updateDynamic("onLongPress")(onLongPress.toJsFn)
    __obj.updateDynamic("onPress")(onPress.toJsFn)
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor.asInstanceOf[js.Any])
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent) => onLayout(t0).runNow()))
    if (pressColor != null) __obj.updateDynamic("pressColor")(pressColor.asInstanceOf[js.Any])
    if (pressOpacity != null) __obj.updateDynamic("pressOpacity")(pressOpacity.asInstanceOf[js.Any])
    if (renderBadge != null) __obj.updateDynamic("renderBadge")(js.Any.fromFunction1((t0: /* scene */ typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => renderBadge(t0).runNow()))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1((t0: /* scene */ typingsJapgolly.reactNativeTabView.AnonFocused[T]) => renderIcon(t0).runNow()))
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1((t0: /* scene */ typingsJapgolly.reactNativeTabView.AnonFocused[T]) => renderLabel(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

