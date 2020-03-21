package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationStack.createPointerEventsContainerMod.PointerEvents
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackProp
import typingsJapgolly.reactNavigationStack.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewCard", JSImport.Namespace)
@js.native
object stackViewCardMod extends js.Object {
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
    extends Component[PickPropsstylechildrensce, ComponentState, js.Any] {
    def this(props: PickPropsstylechildrensce) = this()
    def this(props: PickPropsstylechildrensce, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[PickPropsstylechildrensce]]
  
}

