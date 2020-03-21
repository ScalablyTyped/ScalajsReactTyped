package typingsJapgolly.p5.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintWriter extends js.Object {
  /**
    *   Clears the data already written to the PrintWriter
    *   object
    */
  def clear(): Unit
  /**
    *   Closes the PrintWriter
    */
  def close(): Unit
  /**
    *   Writes data to the PrintWriter stream, and adds a
    *   new line at the end
    *   @param data all data to be printed by the
    *   PrintWriter
    */
  def print(data: js.Array[_]): Unit
  /**
    *   Writes data to the PrintWriter stream
    *   @param data all data to be written by the
    *   PrintWriter
    */
  def write(data: js.Array[_]): Unit
}

object PrintWriter {
  @scala.inline
  def apply(
    clear: Callback,
    close: Callback,
    print: js.Array[js.Any] => Callback,
    write: js.Array[js.Any] => Callback
  ): PrintWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("print")(js.Any.fromFunction1((t0: js.Array[js.Any]) => print(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: js.Array[js.Any]) => write(t0).runNow()))
    __obj.asInstanceOf[PrintWriter]
  }
}

