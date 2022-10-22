package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content380404 extends StObject {
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List team projects`](https://docs.github.com/rest/reference/teams#list-team-projects) endpoint.
    *
    * Lists the organization projects for a team.
    */
  var get: Responses200Content380404
}
object GetResponses200Content380404 {
  
  inline def apply(get: Responses200Content380404): GetResponses200Content380404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content380404]
  }
  
  extension [Self <: GetResponses200Content380404](x: Self) {
    
    inline def setGet(value: Responses200Content380404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
