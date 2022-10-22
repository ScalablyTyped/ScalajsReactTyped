package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListItemActionMod {
  
  @JSImport("react-toolbox/components/list/ListItemAction", "ListItemAction")
  @js.native
  open class ListItemAction protected ()
    extends Component[ListItemActionProps, js.Object, Any] {
    def this(props: ListItemActionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemActionProps, context: Any) = this()
  }
  
  trait ListItemActionProps extends StObject {
    
    /**
      * List item action.
      */
    var action: js.UndefOr[Node] = js.undefined
    
    /**
      * Object defining the component class name mappings.
      */
    var theme: js.UndefOr[ListItemActionTheme] = js.undefined
  }
  object ListItemActionProps {
    
    inline def apply(): ListItemActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemActionProps]
    }
    
    extension [Self <: ListItemActionProps](x: Self) {
      
      inline def setAction(value: VdomNode): Self = StObject.set(x, "action", value.rawNode.asInstanceOf[js.Any])
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "action", js.Array(value*))
      
      inline def setActionVdomElement(value: VdomElement): Self = StObject.set(x, "action", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: ListItemActionTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ListItemActionTheme extends StObject {
    
    /**
      * Used for each action element (left/right).
      */
    var itemAction: js.UndefOr[String] = js.undefined
  }
  object ListItemActionTheme {
    
    inline def apply(): ListItemActionTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemActionTheme]
    }
    
    extension [Self <: ListItemActionTheme](x: Self) {
      
      inline def setItemAction(value: String): Self = StObject.set(x, "itemAction", value.asInstanceOf[js.Any])
      
      inline def setItemActionUndefined: Self = StObject.set(x, "itemAction", js.undefined)
    }
  }
}
