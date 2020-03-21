package typingsJapgolly.pizzip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pizzip.pizzipStrings.STORE
  - typingsJapgolly.pizzip.pizzipStrings.DEFLATE
*/
trait Compression extends js.Object

object Compression {
  @scala.inline
  def DEFLATE: typingsJapgolly.pizzip.pizzipStrings.DEFLATE = this.cast("DEFLATE")
  @scala.inline
  def STORE: typingsJapgolly.pizzip.pizzipStrings.STORE = this.cast("STORE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

