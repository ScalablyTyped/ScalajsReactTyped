package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var nodeSelectorTerms: js.UndefOr[Input[js.Array[Input[NodeSelectorTermPatch]]]] = js.undefined
}
object NodeSelectorPatch {
  
  inline def apply(): NodeSelectorPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSelectorPatch]
  }
  
  extension [Self <: NodeSelectorPatch](x: Self) {
    
    inline def setNodeSelectorTerms(value: Input[js.Array[Input[NodeSelectorTermPatch]]]): Self = StObject.set(x, "nodeSelectorTerms", value.asInstanceOf[js.Any])
    
    inline def setNodeSelectorTermsUndefined: Self = StObject.set(x, "nodeSelectorTerms", js.undefined)
    
    inline def setNodeSelectorTermsVarargs(value: Input[NodeSelectorTermPatch]*): Self = StObject.set(x, "nodeSelectorTerms", js.Array(value*))
  }
}
