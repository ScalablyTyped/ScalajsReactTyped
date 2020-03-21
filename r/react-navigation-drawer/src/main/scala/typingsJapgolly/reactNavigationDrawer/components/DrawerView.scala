package typingsJapgolly.reactNavigationDrawer.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigationDrawer.DrawerOptionscontentCompo
import typingsJapgolly.reactNavigationDrawer.drawerViewMod.Props
import typingsJapgolly.reactNavigationDrawer.drawerViewMod.default
import typingsJapgolly.reactNavigationDrawer.typesMod.NavigationDrawerState
import typingsJapgolly.reactNavigationDrawer.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerView {
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    navigationConfig: DrawerOptionscontentCompo,
    screenProps: js.Any,
    `lazy`: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
  
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationDrawer.drawerViewMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationDrawer.drawerViewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationDrawer.drawerViewMod.Props])(children: _*)
  }
  @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

