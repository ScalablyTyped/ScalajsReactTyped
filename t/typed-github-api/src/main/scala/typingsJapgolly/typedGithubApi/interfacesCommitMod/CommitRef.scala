package typingsJapgolly.typedGithubApi.interfacesCommitMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRef extends js.Object {
  val repository: RepositoryRef
  val sha: String
  def loadAsync(): js.Promise[Commit | Null]
  def loadGitAsync(): js.Promise[GitCommit | Null]
}

object CommitRef {
  @scala.inline
  def apply(
    loadAsync: CallbackTo[js.Promise[Commit | Null]],
    loadGitAsync: CallbackTo[js.Promise[GitCommit | Null]],
    repository: RepositoryRef,
    sha: String
  ): CommitRef = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.updateDynamic("loadGitAsync")(loadGitAsync.toJsFn)
    __obj.asInstanceOf[CommitRef]
  }
}

