package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchCommitter extends StObject {
  
  /** @description object containing information about the author. */
  var author: js.UndefOr[`116`] = js.undefined
  
  /** @description The branch name. Default: the repository’s default branch (usually `master`) */
  var branch: js.UndefOr[String] = js.undefined
  
  /** @description object containing information about the committer. */
  var committer: js.UndefOr[`116`] = js.undefined
  
  /** @description The commit message. */
  var message: String
  
  /** @description The blob SHA of the file being deleted. */
  var sha: String
}
object BranchCommitter {
  
  inline def apply(message: String, sha: String): BranchCommitter = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchCommitter]
  }
  
  extension [Self <: BranchCommitter](x: Self) {
    
    inline def setAuthor(value: `116`): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCommitter(value: `116`): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
