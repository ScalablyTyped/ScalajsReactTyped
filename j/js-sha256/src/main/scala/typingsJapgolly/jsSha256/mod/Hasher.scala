package typingsJapgolly.jsSha256.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hasher extends js.Object {
  /**
    * Return hash in integer array.
    */
  def array(): js.Array[Double]
  /**
    * Return hash in ArrayBuffer.
    */
  def arrayBuffer(): scala.scalajs.js.typedarray.ArrayBuffer
  /**
    * Return hash in integer array.
    */
  def digest(): js.Array[Double]
  /**
    * Return hash in hex string.
    */
  def hex(): String
  /**
    * Update hash
    *
    * @param message The message you want to hash.
    */
  def update(message: Message): Hasher
}

object Hasher {
  @scala.inline
  def apply(
    array: CallbackTo[js.Array[Double]],
    arrayBuffer: CallbackTo[scala.scalajs.js.typedarray.ArrayBuffer],
    digest: CallbackTo[js.Array[Double]],
    hex: CallbackTo[String],
    update: Message => CallbackTo[Hasher]
  ): Hasher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array.toJsFn)
    __obj.updateDynamic("arrayBuffer")(arrayBuffer.toJsFn)
    __obj.updateDynamic("digest")(digest.toJsFn)
    __obj.updateDynamic("hex")(hex.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.jsSha256.mod.Message) => update(t0).runNow()))
    __obj.asInstanceOf[Hasher]
  }
}

