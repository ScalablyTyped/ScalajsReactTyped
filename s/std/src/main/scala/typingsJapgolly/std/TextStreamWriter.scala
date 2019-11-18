package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStreamWriter extends TextStreamBase {
  /**
    * Sends a string to an output stream.
    */
  def Write(s: java.lang.String): Unit
  /**
    * Sends a specified number of blank lines (newline characters) to an output stream.
    */
  def WriteBlankLines(intLines: Double): Unit
  /**
    * Sends a string followed by a newline character to an output stream.
    */
  def WriteLine(s: java.lang.String): Unit
}

object TextStreamWriter {
  @scala.inline
  def apply(
    Close: Callback,
    Column: Double,
    Line: Double,
    Write: java.lang.String => Callback,
    WriteBlankLines: Double => Callback,
    WriteLine: java.lang.String => Callback
  ): TextStreamWriter = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any])
    __obj.updateDynamic("Close")(Close.toJsFn)
    __obj.updateDynamic("Write")(js.Any.fromFunction1((t0: java.lang.String) => Write(t0).runNow()))
    __obj.updateDynamic("WriteBlankLines")(js.Any.fromFunction1((t0: scala.Double) => WriteBlankLines(t0).runNow()))
    __obj.updateDynamic("WriteLine")(js.Any.fromFunction1((t0: java.lang.String) => WriteLine(t0).runNow()))
    __obj.asInstanceOf[TextStreamWriter]
  }
}

