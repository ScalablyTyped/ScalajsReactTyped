package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewTreeNodeMod {
  
  @JSImport("baseui/tree-view/tree-node", JSImport.Default)
  @js.native
  open class default () extends TreeNode
  
  @js.native
  trait TreeNode
    extends Component[TreeNodeProps, js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MTreeNode(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTreeNode(): Unit = js.native
    
    def onFocus(e: ReactEventFrom[Element]): Unit = js.native
    
    def onToggle(): Unit = js.native
    
    var treeItemRef: RefHandle[HTMLLIElement] = js.native
  }
}
