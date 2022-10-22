package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/compound-nodes
  */
trait NodeSingularCompound extends StObject {
  
  /**
    * Get whether the node is a compound child (i.e. contained within a node)
    *  http://js.cytoscape.org/#node.isChild
    */
  def isChild(): Boolean
  
  /**
    * Get whether the node is childless (i.e. a node with no child nodes)
    * http://js.cytoscape.org/#node.isChildless
    */
  def isChildless(): Boolean
  
  /**
    * Get whether the node is an orphan (i.e. a node with no parent)
    * http://js.cytoscape.org/#node.isOrphan
    */
  def isOrphan(): Boolean
  
  /**
    * Get whether the node is a compound parent
    * (i.e. a node containing one or more child nodes)
    * http://js.cytoscape.org/#node.isParent
    */
  def isParent(): Boolean
}
object NodeSingularCompound {
  
  inline def apply(
    isChild: CallbackTo[Boolean],
    isChildless: CallbackTo[Boolean],
    isOrphan: CallbackTo[Boolean],
    isParent: CallbackTo[Boolean]
  ): NodeSingularCompound = {
    val __obj = js.Dynamic.literal(isChild = isChild.toJsFn, isChildless = isChildless.toJsFn, isOrphan = isOrphan.toJsFn, isParent = isParent.toJsFn)
    __obj.asInstanceOf[NodeSingularCompound]
  }
  
  extension [Self <: NodeSingularCompound](x: Self) {
    
    inline def setIsChild(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChild", value.toJsFn)
    
    inline def setIsChildless(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChildless", value.toJsFn)
    
    inline def setIsOrphan(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOrphan", value.toJsFn)
    
    inline def setIsParent(value: CallbackTo[Boolean]): Self = StObject.set(x, "isParent", value.toJsFn)
  }
}
