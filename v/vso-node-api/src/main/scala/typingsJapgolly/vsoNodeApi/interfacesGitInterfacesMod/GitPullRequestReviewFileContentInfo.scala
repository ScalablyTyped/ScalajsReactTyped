package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPullRequestReviewFileContentInfo extends StObject {
  
  var _links: Any
  
  /**
    * The file change path.
    */
  var path: String
  
  /**
    * Content hash of on-disk representation of file content. Its calculated by the client by using SHA1 hash function. Ensure that uploaded file has same encoding as in source control.
    */
  var sHA1Hash: String
}
object GitPullRequestReviewFileContentInfo {
  
  inline def apply(_links: Any, path: String, sHA1Hash: String): GitPullRequestReviewFileContentInfo = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sHA1Hash = sHA1Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestReviewFileContentInfo]
  }
  
  extension [Self <: GitPullRequestReviewFileContentInfo](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSHA1Hash(value: String): Self = StObject.set(x, "sHA1Hash", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
