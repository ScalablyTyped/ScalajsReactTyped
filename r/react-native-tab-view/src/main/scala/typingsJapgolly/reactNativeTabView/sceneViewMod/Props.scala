package typingsJapgolly.reactNativeTabView.sceneViewMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.AnonLoading
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter
import typingsJapgolly.reactNativeTabView.typesMod.Layout
import typingsJapgolly.reactNativeTabView.typesMod.Listener
import typingsJapgolly.reactNativeTabView.typesMod.NavigationState
import typingsJapgolly.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   lazy  :boolean,   lazyPreloadDistance  :number,   index  :number, children (props : {  loading  :boolean}): react.react.ReactNode,   style ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>} */
trait Props[T /* <: Route */] extends js.Object {
  var index: Double
  var layout: Layout
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var navigationState: NavigationState[T]
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit
  def children(props: AnonLoading): Node
  def jumpTo(key: String): Unit
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit
}

object Props {
  @scala.inline
  def apply[T /* <: Route */](
    addListener: (enter, Listener) => Callback,
    children: AnonLoading => CallbackTo[Node],
    index: Double,
    jumpTo: String => Callback,
    layout: Layout,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    removeListener: (enter, Listener) => Callback,
    style: StyleProp[ViewStyle] = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter, t1: typingsJapgolly.reactNativeTabView.typesMod.Listener) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.AnonLoading) => children(t0).runNow()))
    __obj.updateDynamic("jumpTo")(js.Any.fromFunction1((t0: java.lang.String) => jumpTo(t0).runNow()))
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter, t1: typingsJapgolly.reactNativeTabView.typesMod.Listener) => removeListener(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

