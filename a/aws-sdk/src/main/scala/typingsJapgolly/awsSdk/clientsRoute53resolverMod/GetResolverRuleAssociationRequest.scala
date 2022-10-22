package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverRuleAssociationRequest extends StObject {
  
  /**
    * The ID of the Resolver rule association that you want to get information about.
    */
  var ResolverRuleAssociationId: ResourceId
}
object GetResolverRuleAssociationRequest {
  
  inline def apply(ResolverRuleAssociationId: ResourceId): GetResolverRuleAssociationRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleAssociationId = ResolverRuleAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleAssociationRequest]
  }
  
  extension [Self <: GetResolverRuleAssociationRequest](x: Self) {
    
    inline def setResolverRuleAssociationId(value: ResourceId): Self = StObject.set(x, "ResolverRuleAssociationId", value.asInstanceOf[js.Any])
  }
}
