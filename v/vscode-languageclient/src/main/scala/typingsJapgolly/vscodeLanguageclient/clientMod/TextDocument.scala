package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "TextDocument")
@js.native
object TextDocument extends js.Object {
  def applyEdits(
    document: typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocument,
    edits: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit]
  ): String = js.native
  /**
    * Creates a new ITextDocument literal from the given uri and content.
    * @param uri The document's uri.
    * @param languageId  The document's language Id.
    * @param content The document's content.
    */
  def create(uri: DocumentUri, languageId: String, version: Double, content: String): typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocument = js.native
  /**
    * Checks whether the given literal conforms to the [ITextDocument](#ITextDocument) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocument */ Boolean = js.native
}

