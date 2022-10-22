package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.grommet.anon.SkipTo
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsSkipLinksMod {
  
  @JSImport("grommet/es6/components/SkipLinks", "SkipLinks")
  @js.native
  val SkipLinks: FC[SkipLinksProps] = js.native
  
  trait SkipLinksProps extends StObject {
    
    var children: Node
    
    var messages: js.UndefOr[SkipTo] = js.undefined
  }
  object SkipLinksProps {
    
    inline def apply(): SkipLinksProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[SkipLinksProps]
    }
    
    extension [Self <: SkipLinksProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMessages(value: SkipTo): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    }
  }
}
