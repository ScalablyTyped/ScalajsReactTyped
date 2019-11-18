package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextWriter extends js.Object {
  def Close(): Unit
  def Write(s: java.lang.String): Unit
  def WriteLine(s: java.lang.String): Unit
}

object ITextWriter {
  @scala.inline
  def apply(Close: Callback, Write: java.lang.String => Callback, WriteLine: java.lang.String => Callback): ITextWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Close")(Close.toJsFn)
    __obj.updateDynamic("Write")(js.Any.fromFunction1((t0: java.lang.String) => Write(t0).runNow()))
    __obj.updateDynamic("WriteLine")(js.Any.fromFunction1((t0: java.lang.String) => WriteLine(t0).runNow()))
    __obj.asInstanceOf[ITextWriter]
  }
}

