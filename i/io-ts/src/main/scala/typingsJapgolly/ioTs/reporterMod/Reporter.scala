package typingsJapgolly.ioTs.reporterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ioTs.mod.Validation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter[A] extends js.Object {
  def report(validation: Validation[_]): A
}

object Reporter {
  @scala.inline
  def apply[A](report: Validation[js.Any] => CallbackTo[A]): Reporter[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("report")(js.Any.fromFunction1((t0: typingsJapgolly.ioTs.mod.Validation[js.Any]) => report(t0).runNow()))
    __obj.asInstanceOf[Reporter[A]]
  }
}

