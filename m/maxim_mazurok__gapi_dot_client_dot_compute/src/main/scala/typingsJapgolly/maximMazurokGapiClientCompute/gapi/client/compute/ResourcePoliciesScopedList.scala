package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePoliciesScopedList extends StObject {
  
  /** A list of resourcePolicies contained in this scope. */
  var resourcePolicies: js.UndefOr[js.Array[ResourcePolicy]] = js.undefined
  
  /** Informational warning which replaces the list of resourcePolicies when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object ResourcePoliciesScopedList {
  
  inline def apply(): ResourcePoliciesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePoliciesScopedList]
  }
  
  extension [Self <: ResourcePoliciesScopedList](x: Self) {
    
    inline def setResourcePolicies(value: js.Array[ResourcePolicy]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    inline def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    inline def setResourcePoliciesVarargs(value: ResourcePolicy*): Self = StObject.set(x, "resourcePolicies", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
