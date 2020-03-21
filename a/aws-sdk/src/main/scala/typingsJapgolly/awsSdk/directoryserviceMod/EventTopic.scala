package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTopic extends js.Object {
  /**
    * The date and time of when you associated your directory with the SNS topic.
    */
  var CreatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
    */
  var DirectoryId: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The topic registration status.
    */
  var Status: js.UndefOr[TopicStatus] = js.native
  /**
    * The SNS topic ARN (Amazon Resource Name).
    */
  var TopicArn: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.TopicArn] = js.native
  /**
    * The name of an AWS SNS topic the receives status messages from the directory.
    */
  var TopicName: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.TopicName] = js.native
}

object EventTopic {
  @scala.inline
  def apply(
    CreatedDateTime: js.Date = null,
    DirectoryId: DirectoryId = null,
    Status: TopicStatus = null,
    TopicArn: TopicArn = null,
    TopicName: TopicName = null
  ): EventTopic = {
    val __obj = js.Dynamic.literal()
    if (CreatedDateTime != null) __obj.updateDynamic("CreatedDateTime")(CreatedDateTime.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn.asInstanceOf[js.Any])
    if (TopicName != null) __obj.updateDynamic("TopicName")(TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTopic]
  }
}

