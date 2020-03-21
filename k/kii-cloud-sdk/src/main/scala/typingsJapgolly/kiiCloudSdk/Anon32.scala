package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon32 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(existed: Boolean): js.Any
}

object Anon32 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: Boolean => CallbackTo[js.Any]): Anon32 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: scala.Boolean) => success(t0).runNow()))
    __obj.asInstanceOf[Anon32]
  }
}

