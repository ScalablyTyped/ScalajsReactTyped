package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiMqttEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon21 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(response: KiiMqttEndpoint): js.Any
}

object Anon21 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: KiiMqttEndpoint => CallbackTo[js.Any]): Anon21 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiMqttEndpoint) => success(t0).runNow()))
    __obj.asInstanceOf[Anon21]
  }
}

