package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var matchExpressions: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirementPatch]]]] = js.undefined
  
  /**
    * A list of node selector requirements by node's fields.
    */
  var matchFields: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirementPatch]]]] = js.undefined
}
object NodeSelectorTermPatch {
  
  inline def apply(): NodeSelectorTermPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSelectorTermPatch]
  }
  
  extension [Self <: NodeSelectorTermPatch](x: Self) {
    
    inline def setMatchExpressions(value: Input[js.Array[Input[NodeSelectorRequirementPatch]]]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchExpressionsUndefined: Self = StObject.set(x, "matchExpressions", js.undefined)
    
    inline def setMatchExpressionsVarargs(value: Input[NodeSelectorRequirementPatch]*): Self = StObject.set(x, "matchExpressions", js.Array(value*))
    
    inline def setMatchFields(value: Input[js.Array[Input[NodeSelectorRequirementPatch]]]): Self = StObject.set(x, "matchFields", value.asInstanceOf[js.Any])
    
    inline def setMatchFieldsUndefined: Self = StObject.set(x, "matchFields", js.undefined)
    
    inline def setMatchFieldsVarargs(value: Input[NodeSelectorRequirementPatch]*): Self = StObject.set(x, "matchFields", js.Array(value*))
  }
}
