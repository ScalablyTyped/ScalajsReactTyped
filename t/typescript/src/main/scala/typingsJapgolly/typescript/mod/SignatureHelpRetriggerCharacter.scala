package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typescript.typescriptStrings.Rightparenthesis
  - typingsJapgolly.typescript.typescriptStrings.Comma
  - typingsJapgolly.typescript.typescriptStrings.Leftparenthesis
  - typingsJapgolly.typescript.typescriptStrings.Lessthansign
*/
trait SignatureHelpRetriggerCharacter extends js.Object

object SignatureHelpRetriggerCharacter {
  @scala.inline
  def Comma: typingsJapgolly.typescript.typescriptStrings.Comma = this.cast(",")
  @scala.inline
  def Leftparenthesis: typingsJapgolly.typescript.typescriptStrings.Leftparenthesis = this.cast("(")
  @scala.inline
  def Lessthansign: typingsJapgolly.typescript.typescriptStrings.Lessthansign = this.cast("<")
  @scala.inline
  def Rightparenthesis: typingsJapgolly.typescript.typescriptStrings.Rightparenthesis = this.cast(")")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

