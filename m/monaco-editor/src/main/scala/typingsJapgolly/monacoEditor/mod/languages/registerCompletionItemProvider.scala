package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerCompletionItemProvider")
@js.native
object registerCompletionItemProvider extends js.Object {
  def apply(languageId: String, provider: CompletionItemProvider): IDisposable = js.native
}

