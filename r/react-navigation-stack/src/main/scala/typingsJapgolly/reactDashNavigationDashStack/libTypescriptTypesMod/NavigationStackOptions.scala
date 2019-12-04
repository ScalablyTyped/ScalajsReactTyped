package typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.TextStyle
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigationDashStack.Anon_Horizontal
import typingsJapgolly.reactDashNavigationDashStack.Anon_TintColor
import typingsJapgolly.reactDashNavigationDashStack.TextPropschildrenstring
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.inverted
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackOptions extends js.Object {
  var disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined
  var gestureDirection: js.UndefOr[inverted | normal] = js.undefined
  var gestureResponseDistance: js.UndefOr[Anon_Horizontal] = js.undefined
  var gesturesEnabled: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[(js.Function1[/* props */ HeaderProps, Node]) | Null] = js.undefined
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  var headerBackImage: js.UndefOr[js.Function1[/* props */ Anon_TintColor, Node]] = js.undefined
  var headerBackTitle: js.UndefOr[String | Null] = js.undefined
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerBackground: js.UndefOr[js.Function0[Node] | Node] = js.undefined
  var headerForceInset: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.ComponentClass<react-navigation.react-navigation.SafeAreaViewProps, react.react.ComponentState> & new (props : react-navigation.react-navigation.SafeAreaViewProps): react-navigation.react-navigation.SafeAreaView>['forceInset'] */ js.Any
  ] = js.undefined
  var headerLeft: js.UndefOr[(js.Function1[/* props */ HeaderBackButtonProps, Node]) | Node] = js.undefined
  var headerLeftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerPressColorAndroid: js.UndefOr[String] = js.undefined
  var headerRight: js.UndefOr[js.Function0[Node] | Node] = js.undefined
  var headerRightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerShown: js.UndefOr[Boolean] = js.undefined
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerTintColor: js.UndefOr[String] = js.undefined
  var headerTitle: js.UndefOr[(js.Function1[/* props */ TextPropschildrenstring, Node]) | Node] = js.undefined
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  var headerTitleContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerTransparent: js.UndefOr[Boolean] = js.undefined
  var headerTruncatedBackTitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NavigationStackOptions {
  @scala.inline
  def apply(
    disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined,
    gestureDirection: inverted | normal = null,
    gestureResponseDistance: Anon_Horizontal = null,
    gesturesEnabled: js.UndefOr[Boolean] = js.undefined,
    header: /* props */ HeaderProps => CallbackTo[Node] = null,
    headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerBackImage: /* props */ Anon_TintColor => CallbackTo[Node] = null,
    headerBackTitle: String = null,
    headerBackTitleStyle: StyleProp[TextStyle] = null,
    headerBackground: js.Function0[Node] | Node = null,
    headerForceInset: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.ComponentClass<react-navigation.react-navigation.SafeAreaViewProps, react.react.ComponentState> & new (props : react-navigation.react-navigation.SafeAreaViewProps): react-navigation.react-navigation.SafeAreaView>['forceInset'] */ js.Any = null,
    headerLeft: (js.Function1[/* props */ HeaderBackButtonProps, Node]) | Node = null,
    headerLeftContainerStyle: StyleProp[ViewStyle] = null,
    headerPressColorAndroid: String = null,
    headerRight: js.Function0[Node] | Node = null,
    headerRightContainerStyle: StyleProp[ViewStyle] = null,
    headerShown: js.UndefOr[Boolean] = js.undefined,
    headerStyle: StyleProp[ViewStyle] = null,
    headerTintColor: String = null,
    headerTitle: (js.Function1[/* props */ TextPropschildrenstring, Node]) | Node = null,
    headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerTitleContainerStyle: StyleProp[ViewStyle] = null,
    headerTitleStyle: StyleProp[TextStyle] = null,
    headerTransparent: js.UndefOr[Boolean] = js.undefined,
    headerTruncatedBackTitle: String = null,
    title: String = null
  ): NavigationStackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableKeyboardHandling)) __obj.updateDynamic("disableKeyboardHandling")(disableKeyboardHandling.asInstanceOf[js.Any])
    if (gestureDirection != null) __obj.updateDynamic("gestureDirection")(gestureDirection.asInstanceOf[js.Any])
    if (gestureResponseDistance != null) __obj.updateDynamic("gestureResponseDistance")(gestureResponseDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(gesturesEnabled)) __obj.updateDynamic("gesturesEnabled")(gesturesEnabled.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderProps) => header(t0).runNow()))
    if (!js.isUndefined(headerBackAllowFontScaling)) __obj.updateDynamic("headerBackAllowFontScaling")(headerBackAllowFontScaling.asInstanceOf[js.Any])
    if (headerBackImage != null) __obj.updateDynamic("headerBackImage")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.Anon_TintColor) => headerBackImage(t0).runNow()))
    if (headerBackTitle != null) __obj.updateDynamic("headerBackTitle")(headerBackTitle.asInstanceOf[js.Any])
    if (headerBackTitleStyle != null) __obj.updateDynamic("headerBackTitleStyle")(headerBackTitleStyle.asInstanceOf[js.Any])
    if (headerBackground != null) __obj.updateDynamic("headerBackground")(headerBackground.asInstanceOf[js.Any])
    if (headerForceInset != null) __obj.updateDynamic("headerForceInset")(headerForceInset.asInstanceOf[js.Any])
    if (headerLeft != null) __obj.updateDynamic("headerLeft")(headerLeft.asInstanceOf[js.Any])
    if (headerLeftContainerStyle != null) __obj.updateDynamic("headerLeftContainerStyle")(headerLeftContainerStyle.asInstanceOf[js.Any])
    if (headerPressColorAndroid != null) __obj.updateDynamic("headerPressColorAndroid")(headerPressColorAndroid.asInstanceOf[js.Any])
    if (headerRight != null) __obj.updateDynamic("headerRight")(headerRight.asInstanceOf[js.Any])
    if (headerRightContainerStyle != null) __obj.updateDynamic("headerRightContainerStyle")(headerRightContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerShown)) __obj.updateDynamic("headerShown")(headerShown.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerTintColor != null) __obj.updateDynamic("headerTintColor")(headerTintColor.asInstanceOf[js.Any])
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitleAllowFontScaling)) __obj.updateDynamic("headerTitleAllowFontScaling")(headerTitleAllowFontScaling.asInstanceOf[js.Any])
    if (headerTitleContainerStyle != null) __obj.updateDynamic("headerTitleContainerStyle")(headerTitleContainerStyle.asInstanceOf[js.Any])
    if (headerTitleStyle != null) __obj.updateDynamic("headerTitleStyle")(headerTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTransparent)) __obj.updateDynamic("headerTransparent")(headerTransparent.asInstanceOf[js.Any])
    if (headerTruncatedBackTitle != null) __obj.updateDynamic("headerTruncatedBackTitle")(headerTruncatedBackTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackOptions]
  }
}

