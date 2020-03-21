package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon7 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(group: KiiGroup): js.Any
}

object Anon7 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: KiiGroup => CallbackTo[js.Any]): Anon7 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup) => success(t0).runNow()))
    __obj.asInstanceOf[Anon7]
  }
}

