package typingsJapgolly.reactMdMenu.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdMenu.typesMenuKeyboardFocusProviderMod.MenuKeyboardFocusProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuKeyboardFocusProvider {
  
  @JSImport("@react-md/menu", "MenuKeyboardFocusProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuKeyboardFocusProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuKeyboardFocusProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
