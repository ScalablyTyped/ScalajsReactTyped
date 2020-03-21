package typingsJapgolly.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jose.joseStrings.sig
  - typingsJapgolly.jose.joseStrings.enc
*/
trait use extends js.Object

object use {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enc: typingsJapgolly.jose.joseStrings.enc = this.cast("enc")
  @scala.inline
  def sig: typingsJapgolly.jose.joseStrings.sig = this.cast("sig")
}

