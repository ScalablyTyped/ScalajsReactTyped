package typingsJapgolly.johnnyFive.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repl extends js.Object {
  def inject(`object`: js.Any): Unit
}

object Repl {
  @scala.inline
  def apply(inject: js.Any => Callback): Repl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inject")(js.Any.fromFunction1((t0: js.Any) => inject(t0).runNow()))
    __obj.asInstanceOf[Repl]
  }
}

