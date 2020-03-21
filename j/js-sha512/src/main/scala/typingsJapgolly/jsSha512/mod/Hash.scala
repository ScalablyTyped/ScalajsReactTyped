package typingsJapgolly.jsSha512.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  def array(): js.Array[Double]
  def arrayBuffer(): scala.scalajs.js.typedarray.ArrayBuffer
  def digest(): js.Array[Double]
  def hex(): String
  def update(messageToHash: String): Hash
}

object Hash {
  @scala.inline
  def apply(
    array: CallbackTo[js.Array[Double]],
    arrayBuffer: CallbackTo[scala.scalajs.js.typedarray.ArrayBuffer],
    digest: CallbackTo[js.Array[Double]],
    hex: CallbackTo[String],
    update: String => CallbackTo[Hash]
  ): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array.toJsFn)
    __obj.updateDynamic("arrayBuffer")(arrayBuffer.toJsFn)
    __obj.updateDynamic("digest")(digest.toJsFn)
    __obj.updateDynamic("hex")(hex.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: java.lang.String) => update(t0).runNow()))
    __obj.asInstanceOf[Hash]
  }
}

