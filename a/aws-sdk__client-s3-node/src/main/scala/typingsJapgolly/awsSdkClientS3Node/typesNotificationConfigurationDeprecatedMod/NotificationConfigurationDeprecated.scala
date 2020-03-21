package typingsJapgolly.awsSdkClientS3Node.typesNotificationConfigurationDeprecatedMod

import typingsJapgolly.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.QueueConfigurationDeprecated
import typingsJapgolly.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.TopicConfigurationDeprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfigurationDeprecated extends js.Object {
  /**
    * _CloudFunctionConfiguration shape
    */
  var CloudFunctionConfiguration: js.UndefOr[
    typingsJapgolly.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
  ] = js.undefined
  /**
    * _QueueConfigurationDeprecated shape
    */
  var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.undefined
  /**
    * _TopicConfigurationDeprecated shape
    */
  var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.undefined
}

object NotificationConfigurationDeprecated {
  @scala.inline
  def apply(
    CloudFunctionConfiguration: CloudFunctionConfiguration = null,
    QueueConfiguration: QueueConfigurationDeprecated = null,
    TopicConfiguration: TopicConfigurationDeprecated = null
  ): NotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (CloudFunctionConfiguration != null) __obj.updateDynamic("CloudFunctionConfiguration")(CloudFunctionConfiguration.asInstanceOf[js.Any])
    if (QueueConfiguration != null) __obj.updateDynamic("QueueConfiguration")(QueueConfiguration.asInstanceOf[js.Any])
    if (TopicConfiguration != null) __obj.updateDynamic("TopicConfiguration")(TopicConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfigurationDeprecated]
  }
}

