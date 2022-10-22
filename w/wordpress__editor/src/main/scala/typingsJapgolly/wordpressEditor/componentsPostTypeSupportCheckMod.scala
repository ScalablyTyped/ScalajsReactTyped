package typingsJapgolly.wordpressEditor

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressEditor.componentsPostTypeSupportCheckMod.PostTypeSupportCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPostTypeSupportCheckMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-type-support-check", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostTypeSupportCheck {
    
    trait Props extends StObject {
      
      var children: Node
      
      var supportKeys: String | js.Array[String]
    }
    object Props {
      
      inline def apply(supportKeys: String | js.Array[String]): Props = {
        val __obj = js.Dynamic.literal(supportKeys = supportKeys.asInstanceOf[js.Any], children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setSupportKeys(value: String | js.Array[String]): Self = StObject.set(x, "supportKeys", value.asInstanceOf[js.Any])
        
        inline def setSupportKeysVarargs(value: String*): Self = StObject.set(x, "supportKeys", js.Array(value*))
      }
    }
  }
}
