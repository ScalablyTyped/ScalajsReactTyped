package typingsJapgolly.reactNativeTabView.tabBarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.AnonColor
import typingsJapgolly.reactNativeTabView.typesMod.Event
import typingsJapgolly.reactNativeTabView.typesMod.Layout
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import typingsJapgolly.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   scrollEnabled ? :boolean,   bounces ? :boolean,   activeColor ? :string,   inactiveColor ? :string,   pressColor ? :string,   pressOpacity ? :number, getLabelText (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, getAccessible (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): boolean | undefined, getAccessibilityLabel (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, getTestID (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, renderLabel ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & {  focused  :boolean,   color  :string}): react.react.ReactNode, renderIcon ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & {  focused  :boolean,   color  :string}): react.react.ReactNode, renderBadge ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): react.react.ReactNode, renderIndicator (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/TabBarIndicator.Props<T>): react.react.ReactNode, onTabPress ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Event): void, onTabLongPress ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): void,   tabStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   indicatorStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   indicatorContainerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   labelStyle ? :react-native.react-native.StyleProp<react-native.react-native.TextStyle>,   contentContainerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   style ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>} */
trait Props[T /* <: Route */] extends js.Object {
  var activeColor: js.UndefOr[String] = js.undefined
  var bounces: js.UndefOr[Boolean] = js.undefined
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveColor: js.UndefOr[String] = js.undefined
  var indicatorContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var layout: Layout
  var navigationState: NavigationState[T]
  var onTabLongPress: js.UndefOr[js.Function1[/* scene */ Scene[T], Unit]] = js.undefined
  var onTabPress: js.UndefOr[js.Function1[/* scene */ Scene[T] with Event, Unit]] = js.undefined
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var pressColor: js.UndefOr[String] = js.undefined
  var pressOpacity: js.UndefOr[Double] = js.undefined
  var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], Node]] = js.undefined
  var renderIcon: js.UndefOr[js.Function1[/* scene */ Scene[T] with AnonColor, Node]] = js.undefined
  var renderLabel: js.UndefOr[js.Function1[/* scene */ Scene[T] with AnonColor, Node]] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String]
  def getAccessible(scene: Scene[T]): js.UndefOr[Boolean]
  def getLabelText(scene: Scene[T]): js.UndefOr[String]
  def getTestID(scene: Scene[T]): js.UndefOr[String]
  def jumpTo(key: String): Unit
  def renderIndicator(props: typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.Props[T]): Node
}

object Props {
  @scala.inline
  def apply[T /* <: Route */](
    getAccessibilityLabel: Scene[T] => CallbackTo[js.UndefOr[String]],
    getAccessible: Scene[T] => CallbackTo[js.UndefOr[Boolean]],
    getLabelText: Scene[T] => CallbackTo[js.UndefOr[String]],
    getTestID: Scene[T] => CallbackTo[js.UndefOr[String]],
    jumpTo: String => Callback,
    layout: Layout,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    renderIndicator: typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.Props[T] => CallbackTo[Node],
    activeColor: String = null,
    bounces: js.UndefOr[Boolean] = js.undefined,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    inactiveColor: String = null,
    indicatorContainerStyle: StyleProp[ViewStyle] = null,
    indicatorStyle: StyleProp[ViewStyle] = null,
    labelStyle: StyleProp[TextStyle] = null,
    onTabLongPress: /* scene */ Scene[T] => Callback = null,
    onTabPress: /* scene */ Scene[T] with Event => Callback = null,
    pressColor: String = null,
    pressOpacity: Int | Double = null,
    renderBadge: /* scene */ Scene[T] => CallbackTo[Node] = null,
    renderIcon: /* scene */ Scene[T] with AnonColor => CallbackTo[Node] = null,
    renderLabel: /* scene */ Scene[T] with AnonColor => CallbackTo[Node] = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    tabStyle: StyleProp[ViewStyle] = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("getAccessibilityLabel")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => getAccessibilityLabel(t0).runNow()))
    __obj.updateDynamic("getAccessible")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => getAccessible(t0).runNow()))
    __obj.updateDynamic("getLabelText")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => getLabelText(t0).runNow()))
    __obj.updateDynamic("getTestID")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => getTestID(t0).runNow()))
    __obj.updateDynamic("jumpTo")(js.Any.fromFunction1((t0: java.lang.String) => jumpTo(t0).runNow()))
    __obj.updateDynamic("renderIndicator")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.Props[T]) => renderIndicator(t0).runNow()))
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor.asInstanceOf[js.Any])
    if (indicatorContainerStyle != null) __obj.updateDynamic("indicatorContainerStyle")(indicatorContainerStyle.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onTabLongPress != null) __obj.updateDynamic("onTabLongPress")(js.Any.fromFunction1((t0: /* scene */ typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => onTabLongPress(t0).runNow()))
    if (onTabPress != null) __obj.updateDynamic("onTabPress")(js.Any.fromFunction1((t0: /* scene */ typingsJapgolly.reactNativeTabView.typesMod.Scene[T] with typingsJapgolly.reactNativeTabView.typesMod.Event) => onTabPress(t0).runNow()))
    if (pressColor != null) __obj.updateDynamic("pressColor")(pressColor.asInstanceOf[js.Any])
    if (pressOpacity != null) __obj.updateDynamic("pressOpacity")(pressOpacity.asInstanceOf[js.Any])
    if (renderBadge != null) __obj.updateDynamic("renderBadge")(js.Any.fromFunction1((t0: /* scene */ typingsJapgolly.reactNativeTabView.typesMod.Scene[T]) => renderBadge(t0).runNow()))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1((t0: /* scene */ typingsJapgolly.reactNativeTabView.typesMod.Scene[T] with typingsJapgolly.reactNativeTabView.AnonColor) => renderIcon(t0).runNow()))
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1((t0: /* scene */ typingsJapgolly.reactNativeTabView.typesMod.Scene[T] with typingsJapgolly.reactNativeTabView.AnonColor) => renderLabel(t0).runNow()))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

