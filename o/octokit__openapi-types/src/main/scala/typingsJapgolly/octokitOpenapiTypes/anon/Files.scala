package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  var comments: js.UndefOr[Double] = js.undefined
  
  var comments_url: js.UndefOr[String] = js.undefined
  
  var commits_url: js.UndefOr[String] = js.undefined
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String | Null] = js.undefined
  
  var files: js.UndefOr[StringDictionary[Content | Null]] = js.undefined
  
  /**
    * Gist
    * @description Gist
    */
  var fork_of: js.UndefOr[Commitsurl | Null] = js.undefined
  
  /** @deprecated */
  var forks: js.UndefOr[js.Array[Updatedat] | Null] = js.undefined
  
  var forks_url: js.UndefOr[String] = js.undefined
  
  var git_pull_url: js.UndefOr[String] = js.undefined
  
  var git_push_url: js.UndefOr[String] = js.undefined
  
  /** @deprecated */
  var history: js.UndefOr[js.Array[Committedat] | Null] = js.undefined
  
  var html_url: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
  
  var owner: js.UndefOr[Avatarurl] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var truncated: js.UndefOr[Boolean] = js.undefined
  
  var updated_at: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var user: js.UndefOr[String | Null] = js.undefined
}
object Files {
  
  inline def apply(): Files = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Files]
  }
  
  extension [Self <: Files](x: Self) {
    
    inline def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setComments_urlUndefined: Self = StObject.set(x, "comments_url", js.undefined)
    
    inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    inline def setCommits_urlUndefined: Self = StObject.set(x, "commits_url", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: StringDictionary[Content | Null]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFork_of(value: Commitsurl): Self = StObject.set(x, "fork_of", value.asInstanceOf[js.Any])
    
    inline def setFork_ofNull: Self = StObject.set(x, "fork_of", null)
    
    inline def setFork_ofUndefined: Self = StObject.set(x, "fork_of", js.undefined)
    
    inline def setForks(value: js.Array[Updatedat]): Self = StObject.set(x, "forks", value.asInstanceOf[js.Any])
    
    inline def setForksNull: Self = StObject.set(x, "forks", null)
    
    inline def setForksUndefined: Self = StObject.set(x, "forks", js.undefined)
    
    inline def setForksVarargs(value: Updatedat*): Self = StObject.set(x, "forks", js.Array(value*))
    
    inline def setForks_url(value: String): Self = StObject.set(x, "forks_url", value.asInstanceOf[js.Any])
    
    inline def setForks_urlUndefined: Self = StObject.set(x, "forks_url", js.undefined)
    
    inline def setGit_pull_url(value: String): Self = StObject.set(x, "git_pull_url", value.asInstanceOf[js.Any])
    
    inline def setGit_pull_urlUndefined: Self = StObject.set(x, "git_pull_url", js.undefined)
    
    inline def setGit_push_url(value: String): Self = StObject.set(x, "git_push_url", value.asInstanceOf[js.Any])
    
    inline def setGit_push_urlUndefined: Self = StObject.set(x, "git_push_url", js.undefined)
    
    inline def setHistory(value: js.Array[Committedat]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryNull: Self = StObject.set(x, "history", null)
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: Committedat*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
