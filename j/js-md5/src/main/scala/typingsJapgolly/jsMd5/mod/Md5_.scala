package typingsJapgolly.jsMd5.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Md5_ extends js.Object {
  def array(): js.Array[Double]
  def arrayBuffer(): scala.scalajs.js.typedarray.ArrayBuffer
  def base64(): String
  def buffer(): scala.scalajs.js.typedarray.ArrayBuffer
  def digest(): js.Array[Double]
  def hex(): String
  def update(message: message): Md5_
}

object Md5_ {
  @scala.inline
  def apply(
    array: CallbackTo[js.Array[Double]],
    arrayBuffer: CallbackTo[scala.scalajs.js.typedarray.ArrayBuffer],
    base64: CallbackTo[String],
    buffer: CallbackTo[scala.scalajs.js.typedarray.ArrayBuffer],
    digest: CallbackTo[js.Array[Double]],
    hex: CallbackTo[String],
    update: message => CallbackTo[Md5_]
  ): Md5_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array.toJsFn)
    __obj.updateDynamic("arrayBuffer")(arrayBuffer.toJsFn)
    __obj.updateDynamic("base64")(base64.toJsFn)
    __obj.updateDynamic("buffer")(buffer.toJsFn)
    __obj.updateDynamic("digest")(digest.toJsFn)
    __obj.updateDynamic("hex")(hex.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.jsMd5.mod.message) => update(t0).runNow()))
    __obj.asInstanceOf[Md5_]
  }
}

