package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResolverRuleResponse extends StObject {
  
  /**
    * Information about the DeleteResolverRule request, including the status of the request.
    */
  var ResolverRule: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.ResolverRule] = js.undefined
}
object DeleteResolverRuleResponse {
  
  inline def apply(): DeleteResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResolverRuleResponse]
  }
  
  extension [Self <: DeleteResolverRuleResponse](x: Self) {
    
    inline def setResolverRule(value: ResolverRule): Self = StObject.set(x, "ResolverRule", value.asInstanceOf[js.Any])
    
    inline def setResolverRuleUndefined: Self = StObject.set(x, "ResolverRule", js.undefined)
  }
}
