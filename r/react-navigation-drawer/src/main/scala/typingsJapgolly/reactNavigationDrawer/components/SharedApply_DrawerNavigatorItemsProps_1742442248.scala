package typingsJapgolly.reactNavigationDrawer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationDrawer.AnonFocused
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsJapgolly.reactNavigationDrawer.typesMod.DrawerNavigatorItemsProps
import typingsJapgolly.reactNavigationDrawer.typesMod.Scene
import typingsJapgolly.reactNavigationDrawer.typesMod.ThemedColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DrawerNavigatorItemsProps_1742442248[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    drawerPosition: left | right,
    items: js.Array[NavigationRoute[NavigationParams]],
    screenProps: js.Any,
    getLabel: Scene => CallbackTo[Node],
    onItemPress: AnonFocused => Callback,
    renderIcon: Scene => CallbackTo[Node],
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
    labelStyle: StyleProp[TextStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DrawerNavigatorItemsProps, ComponentRef, Unit, DrawerNavigatorItemsProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationDrawer.typesMod.DrawerNavigatorItemsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationDrawer.typesMod.DrawerNavigatorItemsProps])(children: _*)
  }
}

