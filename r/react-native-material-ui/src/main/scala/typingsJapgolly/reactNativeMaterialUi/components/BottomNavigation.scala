package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.anon.Active
import typingsJapgolly.reactNativeMaterialUi.anon.`0`
import typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigationAction
import typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BottomNavigation {
  
  inline def apply(children: Element | js.Array[Element]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BottomNavigationProps]))
  }
  
  object Action {
    
    inline def apply(active: Boolean, icon: Element | String): typingsJapgolly.reactNativeMaterialUi.components.BottomNavigation.Action.Builder = {
      val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
      new typingsJapgolly.reactNativeMaterialUi.components.BottomNavigation.Action.Builder(js.Array(this.component, __props.asInstanceOf[BottomNavigationAction]))
    }
    
    @JSImport("react-native-material-ui", "BottomNavigation.Action")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigation.Action] {
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      
      inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
      
      inline def style(value: Active): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: BottomNavigationAction): typingsJapgolly.reactNativeMaterialUi.components.BottomNavigation.Action.Builder = new typingsJapgolly.reactNativeMaterialUi.components.BottomNavigation.Action.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-material-ui", "BottomNavigation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigation] {
    
    inline def active(value: String): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def style(value: `0`): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BottomNavigationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
