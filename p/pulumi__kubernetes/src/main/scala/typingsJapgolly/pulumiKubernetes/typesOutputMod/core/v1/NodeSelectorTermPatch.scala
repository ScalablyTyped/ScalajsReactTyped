package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
  */
trait NodeSelectorTermPatch extends StObject {
  
  /**
    * A list of node selector requirements by node's labels.
    */
  var matchExpressions: js.Array[NodeSelectorRequirementPatch]
  
  /**
    * A list of node selector requirements by node's fields.
    */
  var matchFields: js.Array[NodeSelectorRequirementPatch]
}
object NodeSelectorTermPatch {
  
  inline def apply(
    matchExpressions: js.Array[NodeSelectorRequirementPatch],
    matchFields: js.Array[NodeSelectorRequirementPatch]
  ): NodeSelectorTermPatch = {
    val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any], matchFields = matchFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSelectorTermPatch]
  }
  
  extension [Self <: NodeSelectorTermPatch](x: Self) {
    
    inline def setMatchExpressions(value: js.Array[NodeSelectorRequirementPatch]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchExpressionsVarargs(value: NodeSelectorRequirementPatch*): Self = StObject.set(x, "matchExpressions", js.Array(value*))
    
    inline def setMatchFields(value: js.Array[NodeSelectorRequirementPatch]): Self = StObject.set(x, "matchFields", value.asInstanceOf[js.Any])
    
    inline def setMatchFieldsVarargs(value: NodeSelectorRequirementPatch*): Self = StObject.set(x, "matchFields", js.Array(value*))
  }
}
