package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryBeforePage extends StObject {
  
  /** List all notifications for the current user, sorted by most recently updated. */
  var get: ParametersQueryBeforePage
  
  /** Marks all notifications as "read" removes it from the [default view on GitHub](https://github.com/notifications). If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`. */
  var put: Responses202205304
}
object GetParametersQueryBeforePage {
  
  inline def apply(get: ParametersQueryBeforePage, put: Responses202205304): GetParametersQueryBeforePage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryBeforePage]
  }
  
  extension [Self <: GetParametersQueryBeforePage](x: Self) {
    
    inline def setGet(value: ParametersQueryBeforePage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses202205304): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
