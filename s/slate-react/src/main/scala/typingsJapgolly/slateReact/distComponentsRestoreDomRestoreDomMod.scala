package typingsJapgolly.slateReact

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsRestoreDomRestoreDomMod {
  
  @JSImport("slate-react/dist/components/restore-dom/restore-dom", "RestoreDOM")
  @js.native
  val RestoreDOM: ComponentType[RestoreDOMProps] = js.native
  
  trait RestoreDOMProps extends StObject {
    
    var node: RefHandle[HTMLDivElement]
    
    var receivedUserInput: RefHandle[Boolean]
  }
  object RestoreDOMProps {
    
    inline def apply(node: RefHandle[HTMLDivElement], receivedUserInput: RefHandle[Boolean]): RestoreDOMProps = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], receivedUserInput = receivedUserInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreDOMProps]
    }
    
    extension [Self <: RestoreDOMProps](x: Self) {
      
      inline def setNode(value: RefHandle[HTMLDivElement]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setReceivedUserInput(value: RefHandle[Boolean]): Self = StObject.set(x, "receivedUserInput", value.asInstanceOf[js.Any])
    }
  }
}
