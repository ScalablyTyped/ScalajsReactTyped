package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "LocationLink")
@js.native
object LocationLink extends js.Object {
  /**
    * Creates a LocationLink literal.
    * @param targetUri The definition's uri.
    * @param targetRange The full range of the definition.
    * @param targetSelectionRange The span of the symbol definition at the target.
    * @param originSelectionRange The span of the symbol being defined in the originating source file.
    */
  def create(
    targetUri: DocumentUri,
    targetRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    targetSelectionRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink = js.native
  def create(
    targetUri: DocumentUri,
    targetRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    targetSelectionRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    originSelectionRange: typingsJapgolly.vscodeLanguageserverTypes.mod.Range
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink = js.native
  /**
    * Checks whether the given literal conforms to the [LocationLink](#LocationLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.LocationLink */ Boolean = js.native
}

