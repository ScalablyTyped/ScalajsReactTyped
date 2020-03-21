package typingsJapgolly.rsocketCore.rsocketencodingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder[T /* <: Encodable */] extends js.Object {
  def byteLength(value: Encodable): Double
  def decode(buffer: Buffer, start: Double, end: Double): T
  def encode(value: Encodable, buffer: Buffer, start: Double, end: Double): Double
}

object Encoder {
  @scala.inline
  def apply[T /* <: Encodable */](
    byteLength: Encodable => CallbackTo[Double],
    decode: (Buffer, Double, Double) => CallbackTo[T],
    encode: (Encodable, Buffer, Double, Double) => CallbackTo[Double]
  ): Encoder[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("byteLength")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Encodable) => byteLength(t0).runNow()))
    __obj.updateDynamic("decode")(js.Any.fromFunction3((t0: typingsJapgolly.node.Buffer, t1: scala.Double, t2: scala.Double) => decode(t0, t1, t2).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction4((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Encodable, t1: typingsJapgolly.node.Buffer, t2: scala.Double, t3: scala.Double) => encode(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Encoder[T]]
  }
}

