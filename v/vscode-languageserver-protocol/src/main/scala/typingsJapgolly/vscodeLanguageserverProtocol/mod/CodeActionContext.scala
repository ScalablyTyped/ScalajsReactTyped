package typingsJapgolly.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CodeActionContext")
@js.native
object CodeActionContext extends js.Object {
  /**
    * Creates a new CodeActionContext literal.
    */
  def create(diagnostics: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  def create(
    diagnostics: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = js.native
}

