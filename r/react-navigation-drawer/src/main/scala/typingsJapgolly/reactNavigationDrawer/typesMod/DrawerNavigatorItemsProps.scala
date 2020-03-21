package typingsJapgolly.reactNavigationDrawer.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationDrawer.AnonFocused
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNavigatorItemsProps extends js.Object {
  var activeBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
  var activeItemKey: js.UndefOr[String | Null] = js.undefined
  var activeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var activeTintColor: js.UndefOr[String | ThemedColor] = js.undefined
  var drawerPosition: left | right
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
  var inactiveLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var inactiveTintColor: js.UndefOr[String | ThemedColor] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var items: js.Array[NavigationRoute[NavigationParams]]
  var itemsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var screenProps: js.Any
  def getLabel(scene: Scene): Node
  def onItemPress(scene: AnonFocused): Unit
  def renderIcon(scene: Scene): Node
}

object DrawerNavigatorItemsProps {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    getLabel: Scene => CallbackTo[Node],
    items: js.Array[NavigationRoute[NavigationParams]],
    onItemPress: AnonFocused => Callback,
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
  ): DrawerNavigatorItemsProps = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.updateDynamic("getLabel")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationDrawer.typesMod.Scene) => getLabel(t0).runNow()))
    __obj.updateDynamic("onItemPress")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationDrawer.AnonFocused) => onItemPress(t0).runNow()))
    __obj.updateDynamic("renderIcon")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationDrawer.typesMod.Scene) => renderIcon(t0).runNow()))
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
    __obj.asInstanceOf[DrawerNavigatorItemsProps]
  }
}

