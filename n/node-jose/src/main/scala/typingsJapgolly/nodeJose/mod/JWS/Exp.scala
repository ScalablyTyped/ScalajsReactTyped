package typingsJapgolly.nodeJose.mod.JWS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exp extends js.Object {
  def complete(jws: js.Any): js.Any
}

object Exp {
  @scala.inline
  def apply(complete: js.Any => CallbackTo[js.Any]): Exp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: js.Any) => complete(t0).runNow()))
    __obj.asInstanceOf[Exp]
  }
}

