package typingsJapgolly.sodiumNative.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoStreamChacha20XorWrap extends js.Object {
  /**
    * Finalize the stream. Zeros out internal state.
    */
  def `final`(): Unit
  /**
    * Encrypt the next message
    */
  def update(ciphertext: Buffer, message: Buffer): Unit
}

object CryptoStreamChacha20XorWrap {
  @scala.inline
  def apply(`final`: Callback, update: (Buffer, Buffer) => Callback): CryptoStreamChacha20XorWrap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("final")(`final`.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.node.Buffer, t1: typingsJapgolly.node.Buffer) => update(t0, t1).runNow()))
    __obj.asInstanceOf[CryptoStreamChacha20XorWrap]
  }
}

