package typingsJapgolly.bitcoinjsLib.psbtMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HDSigner extends HDSignerBase {
  /**
    * The path string must match /^m(\/\d+'?)+$/
    * ex. m/44'/0'/0'/1/23 levels with ' must be hard derivations
    */
  def derivePath(path: String): HDSigner
  /**
    * Input hash (the "message digest") for the signature algorithm
    * Return a 64 byte signature (32 byte r and 32 byte s in that order)
    */
  def sign(hash: Buffer): Buffer
}

object HDSigner {
  @scala.inline
  def apply(
    derivePath: String => CallbackTo[HDSigner],
    fingerprint: Buffer,
    publicKey: Buffer,
    sign: Buffer => CallbackTo[Buffer]
  ): HDSigner = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("derivePath")(js.Any.fromFunction1((t0: java.lang.String) => derivePath(t0).runNow()))
    __obj.updateDynamic("sign")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => sign(t0).runNow()))
    __obj.asInstanceOf[HDSigner]
  }
}

