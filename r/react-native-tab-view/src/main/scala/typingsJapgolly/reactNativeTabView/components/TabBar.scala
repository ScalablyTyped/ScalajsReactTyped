package typingsJapgolly.reactNativeTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.AnonColor
import typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.Props
import typingsJapgolly.reactNativeTabView.tabBarMod.default
import typingsJapgolly.reactNativeTabView.typesMod.Event
import typingsJapgolly.reactNativeTabView.typesMod.Layout
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import typingsJapgolly.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBar {
  def apply[T /* <: Route */](
    layout: Layout,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    getAccessibilityLabel: Scene[T] => CallbackTo[js.UndefOr[String]],
    getAccessible: Scene[T] => CallbackTo[js.UndefOr[Boolean]],
    getLabelText: Scene[T] => CallbackTo[js.UndefOr[String]],
    getTestID: Scene[T] => CallbackTo[js.UndefOr[String]],
    jumpTo: String => Callback,
    renderIndicator: Props[T] => CallbackTo[Node],
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
    tabStyle: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactNativeTabView.tabBarMod.Props[T], 
    default[T], 
    Unit, 
    typingsJapgolly.reactNativeTabView.tabBarMod.Props[T]
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeTabView.tabBarMod.Props[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeTabView.tabBarMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeTabView.tabBarMod.Props[T]])(children: _*)
  }
  @JSImport("react-native-tab-view/lib/typescript/src/TabBar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

