package typingsJapgolly.postmanCollection

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIn extends js.Object {
  def in(`val`: js.Any): String
  def out(`val`: String): js.Any
}

object AnonIn {
  @scala.inline
  def apply(in: js.Any => CallbackTo[String], out: String => CallbackTo[js.Any]): AnonIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("in")(js.Any.fromFunction1((t0: js.Any) => in(t0).runNow()))
    __obj.updateDynamic("out")(js.Any.fromFunction1((t0: java.lang.String) => out(t0).runNow()))
    __obj.asInstanceOf[AnonIn]
  }
}

