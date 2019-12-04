package typingsJapgolly.reactDashNavigationDashDrawer.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsJapgolly.reactDashNavigationDashDrawer.DrawerOptionscontentComponentComponentTypeDrawerCo
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerState
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.SceneDescriptorMap
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.Props
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerView {
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    navigationConfig: DrawerOptionscontentComponentComponentTypeDrawerCo,
    screenProps: js.Any,
    `lazy`: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
  
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod.Props])(children: _*)
  }
  @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

