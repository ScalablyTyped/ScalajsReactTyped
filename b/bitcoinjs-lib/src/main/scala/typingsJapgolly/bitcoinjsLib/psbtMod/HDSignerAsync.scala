package typingsJapgolly.bitcoinjsLib.psbtMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Same as above but with async sign method
  */
trait HDSignerAsync extends HDSignerBase {
  def derivePath(path: String): HDSignerAsync
  def sign(hash: Buffer): js.Promise[Buffer]
}

object HDSignerAsync {
  @scala.inline
  def apply(
    derivePath: String => CallbackTo[HDSignerAsync],
    fingerprint: Buffer,
    publicKey: Buffer,
    sign: Buffer => CallbackTo[js.Promise[Buffer]]
  ): HDSignerAsync = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("derivePath")(js.Any.fromFunction1((t0: java.lang.String) => derivePath(t0).runNow()))
    __obj.updateDynamic("sign")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => sign(t0).runNow()))
    __obj.asInstanceOf[HDSignerAsync]
  }
}

