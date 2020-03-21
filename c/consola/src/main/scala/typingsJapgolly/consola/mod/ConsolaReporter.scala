package typingsJapgolly.consola.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsolaReporter extends js.Object {
  def log(logObj: ConsolaLogObject, args: ConsolaReporterArgs): Unit
}

object ConsolaReporter {
  @scala.inline
  def apply(log: (ConsolaLogObject, ConsolaReporterArgs) => Callback): ConsolaReporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction2((t0: typingsJapgolly.consola.mod.ConsolaLogObject, t1: typingsJapgolly.consola.mod.ConsolaReporterArgs) => log(t0, t1).runNow()))
    __obj.asInstanceOf[ConsolaReporter]
  }
}

