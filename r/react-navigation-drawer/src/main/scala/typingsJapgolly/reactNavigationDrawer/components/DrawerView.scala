package typingsJapgolly.reactNavigationDrawer.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigationDrawer.anon.DrawerOptionscontentCompo
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerState
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.SceneDescriptorMap
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsDrawerViewMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerView {
  
  inline def apply(
    descriptors: SceneDescriptorMap,
    detachInactiveScreens: Boolean,
    `lazy`: Boolean,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    navigationConfig: DrawerOptionscontentCompo,
    screenProps: Any
  ): Default[typingsJapgolly.reactNavigationDrawer.mod.DrawerView] = {
    val __props = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], detachInactiveScreens = detachInactiveScreens.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __props.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactNavigationDrawer.mod.DrawerView](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-drawer", "DrawerView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[typingsJapgolly.reactNavigationDrawer.mod.DrawerView] = new Default[typingsJapgolly.reactNavigationDrawer.mod.DrawerView](js.Array(this.component, p.asInstanceOf[js.Any]))
}
