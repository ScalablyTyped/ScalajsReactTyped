package typingsJapgolly.reactMdMenu.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdMenu.typesMenuVisibilityProviderMod.MenuVisibilityProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuVisibilityProvider {
  
  inline def apply(setVisible: SetStateAction[Boolean] => Callback, visible: Boolean): Default[js.Object] = {
    val __props = js.Dynamic.literal(setVisible = js.Any.fromFunction1((t0: SetStateAction[Boolean]) => setVisible(t0).runNow()), visible = visible.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MenuVisibilityProviderProps]))
  }
  
  @JSImport("@react-md/menu", "MenuVisibilityProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MenuVisibilityProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
