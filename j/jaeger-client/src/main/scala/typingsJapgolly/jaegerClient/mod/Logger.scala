package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(msg: String): Unit
  def info(msg: String): Unit
}

object Logger {
  @scala.inline
  def apply(error: String => Callback, info: String => Callback): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: java.lang.String) => info(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

