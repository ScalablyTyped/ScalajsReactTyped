package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerSignatureHelpProvider")
@js.native
object registerSignatureHelpProvider extends js.Object {
  def apply(languageId: String, provider: SignatureHelpProvider): IDisposable = js.native
}

