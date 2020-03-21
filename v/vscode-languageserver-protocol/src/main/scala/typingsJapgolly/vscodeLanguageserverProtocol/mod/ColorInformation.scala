package typingsJapgolly.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "ColorInformation")
@js.native
object ColorInformation extends js.Object {
  /**
    * Creates a new ColorInformation literal.
    */
  def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    color: typingsJapgolly.vscodeLanguageserverTypes.mod.Color
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation = js.native
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean = js.native
}

