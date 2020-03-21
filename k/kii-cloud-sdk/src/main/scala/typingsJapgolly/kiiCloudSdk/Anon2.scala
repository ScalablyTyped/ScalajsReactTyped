package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(): js.Any
}

object Anon2 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: CallbackTo[js.Any]): Anon2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(success.toJsFn)
    __obj.asInstanceOf[Anon2]
  }
}

