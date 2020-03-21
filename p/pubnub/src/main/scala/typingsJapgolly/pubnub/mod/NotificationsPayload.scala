package typingsJapgolly.pubnub.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pubnub.AnonApns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsPayload extends js.Object {
  var apns: APNSNotificationPayload
  var badge: js.UndefOr[Double] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var debugging: Boolean
  var fcm: FCMNotificationPayload
  var mpns: MPNSNotificationPayload
  var payload: AnonApns
  var sound: js.UndefOr[String] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  def buildPayload(platforms: js.Array[String]): js.Object
}

object NotificationsPayload {
  @scala.inline
  def apply(
    apns: APNSNotificationPayload,
    buildPayload: js.Array[String] => CallbackTo[js.Object],
    debugging: Boolean,
    fcm: FCMNotificationPayload,
    mpns: MPNSNotificationPayload,
    payload: AnonApns,
    badge: Int | Double = null,
    body: String = null,
    sound: String = null,
    subtitle: String = null,
    title: String = null
  ): NotificationsPayload = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], debugging = debugging.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("buildPayload")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => buildPayload(t0).runNow()))
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsPayload]
  }
}

