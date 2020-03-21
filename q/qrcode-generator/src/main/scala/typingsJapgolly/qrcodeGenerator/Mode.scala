package typingsJapgolly.qrcodeGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qrcodeGenerator.qrcodeGeneratorStrings.Numeric
  - typingsJapgolly.qrcodeGenerator.qrcodeGeneratorStrings.Alphanumeric
  - typingsJapgolly.qrcodeGenerator.qrcodeGeneratorStrings.Byte
  - typingsJapgolly.qrcodeGenerator.qrcodeGeneratorStrings.Kanji
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def Alphanumeric: typingsJapgolly.qrcodeGenerator.qrcodeGeneratorStrings.Alphanumeric = this.cast("Alphanumeric")
  @scala.inline
  def Byte: typingsJapgolly.qrcodeGenerator.qrcodeGeneratorStrings.Byte = this.cast("Byte")
  @scala.inline
  def Kanji: typingsJapgolly.qrcodeGenerator.qrcodeGeneratorStrings.Kanji = this.cast("Kanji")
  @scala.inline
  def Numeric: typingsJapgolly.qrcodeGenerator.qrcodeGeneratorStrings.Numeric = this.cast("Numeric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

