package typingsJapgolly.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeJose.nodeJoseStrings.sig
  - typingsJapgolly.nodeJose.nodeJoseStrings.enc
  - typingsJapgolly.nodeJose.nodeJoseStrings.desc
*/
trait KeyUse extends js.Object

object KeyUse {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typingsJapgolly.nodeJose.nodeJoseStrings.desc = this.cast("desc")
  @scala.inline
  def enc: typingsJapgolly.nodeJose.nodeJoseStrings.enc = this.cast("enc")
  @scala.inline
  def sig: typingsJapgolly.nodeJose.nodeJoseStrings.sig = this.cast("sig")
}

