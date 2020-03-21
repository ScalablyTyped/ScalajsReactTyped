package typingsJapgolly.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DocumentLink")
@js.native
object DocumentLink extends js.Object {
  /**
    * Creates a new DocumentLink literal.
    */
  def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, target: String): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, target: String, data: js.Any): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = js.native
}

