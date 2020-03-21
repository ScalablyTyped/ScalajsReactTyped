package typingsJapgolly.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jose.joseStrings.`P-256`
  - typingsJapgolly.jose.joseStrings.secp256k1
  - typingsJapgolly.jose.joseStrings.`P-384`
  - typingsJapgolly.jose.joseStrings.`P-521`
*/
trait ECCurve extends js.Object

object ECCurve {
  @scala.inline
  def `P-256`: typingsJapgolly.jose.joseStrings.`P-256` = this.cast("P-256")
  @scala.inline
  def `P-384`: typingsJapgolly.jose.joseStrings.`P-384` = this.cast("P-384")
  @scala.inline
  def `P-521`: typingsJapgolly.jose.joseStrings.`P-521` = this.cast("P-521")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def secp256k1: typingsJapgolly.jose.joseStrings.secp256k1 = this.cast("secp256k1")
}

