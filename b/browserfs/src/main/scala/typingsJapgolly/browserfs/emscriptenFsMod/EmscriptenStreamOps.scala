package typingsJapgolly.browserfs.emscriptenFsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmscriptenStreamOps extends js.Object {
  def close(stream: EmscriptenStream): Unit
  def llseek(stream: EmscriptenStream, offset: Double, whence: Double): Double
  def open(stream: EmscriptenStream): Unit
  def read(
    stream: EmscriptenStream,
    buffer: scala.scalajs.js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Double
  ): Double
  def write(
    stream: EmscriptenStream,
    buffer: scala.scalajs.js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Double
  ): Double
}

object EmscriptenStreamOps {
  @scala.inline
  def apply(
    close: EmscriptenStream => Callback,
    llseek: (EmscriptenStream, Double, Double) => CallbackTo[Double],
    open: EmscriptenStream => Callback,
    read: (EmscriptenStream, scala.scalajs.js.typedarray.Uint8Array, Double, Double, Double) => CallbackTo[Double],
    write: (EmscriptenStream, scala.scalajs.js.typedarray.Uint8Array, Double, Double, Double) => CallbackTo[Double]
  ): EmscriptenStreamOps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenStream) => close(t0).runNow()))
    __obj.updateDynamic("llseek")(js.Any.fromFunction3((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenStream, t1: scala.Double, t2: scala.Double) => llseek(t0, t1, t2).runNow()))
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenStream) => open(t0).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction5((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenStream, t1: scala.scalajs.js.typedarray.Uint8Array, t2: scala.Double, t3: scala.Double, t4: scala.Double) => read(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction5((t0: typingsJapgolly.browserfs.emscriptenFsMod.EmscriptenStream, t1: scala.scalajs.js.typedarray.Uint8Array, t2: scala.Double, t3: scala.Double, t4: scala.Double) => write(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[EmscriptenStreamOps]
  }
}

