package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typescript.typescriptStrings.Dot
  - typingsJapgolly.typescript.typescriptStrings.Quotationmark
  - typingsJapgolly.typescript.typescriptStrings.Apostrophe
  - typingsJapgolly.typescript.typescriptStrings.Graveaccent
  - typingsJapgolly.typescript.typescriptStrings.Slash
  - typingsJapgolly.typescript.typescriptStrings.`@`
  - typingsJapgolly.typescript.typescriptStrings.Lessthansign
  - typingsJapgolly.typescript.typescriptStrings.Numbersign
*/
trait CompletionsTriggerCharacter extends js.Object

object CompletionsTriggerCharacter {
  @scala.inline
  def `@`: typingsJapgolly.typescript.typescriptStrings.`@` = this.cast("@")
  @scala.inline
  def Apostrophe: typingsJapgolly.typescript.typescriptStrings.Apostrophe = this.cast("'")
  @scala.inline
  def Dot: typingsJapgolly.typescript.typescriptStrings.Dot = this.cast(".")
  @scala.inline
  def Graveaccent: typingsJapgolly.typescript.typescriptStrings.Graveaccent = this.cast("`")
  @scala.inline
  def Lessthansign: typingsJapgolly.typescript.typescriptStrings.Lessthansign = this.cast("<")
  @scala.inline
  def Numbersign: typingsJapgolly.typescript.typescriptStrings.Numbersign = this.cast("#")
  @scala.inline
  def Quotationmark: typingsJapgolly.typescript.typescriptStrings.Quotationmark = this.cast("\"")
  @scala.inline
  def Slash: typingsJapgolly.typescript.typescriptStrings.Slash = this.cast("/")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

