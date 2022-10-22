package typingsJapgolly.terraActionFooter

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActionFooterMod extends Shortcut {
  
  @JSImport("terra-action-footer/lib/ActionFooter", JSImport.Default)
  @js.native
  val default: FC[ActionFooterProps] = js.native
  
  trait ActionFooterProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Actions to be displayed in the end socket
      */
    var end: js.UndefOr[Node] = js.undefined
    
    /**
      * Actions to be displayed in the start socket
      */
    var start: js.UndefOr[Node] = js.undefined
  }
  object ActionFooterProps {
    
    inline def apply(): ActionFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFooterProps]
    }
    
    extension [Self <: ActionFooterProps](x: Self) {
      
      inline def setEnd(value: VdomNode): Self = StObject.set(x, "end", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setEndVdomElement(value: VdomElement): Self = StObject.set(x, "end", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStart(value: VdomNode): Self = StObject.set(x, "start", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "start", js.Array(value*))
      
      inline def setStartVdomElement(value: VdomElement): Self = StObject.set(x, "start", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[ActionFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `libActionFooterMod.foo` */
  override def _to: FC[ActionFooterProps] = default
}
