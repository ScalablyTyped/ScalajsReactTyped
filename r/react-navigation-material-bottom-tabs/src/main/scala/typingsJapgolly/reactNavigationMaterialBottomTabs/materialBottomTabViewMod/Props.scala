package typingsJapgolly.reactNavigationMaterialBottomTabs.materialBottomTabViewMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.mod.NavigationDescriptor
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationProp
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigationMaterialBottomTabs.AnonTintColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BottomNavigation * / any> & react-navigation-material-bottom-tabs.react-navigation-material-bottom-tabs/lib/typescript/src/types.NavigationMaterialBottomTabConfig & {  navigation  :react-navigation.react-navigation.NavigationProp<any>,   descriptors  :{[key: string] : react-navigation.react-navigation.NavigationDescriptor<any, react-navigation-material-bottom-tabs.react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView.Options, react-navigation.react-navigation.NavigationScreenProp<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>, react-navigation.react-navigation.NavigationParams>>},   screenProps ? :unknown, renderIcon (options : {  route  :{  key  :string},   focused  :boolean,   tintColor  :string}): react.react.ReactNode} */
trait Props extends js.Object {
  var activeColorDark: js.UndefOr[String] = js.undefined
  var activeColorLight: js.UndefOr[String] = js.undefined
  var barStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var barStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var descriptors: StringDictionary[
    NavigationDescriptor[
      _, 
      Options, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  var inactiveColorDark: js.UndefOr[String] = js.undefined
  var inactiveColorLight: js.UndefOr[String] = js.undefined
  var navigation: NavigationProp[_]
  var screenProps: js.UndefOr[js.Any] = js.undefined
  def renderIcon(options: AnonTintColor): Node
}

object Props {
  @scala.inline
  def apply(
    descriptors: StringDictionary[
      NavigationDescriptor[
        _, 
        Options, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigation: NavigationProp[_],
    renderIcon: AnonTintColor => CallbackTo[Node],
    activeColorDark: String = null,
    activeColorLight: String = null,
    barStyleDark: StyleProp[ViewStyle] = null,
    barStyleLight: StyleProp[ViewStyle] = null,
    inactiveColorDark: String = null,
    inactiveColorLight: String = null,
    screenProps: js.Any = null
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    __obj.updateDynamic("renderIcon")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationMaterialBottomTabs.AnonTintColor) => renderIcon(t0).runNow()))
    if (activeColorDark != null) __obj.updateDynamic("activeColorDark")(activeColorDark.asInstanceOf[js.Any])
    if (activeColorLight != null) __obj.updateDynamic("activeColorLight")(activeColorLight.asInstanceOf[js.Any])
    if (barStyleDark != null) __obj.updateDynamic("barStyleDark")(barStyleDark.asInstanceOf[js.Any])
    if (barStyleLight != null) __obj.updateDynamic("barStyleLight")(barStyleLight.asInstanceOf[js.Any])
    if (inactiveColorDark != null) __obj.updateDynamic("inactiveColorDark")(inactiveColorDark.asInstanceOf[js.Any])
    if (inactiveColorLight != null) __obj.updateDynamic("inactiveColorLight")(inactiveColorLight.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

