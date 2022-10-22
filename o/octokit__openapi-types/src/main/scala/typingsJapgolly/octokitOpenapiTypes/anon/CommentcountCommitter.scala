package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentcountCommitter extends StObject {
  
  var author: DateString
  
  var comment_count: Double
  
  var committer: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-git-user'] */ js.Any
  
  var message: String
  
  var tree: Sha
  
  /** Format: uri */
  var url: String
  
  var verification: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['verification'] */ js.Any
  ] = js.undefined
}
object CommentcountCommitter {
  
  inline def apply(
    author: DateString,
    comment_count: Double,
    committer: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-git-user'] */ js.Any,
    message: String,
    tree: Sha,
    url: String
  ): CommentcountCommitter = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentcountCommitter]
  }
  
  extension [Self <: CommentcountCommitter](x: Self) {
    
    inline def setAuthor(value: DateString): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setCommitter(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-git-user'] */ js.Any
    ): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTree(value: Sha): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerification(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['verification'] */ js.Any
    ): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
