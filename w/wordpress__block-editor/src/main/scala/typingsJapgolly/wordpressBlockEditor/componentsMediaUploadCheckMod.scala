package typingsJapgolly.wordpressBlockEditor

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressBlockEditor.componentsMediaUploadCheckMod.MediaUploadCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMediaUploadCheckMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/media-upload/check", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object MediaUploadCheck {
    
    trait Props extends StObject {
      
      var children: Node
      
      var fallback: js.UndefOr[Node] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal(children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setFallback(value: VdomNode): Self = StObject.set(x, "fallback", value.rawNode.asInstanceOf[js.Any])
        
        inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
        
        inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
        
        inline def setFallbackVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "fallback", js.Array(value*))
        
        inline def setFallbackVdomElement(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
      }
    }
  }
}
