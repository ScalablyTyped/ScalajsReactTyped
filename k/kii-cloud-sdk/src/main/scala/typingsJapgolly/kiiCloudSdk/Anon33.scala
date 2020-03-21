package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon33 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(topic: KiiTopic): js.Any
}

object Anon33 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: KiiTopic => CallbackTo[js.Any]): Anon33 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic) => success(t0).runNow()))
    __obj.asInstanceOf[Anon33]
  }
}

