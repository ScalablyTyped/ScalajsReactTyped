package typingsJapgolly.reactTreeview

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-treeview", JSImport.Namespace)
  @js.native
  open class ^ () extends Component[TreeProps, Any, Any]
  
  trait TreeProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var childrenClassName: js.UndefOr[String] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var defaultCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var itemClassName: js.UndefOr[String] = js.undefined
    
    var nodeLabel: Node
    
    var treeViewClassName: js.UndefOr[String] = js.undefined
  }
  object TreeProps {
    
    inline def apply(): TreeProps = {
      val __obj = js.Dynamic.literal(nodeLabel = null)
      __obj.asInstanceOf[TreeProps]
    }
    
    extension [Self <: TreeProps](x: Self) {
      
      inline def setChildrenClassName(value: String): Self = StObject.set(x, "childrenClassName", value.asInstanceOf[js.Any])
      
      inline def setChildrenClassNameUndefined: Self = StObject.set(x, "childrenClassName", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setDefaultCollapsed(value: Boolean): Self = StObject.set(x, "defaultCollapsed", value.asInstanceOf[js.Any])
      
      inline def setDefaultCollapsedUndefined: Self = StObject.set(x, "defaultCollapsed", js.undefined)
      
      inline def setItemClassName(value: String): Self = StObject.set(x, "itemClassName", value.asInstanceOf[js.Any])
      
      inline def setItemClassNameUndefined: Self = StObject.set(x, "itemClassName", js.undefined)
      
      inline def setNodeLabel(value: VdomNode): Self = StObject.set(x, "nodeLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNodeLabelNull: Self = StObject.set(x, "nodeLabel", null)
      
      inline def setNodeLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nodeLabel", js.Array(value*))
      
      inline def setNodeLabelVdomElement(value: VdomElement): Self = StObject.set(x, "nodeLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTreeViewClassName(value: String): Self = StObject.set(x, "treeViewClassName", value.asInstanceOf[js.Any])
      
      inline def setTreeViewClassNameUndefined: Self = StObject.set(x, "treeViewClassName", js.undefined)
    }
  }
  
  type TreeView = japgolly.scalajs.react.facade.React.Component[TreeProps & js.Object, js.Object]
}
