package typingsJapgolly.openpgp.mod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Maps curve names under various standards to one
  * @see
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openpgp.openpgpStrings.p256
  - typingsJapgolly.openpgp.openpgpStrings.p384
  - typingsJapgolly.openpgp.openpgpStrings.p251
  - typingsJapgolly.openpgp.openpgpStrings.secp256k1
  - typingsJapgolly.openpgp.openpgpStrings.ed25519
  - typingsJapgolly.openpgp.openpgpStrings.curve25519
  - typingsJapgolly.openpgp.openpgpStrings.brainpoolP256r1
  - typingsJapgolly.openpgp.openpgpStrings.brainpoolP384r1
  - typingsJapgolly.openpgp.openpgpStrings.brainpoolP512r1
*/
trait curve extends js.Object

object curve {
  @scala.inline
  def brainpoolP256r1: typingsJapgolly.openpgp.openpgpStrings.brainpoolP256r1 = this.cast("brainpoolP256r1")
  @scala.inline
  def brainpoolP384r1: typingsJapgolly.openpgp.openpgpStrings.brainpoolP384r1 = this.cast("brainpoolP384r1")
  @scala.inline
  def brainpoolP512r1: typingsJapgolly.openpgp.openpgpStrings.brainpoolP512r1 = this.cast("brainpoolP512r1")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def curve25519: typingsJapgolly.openpgp.openpgpStrings.curve25519 = this.cast("curve25519")
  @scala.inline
  def ed25519: typingsJapgolly.openpgp.openpgpStrings.ed25519 = this.cast("ed25519")
  @scala.inline
  def p251: typingsJapgolly.openpgp.openpgpStrings.p251 = this.cast("p251")
  @scala.inline
  def p256: typingsJapgolly.openpgp.openpgpStrings.p256 = this.cast("p256")
  @scala.inline
  def p384: typingsJapgolly.openpgp.openpgpStrings.p384 = this.cast("p384")
  @scala.inline
  def secp256k1: typingsJapgolly.openpgp.openpgpStrings.secp256k1 = this.cast("secp256k1")
}

