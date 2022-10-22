package typingsJapgolly.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMenuMenuHeaderMod.MenuHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMenuMenuMod.MenuComponent
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMenuMenuMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Menu")
@js.native
open class Menu protected ()
  extends Component[MenuProps, js.Object, Any] {
  def this(props: MenuProps) = this()
  def this(props: MenuProps, context: Any) = this()
}
object Menu extends Shortcut {
  
  @JSImport("semantic-ui-react", "Menu")
  @js.native
  val ^ : MenuComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Menu.Header")
  @js.native
  open class Header protected ()
    extends Component[MenuHeaderProps, js.Object, Any] {
    def this(props: MenuHeaderProps) = this()
    def this(props: MenuHeaderProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Menu.Item")
  @js.native
  open class Item protected ()
    extends Component[MenuItemProps, js.Object, Any] {
    def this(props: MenuItemProps) = this()
    def this(props: MenuItemProps, context: Any) = this()
  }
  
  type _To = MenuComponent
  
  /* This means you don't have to write `^`, but can instead just say `Menu.foo` */
  override def _to: MenuComponent = ^
}
