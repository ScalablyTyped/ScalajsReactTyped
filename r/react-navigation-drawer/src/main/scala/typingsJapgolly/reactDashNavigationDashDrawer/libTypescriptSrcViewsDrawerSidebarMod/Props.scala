package typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod

import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.DrawerContentComponentProps
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerState
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.SceneDescriptorMap
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.left
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
  var contentOptions: js.UndefOr[js.Object] = js.undefined
  var descriptors: SceneDescriptorMap
  var drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var drawerPosition: left | right
  var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
  var screenProps: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[ViewStyle] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    drawerPosition: left | right,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    contentComponent: ComponentType[DrawerContentComponentProps] = null,
    contentOptions: js.Object = null,
    screenProps: js.Any = null,
    style: ViewStyle = null
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

