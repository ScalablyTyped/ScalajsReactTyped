package typingsJapgolly.reactDashNavigationDashStack

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.View
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewCreatePointerEventsContainerMod.PointerEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewCard", JSImport.Namespace)
@js.native
object libTypescriptViewsStackViewStackViewCardMod extends js.Object {
  /* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InputProps & react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InjectedProps & {  style  :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   animatedStyle  :any,   position  :react-native.react-native.Animated.AnimatedInterpolation,   transparent ? :boolean,   children  :react.react.ReactNode} */
  @js.native
  trait Props extends js.Object {
    var animatedStyle: js.Any = js.native
    var children: Node = js.native
    var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
    var pointerEvents: PointerEvents = js.native
    var position: AnimatedInterpolation = js.native
    var realPosition: Value = js.native
    var scene: Scene = js.native
    var style: StyleProp[ViewStyle] = js.native
    var transparent: js.UndefOr[Boolean] = js.native
    def onComponentRef(): Unit = js.native
    def onComponentRef(ref: View): Unit = js.native
  }
  
  @js.native
  class default protected ()
    extends Component[PickPropsstylechildrenscenenavigationrealPositiona, ComponentState, js.Any] {
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona) = this()
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona, context: js.Any) = this()
  }
  
  val default: ComponentType[PickPropsstylechildrenscenenavigationrealPositiona] = js.native
}

