package typingsJapgolly.morgan.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOptions extends js.Object {
  /**
    * Output stream for writing log lines.
    */
  def write(str: String): Unit
}

object StreamOptions {
  @scala.inline
  def apply(write: String => Callback): StreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[StreamOptions]
  }
}

