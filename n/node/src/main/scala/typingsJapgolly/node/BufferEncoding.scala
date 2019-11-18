package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Buffer class
/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.ascii
  - typings.node.nodeStrings.utf8
  - typings.node.nodeStrings.`utf-8`
  - typings.node.nodeStrings.utf16le
  - typings.node.nodeStrings.ucs2
  - typings.node.nodeStrings.`ucs-2`
  - typings.node.nodeStrings.base64
  - typings.node.nodeStrings.latin1
  - typings.node.nodeStrings.binary
  - typings.node.nodeStrings.hex
*/
trait BufferEncoding extends js.Object

object BufferEncoding {
  @scala.inline
  def ascii: typingsJapgolly.node.nodeStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typingsJapgolly.node.nodeStrings.base64 = this.cast("base64")
  @scala.inline
  def binary: typingsJapgolly.node.nodeStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsJapgolly.node.nodeStrings.hex = this.cast("hex")
  @scala.inline
  def latin1: typingsJapgolly.node.nodeStrings.latin1 = this.cast("latin1")
  @scala.inline
  def `ucs-2`: typingsJapgolly.node.nodeStrings.`ucs-2` = this.cast("ucs-2")
  @scala.inline
  def ucs2: typingsJapgolly.node.nodeStrings.ucs2 = this.cast("ucs2")
  @scala.inline
  def `utf-8`: typingsJapgolly.node.nodeStrings.`utf-8` = this.cast("utf-8")
  @scala.inline
  def utf16le: typingsJapgolly.node.nodeStrings.utf16le = this.cast("utf16le")
  @scala.inline
  def utf8: typingsJapgolly.node.nodeStrings.utf8 = this.cast("utf8")
}

