package typingsJapgolly.firebaseMessaging.migrateOldDatabaseMod

import org.scalajs.dom.experimental.push.PushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2TokenDetails extends js.Object {
  var auth: js.UndefOr[String] = js.undefined
  var createTime: js.UndefOr[Double] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var fcmPushSet: String
  var fcmSenderId: String
  var fcmToken: String
  var p256dh: js.UndefOr[String] = js.undefined
  var subscription: PushSubscription
  var swScope: String
  var vapidKey: String | scala.scalajs.js.typedarray.Uint8Array
}

object V2TokenDetails {
  @scala.inline
  def apply(
    fcmPushSet: String,
    fcmSenderId: String,
    fcmToken: String,
    subscription: PushSubscription,
    swScope: String,
    vapidKey: String | scala.scalajs.js.typedarray.Uint8Array,
    auth: String = null,
    createTime: Int | Double = null,
    endpoint: String = null,
    p256dh: String = null
  ): V2TokenDetails = {
    val __obj = js.Dynamic.literal(fcmPushSet = fcmPushSet.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (p256dh != null) __obj.updateDynamic("p256dh")(p256dh.asInstanceOf[js.Any])
    __obj.asInstanceOf[V2TokenDetails]
  }
}

