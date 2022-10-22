package typingsJapgolly.wordpressNux

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressNux.componentsDotTipMod.DotTip.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDotTipMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/nux/components/dot-tip", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DotTip {
    
    trait Props extends StObject {
      
      /**
        * Any React element or elements can be passed as children. They will be rendered within the
        * tip bubble.
        */
      var children: Node
      
      /**
        * A string that uniquely identifies the tip. Identifiers should be prefixed with the name
        * of the plugin, followed by a `/`. For example, `acme/add-to-cart`.
        */
      var tipId: String
    }
    object Props {
      
      inline def apply(tipId: String): Props = {
        val __obj = js.Dynamic.literal(tipId = tipId.asInstanceOf[js.Any], children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setTipId(value: String): Self = StObject.set(x, "tipId", value.asInstanceOf[js.Any])
      }
    }
  }
}
