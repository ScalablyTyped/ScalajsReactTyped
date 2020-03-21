package typingsJapgolly.neverbounce.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poe extends js.Object {
  def confirm(email: String, result: String, confirmationToken: String, transactionId: String): js.Promise[Response]
}

object Poe {
  @scala.inline
  def apply(confirm: (String, String, String, String) => CallbackTo[js.Promise[Response]]): Poe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("confirm")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => confirm(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Poe]
  }
}

