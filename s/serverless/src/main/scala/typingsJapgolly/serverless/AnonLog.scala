package typingsJapgolly.serverless

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLog extends js.Object {
  def log(message: String): Null
}

object AnonLog {
  @scala.inline
  def apply(log: String => CallbackTo[Null]): AnonLog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.asInstanceOf[AnonLog]
  }
}

