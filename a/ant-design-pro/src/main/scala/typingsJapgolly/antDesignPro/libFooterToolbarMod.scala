package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterToolbarMod {
  
  @JSImport("ant-design-pro/lib/FooterToolbar", JSImport.Default)
  @js.native
  open class default () extends Component[FooterToolbarProps, Any, Any]
  
  type FooterToolbar = japgolly.scalajs.react.facade.React.Component[FooterToolbarProps & js.Object, js.Object]
  
  trait FooterToolbarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var extra: Node
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FooterToolbarProps {
    
    inline def apply(): FooterToolbarProps = {
      val __obj = js.Dynamic.literal(extra = null)
      __obj.asInstanceOf[FooterToolbarProps]
    }
    
    extension [Self <: FooterToolbarProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtra(value: VdomNode): Self = StObject.set(x, "extra", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExtraNull: Self = StObject.set(x, "extra", null)
      
      inline def setExtraVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extra", js.Array(value*))
      
      inline def setExtraVdomElement(value: VdomElement): Self = StObject.set(x, "extra", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
