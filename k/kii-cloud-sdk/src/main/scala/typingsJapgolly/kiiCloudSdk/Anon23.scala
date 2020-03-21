package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon23 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiTopic): js.Any
}

object Anon23 {
  @scala.inline
  def apply(
    failure: js.Error => CallbackTo[js.Any],
    success: (KiiPushSubscription, KiiTopic) => CallbackTo[js.Any]
  ): Anon23 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiPushSubscription, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon23]
  }
}

