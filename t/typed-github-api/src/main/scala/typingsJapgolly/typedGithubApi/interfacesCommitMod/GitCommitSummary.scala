package typingsJapgolly.typedGithubApi.interfacesCommitMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitSummary extends CommitRef {
  var author: GitActor
  var committer: GitActor
  var message: String
}

object GitCommitSummary {
  @scala.inline
  def apply(
    author: GitActor,
    committer: GitActor,
    loadAsync: CallbackTo[js.Promise[Commit | Null]],
    loadGitAsync: CallbackTo[js.Promise[GitCommit | Null]],
    message: String,
    repository: RepositoryRef,
    sha: String
  ): GitCommitSummary = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.updateDynamic("loadGitAsync")(loadGitAsync.toJsFn)
    __obj.asInstanceOf[GitCommitSummary]
  }
}

