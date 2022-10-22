package typingsJapgolly.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownDividerMod.DropdownDividerProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownHeaderMod.DropdownHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownMod.DropdownComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownMod.DropdownProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownSearchInputMod.DropdownSearchInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Dropdown")
@js.native
open class Dropdown protected ()
  extends Component[DropdownProps, js.Object, Any] {
  def this(props: DropdownProps) = this()
  def this(props: DropdownProps, context: Any) = this()
}
object Dropdown extends Shortcut {
  
  @JSImport("semantic-ui-react", "Dropdown")
  @js.native
  val ^ : DropdownComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.Divider")
  @js.native
  open class Divider protected ()
    extends Component[DropdownDividerProps, js.Object, Any] {
    def this(props: DropdownDividerProps) = this()
    def this(props: DropdownDividerProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.Header")
  @js.native
  open class Header protected ()
    extends Component[DropdownHeaderProps, js.Object, Any] {
    def this(props: DropdownHeaderProps) = this()
    def this(props: DropdownHeaderProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.Item")
  @js.native
  open class Item protected ()
    extends Component[DropdownItemProps, js.Object, Any] {
    def this(props: DropdownItemProps) = this()
    def this(props: DropdownItemProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.SearchInput")
  @js.native
  open class SearchInput protected ()
    extends Component[DropdownSearchInputProps, js.Object, Any] {
    def this(props: DropdownSearchInputProps) = this()
    def this(props: DropdownSearchInputProps, context: Any) = this()
  }
  
  type _To = DropdownComponent
  
  /* This means you don't have to write `^`, but can instead just say `Dropdown.foo` */
  override def _to: DropdownComponent = ^
}
