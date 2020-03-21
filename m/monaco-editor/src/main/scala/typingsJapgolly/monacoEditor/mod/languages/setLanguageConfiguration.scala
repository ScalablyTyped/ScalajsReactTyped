package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.setLanguageConfiguration")
@js.native
object setLanguageConfiguration extends js.Object {
  def apply(languageId: String, configuration: LanguageConfiguration): IDisposable = js.native
}

