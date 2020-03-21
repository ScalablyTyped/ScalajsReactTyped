package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiPushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon24 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiBucket, isSubscribed: Boolean): js.Any
}

object Anon24 {
  @scala.inline
  def apply(
    failure: js.Error => CallbackTo[js.Any],
    success: (KiiPushSubscription, KiiBucket, Boolean) => CallbackTo[js.Any]
  ): Anon24 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction3((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiPushSubscription, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket, t2: scala.Boolean) => success(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Anon24]
  }
}

