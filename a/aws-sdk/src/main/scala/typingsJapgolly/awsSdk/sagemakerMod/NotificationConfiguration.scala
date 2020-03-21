package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfiguration extends js.Object {
  /**
    * The ARN for the SNS topic to which notifications should be published.
    */
  var NotificationTopicArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NotificationTopicArn] = js.native
}

object NotificationConfiguration {
  @scala.inline
  def apply(NotificationTopicArn: NotificationTopicArn = null): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (NotificationTopicArn != null) __obj.updateDynamic("NotificationTopicArn")(NotificationTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

