package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.protonNative.mod.MenuItemProps
import typingsJapgolly.protonNative.protonNativeStrings.About
import typingsJapgolly.protonNative.protonNativeStrings.Check
import typingsJapgolly.protonNative.protonNativeStrings.Item
import typingsJapgolly.protonNative.protonNativeStrings.Preferences
import typingsJapgolly.protonNative.protonNativeStrings.Quit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItem {
  
  @JSImport("proton-native", "MenuItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.protonNative.mod.MenuItem] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* checked */ Boolean => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
    
    inline def `type`(
      value: Check | Quit | About | Preferences | typingsJapgolly.protonNative.protonNativeStrings.Separator | Item
    ): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
