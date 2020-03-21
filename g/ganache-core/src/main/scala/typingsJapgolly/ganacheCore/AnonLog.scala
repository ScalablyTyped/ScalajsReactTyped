package typingsJapgolly.ganacheCore

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLog extends js.Object {
  def log(msg: String): Unit
}

object AnonLog {
  @scala.inline
  def apply(log: String => Callback): AnonLog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.asInstanceOf[AnonLog]
  }
}

