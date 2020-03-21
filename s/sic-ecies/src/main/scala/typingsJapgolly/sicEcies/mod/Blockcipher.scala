package typingsJapgolly.sicEcies.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blockcipher extends js.Object {
  def decrypt(encbuf: Buffer, cipherkeybuf: Buffer): Buffer
  def encrypt(xorbuf: Buffer, cipherkeybuf: Buffer): Buffer
}

object Blockcipher {
  @scala.inline
  def apply(decrypt: (Buffer, Buffer) => CallbackTo[Buffer], encrypt: (Buffer, Buffer) => CallbackTo[Buffer]): Blockcipher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrypt")(js.Any.fromFunction2((t0: typingsJapgolly.node.Buffer, t1: typingsJapgolly.node.Buffer) => decrypt(t0, t1).runNow()))
    __obj.updateDynamic("encrypt")(js.Any.fromFunction2((t0: typingsJapgolly.node.Buffer, t1: typingsJapgolly.node.Buffer) => encrypt(t0, t1).runNow()))
    __obj.asInstanceOf[Blockcipher]
  }
}

