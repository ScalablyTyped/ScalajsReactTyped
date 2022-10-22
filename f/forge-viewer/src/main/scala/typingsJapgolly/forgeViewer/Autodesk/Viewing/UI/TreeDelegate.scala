package typingsJapgolly.forgeViewer.Autodesk.Viewing.UI

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeDelegate extends StObject {
  
  def createTreeNode(node: js.Object, parent: HTMLElement, options: js.Object): Unit
  
  def forEachChild(node: js.Object, callback: js.Function1[/* child */ js.Object, Unit]): Unit
  
  def getTreeNodeClass(node: js.Object): Unit
  
  def getTreeNodeId(node: js.Object): String
  
  def getTreeNodeLabel(node: js.Object): String
  
  def isTreeNodeGroup(node: js.Object): Boolean
  
  def onTreeNodeClick(tree: Tree, node: js.Object, event: Event): Unit
  
  def onTreeNodeDoubleClick(tree: Tree, node: js.Object, event: Event): Unit
  
  def onTreeNodeIconClick(tree: Tree, node: js.Object, event: Event): Unit
  
  def onTreeNodeRightClick(tree: Tree, node: js.Object, event: Event): Unit
  
  def shouldCreateTreeNode(node: js.Object): Boolean
}
object TreeDelegate {
  
  inline def apply(
    createTreeNode: (js.Object, HTMLElement, js.Object) => Callback,
    forEachChild: (js.Object, js.Function1[/* child */ js.Object, Unit]) => Callback,
    getTreeNodeClass: js.Object => Callback,
    getTreeNodeId: js.Object => String,
    getTreeNodeLabel: js.Object => String,
    isTreeNodeGroup: js.Object => Boolean,
    onTreeNodeClick: (Tree, js.Object, Event) => Callback,
    onTreeNodeDoubleClick: (Tree, js.Object, Event) => Callback,
    onTreeNodeIconClick: (Tree, js.Object, Event) => Callback,
    onTreeNodeRightClick: (Tree, js.Object, Event) => Callback,
    shouldCreateTreeNode: js.Object => Boolean
  ): TreeDelegate = {
    val __obj = js.Dynamic.literal(createTreeNode = js.Any.fromFunction3((t0: js.Object, t1: HTMLElement, t2: js.Object) => (createTreeNode(t0, t1, t2)).runNow()), forEachChild = js.Any.fromFunction2((t0: js.Object, t1: js.Function1[/* child */ js.Object, Unit]) => (forEachChild(t0, t1)).runNow()), getTreeNodeClass = js.Any.fromFunction1((t0: js.Object) => getTreeNodeClass(t0).runNow()), getTreeNodeId = js.Any.fromFunction1(getTreeNodeId), getTreeNodeLabel = js.Any.fromFunction1(getTreeNodeLabel), isTreeNodeGroup = js.Any.fromFunction1(isTreeNodeGroup), onTreeNodeClick = js.Any.fromFunction3((t0: Tree, t1: js.Object, t2: Event) => (onTreeNodeClick(t0, t1, t2)).runNow()), onTreeNodeDoubleClick = js.Any.fromFunction3((t0: Tree, t1: js.Object, t2: Event) => (onTreeNodeDoubleClick(t0, t1, t2)).runNow()), onTreeNodeIconClick = js.Any.fromFunction3((t0: Tree, t1: js.Object, t2: Event) => (onTreeNodeIconClick(t0, t1, t2)).runNow()), onTreeNodeRightClick = js.Any.fromFunction3((t0: Tree, t1: js.Object, t2: Event) => (onTreeNodeRightClick(t0, t1, t2)).runNow()), shouldCreateTreeNode = js.Any.fromFunction1(shouldCreateTreeNode))
    __obj.asInstanceOf[TreeDelegate]
  }
  
  extension [Self <: TreeDelegate](x: Self) {
    
    inline def setCreateTreeNode(value: (js.Object, HTMLElement, js.Object) => Callback): Self = StObject.set(x, "createTreeNode", js.Any.fromFunction3((t0: js.Object, t1: HTMLElement, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setForEachChild(value: (js.Object, js.Function1[/* child */ js.Object, Unit]) => Callback): Self = StObject.set(x, "forEachChild", js.Any.fromFunction2((t0: js.Object, t1: js.Function1[/* child */ js.Object, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetTreeNodeClass(value: js.Object => Callback): Self = StObject.set(x, "getTreeNodeClass", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setGetTreeNodeId(value: js.Object => String): Self = StObject.set(x, "getTreeNodeId", js.Any.fromFunction1(value))
    
    inline def setGetTreeNodeLabel(value: js.Object => String): Self = StObject.set(x, "getTreeNodeLabel", js.Any.fromFunction1(value))
    
    inline def setIsTreeNodeGroup(value: js.Object => Boolean): Self = StObject.set(x, "isTreeNodeGroup", js.Any.fromFunction1(value))
    
    inline def setOnTreeNodeClick(value: (Tree, js.Object, Event) => Callback): Self = StObject.set(x, "onTreeNodeClick", js.Any.fromFunction3((t0: Tree, t1: js.Object, t2: Event) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnTreeNodeDoubleClick(value: (Tree, js.Object, Event) => Callback): Self = StObject.set(x, "onTreeNodeDoubleClick", js.Any.fromFunction3((t0: Tree, t1: js.Object, t2: Event) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnTreeNodeIconClick(value: (Tree, js.Object, Event) => Callback): Self = StObject.set(x, "onTreeNodeIconClick", js.Any.fromFunction3((t0: Tree, t1: js.Object, t2: Event) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnTreeNodeRightClick(value: (Tree, js.Object, Event) => Callback): Self = StObject.set(x, "onTreeNodeRightClick", js.Any.fromFunction3((t0: Tree, t1: js.Object, t2: Event) => (value(t0, t1, t2)).runNow()))
    
    inline def setShouldCreateTreeNode(value: js.Object => Boolean): Self = StObject.set(x, "shouldCreateTreeNode", js.Any.fromFunction1(value))
  }
}
