package typingsJapgolly.reactDashNavigationDashDrawer.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.DrawerContentComponentProps
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerState
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.SceneDescriptorMap
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod.Props
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod.default
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.left
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerSidebar {
  def apply(
    descriptors: SceneDescriptorMap,
    drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    drawerPosition: left | right,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    contentComponent: ComponentType[DrawerContentComponentProps] = null,
    contentOptions: js.Object = null,
    screenProps: js.Any = null,
    style: ViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
  
      if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerSidebarMod.Props])(children: _*)
  }
  @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerSidebar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

