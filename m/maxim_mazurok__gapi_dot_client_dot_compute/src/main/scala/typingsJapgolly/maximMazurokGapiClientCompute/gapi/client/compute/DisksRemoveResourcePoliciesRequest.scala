package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisksRemoveResourcePoliciesRequest extends StObject {
  
  /** Resource policies to be removed from this disk. */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.undefined
}
object DisksRemoveResourcePoliciesRequest {
  
  inline def apply(): DisksRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisksRemoveResourcePoliciesRequest]
  }
  
  extension [Self <: DisksRemoveResourcePoliciesRequest](x: Self) {
    
    inline def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    inline def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    inline def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value*))
  }
}
