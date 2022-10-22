package typingsJapgolly.rcMenu

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSubMenuInlineSubMenuListMod {
  
  @JSImport("rc-menu/es/SubMenu/InlineSubMenuList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasIdOpenKeyPathChildren: InlineSubMenuListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIdOpenKeyPathChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait InlineSubMenuListProps extends StObject {
    
    var children: Node
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyPath: js.Array[String]
    
    var open: Boolean
  }
  object InlineSubMenuListProps {
    
    inline def apply(keyPath: js.Array[String], open: Boolean): InlineSubMenuListProps = {
      val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[InlineSubMenuListProps]
    }
    
    extension [Self <: InlineSubMenuListProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyPath(value: js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value*))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
