package typingsJapgolly.insertModuleGlobals

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  def Buffer(): String
  @JSName("Buffer.isBuffer")
  def BufferDotisBuffer(file: String): String
  def __dirname(file: String, basedir: String): String
  def __filename(file: String, basedir: String): String
  def global(): String
  def process(file: String): String
}

object AnonBuffer {
  @scala.inline
  def apply(
    Buffer: CallbackTo[String],
    BufferDotisBuffer: String => CallbackTo[String],
    __dirname: (String, String) => CallbackTo[String],
    __filename: (String, String) => CallbackTo[String],
    global: CallbackTo[String],
    process: String => CallbackTo[String]
  ): AnonBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Buffer")(Buffer.toJsFn)
    __obj.updateDynamic("BufferDotisBuffer")(js.Any.fromFunction1((t0: java.lang.String) => BufferDotisBuffer(t0).runNow()))
    __obj.updateDynamic("__dirname")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => __dirname(t0, t1).runNow()))
    __obj.updateDynamic("__filename")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => __filename(t0, t1).runNow()))
    __obj.updateDynamic("global")(global.toJsFn)
    __obj.updateDynamic("process")(js.Any.fromFunction1((t0: java.lang.String) => process(t0).runNow()))
    __obj.asInstanceOf[AnonBuffer]
  }
}

