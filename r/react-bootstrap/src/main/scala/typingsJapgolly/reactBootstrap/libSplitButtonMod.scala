package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSplitButtonMod {
  
  @JSImport("react-bootstrap/lib/SplitButton", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[SplitButtonProps, js.Object, Any]
  
  type SplitButton = japgolly.scalajs.react.facade.React.Component[SplitButtonProps & js.Object, js.Object]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>[P]} */ trait SplitButtonProps extends StObject {
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var dropdownTitle: js.UndefOr[Any] = js.undefined
    
    // TODO: Add more specific type
    var dropup: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
    
    var title: Node
  }
  object SplitButtonProps {
    
    inline def apply(id: String): SplitButtonProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[SplitButtonProps]
    }
    
    extension [Self <: SplitButtonProps](x: Self) {
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setDropdownTitle(value: Any): Self = StObject.set(x, "dropdownTitle", value.asInstanceOf[js.Any])
      
      inline def setDropdownTitleUndefined: Self = StObject.set(x, "dropdownTitle", js.undefined)
      
      inline def setDropup(value: Boolean): Self = StObject.set(x, "dropup", value.asInstanceOf[js.Any])
      
      inline def setDropupUndefined: Self = StObject.set(x, "dropup", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      inline def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
