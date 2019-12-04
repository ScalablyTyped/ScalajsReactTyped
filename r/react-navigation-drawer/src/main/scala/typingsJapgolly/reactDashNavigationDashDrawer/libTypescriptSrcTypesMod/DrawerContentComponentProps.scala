package typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.TextStyle
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsJapgolly.reactDashNavigationDashDrawer.Anon_Focused
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.left
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.DrawerNavigatorItemsProps & {  navigation  :react-navigation.react-navigation.NavigationScreenProp<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.NavigationDrawerState, react-navigation.react-navigation.NavigationParams>,   descriptors  :react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.SceneDescriptorMap,   drawerOpenProgress  :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any,   screenProps  :unknown} */
trait DrawerContentComponentProps extends js.Object {
  var activeBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
  var activeItemKey: js.UndefOr[String | Null] = js.undefined
  var activeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var activeTintColor: js.UndefOr[String | ThemedColor] = js.undefined
  var descriptors: SceneDescriptorMap
  var drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var drawerPosition: left | right
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
  var inactiveLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var inactiveTintColor: js.UndefOr[String | ThemedColor] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var items: js.Array[NavigationRoute[NavigationParams]]
  var itemsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
  var screenProps: js.Any
  def getLabel(scene: Scene): Node
  def onItemPress(scene: Anon_Focused): Unit
  def renderIcon(scene: Scene): Node
}

object DrawerContentComponentProps {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    drawerPosition: left | right,
    getLabel: Scene => CallbackTo[Node],
    items: js.Array[NavigationRoute[NavigationParams]],
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    onItemPress: Anon_Focused => Callback,
    renderIcon: Scene => CallbackTo[Node],
    screenProps: js.Any,
    activeBackgroundColor: String | ThemedColor = null,
    activeItemKey: String = null,
    activeLabelStyle: StyleProp[TextStyle] = null,
    activeTintColor: String | ThemedColor = null,
    iconContainerStyle: StyleProp[ViewStyle] = null,
    inactiveBackgroundColor: String | ThemedColor = null,
    inactiveLabelStyle: StyleProp[TextStyle] = null,
    inactiveTintColor: String | ThemedColor = null,
    itemStyle: StyleProp[ViewStyle] = null,
    itemsContainerStyle: StyleProp[ViewStyle] = null,
    labelStyle: StyleProp[TextStyle] = null
  ): DrawerContentComponentProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.updateDynamic("getLabel")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.Scene) => getLabel(t0).runNow()))
    __obj.updateDynamic("onItemPress")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNavigationDashDrawer.Anon_Focused) => onItemPress(t0).runNow()))
    __obj.updateDynamic("renderIcon")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.Scene) => renderIcon(t0).runNow()))
    if (activeBackgroundColor != null) __obj.updateDynamic("activeBackgroundColor")(activeBackgroundColor.asInstanceOf[js.Any])
    if (activeItemKey != null) __obj.updateDynamic("activeItemKey")(activeItemKey.asInstanceOf[js.Any])
    if (activeLabelStyle != null) __obj.updateDynamic("activeLabelStyle")(activeLabelStyle.asInstanceOf[js.Any])
    if (activeTintColor != null) __obj.updateDynamic("activeTintColor")(activeTintColor.asInstanceOf[js.Any])
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (inactiveBackgroundColor != null) __obj.updateDynamic("inactiveBackgroundColor")(inactiveBackgroundColor.asInstanceOf[js.Any])
    if (inactiveLabelStyle != null) __obj.updateDynamic("inactiveLabelStyle")(inactiveLabelStyle.asInstanceOf[js.Any])
    if (inactiveTintColor != null) __obj.updateDynamic("inactiveTintColor")(inactiveTintColor.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (itemsContainerStyle != null) __obj.updateDynamic("itemsContainerStyle")(itemsContainerStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerContentComponentProps]
  }
}

