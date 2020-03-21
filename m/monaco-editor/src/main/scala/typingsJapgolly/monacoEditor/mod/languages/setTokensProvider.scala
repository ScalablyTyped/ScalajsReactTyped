package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.setTokensProvider")
@js.native
object setTokensProvider extends js.Object {
  def apply(languageId: String, provider: Thenable[TokensProvider | EncodedTokensProvider]): IDisposable = js.native
  def apply(languageId: String, provider: EncodedTokensProvider): IDisposable = js.native
  def apply(languageId: String, provider: TokensProvider): IDisposable = js.native
}

