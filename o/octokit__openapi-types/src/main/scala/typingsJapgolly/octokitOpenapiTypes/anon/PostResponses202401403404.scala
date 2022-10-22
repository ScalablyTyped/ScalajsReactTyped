package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses202401403404 extends StObject {
  
  /**
    * Triggers an export of the specified codespace and returns a URL and ID where the status of the export can be monitored.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  var post: Responses202401403404
}
object PostResponses202401403404 {
  
  inline def apply(post: Responses202401403404): PostResponses202401403404 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses202401403404]
  }
  
  extension [Self <: PostResponses202401403404](x: Self) {
    
    inline def setPost(value: Responses202401403404): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
