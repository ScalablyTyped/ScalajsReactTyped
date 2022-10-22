package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverRulePolicyRequest extends StObject {
  
  /**
    * The ID of the Resolver rule that you want to get the Resolver rule policy for.
    */
  var Arn: typingsJapgolly.awsSdk.clientsRoute53resolverMod.Arn
}
object GetResolverRulePolicyRequest {
  
  inline def apply(Arn: Arn): GetResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRulePolicyRequest]
  }
  
  extension [Self <: GetResolverRulePolicyRequest](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
