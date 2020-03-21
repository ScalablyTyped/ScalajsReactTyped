package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofjsonrpcs extends js.Object {
  def exec(scmd: String): Double
}

object Typeofjsonrpcs {
  @scala.inline
  def apply(exec: String => CallbackTo[Double]): Typeofjsonrpcs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: java.lang.String) => exec(t0).runNow()))
    __obj.asInstanceOf[Typeofjsonrpcs]
  }
}

