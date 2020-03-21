package typingsJapgolly.reactNavigationStack

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.card
import typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.modal
import typingsJapgolly.reactNavigationStack.typesMod.HeaderBackgroundTransitionPreset
import typingsJapgolly.reactNavigationStack.typesMod.HeaderLayoutPreset
import typingsJapgolly.reactNavigationStack.typesMod.HeaderMode
import typingsJapgolly.reactNavigationStack.typesMod.HeaderTransitionConfig
import typingsJapgolly.reactNavigationStack.typesMod.HeaderTransitionPreset
import typingsJapgolly.reactNavigationStack.typesMod.TransitionConfig
import typingsJapgolly.reactNavigationStack.typesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewLayout", JSImport.Namespace)
@js.native
object stackViewLayoutMod extends js.Object {
  /* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/types.NavigationStackConfig & {  isLandscape  :boolean,   transitionProps  :react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps,   lastTransitionProps ? :react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps, transitionConfig ? (transitionProps : react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps, prevTransitionProps ? : react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps, isModal ? : boolean): react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionConfig, onGestureBegin ? (): void, onGestureEnd ? (): void, onGestureCanceled ? (): void,   screenProps ? :unknown} */
  @js.native
  trait Props extends js.Object {
    var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
    var cardShadowEnabled: js.UndefOr[Boolean] = js.native
    var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    var disableKeyboardHandling: js.UndefOr[Boolean] = js.native
    var headerBackTitleVisible: js.UndefOr[Boolean] = js.native
    var headerBackgroundTransitionPreset: js.UndefOr[HeaderBackgroundTransitionPreset] = js.native
    var headerLayoutPreset: js.UndefOr[HeaderLayoutPreset] = js.native
    var headerMode: js.UndefOr[HeaderMode] = js.native
    var headerTransitionPreset: js.UndefOr[HeaderTransitionPreset] = js.native
    var isLandscape: Boolean = js.native
    var lastTransitionProps: js.UndefOr[TransitionProps] = js.native
    var mode: js.UndefOr[card | modal] = js.native
    var onGestureBegin: js.UndefOr[js.Function0[Unit]] = js.native
    var onGestureCanceled: js.UndefOr[js.Function0[Unit]] = js.native
    var onGestureEnd: js.UndefOr[js.Function0[Unit]] = js.native
    var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
    var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
    var screenProps: js.UndefOr[js.Any] = js.native
    var transitionConfig: js.UndefOr[
        js.Function3[
          /* transitionProps */ TransitionProps, 
          js.UndefOr[TransitionProps], 
          js.UndefOr[Boolean], 
          (TransitionConfig with HeaderTransitionConfig) | TransitionConfig
        ]
      ] = js.native
    var transitionProps: TransitionProps = js.native
    var transparentCard: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  class default protected ()
    extends Component[PickPropsmodeheaderModehe, ComponentState, js.Any] {
    def this(props: PickPropsmodeheaderModehe) = this()
    def this(props: PickPropsmodeheaderModehe, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[PickPropsmodeheaderModehe]]
  
}

