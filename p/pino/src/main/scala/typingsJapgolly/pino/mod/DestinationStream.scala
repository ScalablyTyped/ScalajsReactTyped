package typingsJapgolly.pino.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationStream extends js.Object {
  def write(msg: String): Unit
}

object DestinationStream {
  @scala.inline
  def apply(write: String => Callback): DestinationStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[DestinationStream]
  }
}

