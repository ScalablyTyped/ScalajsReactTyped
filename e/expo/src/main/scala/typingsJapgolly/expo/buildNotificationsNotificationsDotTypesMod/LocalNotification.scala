package typingsJapgolly.expo.buildNotificationsNotificationsDotTypesMod

import org.scalajs.dom.experimental.NotificationOptions
import typingsJapgolly.expo.Anon_ChannelId
import typingsJapgolly.expo.Anon_DisplayInForeground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalNotification extends js.Object {
  var android: js.UndefOr[Anon_ChannelId] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var categoryId: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var ios: js.UndefOr[Anon_DisplayInForeground] = js.undefined
  var title: String
  var web: js.UndefOr[NotificationOptions] = js.undefined
}

object LocalNotification {
  @scala.inline
  def apply(
    title: String,
    android: Anon_ChannelId = null,
    body: String = null,
    categoryId: String = null,
    data: js.Any = null,
    ios: Anon_DisplayInForeground = null,
    web: NotificationOptions = null
  ): LocalNotification = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalNotification]
  }
}

