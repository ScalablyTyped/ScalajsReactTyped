package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.setMonarchTokensProvider")
@js.native
object setMonarchTokensProvider extends js.Object {
  def apply(languageId: String, languageDef: Thenable[IMonarchLanguage]): IDisposable = js.native
  def apply(languageId: String, languageDef: IMonarchLanguage): IDisposable = js.native
}

