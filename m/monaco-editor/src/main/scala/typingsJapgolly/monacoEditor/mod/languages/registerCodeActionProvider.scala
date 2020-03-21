package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerCodeActionProvider")
@js.native
object registerCodeActionProvider extends js.Object {
  def apply(languageId: String, provider: CodeActionProvider): IDisposable = js.native
}

