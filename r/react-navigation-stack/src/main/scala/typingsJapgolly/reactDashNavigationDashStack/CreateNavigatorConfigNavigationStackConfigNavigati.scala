package typingsJapgolly.reactDashNavigationDashStack

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationPathsConfig
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderBackgroundTransitionPreset
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderLayoutPreset
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderMode
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderTransitionPreset
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackOptions
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.card
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.modal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.CreateNavigatorConfig<react-navigation-stack.react-navigation-stack/lib/typescript/types.NavigationStackConfig, react-navigation.react-navigation.NavigationStackRouterConfig, react-navigation-stack.react-navigation-stack/lib/typescript/types.NavigationStackOptions, react-navigation-stack.react-navigation-stack/lib/typescript/types.NavigationStackProp<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>, any>> */
trait CreateNavigatorConfigNavigationStackConfigNavigati extends js.Object {
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined
  var cardShadowEnabled: js.UndefOr[Boolean] = js.undefined
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var defaultNavigationOptions: js.UndefOr[
    NavigationScreenConfig[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _]
  ] = js.undefined
  var disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined
  var headerBackgroundTransitionPreset: js.UndefOr[HeaderBackgroundTransitionPreset] = js.undefined
  var headerLayoutPreset: js.UndefOr[HeaderLayoutPreset] = js.undefined
  var headerMode: js.UndefOr[HeaderMode] = js.undefined
  var headerTransitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
  var initialRouteKey: js.UndefOr[String] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var mode: js.UndefOr[card | modal] = js.undefined
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
  var transitionConfig: js.UndefOr[
    js.Function3[
      /* transitionProps */ TransitionProps, 
      /* prevTransitionProps */ js.UndefOr[TransitionProps], 
      /* isModal */ js.UndefOr[Boolean], 
      TransitionConfigHeaderTransitionConfig
    ]
  ] = js.undefined
  var transparentCard: js.UndefOr[Boolean] = js.undefined
}

object CreateNavigatorConfigNavigationStackConfigNavigati {
  @scala.inline
  def apply(
    cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined,
    cardShadowEnabled: js.UndefOr[Boolean] = js.undefined,
    cardStyle: StyleProp[ViewStyle] = null,
    defaultNavigationOptions: NavigationScreenConfig[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _] = null,
    disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined,
    headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined,
    headerBackgroundTransitionPreset: HeaderBackgroundTransitionPreset = null,
    headerLayoutPreset: HeaderLayoutPreset = null,
    headerMode: HeaderMode = null,
    headerTransitionPreset: HeaderTransitionPreset = null,
    initialRouteKey: String = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    mode: card | modal = null,
    navigationOptions: NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ] = null,
    onTransitionEnd: js.UndefOr[Callback] = js.undefined,
    onTransitionStart: js.UndefOr[Callback] = js.undefined,
    paths: NavigationPathsConfig = null,
    transitionConfig: (/* transitionProps */ TransitionProps, /* prevTransitionProps */ js.UndefOr[TransitionProps], /* isModal */ js.UndefOr[Boolean]) => CallbackTo[TransitionConfigHeaderTransitionConfig] = null,
    transparentCard: js.UndefOr[Boolean] = js.undefined
  ): CreateNavigatorConfigNavigationStackConfigNavigati = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cardOverlayEnabled)) __obj.updateDynamic("cardOverlayEnabled")(cardOverlayEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cardShadowEnabled)) __obj.updateDynamic("cardShadowEnabled")(cardShadowEnabled.asInstanceOf[js.Any])
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardHandling)) __obj.updateDynamic("disableKeyboardHandling")(disableKeyboardHandling.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleVisible)) __obj.updateDynamic("headerBackTitleVisible")(headerBackTitleVisible.asInstanceOf[js.Any])
    if (headerBackgroundTransitionPreset != null) __obj.updateDynamic("headerBackgroundTransitionPreset")(headerBackgroundTransitionPreset.asInstanceOf[js.Any])
    if (headerLayoutPreset != null) __obj.updateDynamic("headerLayoutPreset")(headerLayoutPreset.asInstanceOf[js.Any])
    if (headerMode != null) __obj.updateDynamic("headerMode")(headerMode.asInstanceOf[js.Any])
    if (headerTransitionPreset != null) __obj.updateDynamic("headerTransitionPreset")(headerTransitionPreset.asInstanceOf[js.Any])
    if (initialRouteKey != null) __obj.updateDynamic("initialRouteKey")(initialRouteKey.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    onTransitionEnd.foreach(p => __obj.updateDynamic("onTransitionEnd")(p.toJsFn))
    onTransitionStart.foreach(p => __obj.updateDynamic("onTransitionStart")(p.toJsFn))
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (transitionConfig != null) __obj.updateDynamic("transitionConfig")(js.Any.fromFunction3((t0: /* transitionProps */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps, t1: /* prevTransitionProps */ js.UndefOr[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps], t2: /* isModal */ js.UndefOr[scala.Boolean]) => transitionConfig(t0, t1, t2).runNow()))
    if (!js.isUndefined(transparentCard)) __obj.updateDynamic("transparentCard")(transparentCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNavigatorConfigNavigationStackConfigNavigati]
  }
}

