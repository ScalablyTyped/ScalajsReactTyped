package typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestMod

import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestTargetMod.PullRequestTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequest extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the user who created the pull request.</p>
    */
  var authorArn: js.UndefOr[String] = js.undefined
  /**
    * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The date and time the pull request was originally created, in timestamp format.</p>
    */
  var creationDate: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.</p>
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * <p>The day and time of the last user or system activity on the pull request, in timestamp format.</p>
    */
  var lastActivityDate: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>The system-generated ID of the pull request. </p>
    */
  var pullRequestId: js.UndefOr[String] = js.undefined
  /**
    * <p>The status of the pull request. Pull request status can only change from <code>OPEN</code> to <code>CLOSED</code>.</p>
    */
  var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.undefined
  /**
    * <p>The targets of the pull request, including the source branch and destination branch for the pull request.</p>
    */
  var pullRequestTargets: js.UndefOr[js.Array[PullRequestTarget] | js.Iterable[PullRequestTarget]] = js.undefined
  /**
    * <p>The user-defined title of the pull request. This title is displayed in the list of pull requests to other users of the repository.</p>
    */
  var title: js.UndefOr[String] = js.undefined
}

object PullRequest {
  @scala.inline
  def apply(
    authorArn: String = null,
    clientRequestToken: String = null,
    creationDate: js.Date | String | Double = null,
    description: String = null,
    lastActivityDate: js.Date | String | Double = null,
    pullRequestId: String = null,
    pullRequestStatus: OPEN | CLOSED | String = null,
    pullRequestTargets: js.Array[PullRequestTarget] | js.Iterable[PullRequestTarget] = null,
    title: String = null
  ): PullRequest = {
    val __obj = js.Dynamic.literal()
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastActivityDate != null) __obj.updateDynamic("lastActivityDate")(lastActivityDate.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    if (pullRequestTargets != null) __obj.updateDynamic("pullRequestTargets")(pullRequestTargets.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequest]
  }
}

