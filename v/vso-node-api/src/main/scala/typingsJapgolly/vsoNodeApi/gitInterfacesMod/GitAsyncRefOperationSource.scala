package typingsJapgolly.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAsyncRefOperationSource extends js.Object {
  /**
    * A list of commits to cherry pick or revert
    */
  var commitList: js.Array[GitCommitRef]
  /**
    * Id of the pull request to cherry pick or revert
    */
  var pullRequestId: Double
}

object GitAsyncRefOperationSource {
  @scala.inline
  def apply(commitList: js.Array[GitCommitRef], pullRequestId: Double): GitAsyncRefOperationSource = {
    val __obj = js.Dynamic.literal(commitList = commitList.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitAsyncRefOperationSource]
  }
}

