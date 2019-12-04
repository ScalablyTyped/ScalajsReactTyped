package typingsJapgolly.reactDashNavigation

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationProp
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationState
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import typingsJapgolly.reactDashNavigation.reactDashNavigationStrings.`no-preference`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationContainerProps<{}, {}, unknown> & react-navigation.react-navigation.NavigationNavigatorProps<any, {}, unknown> */
trait NavigationContainerPropsunknownNavigationNavigator extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls whether the navigation container handles URLs opened via 'Linking'
    * @see https://facebook.github.io/react-native/docs/linking
    * @see https://reactnavigation.org/docs/en/deep-linking.html
    */
  var enableURLHandling: js.UndefOr[Boolean] = js.undefined
  var loadNavigationState: js.UndefOr[js.Function0[js.Promise[_]]] = js.undefined
  var navigation: js.UndefOr[
    (NavigationScreenProp[js.Object, NavigationParams]) with NavigationProp[js.Object]
  ] = js.undefined
  var navigationOptions: js.UndefOr[js.Object with js.Any] = js.undefined
   // defaults to true
  var onNavigationStateChange: js.UndefOr[
    js.Function3[
      /* prevNavigationState */ NavigationState, 
      /* nextNavigationState */ NavigationState, 
      /* action */ NavigationAction, 
      js.UndefOr[Unit | Null]
    ]
  ] = js.undefined
  var persistNavigationState: js.UndefOr[js.Function1[/* state */ NavigationState, js.Promise[_]]] = js.undefined
  /*
    * This prop is no longer supported. Use `loadNavigationState` and
    * `persistNavigationState` instead.
    */
  var persistenceKey: js.UndefOr[String | Null] = js.undefined
  var renderLoadingExperimental: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var screenProps: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var theme: js.UndefOr[SupportedThemes | `no-preference`] = js.undefined
  var uriPrefix: js.UndefOr[String | js.RegExp] = js.undefined
}

object NavigationContainerPropsunknownNavigationNavigator {
  @scala.inline
  def apply(
    detached: js.UndefOr[Boolean] = js.undefined,
    enableURLHandling: js.UndefOr[Boolean] = js.undefined,
    loadNavigationState: js.UndefOr[CallbackTo[js.Promise[js.Any]]] = js.undefined,
    navigation: (NavigationScreenProp[js.Object, NavigationParams]) with NavigationProp[js.Object] = null,
    navigationOptions: js.Object with js.Any = null,
    onNavigationStateChange: (/* prevNavigationState */ NavigationState, /* nextNavigationState */ NavigationState, /* action */ NavigationAction) => CallbackTo[js.UndefOr[Unit | Null]] = null,
    persistNavigationState: /* state */ NavigationState => CallbackTo[js.Promise[js.Any]] = null,
    persistenceKey: String = null,
    renderLoadingExperimental: ComponentType[js.Object] = null,
    screenProps: js.Any = null,
    style: StyleProp[ViewStyle] = null,
    theme: SupportedThemes | `no-preference` = null,
    uriPrefix: String | js.RegExp = null
  ): NavigationContainerPropsunknownNavigationNavigator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (!js.isUndefined(enableURLHandling)) __obj.updateDynamic("enableURLHandling")(enableURLHandling.asInstanceOf[js.Any])
    loadNavigationState.foreach(p => __obj.updateDynamic("loadNavigationState")(p.toJsFn))
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (onNavigationStateChange != null) __obj.updateDynamic("onNavigationStateChange")(js.Any.fromFunction3((t0: /* prevNavigationState */ typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationState, t1: /* nextNavigationState */ typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationState, t2: /* action */ typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationAction) => onNavigationStateChange(t0, t1, t2).runNow()))
    if (persistNavigationState != null) __obj.updateDynamic("persistNavigationState")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationState) => persistNavigationState(t0).runNow()))
    if (persistenceKey != null) __obj.updateDynamic("persistenceKey")(persistenceKey.asInstanceOf[js.Any])
    if (renderLoadingExperimental != null) __obj.updateDynamic("renderLoadingExperimental")(renderLoadingExperimental.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (uriPrefix != null) __obj.updateDynamic("uriPrefix")(uriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationContainerPropsunknownNavigationNavigator]
  }
}

