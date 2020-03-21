package typingsJapgolly.typedGithubApi.interfacesCommitMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.interfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitSummary extends CommitRef {
  var author: js.UndefOr[UserSummary] = js.undefined
  var committer: js.UndefOr[UserSummary] = js.undefined
  var gitCommit: GitCommitSummary
  var htmlUri: String
  var parents: js.Array[CommitRef]
}

object CommitSummary {
  @scala.inline
  def apply(
    gitCommit: GitCommitSummary,
    htmlUri: String,
    loadAsync: CallbackTo[js.Promise[Commit | Null]],
    loadGitAsync: CallbackTo[js.Promise[GitCommit | Null]],
    parents: js.Array[CommitRef],
    repository: RepositoryRef,
    sha: String,
    author: UserSummary = null,
    committer: UserSummary = null
  ): CommitSummary = {
    val __obj = js.Dynamic.literal(gitCommit = gitCommit.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.updateDynamic("loadGitAsync")(loadGitAsync.toJsFn)
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (committer != null) __obj.updateDynamic("committer")(committer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitSummary]
  }
}

