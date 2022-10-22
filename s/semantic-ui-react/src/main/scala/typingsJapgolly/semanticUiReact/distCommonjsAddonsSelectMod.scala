package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsAddonsSelectSelectMod.SelectComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownDividerMod.DropdownDividerProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownHeaderMod.DropdownHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsSelectMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select", JSImport.Default)
    @js.native
    val ^ : SelectComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select", "default.Divider")
    @js.native
    open class Divider protected ()
      extends Component[DropdownDividerProps, js.Object, Any] {
      def this(props: DropdownDividerProps) = this()
      def this(props: DropdownDividerProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select", "default.Header")
    @js.native
    open class Header protected ()
      extends Component[DropdownHeaderProps, js.Object, Any] {
      def this(props: DropdownHeaderProps) = this()
      def this(props: DropdownHeaderProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select", "default.Item")
    @js.native
    open class Item protected ()
      extends Component[DropdownItemProps, js.Object, Any] {
      def this(props: DropdownItemProps) = this()
      def this(props: DropdownItemProps, context: Any) = this()
    }
    
    type _To = SelectComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: SelectComponent = ^
  }
}
