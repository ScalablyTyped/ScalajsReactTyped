package typingsJapgolly.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildVersion extends js.Object {
  var commitMessage: String
  var id: String
  var name: String
  var sourceBranch: String
  /**
    * PullRequestId or Commit Id for the Pull Request for which the release will publish status
    */
  var sourcePullRequestId: String
  var sourceRepositoryId: String
  var sourceRepositoryType: String
  var sourceVersion: String
}

object BuildVersion {
  @scala.inline
  def apply(
    commitMessage: String,
    id: String,
    name: String,
    sourceBranch: String,
    sourcePullRequestId: String,
    sourceRepositoryId: String,
    sourceRepositoryType: String,
    sourceVersion: String
  ): BuildVersion = {
    val __obj = js.Dynamic.literal(commitMessage = commitMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceBranch = sourceBranch.asInstanceOf[js.Any], sourcePullRequestId = sourcePullRequestId.asInstanceOf[js.Any], sourceRepositoryId = sourceRepositoryId.asInstanceOf[js.Any], sourceRepositoryType = sourceRepositoryType.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildVersion]
  }
}

