package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice.Choice
import typingsJapgolly.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItemsChoice {
  
  inline def apply(choices: js.Array[Choice], onSelect: String => Callback, value: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1((t0: String) => onSelect(t0).runNow()), value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "MenuItemsChoice")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
