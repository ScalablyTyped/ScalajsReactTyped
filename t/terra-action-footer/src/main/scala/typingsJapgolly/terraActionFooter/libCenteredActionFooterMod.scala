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

object libCenteredActionFooterMod extends Shortcut {
  
  @JSImport("terra-action-footer/lib/CenteredActionFooter", JSImport.Default)
  @js.native
  val default: FC[CenteredActionFooterProps] = js.native
  
  trait CenteredActionFooterProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Actions to be displayed in the center socket
      */
    var center: js.UndefOr[Node] = js.undefined
  }
  object CenteredActionFooterProps {
    
    inline def apply(): CenteredActionFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CenteredActionFooterProps]
    }
    
    extension [Self <: CenteredActionFooterProps](x: Self) {
      
      inline def setCenter(value: VdomNode): Self = StObject.set(x, "center", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCenterNull: Self = StObject.set(x, "center", null)
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCenterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setCenterVdomElement(value: VdomElement): Self = StObject.set(x, "center", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[CenteredActionFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `libCenteredActionFooterMod.foo` */
  override def _to: FC[CenteredActionFooterProps] = default
}
