package typingsJapgolly.nodeZopfli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZopfli.nodeZopfliStrings.deflate
  - typingsJapgolly.nodeZopfli.nodeZopfliStrings.gzip
  - typingsJapgolly.nodeZopfli.nodeZopfliStrings.zlib
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typingsJapgolly.nodeZopfli.nodeZopfliStrings.deflate = this.cast("deflate")
  @scala.inline
  def gzip: typingsJapgolly.nodeZopfli.nodeZopfliStrings.gzip = this.cast("gzip")
  @scala.inline
  def zlib: typingsJapgolly.nodeZopfli.nodeZopfliStrings.zlib = this.cast("zlib")
}

