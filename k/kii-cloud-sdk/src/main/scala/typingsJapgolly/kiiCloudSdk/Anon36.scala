package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon36 extends js.Object {
  def failure(errString: String): js.Any
  def success(): js.Any
}

object Anon36 {
  @scala.inline
  def apply(failure: String => CallbackTo[js.Any], success: CallbackTo[js.Any]): Anon36 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: java.lang.String) => failure(t0).runNow()))
    __obj.updateDynamic("success")(success.toJsFn)
    __obj.asInstanceOf[Anon36]
  }
}

