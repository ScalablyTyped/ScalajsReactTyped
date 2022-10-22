package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
  */
trait NodeSelectorPatch extends StObject {
  
  /**
    * Required. A list of node selector terms. The terms are ORed.
    */
  var nodeSelectorTerms: js.Array[NodeSelectorTermPatch]
}
object NodeSelectorPatch {
  
  inline def apply(nodeSelectorTerms: js.Array[NodeSelectorTermPatch]): NodeSelectorPatch = {
    val __obj = js.Dynamic.literal(nodeSelectorTerms = nodeSelectorTerms.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSelectorPatch]
  }
  
  extension [Self <: NodeSelectorPatch](x: Self) {
    
    inline def setNodeSelectorTerms(value: js.Array[NodeSelectorTermPatch]): Self = StObject.set(x, "nodeSelectorTerms", value.asInstanceOf[js.Any])
    
    inline def setNodeSelectorTermsVarargs(value: NodeSelectorTermPatch*): Self = StObject.set(x, "nodeSelectorTerms", js.Array(value*))
  }
}
