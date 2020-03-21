package typingsJapgolly.reactNativeTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.Props
import typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.default
import typingsJapgolly.reactNativeTabView.typesMod.Layout
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBarIndicator {
  def apply[T /* <: Route */](
    layout: Layout,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    width: String,
    getTabWidth: /* index */ Double => CallbackTo[Double],
    jumpTo: String => Callback,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props[T], default[T], Unit, Props[T]] = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getTabWidth")(js.Any.fromFunction1((t0: /* index */ scala.Double) => getTabWidth(t0).runNow()))
    __obj.updateDynamic("jumpTo")(js.Any.fromFunction1((t0: java.lang.String) => jumpTo(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.Props[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.Props[T]])(children: _*)
  }
  @JSImport("react-native-tab-view/lib/typescript/src/TabBarIndicator", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

