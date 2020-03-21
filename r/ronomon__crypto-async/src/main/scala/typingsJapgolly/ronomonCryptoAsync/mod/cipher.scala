package typingsJapgolly.ronomonCryptoAsync.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ronomon/crypto-async", "cipher")
@js.native
object cipher extends js.Object {
  def apply(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    iv: Buffer,
    plaintext: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* ciphertext */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    keyOffset: Double,
    keySize: Double,
    iv: Buffer,
    ivOffset: Double,
    ivSize: Double,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* targetSize */ Double, Unit]
  ): Unit = js.native
}

