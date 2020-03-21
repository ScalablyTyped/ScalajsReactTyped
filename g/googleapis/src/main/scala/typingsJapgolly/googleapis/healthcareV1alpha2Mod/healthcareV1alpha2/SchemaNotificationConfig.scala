package typingsJapgolly.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies where notifications should be sent upon changes to a data store.
  */
@js.native
trait SchemaNotificationConfig extends js.Object {
  /**
    * The [Cloud Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that
    * notifications of changes are published on. Supplied by the client.
    * PubsubMessage.Data will contain the resource name.
    * PubsubMessage.MessageId is the ID of this message. It is guaranteed to be
    * unique within the topic. PubsubMessage.PublishTime is the time at which
    * the message was published. Notifications are only sent if the topic is
    * non-empty. [Topic
    * names](https://cloud.google.com/pubsub/docs/overview#names) must be
    * scoped to a project. cloud-healthcare@system.gserviceaccount.com must
    * have publisher permissions on the given Cloud Pub/Sub topic. Not having
    * adequate permissions will cause the calls that send notifications to
    * fail.
    */
  var pubsubTopic: js.UndefOr[String] = js.native
}

object SchemaNotificationConfig {
  @scala.inline
  def apply(pubsubTopic: String = null): SchemaNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (pubsubTopic != null) __obj.updateDynamic("pubsubTopic")(pubsubTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotificationConfig]
  }
}

