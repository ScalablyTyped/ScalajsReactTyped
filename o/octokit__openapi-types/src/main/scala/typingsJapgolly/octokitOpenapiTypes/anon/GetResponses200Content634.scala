package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content634 extends StObject {
  
  /** Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/). */
  var get: Responses200Content634
}
object GetResponses200Content634 {
  
  inline def apply(get: Responses200Content634): GetResponses200Content634 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content634]
  }
  
  extension [Self <: GetResponses200Content634](x: Self) {
    
    inline def setGet(value: Responses200Content634): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
