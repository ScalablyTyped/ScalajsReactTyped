package typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod

import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestStatusChangedEventMetadata extends js.Object {
  /**
    * <p>The changed status of the pull request.</p>
    */
  var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.undefined
}

object PullRequestStatusChangedEventMetadata {
  @scala.inline
  def apply(pullRequestStatus: OPEN | CLOSED | String = null): PullRequestStatusChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
  }
}

