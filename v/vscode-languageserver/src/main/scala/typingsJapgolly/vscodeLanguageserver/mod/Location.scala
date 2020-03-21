package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "Location")
@js.native
object Location extends js.Object {
  /**
    * Creates a Location literal.
    * @param uri The location's uri.
    * @param range The location's range.
    */
  def create(uri: DocumentUri, range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): typingsJapgolly.vscodeLanguageserverTypes.mod.Location = js.native
  /**
    * Checks whether the given literal conforms to the [Location](#Location) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Location */ Boolean = js.native
}

