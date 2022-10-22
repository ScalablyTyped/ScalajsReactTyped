package typingsJapgolly.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyGenerationDetails extends StObject {
  
  /**
    * The ARN of the IAM entity (user or role) for which you are generating a policy.
    */
  var principalArn: PrincipalArn
}
object PolicyGenerationDetails {
  
  inline def apply(principalArn: PrincipalArn): PolicyGenerationDetails = {
    val __obj = js.Dynamic.literal(principalArn = principalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGenerationDetails]
  }
  
  extension [Self <: PolicyGenerationDetails](x: Self) {
    
    inline def setPrincipalArn(value: PrincipalArn): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
  }
}
