package typingsJapgolly.bufferhelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bufferhelper.bufferhelperStrings.ascii
  - typingsJapgolly.bufferhelper.bufferhelperStrings.utf8
  - typingsJapgolly.bufferhelper.bufferhelperStrings.utf16le
  - typingsJapgolly.bufferhelper.bufferhelperStrings.ucs2
  - typingsJapgolly.bufferhelper.bufferhelperStrings.base64
  - typingsJapgolly.bufferhelper.bufferhelperStrings.binary
  - typingsJapgolly.bufferhelper.bufferhelperStrings.hex
*/
trait encoding extends js.Object

object encoding {
  @scala.inline
  def ascii: typingsJapgolly.bufferhelper.bufferhelperStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typingsJapgolly.bufferhelper.bufferhelperStrings.base64 = this.cast("base64")
  @scala.inline
  def binary: typingsJapgolly.bufferhelper.bufferhelperStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsJapgolly.bufferhelper.bufferhelperStrings.hex = this.cast("hex")
  @scala.inline
  def ucs2: typingsJapgolly.bufferhelper.bufferhelperStrings.ucs2 = this.cast("ucs2")
  @scala.inline
  def utf16le: typingsJapgolly.bufferhelper.bufferhelperStrings.utf16le = this.cast("utf16le")
  @scala.inline
  def utf8: typingsJapgolly.bufferhelper.bufferhelperStrings.utf8 = this.cast("utf8")
}

