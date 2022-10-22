package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownDividerMod.DropdownDividerProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownHeaderMod.DropdownHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownMenuMod.DropdownMenuProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownMod.StrictDropdownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsSelectSelectMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", JSImport.Default)
    @js.native
    val ^ : SelectComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", "default.Divider")
    @js.native
    open class Divider protected ()
      extends Component[DropdownDividerProps, js.Object, Any] {
      def this(props: DropdownDividerProps) = this()
      def this(props: DropdownDividerProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", "default.Header")
    @js.native
    open class Header protected ()
      extends Component[DropdownHeaderProps, js.Object, Any] {
      def this(props: DropdownHeaderProps) = this()
      def this(props: DropdownHeaderProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", "default.Item")
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
  
  @js.native
  trait SelectComponent
    extends StObject
       with FunctionComponent[SelectProps] {
    
    var Divider: ComponentClassP[DropdownDividerProps & js.Object] = js.native
    
    var Header: ComponentClassP[DropdownHeaderProps & js.Object] = js.native
    
    var Item: ComponentClassP[DropdownItemProps & js.Object] = js.native
    
    var Menu: FC[DropdownMenuProps] = js.native
  }
  
  trait SelectProps
    extends StObject
       with StrictSelectProps
       with /* key */ StringDictionary[Any]
  object SelectProps {
    
    inline def apply(options: js.Array[DropdownItemProps]): SelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
  }
  
  trait StrictSelectProps
    extends StObject
       with StrictDropdownProps {
    
    /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
    @JSName("options")
    var options_StrictSelectProps: js.Array[DropdownItemProps]
  }
  object StrictSelectProps {
    
    inline def apply(options: js.Array[DropdownItemProps]): StrictSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictSelectProps]
    }
    
    extension [Self <: StrictSelectProps](x: Self) {
      
      inline def setOptions(value: js.Array[DropdownItemProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: DropdownItemProps*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
}
