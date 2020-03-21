package typingsJapgolly.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CodeAction")
@js.native
object CodeAction extends js.Object {
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  def create(title: String, command: typingsJapgolly.vscodeLanguageserverTypes.mod.Command): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction = js.native
  def create(
    title: String,
    command: typingsJapgolly.vscodeLanguageserverTypes.mod.Command,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction = js.native
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  def create(title: String, edit: typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction = js.native
  def create(
    title: String,
    edit: typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean = js.native
}

