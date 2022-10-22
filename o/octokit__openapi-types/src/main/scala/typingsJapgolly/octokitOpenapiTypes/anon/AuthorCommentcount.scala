package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorCommentcount extends StObject {
  
  var author: DateString
  
  var comment_count: Double
  
  var committer: Date | Null
  
  var message: String
  
  var tree: Sha
  
  /** Format: uri */
  var url: String
  
  var verification: js.UndefOr[Reason] = js.undefined
}
object AuthorCommentcount {
  
  inline def apply(author: DateString, comment_count: Double, message: String, tree: Sha, url: String): AuthorCommentcount = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], committer = null)
    __obj.asInstanceOf[AuthorCommentcount]
  }
  
  extension [Self <: AuthorCommentcount](x: Self) {
    
    inline def setAuthor(value: DateString): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: Date): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterNull: Self = StObject.set(x, "committer", null)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTree(value: Sha): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Reason): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
