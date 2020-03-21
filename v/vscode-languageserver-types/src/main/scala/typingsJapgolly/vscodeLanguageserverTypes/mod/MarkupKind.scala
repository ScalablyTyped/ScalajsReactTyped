package typingsJapgolly.vscodeLanguageserverTypes.mod

import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.markdown
import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.plaintext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.plaintext
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.markdown
*/
trait MarkupKind extends js.Object

@JSImport("vscode-languageserver-types", "MarkupKind")
@js.native
object MarkupKind extends js.Object {
  /**
    * Markdown is supported as a content format
    */
  val Markdown: markdown = js.native
  /**
    * Plain text is supported as a content format
    */
  val PlainText: plaintext = js.native
  /**
    * Checks whether the given value is a value of the [MarkupKind](#MarkupKind) type.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean = js.native
}

