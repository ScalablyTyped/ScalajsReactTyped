package typingsJapgolly.nodeZopfliEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZopfliEs.nodeZopfliEsStrings.deflate
  - typingsJapgolly.nodeZopfliEs.nodeZopfliEsStrings.gzip
  - typingsJapgolly.nodeZopfliEs.nodeZopfliEsStrings.zlib
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typingsJapgolly.nodeZopfliEs.nodeZopfliEsStrings.deflate = this.cast("deflate")
  @scala.inline
  def gzip: typingsJapgolly.nodeZopfliEs.nodeZopfliEsStrings.gzip = this.cast("gzip")
  @scala.inline
  def zlib: typingsJapgolly.nodeZopfliEs.nodeZopfliEsStrings.zlib = this.cast("zlib")
}

