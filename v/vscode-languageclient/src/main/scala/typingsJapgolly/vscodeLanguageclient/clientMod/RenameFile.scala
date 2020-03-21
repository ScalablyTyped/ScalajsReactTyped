package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri
import typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "RenameFile")
@js.native
object RenameFile extends js.Object {
  def create(oldUri: DocumentUri, newUri: DocumentUri): typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile = js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): typingsJapgolly.vscodeLanguageserverTypes.mod.RenameFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
}

