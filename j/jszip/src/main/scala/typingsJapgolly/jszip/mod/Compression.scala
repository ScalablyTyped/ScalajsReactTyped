package typingsJapgolly.jszip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jszip.jszipStrings.STORE
  - typingsJapgolly.jszip.jszipStrings.DEFLATE
*/
trait Compression extends js.Object

object Compression {
  @scala.inline
  def DEFLATE: typingsJapgolly.jszip.jszipStrings.DEFLATE = this.cast("DEFLATE")
  @scala.inline
  def STORE: typingsJapgolly.jszip.jszipStrings.STORE = this.cast("STORE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

