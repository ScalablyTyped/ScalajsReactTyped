package typingsJapgolly.reactDevtoolsInline.commonsMod

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTree extends StObject {
  
  var nodes: Map[Double, CommitTreeNode]
  
  var rootID: Double
}
object CommitTree {
  
  inline def apply(nodes: Map[Double, CommitTreeNode], rootID: Double): CommitTree = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], rootID = rootID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTree]
  }
  
  extension [Self <: CommitTree](x: Self) {
    
    inline def setNodes(value: Map[Double, CommitTreeNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setRootID(value: Double): Self = StObject.set(x, "rootID", value.asInstanceOf[js.Any])
  }
}
