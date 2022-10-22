package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactBootstrap.libDropdownMod.DropdownBaseProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDropdownButtonMod {
  
  @JSImport("react-bootstrap/lib/DropdownButton", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[DropdownButtonProps, js.Object, Any]
  
  type DropdownButton = japgolly.scalajs.react.facade.React.Component[DropdownButtonProps & js.Object, js.Object]
  
  trait DropdownButtonBaseProps
    extends StObject
       with DropdownBaseProps {
    
    var block: js.UndefOr[Boolean] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String | Null] = js.undefined
    
    var navItem: js.UndefOr[Boolean] = js.undefined
    
    var noCaret: js.UndefOr[Boolean] = js.undefined
    
    var title: Node
  }
  object DropdownButtonBaseProps {
    
    inline def apply(id: String): DropdownButtonBaseProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[DropdownButtonBaseProps]
    }
    
    extension [Self <: DropdownButtonBaseProps](x: Self) {
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleNull: Self = StObject.set(x, "bsStyle", null)
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setNavItem(value: Boolean): Self = StObject.set(x, "navItem", value.asInstanceOf[js.Any])
      
      inline def setNavItemUndefined: Self = StObject.set(x, "navItem", js.undefined)
      
      inline def setNoCaret(value: Boolean): Self = StObject.set(x, "noCaret", value.asInstanceOf[js.Any])
      
      inline def setNoCaretUndefined: Self = StObject.set(x, "noCaret", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/DropdownButton.DropdownButton> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/DropdownButton.DropdownButton>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/DropdownButton.DropdownButton>[P]} */ trait DropdownButtonProps
    extends StObject
       with DropdownButtonBaseProps
  object DropdownButtonProps {
    
    inline def apply(id: String): DropdownButtonProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[DropdownButtonProps]
    }
  }
}
