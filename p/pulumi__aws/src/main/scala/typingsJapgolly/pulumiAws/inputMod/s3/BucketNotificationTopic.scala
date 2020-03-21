package typingsJapgolly.pulumiAws.inputMod.s3

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketNotificationTopic extends js.Object {
  /**
    * Specifies [event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
    */
  var events: Input[js.Array[Input[String]]] = js.native
  /**
    * Specifies object key name prefix.
    */
  var filterPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies object key name suffix.
    */
  var filterSuffix: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies unique identifier for each of the notification configurations.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies Amazon SNS topic ARN.
    */
  var topicArn: Input[String] = js.native
}

object BucketNotificationTopic {
  @scala.inline
  def apply(
    events: Input[js.Array[Input[String]]],
    topicArn: Input[String],
    filterPrefix: Input[String] = null,
    filterSuffix: Input[String] = null,
    id: Input[String] = null
  ): BucketNotificationTopic = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationTopic]
  }
}

