package typingsJapgolly.sodiumNative.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoHashSha256Wrap extends js.Object {
  /**
    * Finalize the instance.
    *
    * * `output` should be a buffer of length `crypto_hash_sha256_BYTES`.
    *
    * The generated hash is stored in `output`.
    */
  def `final`(output: Buffer): Unit
  /**
    * Update the instance with a new piece of data.
    *
    * * `input` should be a buffer of any size.
    */
  def update(input: Buffer): Unit
}

object CryptoHashSha256Wrap {
  @scala.inline
  def apply(`final`: Buffer => Callback, update: Buffer => Callback): CryptoHashSha256Wrap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("final")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => `final`(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => update(t0).runNow()))
    __obj.asInstanceOf[CryptoHashSha256Wrap]
  }
}

