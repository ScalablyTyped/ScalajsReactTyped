package typingsJapgolly.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludedGitCommit extends js.Object {
  var commitId: String
  var commitTime: js.Date
  var parentCommitIds: js.Array[String]
  var repositoryId: String
}

object IncludedGitCommit {
  @scala.inline
  def apply(commitId: String, commitTime: js.Date, parentCommitIds: js.Array[String], repositoryId: String): IncludedGitCommit = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], commitTime = commitTime.asInstanceOf[js.Any], parentCommitIds = parentCommitIds.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IncludedGitCommit]
  }
}

