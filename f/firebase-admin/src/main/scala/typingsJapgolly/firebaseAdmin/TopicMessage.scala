package typingsJapgolly.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAdmin.admin.messaging.AndroidConfig
import typingsJapgolly.firebaseAdmin.admin.messaging.ApnsConfig
import typingsJapgolly.firebaseAdmin.admin.messaging.FcmOptions
import typingsJapgolly.firebaseAdmin.admin.messaging.Message
import typingsJapgolly.firebaseAdmin.admin.messaging.Notification
import typingsJapgolly.firebaseAdmin.admin.messaging.WebpushConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicMessage
  extends BaseMessage
     with Message {
  var topic: String
}

object TopicMessage {
  @scala.inline
  def apply(
    topic: String,
    android: AndroidConfig = null,
    apns: ApnsConfig = null,
    data: StringDictionary[String] = null,
    fcmOptions: FcmOptions = null,
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): TopicMessage = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (apns != null) __obj.updateDynamic("apns")(apns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (webpush != null) __obj.updateDynamic("webpush")(webpush.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicMessage]
  }
}

