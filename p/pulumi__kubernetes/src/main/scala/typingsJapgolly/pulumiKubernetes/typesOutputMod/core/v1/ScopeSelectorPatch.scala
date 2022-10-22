package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
  */
trait ScopeSelectorPatch extends StObject {
  
  /**
    * A list of scope selector requirements by scope of the resources.
    */
  var matchExpressions: js.Array[ScopedResourceSelectorRequirementPatch]
}
object ScopeSelectorPatch {
  
  inline def apply(matchExpressions: js.Array[ScopedResourceSelectorRequirementPatch]): ScopeSelectorPatch = {
    val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeSelectorPatch]
  }
  
  extension [Self <: ScopeSelectorPatch](x: Self) {
    
    inline def setMatchExpressions(value: js.Array[ScopedResourceSelectorRequirementPatch]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchExpressionsVarargs(value: ScopedResourceSelectorRequirementPatch*): Self = StObject.set(x, "matchExpressions", js.Array(value*))
  }
}
