package typingsJapgolly.istanbulLibInstrument.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.istanbulLibInstrument.AnonFileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def enter(path: String): Unit
  def exit(path: String): AnonFileCoverage
}

object Visitor {
  @scala.inline
  def apply(enter: String => Callback, exit: String => CallbackTo[AnonFileCoverage]): Visitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enter")(js.Any.fromFunction1((t0: java.lang.String) => enter(t0).runNow()))
    __obj.updateDynamic("exit")(js.Any.fromFunction1((t0: java.lang.String) => exit(t0).runNow()))
    __obj.asInstanceOf[Visitor]
  }
}

