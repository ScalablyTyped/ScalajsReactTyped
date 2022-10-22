package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "MenuItem")
@js.native
open class MenuItem protected ()
  extends Component[MenuItemProps, js.Object, Any] {
  def this(props: MenuItemProps) = this()
  def this(props: MenuItemProps, context: Any) = this()
}
object MenuItem {
  
  inline def apply: ComponentClassP[MenuItemProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("MenuItem").asInstanceOf[ComponentClassP[MenuItemProps & js.Object]]
}
