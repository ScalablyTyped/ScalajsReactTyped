package typingsJapgolly.slimerjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  def atEnd(): Boolean
  def close(): Unit
  def flush(): Unit
  def read(): String
  def readLine(): String
  def seek(position: Double): Unit
  def write(data: String): Unit
  def writeLine(data: String): Unit
}

object Stream {
  @scala.inline
  def apply(
    atEnd: CallbackTo[Boolean],
    close: Callback,
    flush: Callback,
    read: CallbackTo[String],
    readLine: CallbackTo[String],
    seek: Double => Callback,
    write: String => Callback,
    writeLine: String => Callback
  ): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atEnd")(atEnd.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.updateDynamic("readLine")(readLine.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.updateDynamic("writeLine")(js.Any.fromFunction1((t0: java.lang.String) => writeLine(t0).runNow()))
    __obj.asInstanceOf[Stream]
  }
}

