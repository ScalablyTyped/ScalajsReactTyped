package typingsJapgolly.bnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bnJs.bnJsStrings.k256
  - typingsJapgolly.bnJs.bnJsStrings.p224
  - typingsJapgolly.bnJs.bnJsStrings.p192
  - typingsJapgolly.bnJs.bnJsStrings.p25519
*/
trait IPrimeName extends js.Object

object IPrimeName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def k256: typingsJapgolly.bnJs.bnJsStrings.k256 = this.cast("k256")
  @scala.inline
  def p192: typingsJapgolly.bnJs.bnJsStrings.p192 = this.cast("p192")
  @scala.inline
  def p224: typingsJapgolly.bnJs.bnJsStrings.p224 = this.cast("p224")
  @scala.inline
  def p25519: typingsJapgolly.bnJs.bnJsStrings.p25519 = this.cast("p25519")
}

