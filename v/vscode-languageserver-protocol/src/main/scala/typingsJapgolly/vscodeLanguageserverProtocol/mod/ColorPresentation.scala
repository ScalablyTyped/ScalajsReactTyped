package typingsJapgolly.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "ColorPresentation")
@js.native
object ColorPresentation extends js.Object {
  /**
    * Creates a new ColorInformation literal.
    */
  def create(label: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  def create(label: String, textEdit: typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit): typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  def create(
    label: String,
    textEdit: typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit,
    additionalTextEdits: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = js.native
}

