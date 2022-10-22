package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.wordpressComponents.focusableIframeMod.FocusableIframe.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusableIframeMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/focusable-iframe", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object FocusableIframe {
    
    trait Props
      extends StObject
         with HTMLProps[HTMLIFrameElement] {
      
      var iframeRef: js.UndefOr[RefHandle[HTMLIFrameElement]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setIframeRef(value: RefHandle[HTMLIFrameElement]): Self = StObject.set(x, "iframeRef", value.asInstanceOf[js.Any])
        
        inline def setIframeRefUndefined: Self = StObject.set(x, "iframeRef", js.undefined)
      }
    }
  }
}
