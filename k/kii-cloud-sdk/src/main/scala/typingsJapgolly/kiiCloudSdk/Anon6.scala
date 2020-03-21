package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon6 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(group: KiiUser): js.Any
}

object Anon6 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: KiiUser => CallbackTo[js.Any]): Anon6 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser) => success(t0).runNow()))
    __obj.asInstanceOf[Anon6]
  }
}

