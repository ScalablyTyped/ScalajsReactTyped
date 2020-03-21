package typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestEventMod

import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_CREATED
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_MERGE_STATE_CHANGED
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_STATUS_CHANGED
import typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod.UnmarshalledPullRequestCreatedEventMetadata
import typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod.UnmarshalledPullRequestMergedStateChangedEventMetadata
import typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestSourceReferenceUpdatedEventMetadataMod.UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata
import typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod.UnmarshalledPullRequestStatusChangedEventMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledPullRequestEvent extends PullRequestEvent {
  /**
    * <p>The day and time of the pull request event, in timestamp format.</p>
    */
  @JSName("eventDate")
  var eventDate_UnmarshalledPullRequestEvent: js.UndefOr[js.Date] = js.undefined
  /**
    * <p>Information about the source and destination branches for the pull request.</p>
    */
  @JSName("pullRequestCreatedEventMetadata")
  var pullRequestCreatedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestCreatedEventMetadata] = js.undefined
  /**
    * <p>Information about the change in mergability state for the pull request event.</p>
    */
  @JSName("pullRequestMergedStateChangedEventMetadata")
  var pullRequestMergedStateChangedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestMergedStateChangedEventMetadata] = js.undefined
  /**
    * <p>Information about the updated source branch for the pull request event. </p>
    */
  @JSName("pullRequestSourceReferenceUpdatedEventMetadata")
  var pullRequestSourceReferenceUpdatedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata] = js.undefined
  /**
    * <p>Information about the change in status for the pull request event.</p>
    */
  @JSName("pullRequestStatusChangedEventMetadata")
  var pullRequestStatusChangedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestStatusChangedEventMetadata] = js.undefined
}

object UnmarshalledPullRequestEvent {
  @scala.inline
  def apply(
    actorArn: String = null,
    eventDate: js.Date = null,
    pullRequestCreatedEventMetadata: UnmarshalledPullRequestCreatedEventMetadata = null,
    pullRequestEventType: PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String = null,
    pullRequestId: String = null,
    pullRequestMergedStateChangedEventMetadata: UnmarshalledPullRequestMergedStateChangedEventMetadata = null,
    pullRequestSourceReferenceUpdatedEventMetadata: UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata = null,
    pullRequestStatusChangedEventMetadata: UnmarshalledPullRequestStatusChangedEventMetadata = null
  ): UnmarshalledPullRequestEvent = {
    val __obj = js.Dynamic.literal()
    if (actorArn != null) __obj.updateDynamic("actorArn")(actorArn.asInstanceOf[js.Any])
    if (eventDate != null) __obj.updateDynamic("eventDate")(eventDate.asInstanceOf[js.Any])
    if (pullRequestCreatedEventMetadata != null) __obj.updateDynamic("pullRequestCreatedEventMetadata")(pullRequestCreatedEventMetadata.asInstanceOf[js.Any])
    if (pullRequestEventType != null) __obj.updateDynamic("pullRequestEventType")(pullRequestEventType.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (pullRequestMergedStateChangedEventMetadata != null) __obj.updateDynamic("pullRequestMergedStateChangedEventMetadata")(pullRequestMergedStateChangedEventMetadata.asInstanceOf[js.Any])
    if (pullRequestSourceReferenceUpdatedEventMetadata != null) __obj.updateDynamic("pullRequestSourceReferenceUpdatedEventMetadata")(pullRequestSourceReferenceUpdatedEventMetadata.asInstanceOf[js.Any])
    if (pullRequestStatusChangedEventMetadata != null) __obj.updateDynamic("pullRequestStatusChangedEventMetadata")(pullRequestStatusChangedEventMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledPullRequestEvent]
  }
}

