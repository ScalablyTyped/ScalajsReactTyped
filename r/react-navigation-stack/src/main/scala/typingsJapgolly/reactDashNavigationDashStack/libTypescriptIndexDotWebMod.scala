package typingsJapgolly.reactDashNavigationDashStack

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.react.reactMod.Context
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRouteConfigMap
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackOptions
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackState
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneDescriptorMap
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionConfig
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderBackButtonMod.default
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.Props
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/index.web", JSImport.Namespace)
@js.native
object libTypescriptIndexDotWebMod extends js.Object {
  @js.native
  class Header protected ()
    extends Component[PickPropsscenenavigationpositionlayoutPresetbackTi, js.Any, js.Any] {
    def this(props: PickPropsscenenavigationpositionlayoutPresetbackTi) = this()
    def this(props: PickPropsscenenavigationpositionlayoutPresetbackTi, context: js.Any) = this()
  }
  
  @js.native
  class HeaderBackButton () extends default
  
  @js.native
  class HeaderTitle ()
    extends typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderTitleMod.default
  
  @js.native
  class StackView ()
    extends typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewMod.StackView
  
  @js.native
  class StackViewCard protected ()
    extends Component[PickPropsstylechildrenscenenavigationrealPositiona, ComponentState, js.Any] {
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona) = this()
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona, context: js.Any) = this()
  }
  
  @js.native
  class StackViewLayout protected ()
    extends Component[PickPropsmodeheaderModeheaderLayoutPresetheaderTra, ComponentState, js.Any] {
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra) = this()
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra, context: js.Any) = this()
  }
  
  @js.native
  class Transitioner protected ()
    extends typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.default {
    def this(props: Props) = this()
  }
  
  val Assets: js.Array[scala.Nothing] = js.native
  val Header: ComponentClassPickPropsscenenavigationpositionlayo | FunctionComponentPickPropsscenenavigationpositionl = js.native
  val StackGestureContext: Context[Ref] = js.native
  val StackViewCard: ComponentType[PickPropsstylechildrenscenenavigationrealPositiona] = js.native
  val StackViewLayout: ComponentType[PickPropsmodeheaderModeheaderLayoutPresetheaderTra] = js.native
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
  def createPointerEventsContainer[Props /* <: InjectedPropsInputProps */](Component: ComponentType[Props]): ComponentType[Pick[Props, Exclude[String, String]]] = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _]]
  ): js.Any = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _]],
    stackConfig: CreateNavigatorConfigNavigationStackConfigNavigati
  ): js.Any = js.native
  /* static members */
  @js.native
  object HeaderBackButton extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: Anon_BackImage = js.native
  }
  
  @js.native
  object HeaderStyleInterpolator extends js.Object {
    var forBackground: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, Anon_Opacity] = js.native
    var forBackgroundWithFade: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forBackgroundWithInactiveHidden: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, Anon_Opacity] = js.native
    var forBackgroundWithTranslation: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransform | Anon_OpacityTransformAnonTranslateXAnimatedInterpolation
      ] = js.native
    var forCenter: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forCenterFromLeft: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolation
      ] = js.native
    var forLayout: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Transform | Anon_TransformAnonTranslateX | Anon_TransformAnonTranslateXAnimatedInterpolation
      ] = js.native
    var forLeft: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forLeftButton: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forLeftLabel: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolation
      ] = js.native
    var forRight: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
  }
  
  /* static members */
  @js.native
  object HeaderTitle extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
  }
  
  @js.native
  object StackViewStyleInterpolator extends js.Object {
    var forFade: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forFadeFromBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolationAnonTranslateY
      ] = js.native
    var forFadeToBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolationAnonTranslateY
      ] = js.native
    var forHorizontal: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityOverlayOpacity | Anon_OpacityOverlayOpacityShadowOpacity
      ] = js.native
    var forNoAnimation: js.Function0[js.Object] = js.native
    var forVertical: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnonTranslateY
      ] = js.native
  }
  
  @js.native
  object StackViewTransitionConfigs extends js.Object {
    var FadeInFromBottomAndroid: Anon_Props = js.native
    var FadeOutToBottomAndroid: Anon_Props = js.native
    var ModalSlideFromBottomIOS: Anon_ContainerStyleDarkContainerStyleLight = js.native
    var NoAnimation: Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator = js.native
    var SlideFromRightIOS: Anon_ContainerStyleDark = js.native
    var defaultTransitionConfig: js.Function3[
        /* transitionProps */ TransitionProps, 
        /* prevTransitionProps */ js.UndefOr[TransitionProps], 
        /* isModal */ js.UndefOr[Boolean], 
        TransitionConfig
      ] = js.native
    var getTransitionConfig: Fn_IsModal = js.native
  }
  
}

