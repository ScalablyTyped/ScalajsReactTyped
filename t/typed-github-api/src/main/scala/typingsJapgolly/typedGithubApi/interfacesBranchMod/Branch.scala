package typingsJapgolly.typedGithubApi.interfacesBranchMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typedGithubApi.interfacesCommitMod.CommitSummary
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends BranchRef {
  var commit: CommitSummary
}

object Branch {
  @scala.inline
  def apply(
    commit: CommitSummary,
    loadAsync: CallbackTo[js.Promise[Branch | Null]],
    name: String,
    repository: RepositoryRef
  ): Branch = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.asInstanceOf[Branch]
  }
}

