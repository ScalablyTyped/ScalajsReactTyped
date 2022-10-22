package typingsJapgolly.reactNavigationDrawer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationDrawer.anon.Focused
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.DrawerNavigatorItemsProps
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.Scene
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerNavigatorItems {
  
  inline def apply(
    drawerPosition: left | right,
    getLabel: Scene => Node,
    items: js.Array[NavigationRoute[NavigationParams]],
    onItemPress: Focused => Callback,
    renderIcon: Scene => Node,
    screenProps: Any
  ): SharedBuilder_DrawerNavigatorItemsProps2141653061[typingsJapgolly.reactNavigationDrawer.mod.DrawerNavigatorItems] = {
    val __props = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1((t0: Focused) => onItemPress(t0).runNow()), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
    new SharedBuilder_DrawerNavigatorItemsProps2141653061[typingsJapgolly.reactNavigationDrawer.mod.DrawerNavigatorItems](js.Array(this.component, __props.asInstanceOf[DrawerNavigatorItemsProps]))
  }
  
  @JSImport("react-navigation-drawer", "DrawerNavigatorItems")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DrawerNavigatorItemsProps): SharedBuilder_DrawerNavigatorItemsProps2141653061[typingsJapgolly.reactNavigationDrawer.mod.DrawerNavigatorItems] = new SharedBuilder_DrawerNavigatorItemsProps2141653061[typingsJapgolly.reactNavigationDrawer.mod.DrawerNavigatorItems](js.Array(this.component, p.asInstanceOf[js.Any]))
}
