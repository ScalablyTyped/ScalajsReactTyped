package typingsJapgolly.firebaseMessaging.migrateOldDatabaseMod

import typingsJapgolly.std.ArrayBufferLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V4TokenDetails extends js.Object {
  var auth: ArrayBufferLike
  var createTime: Double
  var endpoint: String
  var fcmSenderId: String
  var fcmToken: String
  var p256dh: ArrayBufferLike
  var swScope: String
  var vapidKey: scala.scalajs.js.typedarray.Uint8Array
}

object V4TokenDetails {
  @scala.inline
  def apply(
    auth: ArrayBufferLike,
    createTime: Double,
    endpoint: String,
    fcmSenderId: String,
    fcmToken: String,
    p256dh: ArrayBufferLike,
    swScope: String,
    vapidKey: scala.scalajs.js.typedarray.Uint8Array
  ): V4TokenDetails = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[V4TokenDetails]
  }
}

