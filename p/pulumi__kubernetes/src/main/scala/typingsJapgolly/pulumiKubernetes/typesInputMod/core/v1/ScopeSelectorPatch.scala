package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var matchExpressions: js.UndefOr[Input[js.Array[Input[ScopedResourceSelectorRequirementPatch]]]] = js.undefined
}
object ScopeSelectorPatch {
  
  inline def apply(): ScopeSelectorPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopeSelectorPatch]
  }
  
  extension [Self <: ScopeSelectorPatch](x: Self) {
    
    inline def setMatchExpressions(value: Input[js.Array[Input[ScopedResourceSelectorRequirementPatch]]]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchExpressionsUndefined: Self = StObject.set(x, "matchExpressions", js.undefined)
    
    inline def setMatchExpressionsVarargs(value: Input[ScopedResourceSelectorRequirementPatch]*): Self = StObject.set(x, "matchExpressions", js.Array(value*))
  }
}
