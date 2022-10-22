package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonIncludeallbranches extends StObject {
  
  /**
    * Creates a new repository using a repository template. Use the `template_owner` and `template_repo` route parameters to specify the repository to use as the template. If the repository is not public, the authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository's information using the [Get a repository](https://docs.github.com/rest/reference/repos#get-a-repository) endpoint and check that the `is_template` key is `true`.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository
    */
  var post: RequestBodyContentApplicationjsonIncludeallbranches
}
object PostRequestBodyContentApplicationjsonIncludeallbranches {
  
  inline def apply(post: RequestBodyContentApplicationjsonIncludeallbranches): PostRequestBodyContentApplicationjsonIncludeallbranches = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonIncludeallbranches]
  }
  
  extension [Self <: PostRequestBodyContentApplicationjsonIncludeallbranches](x: Self) {
    
    inline def setPost(value: RequestBodyContentApplicationjsonIncludeallbranches): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
