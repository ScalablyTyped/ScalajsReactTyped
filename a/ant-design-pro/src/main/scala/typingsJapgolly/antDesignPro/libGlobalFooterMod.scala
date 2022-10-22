package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.anon.BlankTarget
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGlobalFooterMod {
  
  @JSImport("ant-design-pro/lib/GlobalFooter", JSImport.Default)
  @js.native
  open class default () extends Component[GlobalFooterProps, Any, Any]
  
  type GlobalFooter = japgolly.scalajs.react.facade.React.Component[GlobalFooterProps & js.Object, js.Object]
  
  trait GlobalFooterProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var copyright: js.UndefOr[Node] = js.undefined
    
    var links: js.UndefOr[js.Array[BlankTarget]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object GlobalFooterProps {
    
    inline def apply(): GlobalFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalFooterProps]
    }
    
    extension [Self <: GlobalFooterProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCopyright(value: VdomNode): Self = StObject.set(x, "copyright", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCopyrightNull: Self = StObject.set(x, "copyright", null)
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setCopyrightVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "copyright", js.Array(value*))
      
      inline def setCopyrightVdomElement(value: VdomElement): Self = StObject.set(x, "copyright", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLinks(value: js.Array[BlankTarget]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: BlankTarget*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
