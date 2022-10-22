package typingsJapgolly.reactNativeTabNavigator.components

import typingsJapgolly.reactNativeTabNavigator.mod.TabNavigatorItemProps
import typingsJapgolly.reactNativeTabNavigator.mod.TabNavigatorProps
import typingsJapgolly.reactNativeTabNavigator.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeTabNavigator {
  
  object Item {
    
    @JSImport("react-native-tab-navigator", "default.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_TabNavigatorItemProps_223498006[typingsJapgolly.reactNativeTabNavigator.mod.default.Item] = new SharedBuilder_TabNavigatorItemProps_223498006[typingsJapgolly.reactNativeTabNavigator.mod.default.Item](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabNavigatorItemProps): SharedBuilder_TabNavigatorItemProps_223498006[typingsJapgolly.reactNativeTabNavigator.mod.default.Item] = new SharedBuilder_TabNavigatorItemProps_223498006[typingsJapgolly.reactNativeTabNavigator.mod.default.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-tab-navigator", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativeTabNavigator.type): SharedBuilder_TabNavigatorProps_923531019[default] = new SharedBuilder_TabNavigatorProps_923531019[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabNavigatorProps): SharedBuilder_TabNavigatorProps_923531019[default] = new SharedBuilder_TabNavigatorProps_923531019[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
