package typingsJapgolly.binaryParser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.binaryParser.binaryParserStrings.little
  - typingsJapgolly.binaryParser.binaryParserStrings.big
*/
trait Endianness extends js.Object

object Endianness {
  @scala.inline
  def big: typingsJapgolly.binaryParser.binaryParserStrings.big = this.cast("big")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def little: typingsJapgolly.binaryParser.binaryParserStrings.little = this.cast("little")
}

