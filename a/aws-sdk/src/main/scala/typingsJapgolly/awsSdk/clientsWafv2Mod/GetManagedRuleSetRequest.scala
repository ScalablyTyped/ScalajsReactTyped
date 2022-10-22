package typingsJapgolly.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedRuleSetRequest extends StObject {
  
  /**
    * A unique identifier for the managed rule set. The ID is returned in the responses to commands like list. You provide it to operations like get and update.
    */
  var Id: EntityId
  
  /**
    * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set. This name is assigned to the corresponding managed rule group, which your customers can access and use. 
    */
  var Name: EntityName
  
  /**
    * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or an Amazon Cognito user pool.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typingsJapgolly.awsSdk.clientsWafv2Mod.Scope
}
object GetManagedRuleSetRequest {
  
  inline def apply(Id: EntityId, Name: EntityName, Scope: Scope): GetManagedRuleSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedRuleSetRequest]
  }
  
  extension [Self <: GetManagedRuleSetRequest](x: Self) {
    
    inline def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
