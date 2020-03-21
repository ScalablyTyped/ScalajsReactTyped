package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNavigation.mod.CreateNavigatorConfig
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationRouteConfigMap
import typingsJapgolly.reactNavigation.mod.NavigationStackRouterConfig
import typingsJapgolly.reactNavigation.mod.SupportedThemes
import typingsJapgolly.reactNavigationStack.createPointerEventsContainerMod.InjectedProps
import typingsJapgolly.reactNavigationStack.createPointerEventsContainerMod.InputProps
import typingsJapgolly.reactNavigationStack.headerBackButtonMod.default
import typingsJapgolly.reactNavigationStack.transitionerMod.Props
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackConfig
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackOptions
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackProp
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackState
import typingsJapgolly.reactNavigationStack.typesMod.Scene
import typingsJapgolly.reactNavigationStack.typesMod.SceneDescriptorMap
import typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps
import typingsJapgolly.reactNavigationStack.typesMod.TransitionConfig
import typingsJapgolly.reactNavigationStack.typesMod.TransitionProps
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Header protected ()
    extends Component[PickPropsscenenavigationp, js.Any, js.Any] {
    def this(props: PickPropsscenenavigationp) = this()
    def this(props: PickPropsscenenavigationp, context: js.Any) = this()
  }
  
  @js.native
  class HeaderBackButton () extends default
  
  @js.native
  class HeaderTitle ()
    extends typingsJapgolly.reactNavigationStack.headerTitleMod.default
  
  @js.native
  class StackView ()
    extends typingsJapgolly.reactNavigationStack.stackViewMod.StackView
  
  @js.native
  class StackViewCard protected ()
    extends Component[PickPropsstylechildrensce, ComponentState, js.Any] {
    def this(props: PickPropsstylechildrensce) = this()
    def this(props: PickPropsstylechildrensce, context: js.Any) = this()
  }
  
  @js.native
  class StackViewLayout protected ()
    extends Component[PickPropsmodeheaderModehe, ComponentState, js.Any] {
    def this(props: PickPropsmodeheaderModehe) = this()
    def this(props: PickPropsmodeheaderModehe, context: js.Any) = this()
  }
  
  @js.native
  class Transitioner protected ()
    extends typingsJapgolly.reactNavigationStack.transitionerMod.default {
    def this(props: Props) = this()
  }
  
  val Assets: js.Array[js.Any] = js.native
  val StackGestureContext: Context[Ref] = js.native
  def ScenesReducer(
    scenes: js.Array[Scene],
    nextState: NavigationStackState,
    prevState: Null,
    descriptors: SceneDescriptorMap
  ): js.Array[Scene] = js.native
  def ScenesReducer(
    scenes: js.Array[Scene],
    nextState: NavigationStackState,
    prevState: NavigationStackState,
    descriptors: SceneDescriptorMap
  ): js.Array[Scene] = js.native
  def createPointerEventsContainer[Props /* <: InjectedProps with InputProps */](Component: ComponentType[Props]): ComponentType[Pick[Props, Exclude[String, String]]] = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _]
  ): js.Any = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _],
    stackConfig: CreateNavigatorConfig[
      NavigationStackConfig, 
      NavigationStackRouterConfig, 
      NavigationStackOptions, 
      NavigationStackProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
  @js.native
  object Header extends TopLevel[ComponentClassPickPropssc | FunctionComponentPickProp]
  
  /* static members */
  @js.native
  object HeaderBackButton extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: AnonBackImage = js.native
  }
  
  @js.native
  object HeaderStyleInterpolator extends js.Object {
    var forBackground: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, AnonOpacity] = js.native
    var forBackgroundWithFade: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forBackgroundWithInactiveHidden: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, AnonOpacity] = js.native
    var forBackgroundWithTranslation: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacityTransform | AnonOpacityUndefined] = js.native
    var forCenter: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forCenterFromLeft: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransform | AnonOpacityAnimatedInterpolationTransformArray
      ] = js.native
    var forLayout: js.Function1[/* props */ SceneInterpolatorProps, AnonTransform | AnonTransformArray | Anon0] = js.native
    var forLeft: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forLeftButton: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forLeftLabel: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransform | AnonOpacityAnimatedInterpolationTransformArray
      ] = js.native
    var forRight: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
  }
  
  /* static members */
  @js.native
  object HeaderTitle extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
  }
  
  @js.native
  object StackViewCard extends TopLevel[ComponentType[PickPropsstylechildrensce]]
  
  @js.native
  object StackViewLayout extends TopLevel[ComponentType[PickPropsmodeheaderModehe]]
  
  @js.native
  object StackViewStyleInterpolator extends js.Object {
    var forFade: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOpacity | AnonOpacityAnimatedInterpolation
      ] = js.native
    var forFadeFromBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOpacityTransform | Anon1
      ] = js.native
    var forFadeToBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOpacityTransform | Anon1
      ] = js.native
    var forHorizontal: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOverlayOpacity | AnonShadowOpacity
      ] = js.native
    var forNoAnimation: js.Function0[js.Object] = js.native
    var forVertical: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityNumber | AnonOpacityTransform | AnonOpacityUndefinedTransformArray
      ] = js.native
  }
  
  @js.native
  object StackViewTransitionConfigs extends js.Object {
    var FadeInFromBottomAndroid: AnonScreenInterpolator = js.native
    var FadeOutToBottomAndroid: AnonScreenInterpolator = js.native
    var ModalSlideFromBottomIOS: AnonContainerStyleLight = js.native
    var NoAnimation: AnonTransitionSpec = js.native
    var SlideFromRightIOS: AnonContainerStyleDark = js.native
    var defaultTransitionConfig: js.Function3[
        /* transitionProps */ TransitionProps, 
        /* prevTransitionProps */ js.UndefOr[TransitionProps], 
        /* isModal */ js.UndefOr[Boolean], 
        TransitionConfig
      ] = js.native
    var getTransitionConfig: FnCall = js.native
  }
  
}

