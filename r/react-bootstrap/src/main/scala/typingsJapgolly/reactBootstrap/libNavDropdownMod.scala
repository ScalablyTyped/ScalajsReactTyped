package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactBootstrap.libDropdownMod.DropdownBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavDropdownMod {
  
  @JSImport("react-bootstrap/lib/NavDropdown", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavDropdownProps, js.Object, Any]
  
  type NavDropdown = japgolly.scalajs.react.facade.React.Component[NavDropdownProps & js.Object, js.Object]
  
  trait NavDropdownBaseProps
    extends StObject
       with DropdownBaseProps {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[Any] = js.undefined
    
    var noCaret: js.UndefOr[Boolean] = js.undefined
    
    var title: Node
  }
  object NavDropdownBaseProps {
    
    inline def apply(id: String): NavDropdownBaseProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[NavDropdownBaseProps]
    }
    
    extension [Self <: NavDropdownBaseProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setEventKey(value: Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setNoCaret(value: Boolean): Self = StObject.set(x, "noCaret", value.asInstanceOf[js.Any])
      
      inline def setNoCaretUndefined: Self = StObject.set(x, "noCaret", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/NavDropdown.NavDropdown> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/NavDropdown.NavDropdown>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/NavDropdown.NavDropdown>[P]} */ trait NavDropdownProps
    extends StObject
       with NavDropdownBaseProps
  object NavDropdownProps {
    
    inline def apply(id: String): NavDropdownProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[NavDropdownProps]
    }
  }
}
