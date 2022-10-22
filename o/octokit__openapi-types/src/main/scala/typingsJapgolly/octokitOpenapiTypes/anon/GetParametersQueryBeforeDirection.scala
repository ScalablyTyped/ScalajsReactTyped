package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryBeforeDirection extends StObject {
  
  /**
    * Lists repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    */
  var get: ParametersQueryBeforeDirection
  
  /**
    * Creates a new repository for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository.
    */
  var post: Responses304400401
}
object GetParametersQueryBeforeDirection {
  
  inline def apply(get: ParametersQueryBeforeDirection, post: Responses304400401): GetParametersQueryBeforeDirection = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryBeforeDirection]
  }
  
  extension [Self <: GetParametersQueryBeforeDirection](x: Self) {
    
    inline def setGet(value: ParametersQueryBeforeDirection): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses304400401): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
