package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content308403404 extends StObject {
  
  /**
    * Approves a workflow run for a pull request from a public fork of a first time contributor. For more information, see ["Approving workflow runs from public forks](https://docs.github.com/actions/managing-workflow-runs/approving-workflow-runs-from-public-forks)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var post: Responses201Content308403404
}
object PostResponses201Content308403404 {
  
  inline def apply(post: Responses201Content308403404): PostResponses201Content308403404 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content308403404]
  }
  
  extension [Self <: PostResponses201Content308403404](x: Self) {
    
    inline def setPost(value: Responses201Content308403404): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
