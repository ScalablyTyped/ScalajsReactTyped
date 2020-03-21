package typingsJapgolly.reactNativeTabView.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.AnonLoading
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter
import typingsJapgolly.reactNativeTabView.sceneViewMod.Props
import typingsJapgolly.reactNativeTabView.sceneViewMod.default
import typingsJapgolly.reactNativeTabView.typesMod.Layout
import typingsJapgolly.reactNativeTabView.typesMod.Listener
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SceneView {
  def apply[T /* <: Route */](
    index: Double,
    layout: Layout,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    addListener: (enter, Listener) => Callback,
    jumpTo: String => Callback,
    `lazy`: Boolean,
    removeListener: (enter, Listener) => Callback,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: AnonLoading => CallbackTo[Node]
  ): UnmountedWithRoot[Props[T], default[T], Unit, Props[T]] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.AnonLoading) => children(t0).runNow()))
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter, t1: typingsJapgolly.reactNativeTabView.typesMod.Listener) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("jumpTo")(js.Any.fromFunction1((t0: java.lang.String) => jumpTo(t0).runNow()))
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter, t1: typingsJapgolly.reactNativeTabView.typesMod.Listener) => removeListener(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeTabView.sceneViewMod.Props[T], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactNativeTabView.sceneViewMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeTabView.sceneViewMod.Props[T]])
  }
  @JSImport("react-native-tab-view/lib/typescript/src/SceneView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

