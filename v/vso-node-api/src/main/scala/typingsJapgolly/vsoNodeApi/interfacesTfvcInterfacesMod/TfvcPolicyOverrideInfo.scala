package typingsJapgolly.vsoNodeApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcPolicyOverrideInfo extends StObject {
  
  var comment: String
  
  var policyFailures: js.Array[TfvcPolicyFailureInfo]
}
object TfvcPolicyOverrideInfo {
  
  inline def apply(comment: String, policyFailures: js.Array[TfvcPolicyFailureInfo]): TfvcPolicyOverrideInfo = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], policyFailures = policyFailures.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcPolicyOverrideInfo]
  }
  
  extension [Self <: TfvcPolicyOverrideInfo](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setPolicyFailures(value: js.Array[TfvcPolicyFailureInfo]): Self = StObject.set(x, "policyFailures", value.asInstanceOf[js.Any])
    
    inline def setPolicyFailuresVarargs(value: TfvcPolicyFailureInfo*): Self = StObject.set(x, "policyFailures", js.Array(value*))
  }
}
