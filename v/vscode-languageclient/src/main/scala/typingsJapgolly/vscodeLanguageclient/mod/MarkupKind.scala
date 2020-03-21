package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.markdown
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.plaintext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "MarkupKind")
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

