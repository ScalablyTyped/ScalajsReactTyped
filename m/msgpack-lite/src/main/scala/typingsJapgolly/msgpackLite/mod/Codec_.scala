package typingsJapgolly.msgpackLite.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codec_ extends js.Object {
  /**
    * Register a custom extension to serialize your own class instances
    *
    * @param etype an integer within the range of 0 and 127 (0x0 and 0x7F)
    * @param Class the constructor of the type you wish to serialize
    * @param packer a function that converts an instance of T to bytes
    */
  def addExtPacker[T](
    etype: Double,
    Class: Instantiable1[/* args (repeated) */ js.Any, T],
    packer: js.Function1[/* t */ T, Buffer | scala.scalajs.js.typedarray.Uint8Array]
  ): Unit
  /**
    * Register a custom extension to deserialize your own class instances
    *
    * @param etype an integer within the range of 0 and 127 (0x0 and 0x7F)
    * @param unpacker a function that converts bytes to an instance of T
    */
  def addExtUnpacker[T](
    etype: Double,
    unpacker: js.Function1[/* data */ Buffer | scala.scalajs.js.typedarray.Uint8Array, T]
  ): Unit
}

object Codec_ {
  @scala.inline
  def apply(
    addExtPacker: (Double, Instantiable1[/* args (repeated) */ js.Any, js.Any], js.Function1[js.Any, Buffer | scala.scalajs.js.typedarray.Uint8Array]) => Callback,
    addExtUnpacker: (Double, js.Function1[/* data */ Buffer | scala.scalajs.js.typedarray.Uint8Array, js.Any]) => Callback
  ): Codec_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addExtPacker")(js.Any.fromFunction3((t0: scala.Double, t1: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any], t2: js.Function1[js.Any, typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array]) => addExtPacker(t0, t1, t2).runNow()))
    __obj.updateDynamic("addExtUnpacker")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[
  /* data */ typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array, 
  js.Any]) => addExtUnpacker(t0, t1).runNow()))
    __obj.asInstanceOf[Codec_]
  }
}

