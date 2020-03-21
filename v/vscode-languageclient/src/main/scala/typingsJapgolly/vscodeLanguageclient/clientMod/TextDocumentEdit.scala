package typingsJapgolly.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "TextDocumentEdit")
@js.native
object TextDocumentEdit extends js.Object {
  /**
    * Creates a new `TextDocumentEdit`
    */
  def create(
    textDocument: typingsJapgolly.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier,
    edits: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentEdit = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = js.native
}

