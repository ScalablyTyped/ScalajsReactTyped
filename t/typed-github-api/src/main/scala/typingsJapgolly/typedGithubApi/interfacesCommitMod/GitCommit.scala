package typingsJapgolly.typedGithubApi.interfacesCommitMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends GitCommitSummary {
  var parents: js.Array[CommitRef]
}

object GitCommit {
  @scala.inline
  def apply(
    author: GitActor,
    committer: GitActor,
    loadAsync: CallbackTo[js.Promise[Commit | Null]],
    loadGitAsync: CallbackTo[js.Promise[GitCommit | Null]],
    message: String,
    parents: js.Array[CommitRef],
    repository: RepositoryRef,
    sha: String
  ): GitCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.updateDynamic("loadGitAsync")(loadGitAsync.toJsFn)
    __obj.asInstanceOf[GitCommit]
  }
}

