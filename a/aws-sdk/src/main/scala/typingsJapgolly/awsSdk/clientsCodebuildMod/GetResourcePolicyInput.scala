package typingsJapgolly.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyInput extends StObject {
  
  /**
    *  The ARN of the resource that is associated with the resource policy. 
    */
  var resourceArn: NonEmptyString
}
object GetResourcePolicyInput {
  
  inline def apply(resourceArn: NonEmptyString): GetResourcePolicyInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyInput]
  }
  
  extension [Self <: GetResourcePolicyInput](x: Self) {
    
    inline def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
