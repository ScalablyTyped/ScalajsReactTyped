package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListResponseItem extends js.Object {
  var comments: Double
  var comments_url: String
  var commits_url: String
  var created_at: String
  var description: String
  var files: GistsListResponseItemFiles
  var forks_url: String
  var git_pull_url: String
  var git_push_url: String
  var html_url: String
  var id: String
  var node_id: String
  var owner: GistsListResponseItemOwner
  var public: Boolean
  var truncated: Boolean
  var updated_at: String
  var url: String
  var user: Null
}

object GistsListResponseItem {
  @scala.inline
  def apply(
    comments: Double,
    comments_url: String,
    commits_url: String,
    created_at: String,
    description: String,
    files: GistsListResponseItemFiles,
    forks_url: String,
    git_pull_url: String,
    git_push_url: String,
    html_url: String,
    id: String,
    node_id: String,
    owner: GistsListResponseItemOwner,
    public: Boolean,
    truncated: Boolean,
    updated_at: String,
    url: String,
    user: Null
  ): GistsListResponseItem = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], git_pull_url = git_pull_url.asInstanceOf[js.Any], git_push_url = git_push_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsListResponseItem]
  }
}

