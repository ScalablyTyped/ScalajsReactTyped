package typingsJapgolly.reactNavigationDrawer.components

import org.scalajs.dom.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.DrawerContentComponentProps
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerState
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.SceneDescriptorMap
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsDrawerSidebarMod.Props
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerSidebar {
  
  inline def apply(
    descriptors: SceneDescriptorMap,
    drawerOpenProgress: Node,
    drawerPosition: left | right,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
  ): Builder = {
    val __props = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-drawer", "DrawerSidebar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNavigationDrawer.mod.DrawerSidebar] {
    
    inline def contentComponent(value: ComponentType[DrawerContentComponentProps]): this.type = set("contentComponent", value.asInstanceOf[js.Any])
    
    inline def contentOptions(value: js.Object): this.type = set("contentOptions", value.asInstanceOf[js.Any])
    
    inline def screenProps(value: Any): this.type = set("screenProps", value.asInstanceOf[js.Any])
    
    inline def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
