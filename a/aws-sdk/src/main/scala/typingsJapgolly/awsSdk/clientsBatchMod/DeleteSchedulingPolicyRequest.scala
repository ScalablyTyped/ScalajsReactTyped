package typingsJapgolly.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSchedulingPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the scheduling policy to delete.
    */
  var arn: String
}
object DeleteSchedulingPolicyRequest {
  
  inline def apply(arn: String): DeleteSchedulingPolicyRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchedulingPolicyRequest]
  }
  
  extension [Self <: DeleteSchedulingPolicyRequest](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
